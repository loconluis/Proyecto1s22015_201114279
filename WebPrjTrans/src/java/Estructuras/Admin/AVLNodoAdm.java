/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estructuras.Admin;

/**
 *
 * @author Luis Locon
 */
public class AVLNodoAdm {
   
    String correo, pass;
    AVLNodoAdm izquierda;
    AVLNodoAdm derecho;
    int altura;
    
    public AVLNodoAdm(String correo, String pass){
        this.correo=correo;
        this.pass=pass;
        this.izquierda=null;
        this.derecho=null;
        this.altura=0;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public AVLNodoAdm getIzquierda() {
        return izquierda;
    }

    public void setIzquierda(AVLNodoAdm izquierda) {
        this.izquierda = izquierda;
    }

    public AVLNodoAdm getDerecho() {
        return derecho;
    }

    public void setDerecho(AVLNodoAdm derecho) {
        this.derecho = derecho;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    
    
    
    
    
    
    
    
    
}
