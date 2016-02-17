package controller;

import dao.PedidoDAOJdbc;
import model.PizzariaEnum;

/**
 *
 * @author helder
 */
public class PedidoController{
    
    //Método para Produtos Extras
    public void adicionaPedido(int linhaSelecionada, int mesa, int qtde) {
        
        PedidoDAOJdbc pedido = new PedidoDAOJdbc();
        
        pedido.adicionaPedido(linhaSelecionada, mesa, qtde);
        
    }
    
    //Método para Pizzas
    public void adicionaPedido(
            int linhaSelecionada, int mesaSelecionada, int tamPizza, int qtde) {
        
    }

   
    
}
