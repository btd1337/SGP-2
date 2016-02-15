package dao;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author helder
 */
public class ConnectionFactory {
    public static final int MySQL = 0;
    public static final String MySQLDriver = "com.mysql.jdbc.Driver";
    
    public static Connection conexao(String url, String nome, String senha, int banco) throws ClassNotFoundException, SQLException{
        switch(banco){
            case MySQL: 
                Class.forName(MySQLDriver);
                break;
        }
        return (Connection) DriverManager.getConnection(url,nome,senha);
    }
    
}
