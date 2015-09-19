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
public class AVLNodo {
   
    String correo, pass;
    AVLNodo izquierda;
    AVLNodo derecho;
    int altura;
    
    public AVLNodo(String correo, String pass){
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

    public AVLNodo getIzquierda() {
        return izquierda;
    }

    public void setIzquierda(AVLNodo izquierda) {
        this.izquierda = izquierda;
    }

    public AVLNodo getDerecho() {
        return derecho;
    }

    public void setDerecho(AVLNodo derecho) {
        this.derecho = derecho;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    
    
    
    
    
    
    
    
    
}
