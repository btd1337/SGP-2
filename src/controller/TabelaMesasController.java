package controller;

import dao.TabelaMesasDAO;

/**
 *
 * @author helder
 */
public class TabelaMesasController {
    
    private final String operacao = "SELECT * FROM Mesas";
    
    
    public int getRowCount(){ 
        TabelaMesasDAO tabela = new TabelaMesasDAO();
        return tabela.getRowCount(operacao);
    }

    public int getColumnCount() {
        TabelaMesasDAO tabela = new TabelaMesasDAO();
        return tabela.getColumnCount(operacao);
    }

    public Object valueAt(int row, int column) {
        TabelaMesasDAO tabela = new TabelaMesasDAO();
        return tabela.getValueAt(row, column, operacao);
    }

    public Class getColumnClass(int column) {
        TabelaMesasDAO tabela = new TabelaMesasDAO();
        return tabela.getColumnClass(column, operacao);
    }
    
    
}
