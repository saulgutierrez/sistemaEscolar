package vista;

import controlador.Conexion;
import java.awt.event.ItemEvent;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.*;
import javax.swing.JOptionPane;
import modelo.Estudiante;

public class Registro extends javax.swing.JFrame {

    public Registro() {
        initComponents();
        edadLabel.setVisible(true);
        edadComboBox.setVisible(true);
        generoLabel.setVisible(true);
        generoComboBox.setVisible(true);
        nacionalidadLabel.setVisible(true);
        nacionalidadComboBox.setVisible(true);
        departamentoLabel.setVisible(false);
        departamentoTextField.setVisible(false);
        carreraLabel.setText("Carrera");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        rolComboBox = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        edadLabel = new javax.swing.JLabel();
        generoLabel = new javax.swing.JLabel();
        nacionalidadLabel = new javax.swing.JLabel();
        carreraLabel = new javax.swing.JLabel();
        departamentoTextField = new javax.swing.JTextField();
        nombreTextField = new javax.swing.JTextField();
        generoComboBox = new javax.swing.JComboBox<>();
        edadComboBox = new javax.swing.JComboBox<>();
        carreraComboBox = new javax.swing.JComboBox<>();
        nipTextField = new javax.swing.JTextField();
        nacionalidadComboBox = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        centroComboBox = new javax.swing.JComboBox<>();
        btnVolver = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btnRegistrar = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        correoTextField = new javax.swing.JTextField();
        departamentoLabel = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        codigoTextField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(70, 73, 75));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rolComboBox.setBackground(new java.awt.Color(51, 51, 51));
        rolComboBox.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rolComboBox.setForeground(new java.awt.Color(255, 255, 255));
        rolComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Estudiante", "Profesor", "Administrador" }));
        rolComboBox.setBorder(null);
        rolComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rolComboBoxActionPerformed(evt);
            }
        });
        jPanel1.add(rolComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 370, 34));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Seleccione rol:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Correo");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 380, -1, -1));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Nombre");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("NIP");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, -1, -1));

        edadLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        edadLabel.setForeground(new java.awt.Color(255, 255, 255));
        edadLabel.setText("Edad");
        jPanel1.add(edadLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, -1, -1));

        generoLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        generoLabel.setForeground(new java.awt.Color(255, 255, 255));
        generoLabel.setText("Género");
        jPanel1.add(generoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 310, -1, -1));

        nacionalidadLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        nacionalidadLabel.setForeground(new java.awt.Color(255, 255, 255));
        nacionalidadLabel.setText("Nacionalidad:");
        jPanel1.add(nacionalidadLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 310, -1, -1));

        carreraLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        carreraLabel.setForeground(new java.awt.Color(255, 255, 255));
        carreraLabel.setText("Carrera:");
        jPanel1.add(carreraLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 520, -1, -1));

        departamentoTextField.setBackground(new java.awt.Color(51, 51, 51));
        departamentoTextField.setForeground(new java.awt.Color(255, 255, 255));
        departamentoTextField.setBorder(null);
        jPanel1.add(departamentoTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 340, 370, 34));

        nombreTextField.setBackground(new java.awt.Color(51, 51, 51));
        nombreTextField.setForeground(new java.awt.Color(255, 255, 255));
        nombreTextField.setBorder(null);
        jPanel1.add(nombreTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 370, 34));

        generoComboBox.setBackground(new java.awt.Color(51, 51, 51));
        generoComboBox.setForeground(new java.awt.Color(255, 255, 255));
        generoComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Masculino", "Femenino" }));
        generoComboBox.setBorder(null);
        jPanel1.add(generoComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 340, -1, 34));

        edadComboBox.setBackground(new java.awt.Color(51, 51, 51));
        edadComboBox.setForeground(new java.awt.Color(255, 255, 255));
        edadComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59", "60", "61", "62", "63", "64", "65", "66", "67", "68", "69", "70", "71", "72", "73", "74", "75", "76", "77", "78", "79", "80", "81", "82", "83", "84", "85", "86", "87", "88", "89", "90" }));
        edadComboBox.setBorder(null);
        jPanel1.add(edadComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 340, -1, 34));

        carreraComboBox.setBackground(new java.awt.Color(51, 51, 51));
        carreraComboBox.setForeground(new java.awt.Color(255, 255, 255));
        carreraComboBox.setBorder(null);
        jPanel1.add(carreraComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 550, 370, 34));

        nipTextField.setBackground(new java.awt.Color(51, 51, 51));
        nipTextField.setForeground(new java.awt.Color(255, 255, 255));
        nipTextField.setBorder(null);
        jPanel1.add(nipTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, 370, 34));

        nacionalidadComboBox.setBackground(new java.awt.Color(51, 51, 51));
        nacionalidadComboBox.setForeground(new java.awt.Color(255, 255, 255));
        nacionalidadComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Argentina", "Bolivia", "Brasil", "Chile", "Colombia", "Costa Rica", "Cuba", "Ecuador", "El Salvador", "España", "Guatemala", "Haití", "Honduras", "México", "Nicaragua", "Panamá", "Paraguay", "Perú", "República Dominicana", "Uruguay", "Venezuela" }));
        nacionalidadComboBox.setBorder(null);
        jPanel1.add(nacionalidadComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 340, 120, 34));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Centro Universitario:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 450, -1, -1));

        centroComboBox.setBackground(new java.awt.Color(51, 51, 51));
        centroComboBox.setForeground(new java.awt.Color(255, 255, 255));
        centroComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Centro Universitario de Arte, Arquitectura y Disenio (CUAAD)", "Centro Universitario de Ciencias Biologicas y Agropecuarias (CUCBA)", "Centro Universitario de Ciencias Economico-Administrativas (CUCEA)", "Centro Universitario de Ciencias Exactas e Ingenierias (CUCEI)", "Centro Universitario de Ciencias de la Salud (CUCS)", "Centro Universitario de Ciencias Sociales y Humanidades (CUCSH)", "Centro Universitario de Tonala (CUTonala)", "Centro Universitario de Tlajomulco (CUTlajomulco)", "Centro Universitario de Tlaquepaque (CUTlaquepaque)", "Centro Universitario de Los Altos (CUAltos)", "Centro Universitario de Chapala (CUChapala)", "Centro Universitario de la Cienega (CUCienega)", "Centro Universitario de la Costa (CUCosta)" }));
        centroComboBox.setBorder(null);
        centroComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                centroComboBoxActionPerformed(evt);
            }
        });
        jPanel1.add(centroComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 480, 370, 34));

        btnVolver.setBackground(new java.awt.Color(51, 51, 51));
        btnVolver.setPreferredSize(new java.awt.Dimension(109, 28));
        btnVolver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnVolverMouseClicked(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Volver");

        javax.swing.GroupLayout btnVolverLayout = new javax.swing.GroupLayout(btnVolver);
        btnVolver.setLayout(btnVolverLayout);
        btnVolverLayout.setHorizontalGroup(
            btnVolverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnVolverLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel2)
                .addContainerGap(39, Short.MAX_VALUE))
        );
        btnVolverLayout.setVerticalGroup(
            btnVolverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnVolverLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 610, -1, 40));

        btnRegistrar.setBackground(new java.awt.Color(51, 51, 51));
        btnRegistrar.setPreferredSize(new java.awt.Dimension(109, 28));
        btnRegistrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRegistrarMouseClicked(evt);
            }
        });

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Registrar");

        javax.swing.GroupLayout btnRegistrarLayout = new javax.swing.GroupLayout(btnRegistrar);
        btnRegistrar.setLayout(btnRegistrarLayout);
        btnRegistrarLayout.setHorizontalGroup(
            btnRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnRegistrarLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel11)
                .addContainerGap(40, Short.MAX_VALUE))
        );
        btnRegistrarLayout.setVerticalGroup(
            btnRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnRegistrarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 610, -1, 40));

        correoTextField.setBackground(new java.awt.Color(51, 51, 51));
        correoTextField.setForeground(new java.awt.Color(255, 255, 255));
        correoTextField.setBorder(null);
        jPanel1.add(correoTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 410, 370, 34));

        departamentoLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        departamentoLabel.setForeground(new java.awt.Color(255, 255, 255));
        departamentoLabel.setText("Departamento");
        jPanel1.add(departamentoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, -1, -1));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Código");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, -1, -1));

        codigoTextField.setBackground(new java.awt.Color(51, 51, 51));
        codigoTextField.setForeground(new java.awt.Color(255, 255, 255));
        codigoTextField.setBorder(null);
        jPanel1.add(codigoTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, 370, 34));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVolverMouseClicked
        // TODO add your handling code here:
        Login login = new Login();
        login.setSize(500, 700);
        login.setResizable(false);
        login.setLocationRelativeTo(null);
        login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVolverMouseClicked

    private void centroComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_centroComboBoxActionPerformed
        // TODO add your handling code here:
        int seleccionado = centroComboBox.getSelectedIndex();
        switch (seleccionado) {
            case 1 -> {
                carreraComboBox.removeAllItems();
                carreraComboBox.addItem("Licenciatura en Arquitectura");
                carreraComboBox.addItem("Licenciatura en Artes Escenicas para la Expresion Dancistica");
                carreraComboBox.addItem("Licenciatura en Artes Escenicas para la Expresion Teatral");
                carreraComboBox.addItem("Licenciatura en Artes Visuales para la Expresion Fotografica");
                carreraComboBox.addItem("Licenciatura en Artes Visuales para la Expresion Plastica");
                carreraComboBox.addItem("Licenciatura en Disenio de Interiores y Ambientacion");
                carreraComboBox.addItem("Licenciatura en Disenio de Modas");
                carreraComboBox.addItem("Licenciatura en Disenio Industrial");
                carreraComboBox.addItem("Licenciatura en Disenio para la Comunicacion Grafica");
                carreraComboBox.addItem("Licenciatura en Disenio, Arte y Tecnologias Interactivas");
                carreraComboBox.addItem("Licenciatura en Musica");
                carreraComboBox.addItem("Licenciatura en Urbanistica y Medio Ambiente");
                carreraComboBox.addItem("Licenciatura en Artes Escenicas para la Expresion Dancistica");
                carreraComboBox.addItem("Licenciatura en Artes Escenicas para la Expresion Teatral");
                carreraComboBox.addItem("Licenciatura en Artes Visuales para la Expresion Plastica");
                carreraComboBox.addItem("Tecnico en Musica");
            }
            case 2 -> {
                carreraComboBox.removeAllItems();
                carreraComboBox.addItem("Ingeniero Agronomo");
                carreraComboBox.addItem("Licenciatura en Biologia");
                carreraComboBox.addItem("Licenciatura en Ciencia de los Alimentos");
                carreraComboBox.addItem("Licenciatura en Medicina Veterinaria y Zootecnia");
            }
            case 3 -> {
                carreraComboBox.removeAllItems();
                carreraComboBox.addItem("Ingenieria en Negocios");
                carreraComboBox.addItem("Licenciatura en Administracion");
                carreraComboBox.addItem("Licenciatura en Administracion Financiera y Sistemas");
                carreraComboBox.addItem("Licenciatura en Administracion Gubernamental y Politicas Publicas");
                carreraComboBox.addItem("Licenciatura en Contaduria Publica");
                carreraComboBox.addItem("Licenciatura en Economia");
                carreraComboBox.addItem("Licenciatura en Gestion de Negocios Gastronomicos");
                carreraComboBox.addItem("Licenciatura en Gestion y Economía Ambiental");
                carreraComboBox.addItem("Licenciatura en Mercadotecnia");
                carreraComboBox.addItem("Licenciatura en Negocios Internacionales");
                carreraComboBox.addItem("Licenciatura en Recursos Humanos");
                carreraComboBox.addItem("Licenciatura en Relaciones Publicas y Comunicacion");
                carreraComboBox.addItem("Licenciatura en Tecnologias de la Informacion");
                carreraComboBox.addItem("Licenciatura en Turismo");
            }
            case 4 -> {
                carreraComboBox.removeAllItems();
                carreraComboBox.addItem("Ingenieria Biomedica");
                carreraComboBox.addItem("Ingenieria Civil");
                carreraComboBox.addItem("Ingenieria en Alimentos y Biotecnologia");
                carreraComboBox.addItem("Ingenieria en Computacion");
                carreraComboBox.addItem("Ingenieria en Comunicaciones y Electronica");
                carreraComboBox.addItem("Ingenieria en Logistica y Transporte");
                carreraComboBox.addItem("Ingenieria en Topografia Geomatica");
                carreraComboBox.addItem("Ingenieria Fotonica");
                carreraComboBox.addItem("Ingenieria Industrial");
                carreraComboBox.addItem("Ingenieria Informatica");
                carreraComboBox.addItem("Ingenieria Mecanica Electrica");
                carreraComboBox.addItem("Ingenieria Quimica");
                carreraComboBox.addItem("Ingenieria Robotica");
                carreraComboBox.addItem("Licenciatura en Ciencia de Materiales");
                carreraComboBox.addItem("Licenciatura en Fisica");
                carreraComboBox.addItem("Licenciatura en Matematicas");
                carreraComboBox.addItem("Licenciatura en Quimica");
                carreraComboBox.addItem("Licenciatura en Quimico Farmaceutico Biologo");
            }
            case 5 -> {
                carreraComboBox.removeAllItems();
                carreraComboBox.addItem("Carrera de Enfermeria");
                carreraComboBox.addItem("Carrera de Enfermeria (Semiescolarizado)");
                carreraComboBox.addItem("Licenciatura en Ciencias Forenses");
                carreraComboBox.addItem("Licenciatura en Cirujano Dentista");
                carreraComboBox.addItem("Licenciatura en Cultura Fisica y Deportes");
                carreraComboBox.addItem("Licenciatura en Enfermeria");
                carreraComboBox.addItem("Licenciatura en Nutricion");
                carreraComboBox.addItem("Licenciatura en Podologia");
                carreraComboBox.addItem("Licenciatura en Psicologia");
                carreraComboBox.addItem("Licenciatura en Terapia Física");
                carreraComboBox.addItem("Medico Cirujano y Partero");
                carreraComboBox.addItem("Tecnico Superior Universitario en Protesis Dental");
                carreraComboBox.addItem("Tecnico Superior Universitario en Radiologia e Imagen");
                carreraComboBox.addItem("Tecnico Superior Universitario en Terapia Fisica");
                carreraComboBox.addItem("Tecnico Superior Universitario en Terapia Respiratoria");
            }
            case 6 -> {
                carreraComboBox.removeAllItems();
                carreraComboBox.addItem("Abogado");
                carreraComboBox.addItem("Licenciatura en Antropologia");
                carreraComboBox.addItem("Licenciatura en Comunicacion Publica");
                carreraComboBox.addItem("Licenciatura en Criminologia");
                carreraComboBox.addItem("Licenciatura en Didactica del Frances como Lengua Extranjera");
                carreraComboBox.addItem("Licenciatura en Docencia del Ingles (Modalidad abierta y a distancia)");
                carreraComboBox.addItem("Licenciatura en Docencia del Ingles como Lengua Extranjera");
                carreraComboBox.addItem("Licenciatura en Escritura Creativa");
                carreraComboBox.addItem("Licenciatura en Estudios Politicos y Gobierno");
                carreraComboBox.addItem("Licenciatura en Filosofia");
                carreraComboBox.addItem("Licenciatura en Geografia");
                carreraComboBox.addItem("Licenciatura en Historia");
                carreraComboBox.addItem("Licenciatura en Letras Hispanicas");
                carreraComboBox.addItem("Licenciatura en Relaciones Internacionales");
                carreraComboBox.addItem("Licenciatura en Sociologia");
                carreraComboBox.addItem("Licenciatura en Trabajo Social");
                carreraComboBox.addItem("Nivelacion de la Licenciatura en Trabajos Social");
            }
            case 7 -> {
                carreraComboBox.removeAllItems();
                carreraComboBox.addItem("Abogado");
                carreraComboBox.addItem("Ingenieria en Ciencias Computacionales");
                carreraComboBox.addItem("Ingenieria en Energia");
                carreraComboBox.addItem("Ingenieria en Nanotecnologia");
                carreraComboBox.addItem("Licenciatura en Administración de Negocios");
                carreraComboBox.addItem("Licenciatura en Arquitectura");
                carreraComboBox.addItem("Licenciatura en Ciencias Forenses");
                carreraComboBox.addItem("Licenciatura en Contaduria Publica");
                carreraComboBox.addItem("Licenciatura en Disenio de Artesania");
                carreraComboBox.addItem("Licenciatura en Estudios Liberales");
                carreraComboBox.addItem("Licenciatura en Gerontologia");
                carreraComboBox.addItem("Licenciatura en Historia del Arte");
                carreraComboBox.addItem("Licenciatura en Nutricion");
                carreraComboBox.addItem("Licenciatura en Salud Publica");
                carreraComboBox.addItem("Medico Cirujano y Partero");
            }
            case 8 -> {
                carreraComboBox.removeAllItems();
                carreraComboBox.addItem("Ingenieria Biomedica");
                carreraComboBox.addItem("Ingenieria Civil (CUTlajomulco)");
                carreraComboBox.addItem("Ingenieria en Biotecnologia");
                carreraComboBox.addItem("Ingenieria en Diseño Industrial (Sede Cutlajomulco)");
                carreraComboBox.addItem("Ingenieria Mecatronica (Sede Cutlajomulco)");
                carreraComboBox.addItem("Licenciatura en Administracion");
                carreraComboBox.addItem("Licenciatura en Administracion y Gestion Empresarial");
                carreraComboBox.addItem("Licenciatura en Construccion de la Paz y Seguridad");
                carreraComboBox.addItem("Licenciatura en Enfermeria");
                carreraComboBox.addItem("Licenciatura en Negocios Internacionales");
                carreraComboBox.addItem("Licenciatura en Nutricion");
                carreraComboBox.addItem("Licenciatura en Terapia Fisica");
                carreraComboBox.addItem("Licenciatura en Terapia Fisica (CUTlajomulco)");
                carreraComboBox.addItem("Medico Cirujano y Partero");
            }
            default -> {
            }
        }
    }//GEN-LAST:event_centroComboBoxActionPerformed

    private void rolComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rolComboBoxActionPerformed
        // TODO add your handling code here:
        int selected = rolComboBox.getSelectedIndex();

        switch (selected) {
            case 0 -> {
                edadLabel.setVisible(true);
                edadComboBox.setVisible(true);
                generoLabel.setVisible(true);
                generoComboBox.setVisible(true);
                nacionalidadLabel.setVisible(true);
                nacionalidadComboBox.setVisible(true);
                departamentoLabel.setVisible(false);
                departamentoTextField.setVisible(false);
                carreraLabel.setText("Carrera");
            }
            case 1 -> {
                edadLabel.setVisible(false);
                edadComboBox.setVisible(false);
                generoLabel.setVisible(false);
                generoComboBox.setVisible(false);
                nacionalidadLabel.setVisible(false);
                nacionalidadComboBox.setVisible(false);
                carreraLabel.setText("Titulo");
                departamentoLabel.setVisible(true);
                departamentoTextField.setVisible(true);
            }
            case 2 -> {
                edadLabel.setVisible(false);
                edadComboBox.setVisible(false);
                generoLabel.setVisible(false);
                generoComboBox.setVisible(false);
                nacionalidadLabel.setVisible(false);
                nacionalidadComboBox.setVisible(false);
                carreraLabel.setText("Titulo");
                departamentoLabel.setVisible(true);
                departamentoTextField.setVisible(true);
            }
            
            default -> {
                
            }
        }
    }//GEN-LAST:event_rolComboBoxActionPerformed

    private void btnRegistrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarMouseClicked
        // TODO add your handling code here:
        Connection conn = null;
        Conexion con = new Conexion();
        
        if(nombreTextField.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Faltan campos por llenar");
            return;
        }
        
        if(codigoTextField.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Faltan campos por llenar");
            return;
        }
        
        if(nipTextField.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Faltan campos por llenar");
            return;
        }
        
        if(generoComboBox.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "Faltan campos por llenar");
            return;
        }
        
        if(nacionalidadComboBox.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "Faltan campos por llenar");
            return;
        }
        
        if(correoTextField.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Faltan campos por llenar");
            return;
        }
        
        if(centroComboBox.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "Faltan campos por llenar");
            return;
        }
        
        try {
            conn = (Connection) con.conexionSinLogin();
            if (!con.isConnect(conn)) {
                Estudiante estudiante = new Estudiante();
                estudiante.setRol(rolComboBox.getSelectedItem().toString());
                estudiante.setNombre(nombreTextField.getText());
                estudiante.setCodigo(Integer.parseInt(codigoTextField.getText()));
                estudiante.setNip(nipTextField.getText());
                estudiante.setEdad(Integer.parseInt(edadComboBox.getSelectedItem().toString()));
                estudiante.setGenero(generoComboBox.getSelectedItem().toString());
                estudiante.setNacionalidad(nacionalidadComboBox.getSelectedItem().toString());
                estudiante.setCorreo(correoTextField.getText());
                estudiante.setCentroUniversitario(centroComboBox.getSelectedItem().toString());
                estudiante.setCarrera(carreraComboBox.getSelectedItem().toString());
                
                PreparedStatement statement = (PreparedStatement) conn.prepareStatement("INSERT INTO estudiante VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?) ");
                statement.setString(1, estudiante.getRol());
                statement.setString(2, estudiante.getNombre());
                statement.setInt(3, estudiante.getCodigo());
                statement.setString(4, estudiante.getNip());
                statement.setInt(5, estudiante.getEdad());
                statement.setString(6, estudiante.getGenero());
                statement.setString(7, estudiante.getNacionalidad());
                statement.setString(8, estudiante.getCorreo());
                statement.setString(9, estudiante.getCentroUniversitario());
                statement.setString(10, estudiante.getCarrera());
                
                statement.executeUpdate();
                
                JOptionPane.showMessageDialog(null, "Usuario registrado correctamente");
                
                nombreTextField.setText("");
                codigoTextField.setText("");
                nipTextField.setText("");
                edadComboBox.setSelectedIndex(0);
                generoComboBox.setSelectedIndex(0);
                nacionalidadComboBox.setSelectedIndex(0);
                correoTextField.setText("");
                centroComboBox.setSelectedIndex(0);
                carreraComboBox.setSelectedIndex(0);
                rolComboBox.setSelectedIndex(0);
                
            } else {
                JOptionPane.showMessageDialog(null, "Error al conectar con el servidor");
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnRegistrarMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registro().setVisible(true);
            }
        });
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnRegistrar;
    private javax.swing.JPanel btnVolver;
    public javax.swing.JComboBox<String> carreraComboBox;
    public javax.swing.JLabel carreraLabel;
    private javax.swing.JComboBox<String> centroComboBox;
    private javax.swing.JTextField codigoTextField;
    private javax.swing.JTextField correoTextField;
    public javax.swing.JLabel departamentoLabel;
    public javax.swing.JTextField departamentoTextField;
    public javax.swing.JComboBox<String> edadComboBox;
    public javax.swing.JLabel edadLabel;
    public javax.swing.JComboBox<String> generoComboBox;
    public javax.swing.JLabel generoLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JComboBox<String> nacionalidadComboBox;
    public javax.swing.JLabel nacionalidadLabel;
    private javax.swing.JTextField nipTextField;
    private javax.swing.JTextField nombreTextField;
    private javax.swing.JComboBox<String> rolComboBox;
    // End of variables declaration//GEN-END:variables

    public void itemStateChanged(ItemEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
