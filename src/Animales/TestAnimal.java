/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Animales;

/**
 *
 * @author alumno
 */
public class TestAnimal {
    public static void main(String[] args) {
        Tigre Tgr = new Tigre("Toby",3,"Grrrr....");
        
        System.out.println("Nombre Tigre: "+Tgr.getNombre()+" Edad: "+Tgr.getEdad());
        System.out.println("Ruido : " + Tgr.HaceRuido);
    }
}
