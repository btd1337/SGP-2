package model;

/**
 *
 * @author helder
 */
public class Extras extends Produto{
    

    public Extras(String nome, double valor) {
        super(nome, valor);
    }
  

    @Override
    public void setDescricao(String descricao) {
        super.setDescricao(descricao); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public String getDescricao(){
        return this.getDescricao();
    }
    
}
