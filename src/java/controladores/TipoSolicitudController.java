/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import entidades.TipoSolicitud;
import facade.TipoSolicitudFacade;
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
@Named(value = "tipoSolicitudController")
@SessionScoped
public class TipoSolicitudController implements Serializable {
    
    public TipoSolicitudController(){
        
    }
    
    private TipoSolicitud tipoSolicitud;
    @EJB
    TipoSolicitudFacade tipoSolicitudFacade;
    
    @PostConstruct
    public void init(){
        tipoSolicitud = new TipoSolicitud();
    }

    public TipoSolicitud getTipoSolicitud() {
        return tipoSolicitud;
    }

    public void setTipoSolicitud(TipoSolicitud tipoSolicitud) {
        this.tipoSolicitud = tipoSolicitud;
    }
    
    public String preRegistrar(){
        return "registrarTipoSolicitud";
    }
    
    public String registrarTipoSolicitud(){
        tipoSolicitudFacade.create(this.tipoSolicitud);
        tipoSolicitud = new TipoSolicitud();
        return "listaTipoSolicitud";
    }
    
    public void eliminarTipoSolicitud(TipoSolicitud tipoSolicitud){
        tipoSolicitudFacade.remove(tipoSolicitud);
    }
    
    public String preActualizar(TipoSolicitud tipoSolicitud){
        this.tipoSolicitud = tipoSolicitud;
        return "editarTipoSolicitud";
    }
    
    public String actualizarTipoSolicitud(){
        tipoSolicitudFacade.edit(this.tipoSolicitud);
        tipoSolicitud = new TipoSolicitud();
        return "listaTipoSolicitud";
    }
    
    public List<TipoSolicitud> consultarTipoSolicitud(){
        return tipoSolicitudFacade.findAll();
    }
    
    public TipoSolicitud consultarId(){
        return tipoSolicitudFacade.find(tipoSolicitud.getIdTipoSolicitud());
    }
}
