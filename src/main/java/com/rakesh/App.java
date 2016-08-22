package com.rakesh;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello Docker!!!!!" );

        try{
            Class.forName("com.mysql.jdbc.Driver");

            Connection con= DriverManager.getConnection(
                    "jdbc:mysql://172.17.0.2:3306/sample","mysql","mysql");

            Statement stmt=con.createStatement();

            ResultSet rs=stmt.executeQuery("select * from information_schema.tables");

            while(rs.next())
                System.out.println("Table Name is "+rs.getString("table_name"));

            con.close();

        }catch(Exception e){
            e.printStackTrace();
            System.out.println(e);
        }

    }

}
