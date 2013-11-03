/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Animales;

/**
 *
 * @author alumno
 */
public class Tigre extends Animal {

    public String getHaceRuido() {
        return HaceRuido;
    }

    public void setHaceRuido(String HaceRuido) {
        this.HaceRuido = HaceRuido;
    }
    
    String HaceRuido;
    
    public Tigre (String nombre, int edad, String ruido){
        this.setNombre(nombre);
        this.setEdad(edad);
        this.HaceRuido=ruido;
    }
    
    
}
