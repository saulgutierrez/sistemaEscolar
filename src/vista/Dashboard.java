/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import java.awt.Color;

/**
 *
 * @author USER
 */
public class Dashboard extends javax.swing.JFrame {

    /**
     * Creates new form Dashboard
     */
    public Dashboard() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btn_materias = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btn_alumnos = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btn_escuelas = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        btn_nomina = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        btn_calificaciones = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        btn_cambioNip = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        btn_cerrrarSesion = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(73, 70, 75));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_materias.setBackground(new java.awt.Color(70, 73, 75));
        btn_materias.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_materiasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_materiasMouseExited(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Materias");
        jLabel1.setAlignmentY(0.0F);

        javax.swing.GroupLayout btn_materiasLayout = new javax.swing.GroupLayout(btn_materias);
        btn_materias.setLayout(btn_materiasLayout);
        btn_materiasLayout.setHorizontalGroup(
            btn_materiasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn_materiasLayout.createSequentialGroup()
                .addContainerGap(95, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(77, 77, 77))
        );
        btn_materiasLayout.setVerticalGroup(
            btn_materiasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn_materiasLayout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(28, 28, 28))
        );

        jPanel2.add(btn_materias, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 230, 80));

        btn_alumnos.setBackground(new java.awt.Color(70, 73, 75));
        btn_alumnos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_alumnosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_alumnosMouseExited(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Alumnos");
        jLabel2.setAlignmentY(0.0F);

        javax.swing.GroupLayout btn_alumnosLayout = new javax.swing.GroupLayout(btn_alumnos);
        btn_alumnos.setLayout(btn_alumnosLayout);
        btn_alumnosLayout.setHorizontalGroup(
            btn_alumnosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn_alumnosLayout.createSequentialGroup()
                .addContainerGap(94, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(78, 78, 78))
        );
        btn_alumnosLayout.setVerticalGroup(
            btn_alumnosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn_alumnosLayout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(33, 33, 33))
        );

        jPanel2.add(btn_alumnos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 230, 80));

        btn_escuelas.setBackground(new java.awt.Color(70, 73, 75));
        btn_escuelas.setPreferredSize(new java.awt.Dimension(230, 80));
        btn_escuelas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_escuelasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_escuelasMouseExited(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Escuelas");
        jLabel3.setAlignmentY(0.0F);

        javax.swing.GroupLayout btn_escuelasLayout = new javax.swing.GroupLayout(btn_escuelas);
        btn_escuelas.setLayout(btn_escuelasLayout);
        btn_escuelasLayout.setHorizontalGroup(
            btn_escuelasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn_escuelasLayout.createSequentialGroup()
                .addContainerGap(93, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(83, 83, 83))
        );
        btn_escuelasLayout.setVerticalGroup(
            btn_escuelasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn_escuelasLayout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(33, 33, 33))
        );

        jPanel2.add(btn_escuelas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 230, -1));

        btn_nomina.setBackground(new java.awt.Color(70, 73, 75));
        btn_nomina.setPreferredSize(new java.awt.Dimension(230, 80));
        btn_nomina.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_nominaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_nominaMouseExited(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Nómina");
        jLabel4.setAlignmentY(0.0F);

        javax.swing.GroupLayout btn_nominaLayout = new javax.swing.GroupLayout(btn_nomina);
        btn_nomina.setLayout(btn_nominaLayout);
        btn_nominaLayout.setHorizontalGroup(
            btn_nominaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn_nominaLayout.createSequentialGroup()
                .addContainerGap(91, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(86, 86, 86))
        );
        btn_nominaLayout.setVerticalGroup(
            btn_nominaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn_nominaLayout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(35, 35, 35))
        );

        jPanel2.add(btn_nomina, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 230, -1));

        btn_calificaciones.setBackground(new java.awt.Color(70, 73, 75));
        btn_calificaciones.setPreferredSize(new java.awt.Dimension(230, 80));
        btn_calificaciones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_calificacionesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_calificacionesMouseExited(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Calificaciones");
        jLabel5.setAlignmentY(0.0F);

        javax.swing.GroupLayout btn_calificacionesLayout = new javax.swing.GroupLayout(btn_calificaciones);
        btn_calificaciones.setLayout(btn_calificacionesLayout);
        btn_calificacionesLayout.setHorizontalGroup(
            btn_calificacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn_calificacionesLayout.createSequentialGroup()
                .addContainerGap(73, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(66, 66, 66))
        );
        btn_calificacionesLayout.setVerticalGroup(
            btn_calificacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn_calificacionesLayout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(38, 38, 38))
        );

        jPanel2.add(btn_calificaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 230, -1));

        btn_cambioNip.setBackground(new java.awt.Color(70, 73, 75));
        btn_cambioNip.setPreferredSize(new java.awt.Dimension(230, 80));
        btn_cambioNip.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_cambioNipMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_cambioNipMouseExited(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Cambio de NIP");
        jLabel6.setAlignmentY(0.0F);

        javax.swing.GroupLayout btn_cambioNipLayout = new javax.swing.GroupLayout(btn_cambioNip);
        btn_cambioNip.setLayout(btn_cambioNipLayout);
        btn_cambioNipLayout.setHorizontalGroup(
            btn_cambioNipLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn_cambioNipLayout.createSequentialGroup()
                .addContainerGap(76, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(53, 53, 53))
        );
        btn_cambioNipLayout.setVerticalGroup(
            btn_cambioNipLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn_cambioNipLayout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(33, 33, 33))
        );

        jPanel2.add(btn_cambioNip, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 400, 230, -1));

        btn_cerrrarSesion.setBackground(new java.awt.Color(70, 73, 75));
        btn_cerrrarSesion.setPreferredSize(new java.awt.Dimension(230, 80));
        btn_cerrrarSesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_cerrrarSesionMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_cerrrarSesionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_cerrrarSesionMouseExited(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Cerrar sesión");
        jLabel7.setAlignmentY(0.0F);

        javax.swing.GroupLayout btn_cerrrarSesionLayout = new javax.swing.GroupLayout(btn_cerrrarSesion);
        btn_cerrrarSesion.setLayout(btn_cerrrarSesionLayout);
        btn_cerrrarSesionLayout.setHorizontalGroup(
            btn_cerrrarSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_cerrrarSesionLayout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(jLabel7)
                .addContainerGap(71, Short.MAX_VALUE))
        );
        btn_cerrrarSesionLayout.setVerticalGroup(
            btn_cerrrarSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_cerrrarSesionLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel7)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        jPanel2.add(btn_cerrrarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 480, 230, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 230, 800));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1200, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_materiasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_materiasMouseEntered
        // TODO add your handling code here:
        btn_materias.setBackground(new Color(51, 51, 51));
    }//GEN-LAST:event_btn_materiasMouseEntered

    private void btn_materiasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_materiasMouseExited
        // TODO add your handling code here:
        btn_materias.setBackground(new Color(70, 73, 75));
    }//GEN-LAST:event_btn_materiasMouseExited

    private void btn_alumnosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_alumnosMouseEntered
        // TODO add your handling code here:
        btn_alumnos.setBackground(new Color(51, 51, 51));
    }//GEN-LAST:event_btn_alumnosMouseEntered

    private void btn_alumnosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_alumnosMouseExited
        // TODO add your handling code here:
        btn_alumnos.setBackground(new Color(70, 73, 75));
    }//GEN-LAST:event_btn_alumnosMouseExited

    private void btn_escuelasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_escuelasMouseEntered
        // TODO add your handling code here:
        btn_escuelas.setBackground(new Color(51, 51, 51));
    }//GEN-LAST:event_btn_escuelasMouseEntered

    private void btn_escuelasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_escuelasMouseExited
        // TODO add your handling code here:
        btn_escuelas.setBackground(new Color(70, 73, 75));
    }//GEN-LAST:event_btn_escuelasMouseExited

    private void btn_nominaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_nominaMouseEntered
        // TODO add your handling code here:
        btn_nomina.setBackground(new Color(51, 51, 51));
    }//GEN-LAST:event_btn_nominaMouseEntered

    private void btn_nominaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_nominaMouseExited
        // TODO add your handling code here:
        btn_nomina.setBackground(new Color(70, 73, 75));
    }//GEN-LAST:event_btn_nominaMouseExited

    private void btn_calificacionesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_calificacionesMouseEntered
        // TODO add your handling code here:
        btn_calificaciones.setBackground(new Color(51, 51, 51));
    }//GEN-LAST:event_btn_calificacionesMouseEntered

    private void btn_calificacionesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_calificacionesMouseExited
        // TODO add your handling code here:
        btn_calificaciones.setBackground(new Color(70, 73, 75));
    }//GEN-LAST:event_btn_calificacionesMouseExited

    private void btn_cambioNipMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_cambioNipMouseEntered
        // TODO add your handling code here:
        btn_cambioNip.setBackground(new Color(51, 51, 51));
    }//GEN-LAST:event_btn_cambioNipMouseEntered

    private void btn_cambioNipMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_cambioNipMouseExited
        // TODO add your handling code here:
        btn_cambioNip.setBackground(new Color(70, 73, 75));
    }//GEN-LAST:event_btn_cambioNipMouseExited

    private void btn_cerrrarSesionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_cerrrarSesionMouseEntered
        // TODO add your handling code here:
        btn_cerrrarSesion.setBackground(new Color(51, 51, 51));
    }//GEN-LAST:event_btn_cerrrarSesionMouseEntered

    private void btn_cerrrarSesionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_cerrrarSesionMouseExited
        // TODO add your handling code here:
        btn_cerrrarSesion.setBackground(new Color(70, 73, 75));
    }//GEN-LAST:event_btn_cerrrarSesionMouseExited

    private void btn_cerrrarSesionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_cerrrarSesionMouseClicked
        // TODO add your handling code here:
        this.dispose();
        Login login = new Login();
        login.setSize(500, 600);
        login.setResizable(false);
        login.setLocationRelativeTo(null);
        login.setVisible(true);
    }//GEN-LAST:event_btn_cerrrarSesionMouseClicked

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
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btn_alumnos;
    private javax.swing.JPanel btn_calificaciones;
    private javax.swing.JPanel btn_cambioNip;
    private javax.swing.JPanel btn_cerrrarSesion;
    private javax.swing.JPanel btn_escuelas;
    private javax.swing.JPanel btn_materias;
    private javax.swing.JPanel btn_nomina;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
