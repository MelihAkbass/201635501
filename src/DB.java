
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * 
 */
public class DB {
    
    private String username = "root";
    private String password = "";
    private String databaseName = "201635501";
    private String host = "localhost";
    private int port = 3306;
    
    private String connectedUser = null;

    
    
    public static Connection connection = null;
    private boolean connectionStatus = false;
    
    public static Statement statement=null;

    public DB() {
        
        String url = "jdbc:mysql://" + host +":" + port + "/" + databaseName;
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            System.out.println("Not found Driver...");
        }
        
        try {
            connection = DriverManager.getConnection(url, username, password);
            statement = (Statement) connection.createStatement();
            System.out.println("Connection is successfull...");
            connectionStatus = true;
            
        } catch (SQLException ex) {
            System.out.println("Connection is unsuccessfull...");
            connectionStatus = false;
        }
    }
    
    public boolean login(String username, String password) {
        try {
            String sql = "SELECT * FROM accounts WHERE Username = '"+username+"' AND Password = '"+String.valueOf(password)+"'\n";
            ResultSet rss = statement.executeQuery(sql);
            connectedUser = username; // get connected username
            
            return rss.next();
            
        } catch (SQLException e) {
            System.out.println("Some mistakes...");
            return false;
        }
    }
    
    public String getConnectedUser() {
        return connectedUser;
    }
    
    /*
    * Return database item by ID
    */
    
    public ResultSet getItemByUserName(String username) {
        
        String rqst = "SELECT * FROM accounts WHERE Username = '"+ username +"'"; //get items by id  
        try {
            
            statement = connection.createStatement();
            
           ResultSet result = statement.executeQuery(rqst);
           return result;
            
        } catch (SQLException ex) {
            Logger.getLogger(DB.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
     
    public boolean isConnectionStatus() {
        return connectionStatus;
    }

    public void setConnectionStatus(boolean connectionStatus) {
        this.connectionStatus = connectionStatus;
    }
    
}
