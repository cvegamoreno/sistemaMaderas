/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import java.awt.Color;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.DAOUsuario;
import modelo.DTOUsuario;

/**
 *
 * @author Carlos
 */
public class registrarUsuario extends javax.swing.JFrame {

    int xMouse, yMouse;

    public registrarUsuario() {
        initComponents();
        verUsuario();
        limpiar();
        habilitarBotones(false, false, true, false, false, false);
    }

    void limpiar() {
        userTxt.setText("Ingrese su nombre de usuario");
        passTxt.setText("********");
    }

    void verUsuario() {
        DefaultTableModel modelo;
        DAOUsuario objetoD = new DAOUsuario();
        modelo = objetoD.verUsuario();
        tblUsuario.setModel(modelo);
    }

    void habilitarBotones(boolean correo, boolean pass, boolean n, boolean e, boolean g, boolean bo) {
        userTxt.setEnabled(correo);
        passTxt.setEnabled(pass);
        nuevoTxt.setEnabled(n);
        editarTxt.setEnabled(e);
        grabarTxt.setEnabled(g);
        borrarTxt.setEnabled(bo);

        // Define color para los botones habilitados y deshabilitados
        Color enabledColor = (new Color(0, 96, 170));
        Color disabledColor = Color.DARK_GRAY;

        nuevoBtn.setBackground(n ? enabledColor : disabledColor);
        editarBtn.setBackground(e ? enabledColor : disabledColor);
        grabarBtn.setBackground(g ? enabledColor : disabledColor);
        borrarBtn.setBackground(bo ? enabledColor : disabledColor);
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tblUsuario = new javax.swing.JTable();
        borrarBtn = new javax.swing.JPanel();
        borrarTxt = new javax.swing.JLabel();
        bg_lateral = new javax.swing.JLabel();
        header = new javax.swing.JPanel();
        exitBtn = new javax.swing.JPanel();
        exitTxt = new javax.swing.JLabel();
        favicon = new javax.swing.JLabel();
        userLbl = new javax.swing.JLabel();
        userTxt = new javax.swing.JTextField();
        userSeparator = new javax.swing.JSeparator();
        passlbl = new javax.swing.JLabel();
        passTxt = new javax.swing.JPasswordField();
        passSeparator = new javax.swing.JSeparator();
        nuevoBtn = new javax.swing.JPanel();
        nuevoTxt = new javax.swing.JLabel();
        editarBtn = new javax.swing.JPanel();
        editarTxt = new javax.swing.JLabel();
        grabarBtn = new javax.swing.JPanel();
        grabarTxt = new javax.swing.JLabel();
        idUserTxt = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        bg.setBackground(new java.awt.Color(244, 247, 254));
        bg.setForeground(new java.awt.Color(244, 247, 254));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        empresa.setBackground(new java.awt.Color(244, 247, 254));
        empresa.setFont(new java.awt.Font("Roboto Black", 1, 24)); // NOI18N
        empresa.setForeground(new java.awt.Color(244, 247, 254));
        empresa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        empresa.setText("MADERERA");
        bg.add(empresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 50, 400, -1));

