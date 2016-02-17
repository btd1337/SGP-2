package controller;

import dao.MesaDAOJdbc;
import model.BaseDados;

/**
 *
 * @author helder
 */
public class MesaController{

    public void fechaComanda() {
        BaseDados base = DBController.getBaseDados();
        
        switch(base){
            case Arquivo: break;
            
            case Serial: break;
            
            case JDBC: 
            {
                
                
                break;
            }
        }
    }

    public void adicionaPedido() {
        BaseDados base = DBController.getBaseDados();
        
        switch(base){
            case Arquivo: break;
            
            case Serial: break;
            
            case JDBC: 
            {
                
                
                break;
            }
        }
    }

    public void adicionaMesa() {
        BaseDados base = DBController.getBaseDados();
        
        switch(base){
            case Arquivo: break;
            
            case Serial: break;
            
            case JDBC: 
            {
                MesaDAOJdbc mesa = new MesaDAOJdbc();        
                mesa.addMesa();
                
                break;
            }
        }
        
        
    }

    public void removeMesa() {
        BaseDados base = DBController.getBaseDados();
        
        switch(base){
            case Arquivo: break;
            
            case Serial: break;
            
            case JDBC: 
            {
                MesaDAOJdbc mesa = new MesaDAOJdbc();        
                mesa.removeMesa();
                
                break;
            }
        }
        
    }

    public void cancelaPedido() {
        BaseDados base = DBController.getBaseDados();
        
        switch(base){
            case Arquivo: break;
            
            case Serial: break;
            
            case JDBC: 
            {
                
                
                break;
            }
        }
    }


    public void abreMesa(int idMesa) {
        BaseDados base = DBController.getBaseDados();
        
        switch(base){
            case Arquivo: break;
            
            case Serial: break;
            
            case JDBC: 
            {
                MesaDAOJdbc mesa = new MesaDAOJdbc();        
                mesa.abrirMesa(idMesa);
                
                break;
            }
        }
    }

    
}
