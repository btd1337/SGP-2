
import java.text.DecimalFormat;

/**
 * @author btd
 */
class Pedido {
    private final Produto produto;
    private int qtdeDoProduto;
    private double valorDoPedido;

    public Pedido(Produto mercadoria, int qtdeDeItens) {
        this.produto = mercadoria;
        this.qtdeDoProduto = qtdeDeItens;
        this.valorDoPedido = mercadoria.getValor()*qtdeDeItens;
    }
    
    //Construtor auxiliar todo zerado
    Pedido() {
        Produto p = new Produto(" ",0.00);
        this.produto = p;
        this.qtdeDoProduto = 0;
        this.valorDoPedido = 0.00;
    }

    public Produto getProduto() {
        return produto;
    }

    public int getQtdeDoProduto() {
        return qtdeDoProduto;
    }

    public double getValorDoPedido() {
        return valorDoPedido;
    }
    
    //Adiciona novos itens após já ter sido feito o pedido
    public void addItem(int qtde){
        this.qtdeDoProduto += qtde;
        this.valorDoPedido = produto.getValor()*qtdeDoProduto;
    }
    
    public void cancelarItem(int qtde){
        this.qtdeDoProduto -= qtde;
        this.valorDoPedido = produto.getValor()*qtdeDoProduto;
    }

    @Override
    public String toString() {
        return produto.getNome() + "          Qtde: " + qtdeDoProduto + 
                "          R$ " +                 valorDoPedido;
    }
    
    
    
}
