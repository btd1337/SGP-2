package model;


/**
 * @author btd
 */
public class Produto {
    private String nome;
    private String descricao;
    private double valor;

    public Produto(String nome, String descricao, double valor) {
        
        //primeira letra maiúscula
        nome = nome.substring(0,1).toUpperCase().concat(nome.substring(1));
        descricao = descricao.substring(0,1).toUpperCase().concat(descricao.substring(1));
        
        this.nome = nome;
        this.descricao = descricao;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }   
    

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
    @Override
    public String toString() {
        return nome + " - " + descricao + "-  R$" + valor;
    }
    
}
