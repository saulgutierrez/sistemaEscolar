package controlador;
import java.awt.BorderLayout;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
import vista.Dashboard;
import vista.Perfil;

public class Conexion {
    Connection conn = null;
    PreparedStatement ps;
    String db = "sistemaescolar";
    String user = "root";
    String pass = "admin";
    String ip = "localhost";
    String puerto = "3307";
    String driver = "com.mysql.jdbc.Connection";
    String cadena = "jdbc:mysql://"+ip+":"+puerto+"/"+db;
    
    // Para hacer login
    public Connection conexion(String codigoAlumno, String claveAlumno) throws ClassNotFoundException {
        try {
            Class.forName(driver);
            conn =  DriverManager.getConnection(cadena, user, pass);
            ps = conn.prepareStatement("SELECT * FROM estudiante WHERE codigo = '"+codigoAlumno+"' AND nip = '"+claveAlumno+"'");
            ResultSet result = ps.executeQuery();
            if (result.next()) {
                Dashboard dashboard = new Dashboard();
                dashboard.setSize(1200, 700);
                dashboard.setResizable(false);
                dashboard.setLocationRelativeTo(null);
                dashboard.setVisible(true);
                dashboard.nombreAlumnoLabel.setText(result.getString(3) + " - "+ result.getString(2));
            } else {
                JOptionPane.showMessageDialog(null, "Login Failed");
                conn.close();
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error de conexion con el servidor"+e.toString());
        }
        return conn;
    }
    
    // Para hacer un registro
    public Connection conexionSinLogin() throws ClassNotFoundException, SQLException {
        try {
            Class.forName(driver);
            conn = (Connection) DriverManager.getConnection(cadena, user, pass);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error de conexion con el servidor"+e.toString());   
    }
    return conn;
 }
    
    // Para hacer consulta de informacion
    public Connection conexion(String codigoAlumno, Dashboard d) throws ClassNotFoundException {
        try {
            Class.forName(driver);
            conn =  DriverManager.getConnection(cadena, user, pass);
            ps = conn.prepareStatement("SELECT * FROM estudiante WHERE codigo = '"+codigoAlumno+"'");
            ResultSet result = ps.executeQuery();
            Object nombre;
            Object codigo;
            Object nip;
            Object edad;
            Object genero;
            Object nacionalidad;
            Object correo;
            Object centro;
            Object carrera;
            Perfil perfil = new Perfil();
            perfil.setSize(970, 720);
            perfil.setLocation(0, 0);
            
            int i = 2;
            while (result.next()) {
                nombre = result.getObject(i);
                codigo = result.getObject(i+1);
                nip = result.getObject(i+2);
                edad = result.getObject(i+3);
                genero = result.getObject(i+4);
                nacionalidad = result.getObject(i+5);
                correo = result.getObject(i+6);
                centro = result.getObject(i+7);
                carrera = result.getObject(i+8);
                perfil.nombrePerfilTextField.setText(nombre.toString());
                perfil.codigoPerfilTextField.setText(codigo.toString());
                perfil.nipPerfilTextField.setText(nip.toString());
                perfil.edadPerfilTextField.setText(edad.toString());
                perfil.generoPerfilTextField.setText(genero.toString());
                perfil.nacionalidadPerfilTextField.setText(nacionalidad.toString());
                perfil.correoPerfilTextField.setText(correo.toString());
                perfil.centroPerfilTextField.setText(centro.toString());
                perfil.carreraPerfilTextField.setText(carrera.toString());
                d.contentPanel.removeAll();
                d.contentPanel.add(perfil, BorderLayout.CENTER);
                d.contentPanel.revalidate();
                d.contentPanel.repaint();
                i++;
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
