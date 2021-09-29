/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cliente;

import java.util.Date;
import persona.Persona;

/**
 *
 * @author Rey
 */
public class Cliente extends Persona{
    //Atributo
    int idCliente;
    Date fechaRegistro;
    boolean vip;
    //constructor

    public Cliente(int idCliente, Date fechaRegistro, boolean vip,String nombre, String direccion, char genero, int edad) {
        this.idCliente = idCliente;
        this.fechaRegistro = fechaRegistro;
        this.vip = vip;
        this.nombre = nombre;
        this.direccion = direccion;
        this.genero = genero;
        this.edad = edad;
    }
    /*public Cliente(String nombre, String dirección, char genero, int edad) {
        this.nombre = nombre;
        this.dirección = dirección;
        this.genero = genero;
        this.edad = edad;
    }*/

    @Override
    public String toString() {
        return "Cliente{" + "idCliente=" + idCliente + ", fechaRegistro=" + fechaRegistro + ", vip=" + vip + "nombre=" + nombre + ", direccion=" + direccion + ", genero=" + genero + ", edad=" + edad +'}';
    }

    
    
}
