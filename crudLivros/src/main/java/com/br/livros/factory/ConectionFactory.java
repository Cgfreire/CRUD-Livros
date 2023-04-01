package com.br.livros.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
 

public class ConectionFactory {
    private static final String USERNAME = "root";
    private static final String PASSWORD = "SQLosasco2412";
    private static final String DATABASE_URL = "jdbs://localhost:3306/biblioteca";
    
    
    public static Connection createConnectioBanco() throws ClassNotFoundException, SQLException{
        Class.forName("com.mysql.jdbc.Driver");
        
        Connection connection = DriverManager.getConnection(DATABASE_URL,USERNAME,PASSWORD);
        
        return connection;
    }
    
    public static void main(String[] args) throws ClassNotFoundException, SQLException{
        
        Connection con = createConnectioBanco();
        
        if(con != null){
            System.out.println("COnexão bem sucessida");
            con.close();
        }
    }
};
