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
public class Ej_ver_varclase {
    public static void main(String args[]) {
        // Accediendo a un atributo estático
        System.out.println(Ej_varclase1.contador);
        // Todos los objetos manipulan al atributo estático
        Ej_varclase1 ex1 = new Ej_varclase1(); 
        Ej_varclase1 ex2 = new Ej_varclase1();
        Ej_varclase1 ex3 = new Ej_varclase1();
        Ej_varclase1 ex4 = new Ej_varclase1();
        Ej_varclase1 ex5 = new Ej_varclase1();
        System.out.println(ex1.contador); 
    }
}
