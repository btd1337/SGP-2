package dao;

import model.Pedido;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author helder
 */
public class MesaJdbcDAO implements MesaDAO {
    //configuração de acordo com o banco
    
    private Statement comando;
    private ResultSet resultado;
    private ResultSetMetaData resultadoMD;
    private ConexaoDAO conexao = new ConexaoDAO();
    
    public void removeMesa(){
        
        int ultimaMesa = 1;    //determina ultima mesa
        conexao.conectar();
        
        
        try{
            resultado.last();                   //encontra a última linha da tabela
            ultimaMesa = resultado.getRow();    //obtem número da última mesa
            comando.executeUpdate("DELETE FROM Mesas WHERE id = ultimaMesa");   
        } catch (SQLException ex) {
        conexao.imprimeErro("Erro ao remover mesa!", ex.getMessage());
        
        }finally{
            conexao.desconectar();
        }
    }
        
    public void addMesa() {
        int numMesas;
        ResultSet resultado;
        conexao.conectar();
        comando = conexao.getComando();
        try {
            //insere nova mesa
            comando.executeUpdate("INSERT INTO Mesas(Nome,Ocupado) VALUES('Mesa',false)");         
            
            JOptionPane.showMessageDialog(
                    null, "Mesa adicionada com sucesso!","Mesas",JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {
            conexao.imprimeErro("Erro ao adicionar mesa!", ex.getMessage());
            
        } finally {
            conexao.desconectar();
        }
    }
    
    public boolean isOcupMesa(int mesaSelecionada){
        
        boolean isOcup = false;
        conexao.conectar();
        
        try{
            //recebe o primeiro valor da Query
            resultado = comando.executeQuery(
                    "SELECT 'ocupacao' FROM 'Mesas' WHERE id = '" + mesaSelecionada + "'");
            
            isOcup = resultado.getBoolean("ocupacao");
        } 
        catch (SQLException ex) {
            conexao.imprimeErro("Erro ao receber informação da mesa!", ex.getMessage());
        } finally{
            conexao.desconectar();
        }
        
        return isOcup;
        
    }
    
    public void setOcupaMesa(int mesaSelecionada, boolean isOcup){
        conexao.conectar();
        try{
            //altera a ocupação da mesa que é passa por parâmetro
            comando.executeUpdate(
                    "UPDATE 'Mesas' SET 'ocupacao' = '" + isOcup + 
                            "' WHERE 'id' = '" + mesaSelecionada + "'");
        } catch (SQLException ex) {
            conexao.imprimeErro("Erro ao alterar ocupacação da mesa!", ex.getMessage());
        } finally{
            conexao.desconectar();
        }
    }
    
    public void abrirMesa(int MesaSelecionada){
        
        conexao.conectar();
        try {
            
            //seta o horário de entrada e ocupa a mesa
            comando.executeUpdate(
                    "UPDATE Mesas SET horarioEntrada = CURRENT_TIMESTAMP,"
                    + "ocupacao = true WHERE id = '" 
                    + MesaSelecionada + "'");
           
        } catch (SQLException ex) {
            conexao.imprimeErro("Erro ao abrir mesa", ex.getMessage());
        } finally{
            conexao.desconectar();
        }        
    }
    
    
    public void acrescentarPedido(Pedido p, int mesa) {
        
        
        //Verificar se elemento já foi pedido
        int linhaPedido;
        conexao.conectar();
        ResultSet resultado;
        try{
            //seleciona a coluna qtde e valor do medido da mesa desejada
            //caso o pedido seja igual
            resultado = comando.executeQuery("SELECT qtde, valor FROM PedidosMesa'" + 
                    mesa + "' WHERE nome = '" + p.getProduto().getNome()
                    + "', descricao = '" + p.getProduto().getDescricao() + "'");
            
            //caso o produto já tenha sido pedido
            if(resultado.next()){
                int qtde;       //qtde atual pedida
                double valor;   //valor atual pedido
                //Encontra a linha onde o produto já foi pedido
                linhaPedido = resultado.getRow();
                qtde = resultado.getInt("qtde");
                valor = resultado.getDouble("valor");
                
                //atualiza valores
                qtde += p.getQtdeDoProduto();
                valor += p.getValorDoPedido();
                
                comando.executeUpdate(
                        "UPDATE PedidosMesa'" + mesa + "' SET qtde = '"
                        + qtde + "' ,valor = '" + valor
                        + "' WHERE id = '" + linhaPedido + "'" );
            }
            //caso o produto ainda não tenha sido pedido
            else{
                comando.executeUpdate(
                        "INSERT INTO PedidosMesa'" + mesa + 
                        "' (nome,descricao,qtde, valor) VALUES ('" + 
                        p.getProduto().getNome() + "','" + 
                        p.getProduto().getDescricao() + "','" + 
                        p.getQtdeDoProduto() + "','" +                         
                        p.getValorDoPedido() + "'");
            }
        } 
        catch (SQLException ex) {
            conexao.imprimeErro("Erro ao acrescentar pedido.", ex.getMessage());
        } finally{
            conexao.desconectar();
        }      
    }
        
    public void cancelarPedido(Pedido p, int qtde, int mesa){
        conexao.conectar();
        
        try{
            resultado = comando.executeQuery("SELECT qtde, valor FROM PedidosMesa'" + 
                    mesa + "' WHERE nome = '" + p.getProduto().getNome()
                    + "', descricao = '" + p.getProduto().getDescricao() + "'");
            
            //verifica se foi encontrado o pedido
            if(resultado.next()){
                //captura os valores atuais
                int qtdeAtual;
                double valorAtual;
                int linhaPedido;
                linhaPedido = resultado.getRow();
                qtdeAtual = resultado.getInt("qtde");
                valorAtual = resultado.getDouble("valor");
                
                qtdeAtual -= qtde;
                //verifica a quantidade restante após o cancelamento
                if(qtdeAtual <= 0){ 
                    //remove pedido
                    comando.executeUpdate(
                    "DELETE FROM PedidosMesa'" + mesa + "' WHERE id = '"
                    + linhaPedido + "'");
                }
                else{           
                    //atualiza quantidade
                    valorAtual -= (p.getProduto().getValor() * qtde);

                    comando.executeUpdate(
                            "UPDATE PedidosMesa'" + mesa + "' SET qtde = '"
                            + qtde + "' ,valor = '" + valorAtual
                            + "' WHERE id = '" + linhaPedido + "'" );
                }
            }
        }
        catch (SQLException ex) {
            conexao.imprimeErro("Erro ao cancelar pedido.", ex.getMessage());
        } finally{
            conexao.desconectar();
        }
    } 

    @Override
    public int getNumIDMesa(int mesa) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isOcupacaoMesa(int mesa) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setOcupacaoMesa(boolean ocupacaoMesa, int mesa) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double getTotalPagar(int mesa) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setTotalPagar(double totalPagar, int mesa) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void fecharComanda(int mesa) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getHorarioEntrada(int mesa) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getHorarioSaida(int mesa) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Pedido> getPedidos(int mesa) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
    
    
