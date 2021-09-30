/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persona;
import cliente.Cliente;
import empleado.Empleado;
import java.util.Date;
/**
 *
 * @author Rey
 */
public class Persona {
    //Atributos
    public String nombre,direccion;
    public char genero;
    public int edad;
    //getter

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String dirección) {
        this.direccion = dirección;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    //Constructor

    public Persona(String nombre, String direccion, char genero, int edad) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.genero = genero;
        this.edad = edad;
    }
    
    public static void main(String[] args) {
        Cliente C1 = new Cliente(1,new Date("02/7/1560"),true, "Pepe","C/Alcaparra",'f',32);
        System.out.println(C1);
        Empleado E1 = new Empleado(3000,"Pepe","C/Melena7",'f',20);
        System.out.println(E1);
        Empleado E2 = new Empleado(3000,"Alias","C/Melena65",'f',80);
        System.out.println(E2);
        /*Empleado E3 = new Empleado("Juan", 22000);
        System.out.println(E3);*/
        //C1.setGenero('f');//CON COMILLAS SIMPLES
    }
    
    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", direccion=" + direccion + ", genero=" + genero + ", edad=" + edad + '}';
    }    
    
}
