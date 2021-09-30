/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empleado;

import persona.Persona;

/**
 *
 * @author Rey
 */
public class Empleado extends Persona{
    //Atributos
    private int idEmpleado;
    private double sueldo;
    private static int contador;
    //getter y setter

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
    public Empleado(){
        this.idEmpleado = ++Empleado.contador;//preincrementar el valor a uno de ahi ir sumando uno cad avez que creamos un empleado
    }
    public Empleado(String nombre, double sueldo){
        this();
        this.nombre= nombre;
        this.sueldo=sueldo;
    }
    public Empleado(double sueldo, String nombre, String direccion, char genero, int edad) {
        //super(nombre,direccion,genero,edad);
        this.sueldo = sueldo;
        this.nombre = nombre;
        this.direccion = direccion;
        this.genero = genero;
        this.edad = edad;
        this.idEmpleado = ++Empleado.contador;//preincrementar el valor a uno de ahi ir sumando uno cad avez que creamos un empleado
    }

    @Override
    public String toString() {
        return "Empleado{" + "idEmpleado=" + idEmpleado + ", sueldo=" + sueldo + "nombre=" + super.getNombre() + ", direccion=" + super.getDireccion() + ", genero=" + super.getGenero() + ", edad=" + super.getEdad() +'}';
    }
    
    
}
