/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paqueteuno;
import paquetedos.Universidad;

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
        
        Universidad uni1 = new Universidad();
        uni1.establecerNombreUni("Utpl");
        uni1.establecerDireccion("Loja");
        
        Universidad uni2 = new Universidad();
        uni2.establecerNombreUni("Puce");
        uni2.establecerDireccion("Quito");
        
        Estudiantes estudiante1 = new Estudiantes();
        Estudiantes estudiante2 = new Estudiantes("Dara Van Gijsel", 7.5, 9.5, 8, uni1);
        
        estudiante1.establecerNombre("Sofia Vire");
        estudiante1.establecerMateria1(9.3);
        estudiante1.establecerMateria2(9);
        estudiante1.establecerMateria3(9.8);
        estudiante1.establecerUniversidad(uni2);
        estudiante1.calcularPromedio();
        estudiante2.calcularPromedio();
        System.out.println("Imprimir Constructor Uno");
        System.out.println(estudiante1);
        System.out.println("------------------------------------------");
        System.out.println("Imprimir Constructor  Dos");
        System.out.println(estudiante2);
    }

}
