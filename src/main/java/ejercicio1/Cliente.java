/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

/**
 *
 * @author Pc
 */
public class Cliente {
    
    String nombre;
    String apellidos;
    
    public Cliente(String nombre, String apellidos) {
        
        this.nombre=nombre;
        this.apellidos=apellidos;
        
    }
    
    public void interes()
    {
        System.out.print("Me llamo " + nombre + apellidos + " ");
    }
}
