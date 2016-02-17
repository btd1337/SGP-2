package model;


/**
 * @author btd
 */
public class Produto {
    private String nome;
    private double valor1;
    private double valor2;
    private double valor3;
    private String descricao;

    public Produto(String nome, double valor) {
        
        //primeira letra maiúscula
        nome = nome.substring(0,1).toUpperCase().concat(nome.substring(1));
        
        this.nome = nome;
        this.valor1 = valor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }  
    

    public double getValor1() {
        return valor1;
    }

    public void setValor1(double valor1) {
        this.valor1 = valor1;
    }

    public double getValor2() {
        return valor2;
    }

    public void setValor2(double valor2) {
        this.valor2 = valor2;
    }

    public double getValor3() {
        return valor3;
    }

    public void setValor3(double valor3) {
        this.valor3 = valor3;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    
    
    @Override
    public String toString() {
        return nome + " - " + "-  R$" + valor1;
    }
    
}
