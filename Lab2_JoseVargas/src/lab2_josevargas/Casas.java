/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2_josevargas;

/**
 *
 * @author josevargas
 */
public class Casas {
    private int n_casa;
    private int n_bloque;
    private String color;
    private int largo;
    private int ancho;
    private String comprada;
    private String estado;

    public Casas() {
    }

    public Casas(int n_casa, int n_bloque, String color, int largo, int ancho, String comprada, String estado) {
        this.n_casa = n_casa;
        this.n_bloque = n_bloque;
        this.color = color;
        this.largo = largo;
        this.ancho = ancho;
        this.comprada = comprada;
        this.estado = estado;
    }

    public int getN_casa() {
        return n_casa;
    }

    public void setN_casa(int n_casa) {
        this.n_casa = n_casa;
    }

    public int getN_bloque() {
        return n_bloque;
    }

    public void setN_bloque(int n_bloque) {
        this.n_bloque = n_bloque;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getLargo() {
        return largo;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public String getComprada() {
        return comprada;
    }

    public void setComprada(String comprada) {
        this.comprada = comprada;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Numero de Casa = " + n_casa + " | Bloque = " + n_bloque + " | Color = " + color + " | Largo = " + largo + " | Ancho = " + ancho + " | Disponible = " + comprada + " | Estado = " + estado;
    }
    
    
}
