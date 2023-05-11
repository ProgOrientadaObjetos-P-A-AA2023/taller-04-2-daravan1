/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paqueteuno;
import paquetedos.Provincia;
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
        Provincia provincia1 = new Provincia();
        Provincia provincia2 = new Provincia();
        
        provincia1.establecerNombreProvincia("Loja");
        provincia1.establecerNumero("125009");
        provincia2.establecerNombreProvincia("Azuay");
        provincia2.establecerNumero("260519");
        
        Profesores profe = new Profesores(600);
        Profesores profe2 = new Profesores("Juan", "Perez", 650, 110299530, provincia2);
        
        profe.establecerNombre("Maria");
        profe.establecerApellido("Garcia");
        profe.establecerCedula(1102659646);
        profe.calcularSueldoTotal();
        profe.establecerProvincia(provincia1);
        profe2.calcularSueldoTotal();
        System.out.println("Imprimir Constructor Uno");
        System.out.println(profe);
        System.out.println("------------------------------------------");
        System.out.println("Imprimir Constructor  Dos");
        System.out.println(profe2);
    }
    
}
