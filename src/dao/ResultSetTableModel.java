package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author helder
 */
public class ResultSetTableModel extends AbstractTableModel{
    
    private Connection connection;
    private Statement statement;
    private ResultSet resultSet;
    private ResultSetMetaData metaData;
    private int numberOfRows;
    
    
    //monitora o status da conexão de banco de dados
    private boolean connectedToDatabase = false;
    private final String url = "jdbc:mysql://localhost/Pizzaria";
    private final String nome = "helder";
    private final String senha = "helder"; 
    
    //construtor inicilializa resultSEt e obtém seu objeto de metadados;
    //determina número de linhas
    public ResultSetTableModel(String query) throws SQLException{
        //conecta-se ao banco de dados
        connection = DriverManager.getConnection(url,nome,senha);
        
        //cria Statement para consultar o banco de dados
        statement = connection.createStatement(
        ResultSet.TYPE_SCROLL_INSENSITIVE,
        ResultSet.CONCUR_READ_ONLY);
        
        //atualiza status da conexão de banco de dados
        connectedToDatabase = true;
        
        //configura consulta e a executa
        setQuery(query);
    }
    
    //obtém a classe que representa o tipo de coluna
    public Class getColumnClass(int column){
        //assegura que o banco de dados conexão está disponível
        if(!connectedToDatabase){
            throw new IllegalStateException("Not Connected to Database!");
        }
        
        //determina a classe Java de coluna
        try{
            String className = metaData.getColumnClassName(column + 1);
            
            //retorna objeto Class que representa className
            return Class.forName(className);
        } 
        catch (SQLException ex) {
            ex.printStackTrace();
        }
        catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
        
        return Object.class;    //se ocorerem os problemas acima, assume tipo Object
    }
    
    @Override
    public int getColumnCount() throws IllegalStateException{
        //assegura que o banco de dados conexão está disponivel
        if(!connectedToDatabase){
            throw new IllegalStateException("Not connected to Database!");
        }
        
        //determina o número de colunas
        try{
            return metaData.getColumnCount();
            
        } 
        catch (SQLException ex) {
            ex.printStackTrace();
        }
        
        return 0;   //se ocorrerem os problemas acima, retorna 0 para o número de colunas
    }
    
    
    //obtém o nome de uma coluna particular em ResultSet
    public String getColumnName(int column) throws IllegalStateException{
        //assegura que o banco de dados conexão está disponível
        if(!connectedToDatabase){
            throw new IllegalStateException("Not Connected to Database!");
        }
        
        //determina o nome de coluna
        try{
            return metaData.getColumnName(column+1);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
        return "";  //se ocorrerem problemas, retorna string vazia para o nome da coluna
    }
    

    @Override
    public int getRowCount() throws IllegalStateException{
        //assegura que o banco de dados conexão está disponível
        if(!connectedToDatabase){
            throw new IllegalStateException("Not Connected to Database!");
        }
        
        return numberOfRows;
    }
    

    //obtem o valor de uma linha ou coluna em particular
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) throws IllegalStateException {
        //assegura que a conexão com a base de dados está disponível
        if(!connectedToDatabase){
            throw new IllegalStateException("Not Connected to Database!");
        }
        
        //obtem o valor na linha e na coluna especificados no ResultSet
        try{
            resultSet.absolute(rowIndex + 1);
            return resultSet.getObject(columnIndex + 1);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
        return "";  //se acontecer problemas, retorna objeto string vazio
    }

    //configura a nova string de consulta ao banco de dados
    public void setQuery(String query) throws SQLException, IllegalStateException{
        //assegura que a conexão com o banco de dados está disponível
        if(!connectedToDatabase){
            throw new IllegalStateException("Not Connected to Database!");
        }
        
        //especifica a consulta e a executa
        resultSet = statement.executeQuery(query);
        
        //obtém os metadados para o ResultSet
        metaData = resultSet.getMetaData();
        
        //determina o número de linhas em ResultSet
        resultSet.last();   //move para a última linha
        numberOfRows = resultSet.getRow();  //obtém o número de linha
        
        //notifica o JTable de que o modelo foi alterado
        fireTableStructureChanged();
    }
    
    //fecha Statement e Connection
    public void disconnectionFromDataBase(){
        if(connectedToDatabase){
            //fecha Statement e Connection
            try{
                resultSet.close();
                statement.close();
                connection.close();
            }
            catch(SQLException sQLException){
                sQLException.printStackTrace();
            }
            finally{    //atualiza status de conexão de banco de dados
                connectedToDatabase = false;
            }
        };
    }
}