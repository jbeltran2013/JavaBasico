/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio2;

/**
 *
 * @author alumno
 */
public class Ej_conversion {
    
    public static void main(String args[]) {
        double cantidad = 150;
        double conv = Ej_conversion.dolaraEuro(cantidad);
        System.out.println("Conversion de Moneda:");
        System.out.print(cantidad + " dolares es " + conv + " euros");
        atributostatico();

    }
    
    public static double dolaraEuro(double a) {
        double euro = a * 0.81559;
    return euro;
    }
    
    public static void atributostatico() {
        System.out.println(" E x Dolar $");
        //completar
   
}
    
}
