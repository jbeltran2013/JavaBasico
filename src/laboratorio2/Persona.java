/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio2;

/**
 *
 * @author alumno
 */
public class Persona {
    public String nombre;
    public String apellidos;
    public byte edad;

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public byte getEdad() {
        return edad;
    }

    public void setEdad(byte edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public Persona(String n, String a, byte e) {     
      this.nombre = n;
      this.apellidos = a;
      this.edad = e;
   }  
    
}
