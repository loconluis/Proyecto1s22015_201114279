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
public class ListaBuses {
     public static NodoBuses cabeza, cola;
    
    public void AgregarBus(String idbus){
        NodoBuses nuevo = cabeza;
        if (nuevo == null){
            nuevo = new NodoBuses(null, idbus);
            cabeza = nuevo;
            cola = nuevo;
        }else{
            if(searchBus(idbus, 0)==null){
                while(nuevo.sig !=null)
                nuevo = nuevo.sig;
                nuevo.sig = new NodoBuses(cola, idbus);
                cola = nuevo.sig;
            }
        
        }
    }

    public NodoBuses searchBus(String idbus, int aux) {
        NodoBuses buscado = null;
        NodoBuses actual = cabeza;
            if((actual == null) && (aux==1)){
                javax.swing.JOptionPane.showMessageDialog(null, "No hay datos en la lista");
            }else
            {
                boolean existe = false;
                while(actual!=null){
                    if(actual.getIdbus().equalsIgnoreCase(idbus))
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
    
    public void ActualizarHora(String idbus, double inicio, double fin){
        NodoBuses encontrado;
            encontrado = searchBus(idbus, 0);
            
            encontrado.setInicio(inicio);
            encontrado.setFin(fin);
    javax.swing.JOptionPane.showMessageDialog(null, "se agregaron las horas");
    }
}
