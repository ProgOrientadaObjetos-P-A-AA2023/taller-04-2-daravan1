/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquetedos;

/**
 *
 * @author darav
 */
public class Fabricante {
    
    private String nombre;
    private String ciudad;
    
    public Fabricante(){
        nombre = "NN";
        ciudad = "AA";
    }
    
    public Fabricante(String n, String ciu){
        nombre = n;
        ciudad = ciu;    
    }
    
    
    public void establecerNombre(String n){
        nombre = n;
    }
    
    public void establecerCiudad(String n){
        ciudad = n;
    }
    
    
    public String obtenerNombre(){
        return nombre;
    }
    
    public String obtenerCiudad(){
        return ciudad;
    }
}
