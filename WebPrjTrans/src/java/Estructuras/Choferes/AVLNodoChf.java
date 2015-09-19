/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estructuras.Choferes;

/**
 *
 * @author Luis Locon
 */
public class AVLNodoChf {
    int id;
    String nombre, apellido, pass;
    int altura;
    AVLNodoChf izquierda;
    AVLNodoChf derecha;
    
    public AVLNodoChf(int id, String nombre, String apellido, String pass){
        this.id=id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.pass = pass;
        this.altura=0;
        this.izquierda=null;
        this.derecha=null;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public AVLNodoChf getIzquierda() {
        return izquierda;
    }

    public void setIzquierda(AVLNodoChf izquierda) {
        this.izquierda = izquierda;
    }

    public AVLNodoChf getDerecha() {
        return derecha;
    }

    public void setDerecha(AVLNodoChf derecha) {
        this.derecha = derecha;
    }
    
    
    
}
