package CINEDL;

import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Conexion {

    String server = "localhost";
    String port = "3306";
    private String bd = "cinedl"; // Ajuste el nombre de la base de datos predeterminada aquí
    private String usuario = "root"; // Ajuste el nombre de usuario predeterminado aquí
    private String password = ""; // Ajuste la contraseña predeterminada aquí, si la hay
    String url = "jdbc:mysql://" + server + ":" + port + "/" + bd + "?useTimezone=true&serverTimezone=UTC";
    String driver = "com.mysql.cj.jdbc.Driver";
    Connection con;

    // Constructor por defecto con datos predeterminados
    public Conexion() {
        this("cinedl", "root", ""); // Llamar al constructor con parámetros con valores predeterminados
    }

    // Constructor con parámetros para personalizar la conexión
    public Conexion(String bd, String usuario, String password) {
        this.bd = bd;
        this.usuario = usuario;
        this.password = password;
        this.url = "jdbc:mysql://" + server + ":" + port + "/" + bd + "?useTimezone=true&serverTimezone=UTC";
    }

    // Función para conectar a la base de datos
    public Connection conectar() {
        try {
            Class.forName(driver);
            con = DriverManager.getConnection(url, usuario, password);
            System.out.println("Conexión exitosa a la base de datos: " + bd);
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al conectar a la base de datos");
            System.out.println("Error al conectar a la base de datos");
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, e);
        }
        return con;
    }

    // Función para desconectar de la base de datos
    public void desconectar() {
        try {
            if (con != null) {
                con.close();
                System.out.println("Desconexión exitosa");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al desconectar de la base de datos");
            System.out.println("Error al desconectar de la base de datos");
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    // Setters y getters
    public void setBd(String bd) {
        this.bd = bd;
    }

    public String getBd() {
        return bd;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }
}
