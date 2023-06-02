package controlador;
import java.sql.PreparedStatement;
import java.sql.Connection;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.SQLException;
import vista.Dashboard;

public class Conexion {
    Connection conn = null;
    PreparedStatement ps;
    String db = "sistemaescolar";
    String user = "root";
    String pass = "admin";
    String ip = "localhost";
    String puerto = "3307";
    String driver = "com.mysql.cj.jdbc.Driver";
    
    String cadena = "jdbc:mysql://"+ip+":"+puerto+"/"+db;
    
    public Connection conexion(String codigoAlumno, String claveAlumno) throws ClassNotFoundException {
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(cadena, user, pass);
            ps = conn.prepareStatement("SELECT `codigo`, `nip` FROM estudiante WHERE `codigo` = ? AND `nip` = ?");
            ps.setString(1, codigoAlumno);
            ps.setString(2, claveAlumno);
            ResultSet result = ps.executeQuery();
            if (result.next()) {
                Dashboard dashboard = new Dashboard();
                dashboard.setSize(1200, 700);
                dashboard.setResizable(false);
                dashboard.setLocationRelativeTo(null);
                dashboard.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Login Failed");
                conn.close();
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error de conexion con el servidor"+e.toString());
        }
        return conn;
    }
    
    public boolean isConnect(Connection conn) throws SQLException {
        return this.conn.isClosed();
    }
}
