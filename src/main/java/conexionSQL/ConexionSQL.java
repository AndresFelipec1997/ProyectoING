/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConexionSQL;

import com.sun.jdi.connect.spi.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;


/**
 *
 * @author Esteban
 */
public class ConexionSQL {
    
     
    Connection conectar = null;

    public Connection conexion(){

        try {
            Class.forName("com.mysql.jdbc.Driver");    
            conectar = (Connection) DriverManager
            		.getConnection("jdbc:mysql://localhost:3306/escuela","root", "esalas21");
 
            JOptionPane.showMessageDialog(null," Conexion Exitosa");
        }
     catch(Exception e){
         
        JOptionPane.showMessageDialog(null," Conexion NO Exitosa " + e. getMessage() );
    }
   
    return conectar;
    }
}
