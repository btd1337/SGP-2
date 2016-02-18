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

    public void cancelaPedido(int mesa, int linhaPedido, int qtde) {
        BaseDados base = DBController.getBaseDados();
        
        switch(base){
            case Arquivo: break;
            
            case Serial: break;
            
            case JDBC: 
            {
                MesaDAOJdbc m = new MesaDAOJdbc();        
                m.cancelarPedido(mesa,linhaPedido,qtde);
                
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

    public String getHorarioEntrada(int mesaSelecionada) {
        String entrada = "";
        BaseDados base = DBController.getBaseDados();
        
        switch(base){
            case Arquivo: break;
            
            case Serial: break;
            
            case JDBC: 
            {
                MesaDAOJdbc mesa = new MesaDAOJdbc();        
                entrada = mesa.getHorarioEntrada(mesaSelecionada);
                
                break;
            }
        }
        return entrada;
    }

    
}
