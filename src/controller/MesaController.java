package controller;

import dao.MesaJdbcDAO;
import javax.swing.JTable;

/**
 *
 * @author helder
 */
public class MesaController {

    public void fechaComanda() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void adicionaPedido() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void adicionaMesa(JTable tabela) {
        MesaJdbcDAO mesa = new MesaJdbcDAO();
        
        mesa.addMesa(tabela);
    }

    public void removeMesa(JTable tabela) {
        MesaJdbcDAO mesa = new MesaJdbcDAO();
        
        mesa.removeMesa(tabela);
    }

    public void cancelaPedido() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void removeProduto() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void abreMesa(int idMesa) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
