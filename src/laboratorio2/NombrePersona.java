/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio2;

/**
 *
 * @author alumno
 */
public class NombrePersona {
    public String nombre;
    public String apellidos;

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void setNombrePersona(String nombre, String apellido) {     
       this.nombre = nombre;
       this.apellidos = apellido;
   }   
           
}
