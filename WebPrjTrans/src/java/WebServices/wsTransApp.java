/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WebServices;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import Estructuras.Admin.*;
import Estructuras.Choferes.*;
import Estructuras.EstacionC.*;
import Estructuras.ListaRutasBuses.*;
/**
 *
 * @author Luis Locon
 */
@WebService(serviceName = "wsTransApp")
public class wsTransApp {

    AVLArbolAdmin admtree = new AVLArbolAdmin();
    
    
    
    /**
     * Web service operation
     */
    @WebMethod(operationName = "Validar")
    public String Validar(@WebParam(name = "id") String id, @WebParam(name = "pass") String pass, @WebParam(name = "tipo") String tipo) {
        if(id.equalsIgnoreCase("admin") && pass.equalsIgnoreCase("pass") && tipo.equalsIgnoreCase("administrador")){
            return "Webmaster";
        }
        else{
            AVLNodoAdm adm=null;
            AVLNodoChf chf = null;
            AVLCenterE ce = null;
            AVLNodoEG eg = null;
            switch(tipo){
                case "administrador":
                    adm = admtree.BuscarAdmin(id);
                    
                    
            
            }
        
        }
        
        return null;
    }
}
