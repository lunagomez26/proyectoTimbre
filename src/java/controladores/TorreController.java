/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import entidades.Torre;
import facade.TorreFacade;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;

/**
 *
 * @author USER
 */
@Named(value = "torreController")
@SessionScoped
public class TorreController implements Serializable {

    /**
     * Creates a new instance of TorreController
     */
    public TorreController() {
    }
    
    private Torre torre;
    @EJB
    TorreFacade torreFacade;
    
    @PostConstruct
    public void init(){
        torre = new Torre();
    }

    public Torre getTorre() {
        return torre;
    }

    public void setTorre(Torre torre) {
        this.torre = torre;
    }
    
    public String preRegistrar(){
        return "registroTorre";
    }
    
    public String registrarTorre(){
        torreFacade.create(this.torre);
        torre = new Torre();
        return "listaTorre";
    }
    
    public void elimnarTorre(Torre torre){
        torreFacade.remove(torre);
    }
    
    public String preActualizar(Torre torre){
        this.torre = torre;
        return "editarTorre";
    }
    
    public String actualizarTorre(){
        torreFacade.edit(this.torre);
        torre = new Torre();
        return "listaTorre";
    }
    
    public List<Torre> consultarTorre(){
        return torreFacade.findAll();
    }
   
    public Torre consultarId(){
        return torreFacade.find(torre.getIdTorre());
    }
    
   
    
}
