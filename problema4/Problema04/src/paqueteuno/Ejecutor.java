/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paqueteuno;
import paquetedos.Banco;
import paquetedos.Cliente;
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
        Banco banco = new Banco();
        banco.establecerNombreBanco("Banco de Loja");
        banco.establecerNumeroSucursales("6");
        
        Banco banco2 = new Banco();
        banco2.establecerNombreBanco("Banco de Pichincha");
        banco2.establecerNumeroSucursales("3");
        
        Cliente cliente = new Cliente();
        cliente.establecerNombre("Dara");
        cliente.establecerApellido("Van Gijsel");
        cliente.establecerCedula("11025948");
        
        Cliente cliente2 = new Cliente();
        cliente2.establecerNombre("Carlos");
        cliente2.establecerApellido("Mejia");
        cliente2.establecerCedula("110587108");
        
        Cheques cheque = new Cheques(2009);
        Cheques cheque2 = new Cheques(cliente2, banco2, 5000);
        cheque.calcularComision();
        cheque2.calcularComision();
        cheque.establecerCliente(cliente);
        cheque.establecerBanco(banco);
        System.out.println("Imprimir Constructor Uno");
        System.out.println(cheque);
        System.out.println("------------------------------------------");
        System.out.println("Imprimir Constructor  Dos");
        System.out.println(cheque2);

    }
    
}
