package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import model.Extras;
import model.Pedido;
import model.Pizza;


/**
 *
 * @author helder
 */
public class PedidoDAOJdbc implements PedidoDAO{
    
    
    ConexaoDAO conexao = new ConexaoDAO();
    private Statement comando;
    private ResultSet resultado;        
    
    //Para Produtos Extras
    public void adicionaPedido(int linhaSelecionada, int mesa, int qtde) {        
        
            String nome;
            String descricao;
            Double valor;          
          
            
            conexao.conectar();
            
         try {   
            
            comando = conexao.getComando();
            resultado = comando.executeQuery(
                    " SELECT Produto, Descricao, Valor FROM Extras ");
            
            //Move o resultado para a linha do produto selecionado
            resultado.absolute(linhaSelecionada);
            
            //Captura as informações para preencher o pedido
            nome = resultado.getString("Produto");
            descricao = resultado.getString("Descricao");
            valor = resultado.getDouble("Valor");            
            
            //cria objetos para passar para o método da classe MesaDAO
            Extras produto = new Extras(nome, valor);
            produto.setDescricao(descricao);
            
            Pedido pedido = new Pedido(produto, qtde);
            
            MesaDAOJdbc mesaDAO = new MesaDAOJdbc();
            mesaDAO.acrescentarPedido(pedido, mesa);
            
            
        } catch (SQLException ex) {
            conexao.imprimeErro("Erro ao executar Query", ex.getMessage());
        }
        
    }
    
    //Para Pizzas
    public void adicionaPedido(int linhaSelecionada, int mesa, int tamPizza, int qtde){
            String nome;
            Double valor1;
            Double valor2;          
            Double valor3;
            
            conexao.conectar();
            
         try {   
            
            comando = conexao.getComando();
            resultado = comando.executeQuery(
                    "SELECT Pizza, P, M, G FROM Pizzas");
            
            //Move o resultado para a linha do produto selecionado
            resultado.absolute(linhaSelecionada);
            
            //Captura as informações para preencher o pedido
            nome = resultado.getString("Pizza");
            valor1 = resultado.getDouble("P");
            valor2 = resultado.getDouble("M");
            valor3 = resultado.getDouble("G");
            
            //cria objetos para passar para o método da classe MesaDAO
            Pizza produto = new Pizza(nome, valor1);
            produto.setValor2(valor2);
            produto.setValor3(valor3);
            
            Pedido pedido = new Pedido(produto, qtde);
            
            MesaDAOJdbc mesaDAO = new MesaDAOJdbc();
            mesaDAO.acrescentarPedido(pedido, mesa);
            
            
        } catch (SQLException ex) {
            conexao.imprimeErro("Erro ao executar Query", ex.getMessage());
        }
    }
}
