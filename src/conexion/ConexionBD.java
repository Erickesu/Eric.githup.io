
package conexion;

// Autor: EdilsonJMT

import java.sql.DriverManager;
import com.mysql.jdbc.Connection;

public class ConexionBD {
    
    //Crear conexion.
    Connection CP;
    
    public Connection conectar(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            CP= (Connection) DriverManager.getConnection("jdbc:mysql://localhost/sistemacp","root","");
            System.out.println("Conectado a MySQL");
        }   catch(Exception EX1){
            System.out.println("error:" +EX1);
        }
        return CP;
    }
    
    public static void main(String[] args) {
        ConexionBD x = new ConexionBD();
        x.conectar();
    }
}
