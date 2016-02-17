package model;

/**
 *
 * @author helder
 */
public class Pizza extends Produto{

    public Pizza(String nome, double valor1) {
        super(nome, valor1);
    }


    @Override
    public void setValor2(double valor2) {
        super.setValor2(valor2); //To change body of generated methods, choose Tools | Templates.
    }


    @Override
    public void setValor3(double valor3) {
        super.setValor3(valor3); //To change body of generated methods, choose Tools | Templates.
    }


    @Override
    public double getValor2() {
        return super.getValor2(); //To change body of generated methods, choose Tools | Templates.
    }
    

    @Override
    public double getValor3() {
        return super.getValor3(); //To change body of generated methods, choose Tools | Templates.
    }
}
