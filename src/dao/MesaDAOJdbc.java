package dao;

import model.Pedido;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import model.Extras;

/**
 *
 * @author helder
 */
public class MesaDAOJdbc implements MesaDAO {
    //configuração de acordo com o banco
    
    private Statement comando;
    private ResultSet resultado;
    private ResultSetMetaData resultadoMD;
    private ConexaoDAO conexao = new ConexaoDAO();
    
    public void removeMesa(){
        
        int ultimaMesa = 1;    //determina ultima mesa
        conexao.conectar();
        comando = conexao.getComando();
        
        
        try{
            
            //verificar se a mesa a ser excluida tem pedidos em aberto            
            resultado = comando.executeQuery("SELECT Mesa FROM Mesas");
            
            resultado.last();                   //encontra a última linha da tabela
            ultimaMesa = resultado.getInt("Mesa");    //obtem número da última mesa
            
            //Procura pedidos para a mesa a ser removida
            resultado = comando.executeQuery(
                    "SELECT Mesa FROM Pedidos WHERE Mesa='" + ultimaMesa + "'");
            
            //caso tenha pedidos
            if(resultado.next()){
                JOptionPane.showMessageDialog(
                        null, 
                        "Para remover uma mesa é necessário que ela não tenha pedidos em aberto!",
                        "Erro ao Remover Mesa",
                        JOptionPane.ERROR_MESSAGE);
            }
            //caso não tenha pedidos
            else{
                //deleta ultima mesa
                comando.executeUpdate(
                        "DELETE FROM Mesas WHERE Mesa = '" + ultimaMesa + "'");


                JOptionPane.showMessageDialog(
                        null, "Mesa removida com sucesso!","Mesas",JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (SQLException ex) {
        conexao.imprimeErro("Erro ao remover mesa!", ex.getMessage());
        
        }finally{
            conexao.desconectar();
        }
    }
        
    public void addMesa() {
        int numMesas;
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
            
            comando = conexao.getComando();
            
            //seta o horário de entrada e ocupa a mesa
            comando.executeUpdate(
                    "UPDATE Mesas SET Entrada = CURRENT_TIMESTAMP,"
                    + "Ocupado = true WHERE Mesa = '" 
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
        
        try{
            //seleciona a coluna qtde e valor do medido da mesa desejada
            //caso o pedido seja igual
            comando = conexao.getComando();
            
            
            
            //Traz os pedidos semelhantes para a mesa informada
            if(p.getProduto() instanceof Extras){
                resultado = comando.executeQuery(
                    "SELECT Qtde, Valor FROM Pedidos WHERE Mesa = '" + 
                    mesa + "' AND Nome = '" + p.getProduto().getNome() +
                    "'AND Descricao = '" + p.getProduto().getDescricao() + "'");
            }
            else{
                
            }
            
                //caso o produto já tenha sido pedido
                if(resultado.next()){
                    int qtde;       //qtde atual pedida
                    double valor;   //valor atual pedido
                    //Encontra a linha onde o produto já foi pedido
                    linhaPedido = resultado.getRow();
                    qtde = resultado.getInt("Qtde");
                    valor = resultado.getDouble("Valor");

                    //atualiza valores
                    qtde += p.getQtdeDoProduto();
                    valor += p.getValorDoPedido();

                    comando.executeUpdate(
                            "UPDATE Pedidos SET Qtde = '"
                            + qtde + "' ,Valor = '" + valor
                            + "' WHERE id = '" + linhaPedido + "'" );
                }
                //caso o produto ainda não tenha sido pedido
                else{
                    comando.executeUpdate(
                            "INSERT INTO PedidosMesa(Mesa, Nome, Descricao, Qtde, Valor)"
                            + " VALUES ('" + mesa + "','" +  
                            p.getProduto().getNome() + "','" + 
                            p.getProduto().getDescricao() + "','" + 
                            p.getQtdeDoProduto() + "','" +                         
                            p.getValorDoPedido() + "'");
            }
        } 
        catch (SQLException ex) {
            conexao.imprimeErro("Erro ao acrescentar pedido.", ex.getMessage());
            ex.printStackTrace();
        } finally{
            conexao.desconectar();
        }      
    }
        
    public void cancelarPedido(int mesa, int linhaPedido, int qtde){
        conexao.conectar();
        int id;
        
        try{
            comando = conexao.getComando();
            
            resultado = comando.executeQuery("SELECT id, Qtde, Valor FROM Pedidos "
                    + "WHERE Mesa = '" + mesa + "'");
            
            //verifica se foi encontrado o pedido
            if(resultado.next()){
                //captura os valores atuais
                int qtdeAtual;
                double valorAtual;
                double valorIndividual;
                resultado.absolute(linhaPedido);
                
                qtdeAtual = resultado.getInt("Qtde");
                valorAtual = resultado.getDouble("Valor");
                id = resultado.getInt("id");
                valorIndividual = valorAtual/qtdeAtual;
                
                qtdeAtual -= qtde;
                //verifica a quantidade restante após o cancelamento
                if(qtdeAtual <= 0){ 
                    //remove pedido
                    comando.executeUpdate(
                    "DELETE FROM Pedidos WHERE id = '"
                    + id + "'");
                }
                else{           
                    //atualiza quantidade
                    valorAtual = valorIndividual * qtdeAtual;

                    comando.executeUpdate(
                            "UPDATE Pedidos SET Qtde = '"
                            + qtdeAtual + "' ,Valor = '" + valorAtual
                            + "' WHERE id = '" + id + "'" );
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
    public String getHorarioSaida(int mesa) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Pedido> getPedidos(int mesa) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getHorarioEntrada(int mesaSelecionada) {
        String entrada = "";
        conexao.conectar();
        comando = conexao.getComando();
        try {
            //insere nova mesa
            resultado =  comando.executeQuery("SELECT Mesa,Entrada FROM Mesas");       
            
            resultado.absolute(mesaSelecionada);
            
            entrada = resultado.getString("Entrada");
                    
            
        } catch (SQLException ex) {
            conexao.imprimeErro("Erro ao obter horário de entrada!", ex.getMessage());
            
        } finally {            
            conexao.desconectar();
            return entrada;
        }
    }
}
    
    
