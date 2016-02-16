package controller;

import dao.PedidoJdbcDAO;
import model.PizzariaEnum;

/**
 *
 * @author helder
 */
public class PedidoController {

    public void adicionaPedido(int tabela, int tabelaSelecionada, int mesa) {
        
        PedidoJdbcDAO pedido = new PedidoJdbcDAO();
        
        pedido.adicionaPedido(tabela, tabelaSelecionada);
    }

   
    
}
