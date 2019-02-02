package com.hackt.database;

import java.sql.Connection;
import java.sql.DriverManager;

public class Generals {

    //simple factory pattern
    @SuppressWarnings("ReturnInsideFinallyBlock")
    public static Connection getConnection(){
        Connection con=null;
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            con= DriverManager.getConnection("jdbc:sqlserver://DESKTOP-3ISTHUS;databaseName=newdb;user=arber;password=arber;");
        }catch (Exception e){
            e.printStackTrace();
        }
        finally {
            return con;
        }
    }
}
