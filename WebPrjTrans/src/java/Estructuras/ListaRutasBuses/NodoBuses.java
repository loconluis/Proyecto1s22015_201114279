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
public class NodoBuses {
    String idbus;
    NodoBuses ant, sig;
    double inicio, fin;
    
    public NodoBuses(NodoBuses ant, String idbus){
        this.idbus = idbus;
        this.sig=null;
        this.inicio=0;
        this.fin=0;
    }
    
    public NodoBuses(NodoBuses ant, String idbus, double inicio, double fin){
        this.idbus=idbus;
        this.sig=null;
        this.inicio=inicio; 
        this.fin=fin;
    }

    public String getIdbus() {
        return idbus;
    }

    public void setIdbus(String idbus) {
        this.idbus = idbus;
    }

    public NodoBuses getAnt() {
        return ant;
    }

    public void setAnt(NodoBuses ant) {
        this.ant = ant;
    }

    public NodoBuses getSig() {
        return sig;
    }

    public void setSig(NodoBuses sig) {
        this.sig = sig;
    }

    public double getInicio() {
        return inicio;
    }

    public void setInicio(double inicio) {
        this.inicio = inicio;
    }

    public double getFin() {
        return fin;
    }

    public void setFin(double fin) {
        this.fin = fin;
    }
    
    
}
