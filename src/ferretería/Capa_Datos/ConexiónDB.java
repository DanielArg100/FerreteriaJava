/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ferretería.Capa_Datos;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author danic
 */
public class ConexiónDB {
    Connection con;
    public Connection ConectarDB(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
                con=DriverManager.getConnection("jdbc:mysql://localhost:3306/","root","");
        } catch (Exception e) {
        }
    }
}
