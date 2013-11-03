/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio2;

/**
 *
 * @author alumno
 */
public class Bicicleta {
    int velocidadActual;
    int velocidadMaxima;
    int engranajeActual;
    String nroAro;
    String marca;
    String modelo;

    public int getEngranajeActual() {
        return engranajeActual;
    }

    public void setEngranajeActual(int engranajeActual) {
        this.engranajeActual = engranajeActual;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getNroAro() {
        return nroAro;
    }

    public void setNroAro(String nroAro) {
        this.nroAro = nroAro;
    }

    public int getVelocidadActual() {
        return velocidadActual;
    }

    public void setVelocidadActual(int velocidadActual) {
        this.velocidadActual = velocidadActual;
    }

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }
    
public void cambiarLlantas(){
    System.out.println("Cambiando llantas");
}

public void frenar() { 
    System.out.println("Frenando");
}
public void cambiarVelocidad(int engranajeActual){
    this.engranajeActual = engranajeActual;
    System.out.println("Cambiando velocidad a " + engranajeActual); 
}
    
}
