package controller;

import dao.ProdutoDAO;
import dao.ProdutoDAOJdbc;
import model.BaseDados;

/**
 *
 * @author helder
 */
public class ProdutoController{

    //Cria Pizza
    public void criaProduto(
            String nome, double valor1, double valor2, double valor3 ) {
        
        BaseDados base = DBController.getBaseDados();
        
        switch(base){
            case Arquivo: break;
            
            case Serial: break;
            
            case JDBC: 
            {
                //solicita ao DAO a criação
                ProdutoDAOJdbc produto = new ProdutoDAOJdbc();
                produto.criaProduto(nome, valor1, valor2, valor3);                
                break;
            }
        }
    }
    
    //Cria Extra
    public void criaProduto(
            String nome, String descricao, double valor) {
        
        BaseDados base = DBController.getBaseDados();
        
        switch(base){
            case Arquivo: break;
            
            case Serial: break;
            
            case JDBC: 
            {
                //solicita ao DAO a criação
                ProdutoDAOJdbc produto = new ProdutoDAOJdbc();
                produto.criaProduto(nome, descricao, valor);
                
                break;
            }
        }
    }

    public void removePizza(int tabelaPizzasLinhaSelecionada) {
        
        //Identifica a base de dados
        BaseDados base = DBController.getBaseDados();
        
        switch(base){
            case Arquivo: break;
            
            case Serial: break;
            
            case JDBC: 
            {
                //solicita ao DAO a criação
                ProdutoDAOJdbc produto = new ProdutoDAOJdbc();
                produto.removePizza(tabelaPizzasLinhaSelecionada);
                
                break;
            }
        }
    }

    public void removeExtra(int tabelaExtrasLinhaSelecionada) {
        
        //Identifica a base de dados
        BaseDados base = DBController.getBaseDados();
        
        switch(base){
            case Arquivo: break;
            
            case Serial: break;
            
            case JDBC: 
            {
                //solicita ao DAO a criação
                ProdutoDAOJdbc produto = new ProdutoDAOJdbc();
                produto.removeExtra(tabelaExtrasLinhaSelecionada);
                
                break;
            }
        }
    }

}
