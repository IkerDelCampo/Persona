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
    int idEmpleado;
    double sueldo;
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
    
}
