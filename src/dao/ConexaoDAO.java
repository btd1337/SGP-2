package dao;

import java.sql.SQLException;

/**
 *
 * @author helder
 */
public class ConexaoDAO {
    
    public void conectar(String url, String nome, String senha, String BancoMySQL){
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
        } catch (SQLException ex) {
            imprimeErro("Erro ao fechar conexão com o Banco de Dados", ex.getMessage());
            
        }
    }
}
