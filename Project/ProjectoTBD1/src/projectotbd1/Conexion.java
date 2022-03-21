/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectotbd1;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Luis Carlos Flores
 */
public class Conexion {
    Connection conn;
    private String host = "localhost";
    private String port= "3306";
    private String dbName= "northwind";
    private String userName= "root";
    private String password= "Delmi.luis2000";

    public Conexion() {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url= "jdbc:mysql://" + this.host + ":" + this.port + "/" + this.dbName;
            conn=DriverManager.getConnection(url,this.userName,this.password);
            //System.out.println("EXITOSA");
        } catch(Exception e){
            System.out.println(e);
        } 
        
    }
    
    
}
