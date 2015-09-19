/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estructuras.EstacionC;

/**
 *
 * @author Luis Locon
 */
public class AVLCenterE {
    int idestacion, nopersonas;
    int altura;
    
    AVLCenterE izquierda, derecha;
    
    public AVLCenterE(int idestacion, int nopersonas){
        this.idestacion= idestacion;
        this.nopersonas=nopersonas;
        this.izquierda= null;
        this.derecha= null;
        this.altura=0;
    }

    public int getIdestacion() {
        return idestacion;
    }

    public void setIdestacion(int idestacion) {
        this.idestacion = idestacion;
    }

    public int getNopersonas() {
        return nopersonas;
    }

    public void setNopersonas(int nopersonas) {
        this.nopersonas = nopersonas;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public AVLCenterE getIzquierda() {
        return izquierda;
    }

    public void setIzquierda(AVLCenterE izquierda) {
        this.izquierda = izquierda;
    }

    public AVLCenterE getDerecha() {
        return derecha;
    }

    public void setDerecha(AVLCenterE derecha) {
        this.derecha = derecha;
    }
    
    
}
