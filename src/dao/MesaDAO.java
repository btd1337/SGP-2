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
    
    public int getNumIDMesa(int mesa);

    public boolean isOcupacaoMesa(int mesa);

    public void setOcupacaoMesa(boolean ocupacaoMesa, int mesa);  

    public void cancelarPedido(int mesa, int linhaPedido, int qtde);

    public double getTotalPagar(int mesa);

    public void setTotalPagar(double totalPagar, int mesa);
    
    public void abrirMesa(int mesa);
    
    public void fecharComanda(int mesa);

    public String getHorarioEntrada(int mesa);

    public String getHorarioSaida(int mesa);

    public ArrayList<Pedido> getPedidos(int mesa);    

    @Override
    public String toString();
}
