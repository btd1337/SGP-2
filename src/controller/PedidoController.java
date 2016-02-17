package controller;

import dao.PedidoJdbcDAO;
import model.PizzariaEnum;

/**
 *
 * @author helder
 */
public class PedidoController {
    
    //Método para Produtos Extras
    public void adicionaPedido(int linhaSelecionada, int mesa, int qtde) {
        
        PedidoJdbcDAO pedido = new PedidoJdbcDAO();
        
        pedido.adicionaPedido(linhaSelecionada, mesa, qtde);
        
    }
    
    //Método para Pizzas
    public void adicionaPedido(
            int linhaSelecionada, int mesaSelecionada, int tamPizza, int qtde) {
        
    }

   
    
}
