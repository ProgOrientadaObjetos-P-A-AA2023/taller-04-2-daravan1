/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paqueteuno;
import paquetedos.Fabricante;
/**
 *
 * @author darav
 */
public class Ejecutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Fabricante fabricante1 = new Fabricante();
        fabricante1.establecerNombre("Kiichiro Toyoda");
        fabricante1.establecerCiudad("Toyoda");
        
        Fabricante fabricante2 = new Fabricante();
        fabricante2.establecerNombre("Ron Dennis");
        fabricante2.establecerCiudad("Londres");
        
        Automotores auto = new Automotores("110254888");
        Automotores auto2 = new Automotores("11045798", "Mclaren", 2020, 150520,fabricante2 );
        auto.establecerCedula("11025689");
        auto.establecerMarca("Toyota");
        auto.establecerFabricante(fabricante1);
        auto.establecerAnio(2009);
        auto.establecerValorVehiculo(12000);
        
        auto.calcularValorMatricula();
        auto2.calcularValorMatricula();
        
        System.out.println("Imprimir Consturctor Uno");
        System.out.println(auto);
        System.out.println("------------------------------------------");
        System.out.println("Imprimir Consturctor  Dos");
        System.out.println(auto2);
    }
    
}
