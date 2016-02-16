package controller;

import dao.TabelaMesasControllerDAO;

/**
 *
 * @author helder
 */
public class TabelaMesasController {
    
    public int getRowCount(){        
        TabelaMesasControllerDAO tabela = new TabelaMesasControllerDAO();
        return tabela.getRowCount();
    }

    public int getColumnCount() {
        
        return ;
    }

    public Object valueAt(int row, int column) {
        
        return ;
    }

    public Class getColumnClass(int column) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
