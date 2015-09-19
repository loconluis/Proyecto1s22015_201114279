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
public class AVLArbolEG {
    AVLNodoEG raiz;
    //String cadena="";
    int contador;
    
    public AVLArbolEG(){
        this.raiz=null;
        this.contador=0;
    }
    
    public void insertarChofer(int id, int personas){
        
        AVLNodoEG nuevo = new AVLNodoEG(id, personas);
        
        if(raiz == null){
            raiz = insertarNodo(nuevo, raiz);
        }else{
            raiz = insertarNodo(nuevo, raiz);
        }
    }

    private AVLNodoEG insertarNodo(AVLNodoEG nuevo, AVLNodoEG raiz) {
        if (raiz == null){
            raiz = nuevo;
            System.out.println("SubRaiz: "+ raiz.idestacion);
        }else{
            if(nuevo.idestacion < raiz.idestacion){
                raiz.izquierda = insertarNodo(nuevo, raiz.izquierda);
                raiz.altura = altura(raiz.derecha) - altura(raiz.izquierda);
            
                if(raiz.altura< -1){
                    if (raiz.izquierda.altura == -1){
                        raiz = doubleLeft(raiz, raiz.izquierda);
                    }else if (raiz.izquierda.altura ==1){
                        raiz = leftandRight(raiz, raiz.izquierda, raiz.izquierda.derecha);
                    }
                }
                System.out.println("Se inserto en la izquierda");
            }
            else if (nuevo.idestacion > raiz.idestacion){
                raiz.derecha = insertarNodo(nuevo, raiz.derecha);
                raiz.altura = altura(raiz.derecha)-altura(raiz.izquierda);
                
                if(raiz.altura>1){
                    if(raiz.derecha.altura==1){
                       raiz= doubleRight(raiz, raiz.derecha);
                    }else if (raiz.derecha.altura==-1){
                        raiz = rightandLeft(raiz, raiz.derecha, raiz.derecha.izquierda);
                    }
                }
                System.out.println("Se inserto a la derecha");
            
            }else if (nuevo.idestacion==raiz.idestacion){
                System.out.println("Ya existe");
                return null;
            }
        }
        contador++;
        return raiz;
    }
   
    public boolean BuscarChofer(int id){
        AVLNodoEG eslabon;
        
        eslabon = buscarNodo(raiz, id);
        
        if(eslabon==null){
            return false;
        }else{
            return true;
        }
    }
    
    private AVLNodoEG buscarNodo(AVLNodoEG raiz, int id) {
        if(raiz !=null){
            if(raiz.idestacion == id){
                return raiz;
            }else if (raiz.idestacion > id){
                return buscarNodo(raiz.izquierda, id);
            }else if (raiz.idestacion < id){
                return buscarNodo(raiz.derecha, id);
            }
        }
        return null;
    }
    
    private int altura(AVLNodoEG raiz) {
        if (raiz == null){
            return 0;
        }else {
            int x = altura(raiz.izquierda);
            int y = altura(raiz.derecha);
            if(x>y){
                return x+1;
            }else{
                return y+1;
            }
        }
    }

    private AVLNodoEG doubleLeft(AVLNodoEG t, AVLNodoEG taux) {
        t.altura=0;
        taux.altura=0;
        
        t.izquierda=taux.derecha;
        taux.derecha=t;
        t= taux;
        
        return t;
    }

    private AVLNodoEG leftandRight(AVLNodoEG t, AVLNodoEG taux, AVLNodoEG tnew) {
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
        
        taux.derecha=tnew.izquierda;
        tnew.izquierda= taux;
        t.izquierda= tnew.derecha;
        tnew.derecha = t;
        t= tnew;
        
        return t;
    }

    private AVLNodoEG doubleRight(AVLNodoEG t, AVLNodoEG taux) {
        t.altura=0;
        taux.altura=0;
        
        t.derecha= taux.izquierda;
        taux.izquierda= t;
        t = taux;
        
        return t;
    }

    private AVLNodoEG rightandLeft(AVLNodoEG t, AVLNodoEG taux, AVLNodoEG tnew) {
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
        
        taux.izquierda=tnew.derecha;
        tnew.derecha= taux;
        t.derecha= tnew.izquierda;
        tnew.izquierda = t;
        t= tnew;
        
        return t;
    }
}
