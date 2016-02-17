package controller;

import model.BaseDados;

/**
 *
 * @author helder
 */
public class DBController {
    //usado para armazenar o valor da base de dados
    private static BaseDados baseDados = BaseDados.JDBC;


    public static void setBaseDados(BaseDados baseDados) {
        DBController.baseDados = baseDados;
    }

    public static BaseDados getBaseDados() {
        return baseDados;
    }
    
    
}
