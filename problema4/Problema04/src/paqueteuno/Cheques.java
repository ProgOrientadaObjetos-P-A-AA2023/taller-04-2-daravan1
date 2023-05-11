/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paqueteuno;
import paquetedos.Banco;
import paquetedos.Cliente;
/**
 *
 * @author darav
 */
public class Cheques {
    private double valor;
    private double comision;
    private Banco banco;
    private Cliente cliente;
    
    

    public Cheques(double v) {
        valor = v;
    }

    public Cheques(Cliente c, Banco b, double v) {
        cliente = c;
        banco = b;
        valor = v;
    }
    // 

    public void establecerCliente(Cliente c) {
        cliente = c;
    }

    public void establecerBanco(Banco b) {
        banco = b;
    }

    public void establecerValor(double v) {
        valor = v;
    }

    public void calcularComision() {
        comision = valor * 0.00003;
    }

    // Obtener
    public Cliente obtenerCliente() {
        return cliente;
    }

    public Banco obtenertBanco() {
        return banco;
    }

    public double obtenerValor() {
        return valor;
    }

    public double obtenerComision() {
        return comision;
    }

    @Override
    public String toString() {

        String cadena = String.format("""
                                      Nombre de cliente: %s
                                      Apellido del cliente: %s
                                      Cedula del cliente: %s
                                      Nombre del Banco: %s
                                      Numero de sucursales del banco: %s
                                      Valor del cheque: %.2f
                                      Comision: %.2f
                                      """, 
                cliente.obtenerNombre(),
                cliente.obtenerApellido(),
                cliente.obtenerCedula(),
                banco.obtenerNombreBanco(),
                banco.obtenerNumeroSucursales(),
                valor,
                comision);

        return cadena;
    }
}
