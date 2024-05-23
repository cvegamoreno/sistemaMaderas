/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import java.awt.Color;
import java.awt.event.KeyEvent;
import vista.login.CurrentUser;

/**
 *
 * @author Carlos
 */
public class frmPrincipal extends javax.swing.JFrame {
    
    int xMouse, yMouse;
    public frmPrincipal() {
        initComponents();
        actualizarMensajeBienvenida();
    }

    private void actualizarMensajeBienvenida() {
        String nombreUsuario = CurrentUser.getNombreUsuario();
        if (nombreUsuario != null && !nombreUsuario.isEmpty()) {
            lblBienvenida.setText("Bienvenido, " + nombreUsuario + "!");
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        empresa = new javax.swing.JLabel();
        header = new javax.swing.JPanel();
        exitBtn = new javax.swing.JPanel();
        exitTxt = new javax.swing.JLabel();
        lblBienvenida = new javax.swing.JLabel();
        bg_lateral = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        opRegTpMadera = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        opConsRegCtrlMad = new javax.swing.JMenuItem();
        opDetalleCtrl = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        opRegCtrlMad = new javax.swing.JMenuItem();
        opMantUsuario = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        cerrarSesion = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        bg.setBackground(new java.awt.Color(244, 247, 254));
        bg.setForeground(new java.awt.Color(244, 247, 254));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        empresa.setBackground(new java.awt.Color(244, 247, 254));
        empresa.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        empresa.setForeground(new java.awt.Color(244, 247, 254));
        empresa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        empresa.setText("MADERERA");
        bg.add(empresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 260, 300, -1));

        header.setBackground(new java.awt.Color(244, 247, 254));
        header.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                headerMouseDragged(evt);
            }
        });
        header.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                headerMousePressed(evt);
            }
        });

        exitBtn.setBackground(new java.awt.Color(244, 247, 254));
        exitBtn.setForeground(new java.awt.Color(244, 247, 254));

        exitTxt.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        exitTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exitTxt.setText("X");
        exitTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exitTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitTxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exitTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitTxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout exitBtnLayout = new javax.swing.GroupLayout(exitBtn);
        exitBtn.setLayout(exitBtnLayout);
        exitBtnLayout.setHorizontalGroup(
            exitBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exitTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );
        exitBtnLayout.setVerticalGroup(
            exitBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(exitBtnLayout.createSequentialGroup()
                .addComponent(exitTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerLayout.createSequentialGroup()
                .addContainerGap(760, Short.MAX_VALUE)
                .addComponent(exitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addComponent(exitBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        bg.add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 40));

        lblBienvenida.setFont(new java.awt.Font("Roboto Black", 0, 48)); // NOI18N
        lblBienvenida.setForeground(new java.awt.Color(0, 0, 0));
        lblBienvenida.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBienvenida.setText("Bienvenido, ");
        bg.add(lblBienvenida, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 800, 50));

        bg_lateral.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fondo bl.jpg"))); // NOI18N
        bg.add(bg_lateral, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 500));

        jMenu1.setText("Procesos");

        opRegTpMadera.setText("Registro de control de Madera");
        opRegTpMadera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opRegTpMaderaActionPerformed(evt);
            }
        });
        jMenu1.add(opRegTpMadera);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Consulta");

        opConsRegCtrlMad.setText("Listado de Registros");
        opConsRegCtrlMad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opConsRegCtrlMadActionPerformed(evt);
            }
        });
        jMenu2.add(opConsRegCtrlMad);

        opDetalleCtrl.setText("Detalle de Control");
        opDetalleCtrl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opDetalleCtrlActionPerformed(evt);
            }
        });
        jMenu2.add(opDetalleCtrl);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Mantenimiento");

        opRegCtrlMad.setText("Tipos de madera");
        opRegCtrlMad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opRegCtrlMadActionPerformed(evt);
            }
        });
        jMenu3.add(opRegCtrlMad);

        opMantUsuario.setText("Usuarios");
        opMantUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opMantUsuarioActionPerformed(evt);
            }
        });
        jMenu3.add(opMantUsuario);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Opciones");

        cerrarSesion.setText("Cerrar Sesion");
        cerrarSesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cerrarSesionMouseClicked(evt);
            }
        });
        cerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerrarSesionActionPerformed(evt);
            }
        });
        jMenu4.add(cerrarSesion);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void headerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_headerMousePressed

    private void headerMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_headerMouseDragged

    private void exitTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxtMouseClicked
        System.exit(0);
    }//GEN-LAST:event_exitTxtMouseClicked

    private void exitTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxtMouseEntered
        exitBtn.setBackground(Color.red);
        exitTxt.setForeground(new Color(244,247,254));
    }//GEN-LAST:event_exitTxtMouseEntered

    private void exitTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxtMouseExited
        exitBtn.setBackground(new Color(244,247,254));
        exitTxt.setForeground(Color.black);
    }//GEN-LAST:event_exitTxtMouseExited

    private void cerrarSesionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrarSesionMouseClicked
        
    }//GEN-LAST:event_cerrarSesionMouseClicked

    private void cerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrarSesionActionPerformed
        dispose();
    }//GEN-LAST:event_cerrarSesionActionPerformed

    private void opRegTpMaderaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opRegTpMaderaActionPerformed
        new frmTpMadera().setVisible(true);
    }//GEN-LAST:event_opRegTpMaderaActionPerformed

    private void opConsRegCtrlMadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opConsRegCtrlMadActionPerformed
        new frmRegCtrlMad().setVisible(true);
    }//GEN-LAST:event_opConsRegCtrlMadActionPerformed

    private void opRegCtrlMadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opRegCtrlMadActionPerformed
        new frmRegCtrlMad().setVisible(true);
    }//GEN-LAST:event_opRegCtrlMadActionPerformed

    private void opDetalleCtrlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opDetalleCtrlActionPerformed
        new detalleControl().setVisible(true);
    }//GEN-LAST:event_opDetalleCtrlActionPerformed

    private void opMantUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opMantUsuarioActionPerformed
        new registrarUsuario().setVisible(true);
    }//GEN-LAST:event_opMantUsuarioActionPerformed

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
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JLabel bg_lateral;
    private javax.swing.JMenuItem cerrarSesion;
    private javax.swing.JLabel empresa;
    private javax.swing.JPanel exitBtn;
    private javax.swing.JLabel exitTxt;
    private javax.swing.JPanel header;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel lblBienvenida;
    private javax.swing.JMenuItem opConsRegCtrlMad;
    private javax.swing.JMenuItem opDetalleCtrl;
    private javax.swing.JMenuItem opMantUsuario;
    private javax.swing.JMenuItem opRegCtrlMad;
    private javax.swing.JMenuItem opRegTpMadera;
    // End of variables declaration//GEN-END:variables
}
