/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Carlos
 */
public class DTOTipoMadera {

    private int idMadera;
    private String nombreMadera;
    private double largo;
    private double ancho;
    private double espesor;
    private boolean resultadoEncontrado;

    public DTOTipoMadera() {
    }

    public DTOTipoMadera(int idMadera) {
        this.idMadera = idMadera;
    }

    public DTOTipoMadera(int idMadera, String nombreMadera, double largo, double ancho, double espesor) {
        this.idMadera = idMadera;
        this.nombreMadera = nombreMadera;
        this.largo = largo;
        this.ancho = ancho;
        this.espesor = espesor;
    }

    public DTOTipoMadera(String nombreMadera) {
        this.nombreMadera = nombreMadera;
    }

    public int getIdMadera() {
        return idMadera;
    }

    public void setIdMadera(int idMadera) {
        this.idMadera = idMadera;
    }

    public String getNombreMadera() {
        return nombreMadera;
    }

    public void setNombreMadera(String nombreMadera) {
        this.nombreMadera = nombreMadera;
    }

    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getEspesor() {
        return espesor;
    }

    public void setEspesor(double espesor) {
        this.espesor = espesor;
    }

    public boolean isResultadoEncontrado() {
        return resultadoEncontrado;
    }

    public void setResultadoEncontrado(boolean resultadoEncontrado) {
        this.resultadoEncontrado = resultadoEncontrado;
    }

}
