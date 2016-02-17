package controller;

import dao.PedidoDAOJdbc;
import model.BaseDados;
import model.PizzariaEnum;

/**
 *
 * @author helder
 */
public class PedidoController{
    
    //Método para Produtos Extras
    public void adicionaPedido(int linhaSelecionada, int mesa, int qtde) {
        BaseDados base = DBController.getBaseDados();
        
        switch(base){
            case Arquivo: break;
            
            case Serial: break;
            
            case JDBC: 
            {
                PedidoDAOJdbc pedido = new PedidoDAOJdbc();        
                pedido.adicionaPedido(linhaSelecionada, mesa, qtde);
                
                break;
            }
        }
        
        
        
        
    }
    
    //Método para Pizzas
    public void adicionaPedido(
            int linhaSelecionada, int mesaSelecionada, int tamPizza, int qtde) {
        
        BaseDados base = DBController.getBaseDados();
        
        switch(base){
            case Arquivo: break;
            
            case Serial: break;
            
            case JDBC: 
            {
                
                
                break;
            }
        }
        
    }

   
    
}
