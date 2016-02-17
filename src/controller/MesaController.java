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
        
    }

    public void adicionaMesa() {
        MesaJdbcDAO mesa = new MesaJdbcDAO();
        
        mesa.addMesa();
    }

    public void removeMesa() {
        MesaJdbcDAO mesa = new MesaJdbcDAO();
        
        mesa.removeMesa();
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
