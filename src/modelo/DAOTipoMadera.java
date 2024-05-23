/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.sql.*;
import java.util.logging.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Carlos
 */
public class DAOTipoMadera {

    Conexion oCon;
    Connection con;
    PreparedStatement pst;

    private final String SQLINSERTAR = "INSERT INTO tipo_madera(nombre_madera, largo, ancho, espesor) VALUES(?,?,?,?)";
    private final String SQLEDITAR = "UPDATE tipo_madera SET nombre_madera =?, largo=?, ancho =?, espesor =? WHERE id_madera =?";
    private final String SQLELIMINAR = "DELETE FROM tipo_madera WHERE id_madera=?";
    private final String SQLVER = "SELECT * FROM tipo_madera";
    private final String SQLBUSCAR = "SELECT nombre FROM tipo_madera WHERE nombre = ?";

    public DAOTipoMadera() {
        oCon = new Conexion();
        con = oCon.conectar();
    }

    public void agregarMadera(DTOTipoMadera objeto) {
        try {
            // Verificar que no haya campos vacíos
            if (objeto.getNombreMadera().isEmpty() || objeto.getLargo() <= 0 || objeto.getAncho() <= 0 || objeto.getEspesor() < 0) {
                JOptionPane.showMessageDialog(null, "Por favor, complete todos los campos obligatorios.", "Error", JOptionPane.ERROR_MESSAGE);
                return; // Sale del método si hay campos vacíos
            }

            pst = con.prepareStatement(SQLINSERTAR);
            pst.setString(1, objeto.getNombreMadera());
            pst.setDouble(2, objeto.getLargo());
            pst.setDouble(3, objeto.getAncho());
            pst.setDouble(4, objeto.getEspesor());
            pst.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(DAOTipoMadera.class.getName()).log(Level.SEVERE, null, ex);

        } finally {
            oCon.cerrarConexion();
        }
    }

    public void editarMadera(DTOTipoMadera objeto) {
        try {
            // Verificar que no haya campos vacíos
            if (objeto.getNombreMadera().isEmpty() || objeto.getLargo() <= 0 || objeto.getAncho() <= 0 || objeto.getEspesor() < 0) {
                JOptionPane.showMessageDialog(null, "Por favor, complete todos los campos obligatorios.", "Error", JOptionPane.ERROR_MESSAGE);
                return; // Sale del método si hay campos vacíos
            }
            pst = con.prepareStatement(SQLEDITAR);
            pst.setString(1, objeto.getNombreMadera());
            pst.setDouble(2, objeto.getLargo());
            pst.setDouble(3, objeto.getAncho());
            pst.setDouble(4, objeto.getEspesor());
            pst.setInt(5, objeto.getIdMadera());
            pst.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(DAOTipoMadera.class.getName()).log(Level.SEVERE, null, ex);

        } finally {
            oCon.cerrarConexion();
        }
    }

    public void eliminarProducto(DTOTipoMadera objeto) {

        try {
            pst = con.prepareStatement(SQLELIMINAR);
            pst.setInt(1, objeto.getIdMadera());
            pst.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(DAOTipoMadera.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            oCon.cerrarConexion();
        }
    }

    public void buscar(DTOTipoMadera objeto) {
        try {
            pst = con.prepareStatement(SQLBUSCAR);
            pst.setString(1, objeto.getNombreMadera());

            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                objeto.setNombreMadera(rs.getString("nombre"));
                objeto.setResultadoEncontrado(true);
            } else {
                objeto.setResultadoEncontrado(false);
            }
        } catch (SQLException e) {
            System.out.println("¡Error al buscar producto!, " + e);
        } finally {

        }
    }

    public DefaultTableModel verProducto() {
        DefaultTableModel modeloProducto = new DefaultTableModel();

        try {

            ResultSet rs;
            pst = con.prepareStatement(SQLVER);
            rs = pst.executeQuery();
            String[] datos = new String[5];
            String[] titulo = {"ID", "NOMBRE (LARGO)", "LARGO (Pulgadas)", "ANCHO (Pulgadas)", "ESPESOR (Pulgadas)"};
            modeloProducto.setColumnIdentifiers(titulo);
            while (rs.next()) {
                datos[0] = String.valueOf(rs.getInt(1));
                datos[1] = rs.getString(2);
                datos[2] = String.valueOf(rs.getDouble(3));
                datos[3] = String.valueOf(rs.getDouble(4));
                datos[4] = String.valueOf(rs.getDouble(5));
                modeloProducto.addRow(datos);
            }

        } catch (SQLException ex) {
            Logger.getLogger(DAOTipoMadera.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            oCon.cerrarConexion();
        }

        return modeloProducto;
    }
}
