package main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CConexion {
    Connection conn = null;

    public Connection getConexion() {
        try {
            // Uso del nuevo controlador JDBC de MySQL
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/3m", "root", "1WMG2023");
        } catch (ClassNotFoundException | SQLException e) {
            // Impresión del error y salida del programa en caso de fallo
            System.out.println("Error de conexión en getConexion(): " + e);
            Logger.getLogger(CConexion.class.getName()).log(Level.SEVERE, null, e);
            System.exit(1); // Salida con código de error 1
        }
        return conn;
    }
    
    // Método main para probar la conexión
    public static void main(String[] args) {
        CConexion conexion = new CConexion();
        Connection conn = conexion.getConexion();
        if (conn != null) {
            System.out.println("Conexión establecida correctamente.");
            try {
                conn.close(); // Cerrar la conexión una vez terminado
            } catch (SQLException e) {
                System.out.println("Error al cerrar la conexión: " + e);
            }
        } else {
            System.out.println("No se pudo establecer la conexión.");
        }
    }
}
