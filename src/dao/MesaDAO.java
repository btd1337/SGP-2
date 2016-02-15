/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import model.Pedido;

/**
 *
 * @author helder
 */
public interface MesaDAO {
    
    public int getNumIDMesa();

    public boolean isOcupacaoMesa();

    public void setOcupacaoMesa(boolean ocupacaoMesa);  
    
    public void acrescentarPedido(Pedido p);

    public void cancelarPedido(Pedido produto, int qtde);

    public double getTotalPagar();

    public void setTotalPagar(double totalPagar);
    
    public void abrirMesa();
    
    public void fecharComanda();

    public String getHorarioEntrada();

    public String getHorarioSaida();

    public ArrayList<Pedido> getPedidos();    

    @Override
    public String toString();
}
