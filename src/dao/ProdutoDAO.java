/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

/**
 *
 * @author helder
 */
public interface ProdutoDAO {
    
    public void criaProduto(
            String nome, double valor1, double valor2, double valor3 );
    
    public void criaProduto(
            String nome, String descricao, double valor);
}
