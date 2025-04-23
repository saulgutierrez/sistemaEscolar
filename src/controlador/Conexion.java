package controlador;
import java.awt.BorderLayout;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
import vista.PanelEstudiante;
import vista.PanelProfesor;
import vista.PerfilEstudiante;
import vista.PerfilProfesor;

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
                PanelEstudiante dashboard = new PanelEstudiante();
                dashboard.setSize(1200, 700);
                dashboard.setResizable(false);
                dashboard.setLocationRelativeTo(null);
                dashboard.setVisible(true);
                dashboard.nombreAlumnoLabel.setText(result.getString(3) + " - "+ result.getString(2));
            } else {
                try {
                    Class.forName(driver);
                    conn = DriverManager.getConnection(cadena, user, pass);
                    ps = conn.prepareStatement("SELECT * FROM profesor WHERE codigo = '"+codigoAlumno+"' AND nip='"+claveAlumno+"'");
                    ResultSet result2 = ps.executeQuery();
                    if (result2.next()) {
                        PanelProfesor dashboardProfesor = new PanelProfesor();
                        dashboardProfesor.setSize(1200, 700);
                        dashboardProfesor.setResizable(false);
                        dashboardProfesor.setLocationRelativeTo(null);
                        dashboardProfesor.setVisible(true);
                        dashboardProfesor.nombreAlumnoLabel.setText(result2.getString(3) + " - " + result2.getString(2));
                    } else {
                        JOptionPane.showMessageDialog(null, "Login Failed");
                        conn.close();
                    }
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "Error de conexion con el servidor" + ex.toString());
                }
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
    
    // Para hacer consulta de informacion de estudiante
    // Tambien puede servir para actualizar informacion si se envia un tercer
    // parametro de forma numerica en este constructor conexion
    // Si numero = 0, entonces mostramos informacion
    // Si numero = 1, entonces actualizamos los datos
    public Connection conexion(String codigoAlumno, PanelEstudiante d, int action, PerfilEstudiante perfilActualizar) throws ClassNotFoundException {
        // Mostrar informacion
        if (action == 0) {
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
                Object rol;
                PerfilEstudiante perfil = new PerfilEstudiante();
                perfil.setSize(970, 720);
                perfil.setLocation(0, 0);

                int i = 1;
                while (result.next()) {
                    rol = result.getObject(i);
                    nombre = result.getObject(i+1);
                    codigo = result.getObject(i+2);
                    nip = result.getObject(i+3);
                    edad = result.getObject(i+4);
                    genero = result.getObject(i+5);
                    nacionalidad = result.getObject(i+6);
                    correo = result.getObject(i+7);
                    centro = result.getObject(i+8);
                    carrera = result.getObject(i+9);
                    perfil.nombrePerfilTextField.setText(nombre.toString());
                    perfil.codigoPerfilTextField.setText(codigo.toString());
                    perfil.nipPerfilTextField.setText(nip.toString());
                    perfil.edadPerfilTextField.setText(edad.toString());
                    perfil.generoPerfilTextField.setText(genero.toString());
                    perfil.nacionalidadPerfilTextField.setText(nacionalidad.toString());
                    perfil.correoPerfilTextField.setText(correo.toString());
                    perfil.centroPerfilTextField.setText(centro.toString());
                    perfil.carreraPerfilTextField.setText(carrera.toString());
                    perfil.rolTextField.setText(rol.toString());
                    d.contentPanel.removeAll();
                    d.contentPanel.add(perfil, BorderLayout.CENTER);
                    d.contentPanel.revalidate();
                    d.contentPanel.repaint();
                    i++;
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Error de conexion con el servidor"+e.toString());
            }
        } else { // Actualizar infromacion
            try {
                Class.forName(driver);
                conn =  DriverManager.getConnection(cadena, user, pass);
                Object rol = perfilActualizar.rolTextField.getText();
                Object nombre = perfilActualizar.nombrePerfilTextField.getText();
                int codigo = Integer.parseInt(perfilActualizar.codigoPerfilTextField.getText());
                Object nip = perfilActualizar.nipPerfilTextField.getText();
                Object edad = perfilActualizar.edadPerfilTextField.getText();
                Object genero = perfilActualizar.generoPerfilTextField.getText();
                Object nacionalidad = perfilActualizar.nacionalidadPerfilTextField.getText();
                Object correo = perfilActualizar.correoPerfilTextField.getText();
                Object centro = perfilActualizar.centroPerfilTextField.getText();
                Object carrera = perfilActualizar.carreraPerfilTextField.getText();
                String sql = "UPDATE estudiante SET rol = ?, nombre = ?, nip = ?, edad = ?, genero = ?, nacionalidad = ?, correo = ?, centro = ?, carrera = ? WHERE codigo = '"+codigo+"'";
                try (PreparedStatement statement = conn.prepareStatement(sql)) {
                    statement.setString(1, rol.toString().trim());
                    statement.setString(2, nombre.toString().trim());
                    statement.setString(3, nip.toString().trim());
                    statement.setString(4, edad.toString().trim());
                    statement.setString(5, genero.toString().trim());
                    statement.setString(6, nacionalidad.toString().trim());
                    statement.setString(7, correo.toString().trim());
                    statement.setString(8, centro.toString().trim());
                    statement.setString(9, carrera.toString().trim());
                    
                    int result = statement.executeUpdate(); 
                    if (result > 0) {
                        JOptionPane.showMessageDialog(null, "Datos actualizados exitosamente");
                    }
                }
                perfilActualizar.setSize(970, 720);
                perfilActualizar.setLocation(0, 0);
                d.contentPanel.removeAll();
                d.contentPanel.add(perfilActualizar, BorderLayout.CENTER);
                d.contentPanel.revalidate();
                d.contentPanel.repaint();
            } catch (SQLException | NumberFormatException e) {
                System.out.println("Message: " + e.getMessage());
            }
        }
        return null;
        }
    
    // Para hacer consulta de informacion de profesor
    // Tambien puede servir para actualizar informacion si se envia un tercer
    // parametro de forma numerica en este constructor conexion
    // Si numero = 0, entonces mostramos informacion
    // Si numero = 1, entonces actualizamos los datos
    public Connection conexionProfesor(String codigoAlumno, PanelProfesor d, int action, PerfilProfesor perfilActualizar) throws ClassNotFoundException {
        // Mostrar informacion
        if (action == 0) {
            try {
                Class.forName(driver);
                conn =  DriverManager.getConnection(cadena, user, pass);
                ps = conn.prepareStatement("SELECT * FROM profesor WHERE codigo = '"+codigoAlumno+"'");
                ResultSet result = ps.executeQuery();
                Object nombre;
                Object codigo;
                Object nip;
                Object titulo;
                Object departamento;
                Object correo;
                Object centro;
                Object rol;
                PerfilProfesor perfil = new PerfilProfesor();
                perfil.setSize(970, 720);
                perfil.setLocation(0, 0);

                int i = 1;
                while (result.next()) {
                    rol = result.getObject(i);
                    nombre = result.getObject(i+1);
                    codigo = result.getObject(i+2);
                    nip = result.getObject(i+3);
                    titulo = result.getObject(i+4);
                    departamento = result.getObject(i+5);
                    correo = result.getObject(i+6);
                    centro = result.getObject(i+7);
                    perfil.nombrePerfilTextField.setText(nombre.toString());
                    perfil.codigoPerfilTextField.setText(codigo.toString());
                    perfil.nipPerfilTextField.setText(nip.toString());
                    perfil.correoPerfilTextField.setText(correo.toString());
                    perfil.rolTextField.setText(rol.toString());
                    perfil.tituloPerfilTextField.setText(titulo.toString());
                    perfil.departamentoTextField.setText(departamento.toString());
                    perfil.centroTextField.setText(centro.toString());
                    d.contentPanel.removeAll();
                    d.contentPanel.add(perfil, BorderLayout.CENTER);
                    d.contentPanel.revalidate();
                    d.contentPanel.repaint();
                    i++;
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Error de conexion con el servidor"+e.toString());
            }
        } else { // Actualizar infromacion
            try {
                Class.forName(driver);
                conn =  DriverManager.getConnection(cadena, user, pass);
                Object rol = perfilActualizar.rolTextField.getText();
                Object nombre = perfilActualizar.nombrePerfilTextField.getText();
                int codigo = Integer.parseInt(perfilActualizar.codigoPerfilTextField.getText());
                Object nip = perfilActualizar.nipPerfilTextField.getText();
                Object titulo = perfilActualizar.tituloPerfilTextField.getText();
                Object departamento = perfilActualizar.departamentoTextField.getText();
                Object correo = perfilActualizar.correoPerfilTextField.getText();
                Object centro = perfilActualizar.centroTextField.getText();
                String sql = "UPDATE profesor SET rol = ?, nombre = ?, nip = ?, titulo = ?, departamento = ?, correo = ?, centro_universitario = ? WHERE codigo = '"+codigo+"'";
                try (PreparedStatement statement = conn.prepareStatement(sql)) {
                    statement.setString(1, rol.toString().trim());
                    statement.setString(2, nombre.toString().trim());
                    statement.setString(3, nip.toString().trim());
                    statement.setString(4, titulo.toString().trim());
                    statement.setString(5, departamento.toString().trim());
                    statement.setString(6, correo.toString().trim());
                    statement.setString(7, centro.toString().trim());
                    
                    int result = statement.executeUpdate(); 
                    if (result > 0) {
                        JOptionPane.showMessageDialog(null, "Datos actualizados exitosamente");
                    }
                }
                perfilActualizar.setSize(970, 720);
                perfilActualizar.setLocation(0, 0);
                d.contentPanel.removeAll();
                d.contentPanel.add(perfilActualizar, BorderLayout.CENTER);
                d.contentPanel.revalidate();
                d.contentPanel.repaint();
            } catch (SQLException | NumberFormatException e) {
                System.out.println("Message: " + e.getMessage());
            }
        }
        return null;
        }
    
    public boolean isConnect(Connection conn) throws SQLException {
        return this.conn.isClosed();
    }
}
