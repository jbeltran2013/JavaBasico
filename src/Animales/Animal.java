/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Animales;

/**
 *
 * @author alumno
 */
public class Animal {
    private String Nombre;
    private Double Peso;
    private String Color;
    private int edad;

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
   
    public void Animal(){};
    
}
