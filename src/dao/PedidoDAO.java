package dao;

/**
 *
 * @author helder
 */
public interface PedidoDAO {

    //Para Extras
    public void adicionaPedido(int linhaSelecionada, int mesa, int qtde);
    
    //Para Pizzas
    public void adicionaPedido(int linhaSelecionda, int mesa, int tamPizza, int qtde);
    
    
}
