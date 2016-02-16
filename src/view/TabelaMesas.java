package view;

import controller.TabelaMesasController;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author helder
 */
public class TabelaMesas extends AbstractTableModel {

    @Override
    public int getRowCount() {
        TabelaMesasController tabela = new TabelaMesasController();
        
        return tabela.getRowCount();
    }

    @Override
    public int getColumnCount() {
        TabelaMesasController tabela = new TabelaMesasController();
        
        return tabela.getColumnCount();
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        TabelaMesasController tabela = new TabelaMesasController();
        
        return tabela.valueAt(rowIndex+1,columnIndex+1);
    }
    
    @Override
    public Class getColumnClass(int column){
        TabelaMesasController tabela = new TabelaMesasController();
        
        return tabela.getColumnClass(column);
    }

    
}
