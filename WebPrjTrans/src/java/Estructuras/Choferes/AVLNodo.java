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
public class AVLNodo {
    int id;
    String nombre, apellido, pass;
    int altura;
    AVLNodo izquierda, derecha;
    
    public AVLNodo(int id, String nombre, String apellido, String pass){
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

    public AVLNodo getIzquierda() {
        return izquierda;
    }

    public void setIzquierda(AVLNodo izquierda) {
        this.izquierda = izquierda;
    }

    public AVLNodo getDerecha() {
        return derecha;
    }

    public void setDerecha(AVLNodo derecha) {
        this.derecha = derecha;
    }
    
    
    
}
