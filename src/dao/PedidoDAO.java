package dao;

/**
 *
 * @author helder
 */
public interface PedidoDAO {

    //Para Extras
    public void adicionaPedidoExtra(int linhaSelecionada, int mesa, int qtde);
    
    //Para Pizzas
    public void adicionaPedidoPizza(int linhaSelecionda, int mesa, int tamPizza, int qtde);
    
    
}
