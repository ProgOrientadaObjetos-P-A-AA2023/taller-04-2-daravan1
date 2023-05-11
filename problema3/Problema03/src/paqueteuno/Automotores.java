/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paqueteuno;

import paquetedos.Fabricante;

/**
 *
 * @author darav
 */
public class Automotores {

    private String cedula;
    private String marca;
    private int anio;
    private double valorVehiculo;
    private double valorMatricula;
    private Fabricante frabicante;

    public Automotores(String ced) {
        cedula = ced;
    }

    public Automotores(String ced, String m, int a, double valorV, Fabricante fra) {
        cedula = ced;
        marca = m;
        anio = a;
        valorVehiculo = valorV;
        frabicante = fra;
    }

// Establecer de cda variable 
    public void establecerCedula(String ced) {
        cedula = ced;
    }

    public void establecerMarca(String m) {
        marca = m;
    }

    public void establecerAnio(int a) {
        anio = a;
    }

    public void establecerValorVehiculo(double valorV) {
        valorVehiculo = valorV;
    }

    public void establecerFabricante(Fabricante fra) {
        frabicante = fra;
    }

    public void calcularValorMatricula() {
        valorMatricula = (0.00002 * valorVehiculo) * (2023 - anio);
    }
// Obtener de cada variable

    public String obtenerCedula() {
        return cedula;
    }

    public String obtenertMarcaVehiculo() {
        return marca;
    }

    public int obtenerAnio() {
        return anio;
    }

    public Fabricante obtenerFabricante() {
        return frabicante;
    }

    public double obtenerValorVehiculo() {
        return valorVehiculo;
    }

    public double obtenerValorMatricula() {
        return valorMatricula;
    }

    @Override
    public String toString() {

        String cadena = String.format("""
                                      Cedula: %s
                                      Marca del Vehiculo: %s
                                      Año de Fabricacion: %d
                                      Valor del Vehiculo: %.2f
                                      Valor de la Matricula: %.2f
                                      Nombre de fabricante: %s
                                      Ciudad de origen: %s
                                      """,
                obtenerCedula(),
                obtenertMarcaVehiculo(),
                obtenerAnio(),
                obtenerValorVehiculo(),
                obtenerValorMatricula(),
                frabicante.obtenerNombre(),
                frabicante.obtenerCiudad());
        
        return cadena;

    }
}
