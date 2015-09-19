/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estructuras.ListaRutasBuses;

/**
 *
 * @author Luis Locon
 */
public class NodoRuta {
    String nombreRuta;
    NodoRuta ant, sig;
    
    
    public NodoRuta(NodoRuta ant, String noruta){
        this.sig=null;
        this.nombreRuta=noruta;
    }

    public String getNombreRuta() {
        return nombreRuta;
    }

    public void setNombreRuta(String nombreRuta) {
        this.nombreRuta = nombreRuta;
    }

    public NodoRuta getAnt() {
        return ant;
    }

    public void setAnt(NodoRuta ant) {
        this.ant = ant;
    }

    public NodoRuta getSig() {
        return sig;
    }

    public void setSig(NodoRuta sig) {
        this.sig = sig;
    }
    
    
}
