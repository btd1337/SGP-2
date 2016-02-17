package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author helder
 */
public class ConexaoDAO {
    
    private final String url = "jdbc:mysql://localhost/Pizzaria";
    private final String nome = "helder";
    private final String senha = "helder";
    private final int BancoMySQL = 0; 
    
    private Connection conexao;
    private Statement comando;
    private ResultSet resultado;
    
    public void conectar(){
        try{
            conexao = ConnectionFactory.conexao(url, nome, senha, BancoMySQL);
            comando = conexao.createStatement();
        } catch (ClassNotFoundException ex) {
            imprimeErro("Erro ao carregar o driver!", ex.getMessage());
            
        } catch (SQLException ex) {            
            imprimeErro("Erro ao iniciar conexão com o banco!", ex.getMessage());
        }
    }
    
    public void desconectar(){
        try{
            comando.close();
            conexao.close();
        } catch (SQLException ex) {
            imprimeErro("Erro ao fechar conexão com o Banco de Dados", ex.getMessage());
            
        }
    }
    
    public void imprimeErro(String msg, String msgErro){
        
        JOptionPane.showMessageDialog(
                    null, msg + "/n/n" + msgErro , "Erro Crítico", 
                JOptionPane.ERROR_MESSAGE);
        
        System.err.println(msg);
        System.out.println(msgErro);
    }

    public Statement getComando() {
        return comando;
    }

    
    public ResultSet getResultado(String query) {
        
        try {
            resultado = comando.executeQuery(query);
            return resultado;
        } catch (SQLException ex) {
            imprimeErro("Erro ao executar Query", ex.getMessage());
        }
        
        return null;    //caso aconteça algum erro
    }

    
    
    
}
