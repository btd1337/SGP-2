package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import model.Extras;
import model.Pedido;


/**
 *
 * @author helder
 */
public class PedidoDAOJdbc implements PedidoDAO{
    
    private Statement comando;
    private ResultSet resultado;        
    
    //Para Produtos Extras
    public void adicionaPedido(int linhaSelecionada, int mesa, int qtde) {        
        
            String nome;
            String descricao;
            Double valor;          
            
            ConexaoDAO conexao = new ConexaoDAO();
            
            conexao.conectar();
            
         try {   
            
            comando = conexao.getComando();
            resultado = conexao.getResultado(
                    "SELECT Produto, Descricao, Valor FROM Extras");
            
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
    public void adicionaPedido(int linhaSelecionda, int mesa, int tamPizza, int qtde){
        
    }
}
