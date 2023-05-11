/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquetedos;

/**
 *
 * @author darav
 */
public class Universidad {
    private String nombreUni;
    private String direccion;
    
    public Universidad(){
        nombreUni = "NN";
        direccion = "AA";
    }
    
    public Universidad(String n, String ap){
        nombreUni = n;
        direccion = ap;
    }
    
    
    public void establecerNombreUni(String n){
        nombreUni = n;
    }
    
    public void establecerDireccion(String n){
        direccion = n;
    }
    
    public String obtenerNombreUni(){
        return nombreUni;
    }
    
    public String obtenerDireccion(){
        return direccion;
    }
    
}
