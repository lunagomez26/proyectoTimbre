/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import entidades.EstadoReserva;
import facade.EstadoReservaFacade;
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
@Named(value = "estadoReservaController")
@SessionScoped
public class EstadoReservaController implements Serializable {

    public EstadoReservaController() {
    }
    private EstadoReserva estadoReserva;
    @EJB
    EstadoReservaFacade estadoReservaFacade;
    
    @PostConstruct
    public void init(){
        estadoReserva = new EstadoReserva();
    }

    public EstadoReserva getEstadoReserva() {
        return estadoReserva;
    }

    public void setEstadoReserva(EstadoReserva estadoReserva) {
        this.estadoReserva = estadoReserva;
    }
    
    public String preRegistrar(){
        return "registrarEstadoReserva";
    }
    public String registrarEstadoReserva(){
        estadoReservaFacade.create(this.estadoReserva);
        estadoReserva = new EstadoReserva();
        return "listaEstadoReserva";
    }
    
    public void eliminarEstadoReserva(EstadoReserva estadoReserva){
        estadoReservaFacade.remove(estadoReserva);
    }
    
    public String preActualizar(EstadoReserva estadoReserva){
        this.estadoReserva = estadoReserva;
        return "editarEstadoReserva";
    }
    
    public String actualizarEstadoReserva(){
        estadoReservaFacade.edit(this.estadoReserva);
        estadoReserva = new EstadoReserva();
        return "listaEstadoReserva";
    }
    
   public List<EstadoReserva> consultarEstadoReserva(){
       return estadoReservaFacade.findAll();
   }
    
   public EstadoReserva consultarId(){
       return estadoReservaFacade.find(estadoReserva.getIdEstadoReserva());
   }
    
}
