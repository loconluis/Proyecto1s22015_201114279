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
public class ListaRuta {
    public static NodoRuta cabeza, cola;
    
    public void AgregarBus(String noruta){
        NodoRuta nuevo = cabeza;
        if (nuevo == null){
            nuevo = new NodoRuta(null, noruta);
            cabeza = nuevo;
            cola = nuevo;
        }else{
            if(searchRuta(noruta, 0)==null){
                while(nuevo.sig !=null)
                nuevo = nuevo.sig;
                nuevo.sig = new NodoRuta(cola, noruta);
                cola = nuevo.sig;
            }
        
        }
    }

    public NodoRuta searchRuta(String noruta, int aux) {
        NodoRuta buscado = null;
        NodoRuta actual = cabeza;
            if((actual == null) && (aux==1)){
                javax.swing.JOptionPane.showMessageDialog(null, "No hay datos en la lista");
            }else
            {
                boolean existe = false;
                while(actual!=null){
                    if(actual.getNombreRuta().equalsIgnoreCase(noruta))
                    {
                        existe = true;
                        buscado = actual;
                    }
                    actual = actual.sig;
                }
                if((!existe)&&(aux==1))
                    javax.swing.JOptionPane.showConfirmDialog(null, "No se encontro el objeto");
            }
            return buscado;
    }
}
