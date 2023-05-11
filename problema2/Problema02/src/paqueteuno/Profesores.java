/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paqueteuno;
import paquetedos.Provincia;
/**
 *
 * @author darav
 */
public class Profesores {
     private String nombre;
    private String apellido;
    private double sueldoBasico;
    private double sueldoTotal;
    private int cedula;
    private Provincia provincia;
    
    public Profesores(double sueldob){
        sueldoBasico = sueldob;
    }
    
    public Profesores(String n, String a, double sb, int c, Provincia pro){
        nombre = n;
        apellido = a;
        sueldoBasico = sb;
        cedula = c;
        provincia = pro;
    }
    
    public void establecerNombre(String n) {
        nombre = n;
    }
    
    public void establecerApellido(String a) {
        nombre = a;
    }
    public void establecerSueldoBasico(double sb) {
        sueldoBasico = sb;
    }
    public void establecerCedula(int c) {
        cedula = c;
    }
    public void establecerProvincia(Provincia pro) {
        provincia = pro;
    }
    public void calcularSueldoTotal() {
        sueldoTotal = sueldoBasico + (sueldoBasico * 0.2);
    }
    
    public String obtenerNombre(){
        return nombre;
    }
    public String obtenerApellido(){
        return apellido;
    }
    public int obtenerCedula(){
        return cedula;
    }
    public void obtenerProvincia(Provincia pro) {
        provincia = pro;
    }
    public double obtenerSueldoBasico(){
        return sueldoBasico;
    }
    public double obtenerSueldoTotal(){
        return sueldoTotal;
    }
    
    @Override
    public String toString(){
        
        String cadena = String.format("""
                                      Nombre: %s
                                      Apellido: %s
                                      Sueldo Basico: %.2f
                                      Sueldo Total: %.2f
                                      Cédula: %d
                                      Provincia: %s
                                      Numero de habitantes: %s
                                      """, 
                                            obtenerNombre(), 
                                            obtenerApellido(), 
                                            obtenerSueldoBasico(), 
                                            obtenerSueldoTotal(), 
                                            obtenerCedula(),
                                            provincia.obtenerNombreProvincia(),
                                            provincia.obtenerNumero());
        return cadena;
    }
}
