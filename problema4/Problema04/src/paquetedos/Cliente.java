/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquetedos;

/**
 *
 * @author darav
 */
public class Cliente {
    private String nombre;
    private String apellido;
    private String cedula;
    
    public Cliente(){
        nombre = "NN";
        apellido = "AA";
        cedula = "00";
    }
    
    public Cliente(String n, String ap, String ced){
        nombre = n;
        apellido = ap;
        cedula = ced;
    }
    
    
    public void establecerNombre(String n){
        nombre = n;
    }
    
    public void establecerApellido(String n){
        apellido = n;
    }
    
    public void establecerCedula(String n){
        cedula = n;
    }
    
    public String obtenerNombre(){
        return nombre;
    }
    
    public String obtenerApellido(){
        return apellido;
    }
    
    public String obtenerCedula(){
        return cedula;
    }
        
}
