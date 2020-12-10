/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prueba;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
/**
 *
 * @author Felipe
 */
public class Conexión {
    
    
    static Connection contacto = null;
    public static String usuario;
    public static String contraseña;
    public static boolean estado = false;
    
    public static Connection getConexion(){
        estado = false;
        
        String url = "jdbc:sqlserver://localhost:1433;databaseName=Restaurant";
        
        String conecxionurl = "jdbc:sqlserver://localhost:1433;"
                +"database=AdmAyuntamiento;"
                +"user=Felipe;"
                +"password=123;"
                +"loginTimeout=30";
        
        try {
            
            contacto = DriverManager.getConnection(url, Conexión.usuario,Conexión.contraseña );
            estado = true;
            return contacto;
        } catch (SQLException e) {
            System.out.println(e.toString());
            return null;
        }
        
        
    }
    
    
    
    public static boolean getEstado(){
        return estado;
    }
        
    public static void setCuenta(String usuario, String contraseña){
        
        Conexión.usuario = usuario;
        Conexión.contraseña = contraseña;
        
    }
            
    
    public static ResultSet Consulta(String consulta){
        Connection con = getConexion();
        Statement declara;
            try {
                declara = con.createStatement();
                ResultSet respuesta = declara.executeQuery(consulta);
                return respuesta;
            } catch (SQLException e) {
            }
            return null;
    }
    
}
