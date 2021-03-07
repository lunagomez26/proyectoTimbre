/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import entidades.EstadoSolicitud;
import facade.EstadoSolicitudFacade;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

/**
 *
 * @author Daniel Jerez
 */
@Named(value = "estadoSolicitudController")
@SessionScoped
public class EstadoSolicitudController implements Serializable{
    
    public EstadoSolicitudController(){
        
    }
    
    private EstadoSolicitud estadoSolicitud;
    @EJB
    EstadoSolicitudFacade estadoSolicitudFacade;
    
    @PostConstruct
    public void init(){
        estadoSolicitud = new EstadoSolicitud();
    }

    public EstadoSolicitud getEstadoSolicitud() {
        return estadoSolicitud;
    }

    public void setEstadoSolicitud(EstadoSolicitud estadoSolicitud) {
        this.estadoSolicitud = estadoSolicitud;
    }
    
    public String preRegistrar(){
        return "registrarEstadoSolicitud";
    }
    
    public String registrarEstadoSolicitud(){
        estadoSolicitudFacade.create(this.estadoSolicitud);
        estadoSolicitud = new EstadoSolicitud();
        return "listaEstadoSolicitud";
    }
    
    public void eliminarEstadoSolicitud(EstadoSolicitud estadoSolicitud){
        estadoSolicitudFacade.remove(estadoSolicitud);
    }
    
    public String preActualizar(EstadoSolicitud estadoSolicitud){
        this.estadoSolicitud = estadoSolicitud;
        return "editarEstadoSolicitud";
    }
    
    public String actualizarEstadoSolicitud(){
        estadoSolicitudFacade.edit(this.estadoSolicitud);
        estadoSolicitud = new EstadoSolicitud();
        return "listaEstadoSolicitud";
    }
    
    public List<EstadoSolicitud> consultarEstadoSolicitud(){
        return estadoSolicitudFacade.findAll();
    }
    
    public EstadoSolicitud consultarId(){
        return estadoSolicitudFacade.find(estadoSolicitud.getIdEstadoSolicitud());
    }
}
