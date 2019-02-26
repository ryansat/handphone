/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
//koneksi
/**
 *
 * @author Vadley
 */
public class DBConnection {
    
    private final Connection connection;
    private static DBConnection instance=null;

    private DBConnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        this.connection = DriverManager.
                getConnection("jdbc:mysql://localhost:3306/dbhp","root","");        
    }

    public Connection getConnection() {
        return connection;
    }

    public static DBConnection getInstance() throws ClassNotFoundException, SQLException {
        if(instance==null){
            instance=new DBConnection();
        }
        return instance;
    }
    
    
    
    
}
