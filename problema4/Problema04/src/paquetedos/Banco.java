/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquetedos;

/**
 *
 * @author darav
 */
public class Banco {
     private String nombreBanco;
    private String numeroSucursales;
    
    public Banco(){
        nombreBanco = "NN";
        numeroSucursales = "00";
    }
    
    public Banco(String ban, String num ){
        nombreBanco = ban;
        numeroSucursales = num;
    }
     
    public void establecerNombreBanco(String ban){
        nombreBanco = ban;
    }
    
    public void establecerNumeroSucursales(String num){
        numeroSucursales = num;
    }
  
    public String obtenerNombreBanco(){
        return nombreBanco;
    }
    
    public String obtenerNumeroSucursales(){
        return numeroSucursales;
    }          
}
