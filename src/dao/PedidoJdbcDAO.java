package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Pedido;
import model.Produto;


/**
 *
 * @author helder
 */
public class PedidoJdbcDAO {
    
    //Para Produtos Extras
    public void adicionaPedido(int linhaSelecionada, int mesa, int qtde) {        
        
            String nome;
            String descricao;
            Double valor;          
            
            ConexaoDAO conexao = new ConexaoDAO();
            ResultSet resultado;
            conexao.conectar();
            
         try {   
            
            resultado = conexao.getResultado(
                    "SELECT Produto, Descricao, Valor FROM Extras");
            
            //Move o resultado para a linha do produto selecionado
            resultado.absolute(linhaSelecionada);
            
            //Captura as informações para preencher o pedido
            nome = resultado.getString("Produto");
            descricao = resultado.getString("Descricao");
            valor = resultado.getDouble("Valor");            
            
            //cria objetos para passar para o método da classe MesaDAO
            Produto produto = new Produto(nome, descricao, valor);
            Pedido pedido = new Pedido(produto, qtde);
            
            MesaJdbcDAO mesaDAO = new MesaJdbcDAO();
            mesaDAO.acrescentarPedido(pedido, mesa);
            
            
        } catch (SQLException ex) {
            conexao.imprimeErro("Erro ao executar Query", ex.getMessage());
        }
        
    }
    
    //Para Pizzas
    public void adicionaPedido(int linhaSelecionda, int mesa, int tamPizza, int qtde){
        
    }
}
