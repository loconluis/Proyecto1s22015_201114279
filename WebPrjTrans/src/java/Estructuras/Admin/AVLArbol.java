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
public class AVLArbol {
    
    AVLNodo raiz;
    //String cadena="";
    int contador;
    
    public AVLArbol(){
        this.raiz=null;
        this.contador=0;
    }
    
    public void insertarAdmin(String correo, String pass){
        
        AVLNodo nuevo = new AVLNodo(correo, pass);
        
        if(raiz == null){
            raiz = insertarNodo(nuevo, raiz);
        }else{
            raiz = insertarNodo(nuevo, raiz);
        }
    }

    private AVLNodo insertarNodo(AVLNodo nuevo, AVLNodo raiz) {
        if (raiz == null){
            raiz = nuevo;
            System.out.println("SubRaiz: "+ raiz.correo);
        }else{
            if(raiz.correo.compareTo(nuevo.correo)>0){
                raiz.izquierda = insertarNodo(nuevo, raiz.izquierda);
                raiz.altura = altura(raiz.derecho) - altura(raiz.izquierda);
            
                if(raiz.altura<-1){
                    if (raiz.izquierda.altura == -1){
                        raiz = doubleLeft(raiz, raiz.izquierda);
                    }else if (raiz.izquierda.altura ==1){
                        raiz = leftandRight(raiz, raiz.izquierda, raiz.izquierda.derecho);
                    }
                }
                System.out.println("Se inserto en la izquierda");
            }
            else if (raiz.correo.compareTo(nuevo.correo)<0){
                raiz.derecho = insertarNodo(nuevo, raiz.derecho);
                raiz.altura = altura(raiz.derecho)-altura(raiz.izquierda);
                if(raiz.altura>1){
                    if(raiz.derecho.altura==1){
                       raiz= doubleRight(raiz, raiz.derecho);
                    }else if (raiz.derecho.altura==-1){
                        raiz = rightandLeft(raiz, raiz.derecho, raiz.derecho.izquierda);
                    }
                }
                System.out.println("Se inserto a la derecha");
            
            }else if (raiz.correo.compareTo(nuevo.correo)==0){
                return null;
            }
        }
        contador++;
        return raiz;
    }
   
    public boolean BuscarAdmin(String correo){
        AVLNodo eslabon;
        
        eslabon = buscarNodo(raiz, correo);
        
        if(eslabon==null){
            return false;
        }else{
            return true;
        }
    }
    
    private AVLNodo buscarNodo(AVLNodo raiz, String correo) {
        if(raiz !=null){
            if(raiz.correo.compareTo(correo)==0){
                return raiz;
            }else if (raiz.correo.compareTo(correo)>0){
                return buscarNodo(raiz.izquierda, correo);
            }else if (raiz.correo.compareTo(correo)<0){
                return buscarNodo(raiz.derecho, correo);
            }
        }
        return null;
    }
    
    private int altura(AVLNodo raiz) {
        if (raiz == null){
            return 0;
        }else {
            int x = altura(raiz.izquierda);
            int y = altura(raiz.derecho);
            if(x>y){
                return x+1;
            }else{
                return y+1;
            }
        }
    }

    private AVLNodo doubleLeft(AVLNodo t, AVLNodo taux) {
        t.altura=0;
        taux.altura=0;
        
        t.izquierda=taux.derecho;
        taux.derecho=t;
        t= taux;
        
        return t;
    }

    private AVLNodo leftandRight(AVLNodo t, AVLNodo taux, AVLNodo tnew) {
        if(tnew.altura==-1){
            t.altura=1;
            taux.altura=0;
            tnew.altura=0;
        }
        if (tnew.altura==0){
            t.altura=0;
            taux.altura=0;
            tnew.altura=0;
        }
        if (tnew.altura==1){
            t.altura=0;
            taux.altura=-1;
            tnew.altura=0;
        }
        
        taux.derecho=tnew.izquierda;
        tnew.izquierda= taux;
        t.izquierda= tnew.derecho;
        tnew.derecho = t;
        t= tnew;
        
        return t;
    }

    private AVLNodo doubleRight(AVLNodo t, AVLNodo taux) {
        t.altura=0;
        taux.altura=0;
        
        t.derecho= taux.izquierda;
        taux.izquierda= t;
        t = taux;
        
        return t;
    }

    private AVLNodo rightandLeft(AVLNodo t, AVLNodo taux, AVLNodo tnew) {
        if(tnew.altura==-1){
            t.altura=0;
            taux.altura=1;
            tnew.altura=0;
        }
        if (tnew.altura==0){
            t.altura=0;
            taux.altura=0;
            tnew.altura=0;
        }
        if (tnew.altura==1){
            t.altura=-1;
            taux.altura=0;
            tnew.altura=0;
        }
        
        taux.izquierda=tnew.derecho;
        tnew.derecho= taux;
        t.derecho= tnew.izquierda;
        tnew.izquierda = t;
        t= tnew;
        
        return t;
    }

}
