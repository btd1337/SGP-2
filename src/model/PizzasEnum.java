/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author helder
 */
public enum PizzasEnum {
    
    P (1), M (2), G(3);
    
    public int getValor;

    private PizzasEnum(int getValor) {
        this.getValor = getValor;
    }
    
    
    
}
