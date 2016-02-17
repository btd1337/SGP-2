package dao;

import static dao.ConnectionFactory.conexao;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author helder
 */
public class ProdutoDAOJdbc implements ProdutoDAO{

    private Statement comando;
    private ResultSet resultado;
    private ResultSetMetaData resultadoMD;
    private ConexaoDAO conexao = new ConexaoDAO();
    
    @Override
    //Cria pizza
    public void criaProduto(String nome, double valor1, double valor2, double valor3) {
        
        conexao.conectar();
        comando = conexao.getComando();
        try {
            //insere nova pizza
            comando.executeUpdate("INSERT INTO Pizzas(Pizza,P,M,G) VALUES('" +
                    nome + "','" + valor1 + "','" + valor2 + "','" + valor3 + "')");       
            
                    
            JOptionPane.showMessageDialog(
                    null, "Produto adicionado com sucesso!","Mesas",
                    JOptionPane.INFORMATION_MESSAGE);
            
        } catch (SQLException ex) {
            conexao.imprimeErro("Erro ao adicionar produto!", ex.getMessage());
            
        } finally {
            conexao.desconectar();
        }
        
    }

    @Override
    //Adiciona produto extra
    public void criaProduto(String nome, String descricao, double valor) {
        conexao.conectar();
        comando = conexao.getComando();
        try {
            //insere nova pizza
            comando.executeUpdate("INSERT INTO Extras(Produto,Descricao,Valor) VALUES('" +
                    nome + "','" + descricao + "','" + valor + "')");       
            
                    
            JOptionPane.showMessageDialog(
                    null, "Produto adicionado com sucesso!","Mesas",
                    JOptionPane.INFORMATION_MESSAGE);
            
        } catch (SQLException ex) {
            conexao.imprimeErro("Erro ao adicionar produto!", ex.getMessage());
            
        } finally {
            conexao.desconectar();
        }
    }

    public void removePizza(int tabelaPizzasLinhaSelecionada) {
        String pizza;
        
        conexao.conectar();
        comando = conexao.getComando();
        try {
            
            
            resultado = comando.executeQuery("SELECT Pizza From Pizzas");
            resultado.absolute(tabelaPizzasLinhaSelecionada);
            pizza = resultado.getString("Pizza");
            comando.executeUpdate("DELETE FROM Pizzas WHERE Pizza = '" + pizza + "'");       
            
                    
            JOptionPane.showMessageDialog(
                    null, "Produto removido com sucesso!", "Remover Produto",
                    JOptionPane.INFORMATION_MESSAGE);
            
        } catch (SQLException ex) {
            conexao.imprimeErro("Erro ao remover produto!", ex.getMessage());
            
        } finally {
            conexao.desconectar();
        }
        
    }

    public void removeExtra(int tabelaExtrasLinhaSelecionada) {
        String produto;
        
        conexao.conectar();
        comando = conexao.getComando();
        try {
            
            
            resultado = comando.executeQuery("SELECT Produto From Extras");
            resultado.absolute(tabelaExtrasLinhaSelecionada);
            produto = resultado.getString("Produto");
            comando.executeUpdate("DELETE FROM Extras WHERE Produto = '" + produto + "'");       
            
                    
            JOptionPane.showMessageDialog(
                    null, "Produto removido com sucesso!", "Remover Produto",
                    JOptionPane.INFORMATION_MESSAGE);
            
        } catch (SQLException ex) {
            conexao.imprimeErro("Erro ao adicionar produto!", ex.getMessage());
            
        } finally {
            conexao.desconectar();
        }
    }

}
