package model;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author helder
 */ 
public enum PizzariaEnum {
    TABELAPIZZAS (1),TABELAEXSTRAS (2);
    
    public int getValor;

    private PizzariaEnum(int id) {
        this.getValor = id;
    }
    
    
}
