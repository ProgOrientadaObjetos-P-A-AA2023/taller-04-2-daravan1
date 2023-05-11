/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquetedos;

/**
 *
 * @author darav
 */
public class Provincia {
    private String nombrePro;
    private String numero;
    
    public Provincia(){
        nombrePro = "NN";
        numero = "AA";
    }
    
    public Provincia(String n, String num){
        nombrePro = n;
        numero = num;
    }
    
    
    public void establecerNombreProvincia(String n){
        nombrePro = n;
    }
    
    public void establecerNumero(String n){
        numero = n;
    }
    
    public String obtenerNombreProvincia(){
        return nombrePro;
    }
    
    public String obtenerNumero(){
        return numero;
    }
    
}