        tblUsuario.setBackground(new java.awt.Color(255, 204, 102));
        tblUsuario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tblUsuario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "CORREO", "CONTRASEÑA"
            }
        ));
        tblUsuario.setSelectionBackground(new java.awt.Color(0, 204, 255));
        tblUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblUsuarioMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblUsuario);

        bg.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 170, 380, 200));

        borrarBtn.setBackground(new java.awt.Color(0, 96, 170));
        borrarBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        borrarTxt.setBackground(new java.awt.Color(0, 96, 170));
        borrarTxt.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        borrarTxt.setForeground(new java.awt.Color(244, 247, 254));
        borrarTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        borrarTxt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/borrar.png"))); // NOI18N
        borrarTxt.setText("BORRAR");
        borrarTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        borrarTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                borrarTxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                borrarTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                borrarTxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout borrarBtnLayout = new javax.swing.GroupLayout(borrarBtn);
        borrarBtn.setLayout(borrarBtnLayout);
        borrarBtnLayout.setHorizontalGroup(
            borrarBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(borrarTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
        );
        borrarBtnLayout.setVerticalGroup(
            borrarBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(borrarTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        bg.add(borrarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 410, 110, 40));

        bg_lateral.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fondo.jpg"))); // NOI18N
        bg.add(bg_lateral, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 0, 400, 500));

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
            .addComponent(exitTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addComponent(exitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 760, Short.MAX_VALUE))
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addComponent(exitBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        bg.add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 40));

        favicon.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        favicon.setForeground(new java.awt.Color(0, 0, 0));
        favicon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/usuario b.png"))); // NOI18N
        favicon.setText("MANTENIMIENTO DE USUARIOS");
        bg.add(favicon, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 330, 40));

        userLbl.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        userLbl.setForeground(new java.awt.Color(0, 0, 0));
        userLbl.setText("USUARIO");
        bg.add(userLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, 60, 30));

        userTxt.setBackground(new java.awt.Color(244, 247, 254));
        userTxt.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        userTxt.setForeground(new java.awt.Color(204, 204, 204));
        userTxt.setText("Ingrese su nombre de usuario");
        userTxt.setBorder(null);
        userTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                userTxtMousePressed(evt);
            }
        });
        userTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userTxtActionPerformed(evt);
            }
        });
        userTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                userTxtKeyPressed(evt);
            }
        });
        bg.add(userTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, 260, 30));
        bg.add(userSeparator, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, 260, 10));

        passlbl.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        passlbl.setForeground(new java.awt.Color(0, 0, 0));
        passlbl.setText("CONTRASEÑA");
        bg.add(passlbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, 110, 30));

        passTxt.setBackground(new java.awt.Color(244, 247, 254));
        passTxt.setForeground(new java.awt.Color(204, 204, 204));
        passTxt.setText("********");
        passTxt.setBorder(null);
        passTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                passTxtMousePressed(evt);
            }
        });
        passTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                passTxtKeyPressed(evt);
            }
        });
        bg.add(passTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, 260, 30));
        bg.add(passSeparator, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 380, 260, 10));

        nuevoBtn.setBackground(new java.awt.Color(0, 96, 170));
        nuevoBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        nuevoTxt.setBackground(new java.awt.Color(0, 96, 170));
        nuevoTxt.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        nuevoTxt.setForeground(new java.awt.Color(244, 247, 254));
        nuevoTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nuevoTxt.setText("NUEVO");
        nuevoTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        nuevoTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nuevoTxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                nuevoTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                nuevoTxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout nuevoBtnLayout = new javax.swing.GroupLayout(nuevoBtn);
        nuevoBtn.setLayout(nuevoBtnLayout);
        nuevoBtnLayout.setHorizontalGroup(
            nuevoBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(nuevoTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
        );
        nuevoBtnLayout.setVerticalGroup(
            nuevoBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(nuevoTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        bg.add(nuevoBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 410, 110, 40));

        editarBtn.setBackground(new java.awt.Color(0, 96, 170));
        editarBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        editarTxt.setBackground(new java.awt.Color(0, 96, 170));
        editarTxt.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        editarTxt.setForeground(new java.awt.Color(244, 247, 254));
        editarTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        editarTxt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/editar.png"))); // NOI18N
        editarTxt.setText("EDITAR");
        editarTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        editarTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editarTxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                editarTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                editarTxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout editarBtnLayout = new javax.swing.GroupLayout(editarBtn);
        editarBtn.setLayout(editarBtnLayout);
        editarBtnLayout.setHorizontalGroup(
            editarBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(editarTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
        );
        editarBtnLayout.setVerticalGroup(
            editarBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(editarTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        bg.add(editarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 410, 110, 40));

        grabarBtn.setBackground(new java.awt.Color(0, 96, 170));
        grabarBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        grabarTxt.setBackground(new java.awt.Color(0, 96, 170));
        grabarTxt.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        grabarTxt.setForeground(new java.awt.Color(244, 247, 254));
        grabarTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        grabarTxt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/guardar.png"))); // NOI18N
        grabarTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        grabarTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                grabarTxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                grabarTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                grabarTxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout grabarBtnLayout = new javax.swing.GroupLayout(grabarBtn);
        grabarBtn.setLayout(grabarBtnLayout);
        grabarBtnLayout.setHorizontalGroup(
            grabarBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(grabarBtnLayout.createSequentialGroup()
                .addComponent(grabarTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        grabarBtnLayout.setVerticalGroup(
            grabarBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(grabarTxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        bg.add(grabarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 410, 60, 40));

        idUserTxt.setBackground(new java.awt.Color(244, 247, 254));
        idUserTxt.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        idUserTxt.setForeground(new java.awt.Color(204, 204, 204));
        idUserTxt.setBorder(null);
        idUserTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                idUserTxtMousePressed(evt);
            }
        });
        idUserTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idUserTxtActionPerformed(evt);
            }
        });
        idUserTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                idUserTxtKeyPressed(evt);
            }
        });
        bg.add(idUserTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, 260, 30));

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

    private void userTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userTxtActionPerformed

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
        this.dispose();
    }//GEN-LAST:event_exitTxtMouseClicked

    private void exitTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxtMouseEntered
        exitBtn.setBackground(Color.red);
        exitTxt.setForeground(new Color(244, 247, 254));
    }//GEN-LAST:event_exitTxtMouseEntered

    private void exitTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxtMouseExited
        exitBtn.setBackground(new Color(244, 247, 254));
        exitTxt.setForeground(Color.black);
    }//GEN-LAST:event_exitTxtMouseExited

    private void nuevoTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nuevoTxtMouseEntered
        if (nuevoTxt.isEnabled()) {
            nuevoBtn.setBackground(new Color(0, 156, 223));
        }
    }//GEN-LAST:event_nuevoTxtMouseEntered

    private void nuevoTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nuevoTxtMouseExited
        if (nuevoTxt.isEnabled()) {
            nuevoBtn.setBackground(new Color(0, 96, 170));
        }
    }//GEN-LAST:event_nuevoTxtMouseExited

    private void userTxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userTxtMousePressed
        if (userTxt.getText().equals("Ingrese su nombre de usuario")) {
            userTxt.setText("");
            userTxt.setForeground(Color.black);
        }
        if (String.valueOf(passTxt.getPassword()).isEmpty()) {
            passTxt.setText("********");
            passTxt.setForeground(Color.gray);
        }
    }//GEN-LAST:event_userTxtMousePressed

    private void passTxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passTxtMousePressed
        if (String.valueOf(passTxt.getPassword()).equals("********")) {
            passTxt.setText("");
            passTxt.setForeground(Color.black);
        }
        if (userTxt.getText().isEmpty()) {
            userTxt.setText("Ingrese su nombre de usuario");
            userTxt.setForeground(Color.gray);
        }

    }//GEN-LAST:event_passTxtMousePressed

    private void nuevoTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nuevoTxtMouseClicked
        verUsuario();
        limpiar();
        habilitarBotones(true, true, false, false, true, false);
    }//GEN-LAST:event_nuevoTxtMouseClicked

    private void passTxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passTxtKeyPressed

    }//GEN-LAST:event_passTxtKeyPressed

    private void userTxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_userTxtKeyPressed

    }//GEN-LAST:event_userTxtKeyPressed

    private void borrarTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_borrarTxtMouseClicked
        int IdUsuario;
        IdUsuario = Integer.parseInt(idUserTxt.getText());

        DTOUsuario objeto = new DTOUsuario(IdUsuario);

        DAOUsuario objetoD = new DAOUsuario();
        objetoD.eliminar(objeto);

        verUsuario();
        limpiar();
        habilitarBotones(false, false, true, false, false, false);
    }//GEN-LAST:event_borrarTxtMouseClicked

    private void borrarTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_borrarTxtMouseEntered
        if (borrarTxt.isEnabled()) {
            borrarBtn.setBackground(new Color(0, 96, 170));
        }
    }//GEN-LAST:event_borrarTxtMouseEntered

    private void borrarTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_borrarTxtMouseExited
        if (borrarTxt.isEnabled()) {
            borrarBtn.setBackground(new Color(0, 96, 170));
        }
    }//GEN-LAST:event_borrarTxtMouseExited

    private void editarTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editarTxtMouseClicked
        int IdUsuario;
        String user, password;
        IdUsuario = Integer.parseInt(idUserTxt.getText());
        user = userTxt.getText();
        password = passTxt.getText();

        DTOUsuario objeto = new DTOUsuario();
        objeto.setIdUsuario(IdUsuario);
        objeto.setNombreUsu(user);
        objeto.setContrasenaUsu(password);

        DAOUsuario objetoD = new DAOUsuario();
        objetoD.editar(objeto);

        verUsuario();
        limpiar();
        habilitarBotones(false, false, true, false, false, false);
    }//GEN-LAST:event_editarTxtMouseClicked

    private void editarTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editarTxtMouseEntered
        if (editarTxt.isEnabled()) {
            editarBtn.setBackground(new Color(0, 156, 223));
        }
    }//GEN-LAST:event_editarTxtMouseEntered

    private void editarTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editarTxtMouseExited
        if (editarTxt.isEnabled()) {
            editarBtn.setBackground(new Color(0, 96, 170));
        }
    }//GEN-LAST:event_editarTxtMouseExited

    private void grabarTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grabarTxtMouseClicked
        String user, password;

        user = userTxt.getText();
        password = passTxt.getText();
        //user_id = Integer.parseInt(txtstock.getText());

        // Verificar si el usuario y la contraseña son valores predefinidos
        if (user.equals("Ingrese su nombre de usuario") || password.equals("(********")) {
            JOptionPane.showMessageDialog(null, "Por favor, ingrese un nuevo usuario y contraseña.", "Información", JOptionPane.INFORMATION_MESSAGE);
            return; // Sale del método si los valores son predefinidos
        }
        DTOUsuario objeto = new DTOUsuario();
        objeto.setNombreUsu(user);
        objeto.setContrasenaUsu(password);
        //objeto.setIdUsuario(user_id);

        DAOUsuario objetoD = new DAOUsuario();
        objetoD.agregar(objeto);

        verUsuario();
        limpiar();
        habilitarBotones(false, false, true, false, false, false);
    }//GEN-LAST:event_grabarTxtMouseClicked

    private void grabarTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grabarTxtMouseEntered
        if (grabarTxt.isEnabled()) {
            grabarBtn.setBackground(new Color(0, 156, 223));
        }
    }//GEN-LAST:event_grabarTxtMouseEntered

    private void grabarTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grabarTxtMouseExited
        if (grabarTxt.isEnabled()) {
            grabarBtn.setBackground(new Color(0, 96, 170));
        }
    }//GEN-LAST:event_grabarTxtMouseExited

    private void tblUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblUsuarioMouseClicked
        int fila;
        fila = tblUsuario.getSelectedRow();
        String id, nombre, contra;
        id = (String) tblUsuario.getValueAt(fila, 0);
        nombre = (String) tblUsuario.getValueAt(fila, 1);
        contra = (String) tblUsuario.getValueAt(fila, 2);

        idUserTxt.setText(id);
        userTxt.setText(nombre);
        passTxt.setText(contra);
        habilitarBotones(true, true, false, true, false, true);
    }//GEN-LAST:event_tblUsuarioMouseClicked

    private void idUserTxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_idUserTxtMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_idUserTxtMousePressed

    private void idUserTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idUserTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idUserTxtActionPerformed

    private void idUserTxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_idUserTxtKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_idUserTxtKeyPressed

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
            java.util.logging.Logger.getLogger(registrarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(registrarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(registrarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(registrarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new registrarUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JLabel bg_lateral;
    private javax.swing.JPanel borrarBtn;
    private javax.swing.JLabel borrarTxt;
    private javax.swing.JPanel editarBtn;
    private javax.swing.JLabel editarTxt;
    private javax.swing.JLabel empresa;
    private javax.swing.JPanel exitBtn;
    private javax.swing.JLabel exitTxt;
    private javax.swing.JLabel favicon;
    private javax.swing.JPanel grabarBtn;
    private javax.swing.JLabel grabarTxt;
    private javax.swing.JPanel header;
    private javax.swing.JTextField idUserTxt;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel nuevoBtn;
    private javax.swing.JLabel nuevoTxt;
    private javax.swing.JSeparator passSeparator;
    private javax.swing.JPasswordField passTxt;
    private javax.swing.JLabel passlbl;
    private javax.swing.JTable tblUsuario;
    private javax.swing.JLabel userLbl;
    private javax.swing.JSeparator userSeparator;
    private javax.swing.JTextField userTxt;
    // End of variables declaration//GEN-END:variables
}
