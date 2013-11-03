/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package App;
import laboratorio2.*;
/**
 *
 * @author alumno
 */
public class TestPersona {
    
    public static void main(String[] args) {
            
    byte edad = 60;
    Persona p = new Persona("James","Gosling", edad);
    
    System.out.println ("");
    System.out.println("Accediendo a sus atributos:");
    System.out.println("Nombre: " + p.nombre);
    System.out.println("Apellido: " + p.apellidos);
    System.out.println("Edad: " + p.edad);
    
    System.out.println(printNombre());
    
    }
    
    
     public static String printNombre() {
       NombrePersona n = new NombrePersona();
       n.setNombrePersona("Juan", "Arevalo");
       return n.getNombre()+" "+n.apellidos;
     }
    
    
}
