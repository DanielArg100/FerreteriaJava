/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ferretería.Capa_Lógica;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import ferretería.Capa_Datos.ConexiónDB;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
/**
 *
 * @author danic
 */
public class Clase_login {
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    ConexiónDB cc= new ConexiónDB();
    
    public boolean VerificarUsuario(String usuario,String password) {
        String query="SELECT * FROM Login Where Usuario=? AND Password=?";
        try {
            ps=con.prepareStatement(query);
            ps.setString(1, usuario);
            ps.setString(2, password);
            rs=ps.executeQuery();
            if(rs.next()) {
                return true;
            }
        } catch (SQLException Error) {
            JOptionPane.showMessageDialog(null, Error.toString());
        }
        return false;
    }
}
