package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


/**
 *
 * @author helder
 */
public class PedidoDAOJdbc implements PedidoDAO{
    
    
    ConexaoDAO conexao = new ConexaoDAO();
    private Statement comando;
    private ResultSet resultado;        
    
    //Para Produtos Extras
    @Override
    public void adicionaPedidoExtra(int linhaSelecionada, int mesa, int qtde) {        
        
            String nome = "";
            String descricao = "";
            Double valor = 0.0;          
          
            
            conexao.conectar();
            
         try {   
            
            comando = conexao.getComando();
            resultado = comando.executeQuery(
                    "SELECT Produto, Descricao, Valor FROM Extras");
            
            //Move o resultado para a linha do produto selecionado
            resultado.absolute(linhaSelecionada);
            System.out.println("Linha: " + linhaSelecionada);
            //Captura as informações para preencher o pedido
            nome = resultado.getString("Produto");
            descricao = resultado.getString("Descricao");
            valor = resultado.getDouble("Valor") * qtde;            
            
            comando.executeUpdate(
                    "INSERT INTO Pedidos(Mesa,Nome,Descricao,Qtde,Valor) VALUES('"
                    + mesa + "','" + nome + "','" + descricao + "','" + qtde + "','" +
                    valor + "')");            
            
        } catch (SQLException ex) {
            
            conexao.imprimeErro("Erro ao executar Query", ex.getMessage());
            ex.printStackTrace();
        }
        
    }
    
    //Para Pizzas
    @Override
    public void adicionaPedidoPizza(int linhaSelecionada, int mesa, int tamPizza, int qtde){
            String nome="";
            String descricao="";
            Double valor = 0.0;
            
            
            conexao.conectar();
            
         try {   
            
            comando = conexao.getComando();
            resultado = comando.executeQuery(
                    "SELECT Pizza, P, M, G FROM Pizzas");
            
            //Move o resultado para a linha do produto selecionado
            resultado.absolute(linhaSelecionada);
            
            //Captura as informações para preencher o pedido
            nome = resultado.getString("Pizza");
            
            switch(tamPizza){
                case 1: 
                {
                    descricao = "P";
                    valor = resultado.getDouble("P") * qtde;
                    break;
                } 
                case 2:
                {
                    descricao = "M";
                    valor = resultado.getDouble("M") * qtde;
                    break;
                } 
                case 3:
                {
                    descricao = "G";
                    valor = resultado.getDouble("G") * qtde;
                    break;
                } 
            }
            
            
            //cria objetos para passar para o método da classe MesaDAO
            
            comando.executeUpdate(
                    "INSERT INTO Pedidos(Mesa,Nome,Descricao,Qtde, Valor) VALUES('"
                    + mesa + "','" + nome + "','" + descricao + "','" + qtde + "','" +
                    valor + "')");
            
            
            
        } catch (SQLException ex) {
            conexao.imprimeErro("Erro ao executar Query", ex.getMessage());
            ex.printStackTrace();
        }
    }
}
