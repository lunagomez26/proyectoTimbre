/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import entidades.RespuestaSolicitud;
import entidades.Solicitud;
import facade.RespuestaSolicitudFacade;
import facade.SolicitudFacade;
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
@Named("respuestaSolicitudController")
@SessionScoped
public class RespuestaSolicitudController implements Serializable {
    
    public RespuestaSolicitudController(){
        
    }
    
    private RespuestaSolicitud respuestaSolicitud;
    private Solicitud solicitud;
    
    @EJB
    RespuestaSolicitudFacade respuestaSolicitudFacade;
    @EJB
    SolicitudFacade solicitudFacade;
    
    @PostConstruct
    public void Init(){
        respuestaSolicitud = new RespuestaSolicitud();
        solicitud = new Solicitud();
    }

    public RespuestaSolicitud getRespuestaSolicitud() {
        return respuestaSolicitud;
    }

    public void setRespuestaSolicitud(RespuestaSolicitud respuestaSolicitud) {
        this.respuestaSolicitud = respuestaSolicitud;
    }

    public Solicitud getSolicitud() {
        return solicitud;
    }

    public void setSolicitud(Solicitud solicitud) {
        this.solicitud = solicitud;
    }
    
    public String preRegistrar(){
        return "registrarRespuestaSolicitud";
    }
    
    public String registrarRespuestaSolicitud(){
        respuestaSolicitud.setIdSolicitud(solicitudFacade.find(this.solicitud.getIdSolicitud()));
        respuestaSolicitudFacade.create(this.respuestaSolicitud);
        respuestaSolicitud = new RespuestaSolicitud();
        return "listaRespuestaSolicitud";
    }
    
    public String preActualizar(RespuestaSolicitud respuestaSolicitud){
        this.respuestaSolicitud = respuestaSolicitud;
        return "editarRespuestaSolicitud";
    }
    
    public String actualizarRespuestaSolicitud(){
        respuestaSolicitud.setIdSolicitud(solicitudFacade.find(this.solicitud.getIdSolicitud()));
        respuestaSolicitudFacade.edit(this.respuestaSolicitud);
        respuestaSolicitud = new RespuestaSolicitud();
        return "listaRespuestaSolicitud";
    }
    
    public void eliminarRespuestaSolicitud(RespuestaSolicitud respuestaSolicitud){
        respuestaSolicitudFacade.remove(respuestaSolicitud);
    }
    
    public List<RespuestaSolicitud> consultarRespuestaSolicitud(){
        return respuestaSolicitudFacade.findAll();
    }
    
    public RespuestaSolicitud consultarId(){
        return respuestaSolicitudFacade.find(respuestaSolicitud.getIdRespuestaSolicitud());
    }
}
