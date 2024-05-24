/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.sql.*;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.*;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Carlos
 */
public class DAORegCtrlMad {

    Conexion oCon;
    Connection con;
    PreparedStatement pst;

    private final String SQLVERCMB = "SELECT largo FROM tipo_madera";
    private final String SQLNOMBRESPORLARGO = "SELECT nombre_madera FROM tipo_madera WHERE largo = ?";

    public DAORegCtrlMad() {
        oCon = new Conexion();
        con = oCon.conectar();
    }

    public DefaultComboBoxModel verLargo() {
        DefaultComboBoxModel modeloLargo = new DefaultComboBoxModel();
        Set<Double> largoSet = new HashSet<>(); // Usar un Set para evitar duplicados

        try {
            ResultSet rs;
            pst = con.prepareStatement(SQLVERCMB);
            rs = pst.executeQuery();

            while (rs.next()) {
                double largo = rs.getDouble("largo");
                if (largoSet.add(largo)) { // Agregar al Set y verificar si es un valor único
                    modeloLargo.addElement(largo);
                }
            }

        } catch (SQLException ex) {
            Logger.getLogger(DAORegCtrlMad.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            oCon.cerrarConexion();
        }
        return modeloLargo;
    }

    public DefaultComboBoxModel getNombresPorLargo(double largo) {
        DefaultComboBoxModel modeloNombre = new DefaultComboBoxModel();

        try {
            ResultSet rs;
            pst = con.prepareStatement(SQLNOMBRESPORLARGO);
            pst.setDouble(1, largo);
            rs = pst.executeQuery();

            while (rs.next()) {
                String nombreMadera = rs.getString("nombre_madera");
                modeloNombre.addElement(nombreMadera);
            }

        } catch (SQLException ex) {
            Logger.getLogger(DAORegCtrlMad.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            oCon.cerrarConexion();
        }
        return modeloNombre;
    }
}
