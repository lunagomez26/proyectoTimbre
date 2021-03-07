/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import entidades.Administrador;
import entidades.EstadoSolicitud;
import entidades.Residente;
import entidades.Solicitud;
import entidades.TipoSolicitud;
import facade.AdministradorFacade;
import facade.EstadoSolicitudFacade;
import facade.ResidenteFacade;
import facade.SolicitudFacade;
import facade.TipoSolicitudFacade;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

/**
 *
 * @author Daniel Jerez
 */
@Named(value = "solicitudController")
@SessionScoped
public class SolicitudController implements Serializable{
    
    public SolicitudController(){
        
    }
    
    private Solicitud solicitud;
    private EstadoSolicitud estadoSolicitud;
    private TipoSolicitud tipoSolicitud;
    private Residente residente;
    private Administrador administrador;
    
    @EJB
    SolicitudFacade solicitudFacade;
    @EJB
    EstadoSolicitudFacade estadoSolicitudFacade;
    @EJB
    TipoSolicitudFacade tipoSolicitudFacade;
    @EJB
    AdministradorFacade administradorFacade;
    @EJB
    ResidenteFacade residenteFacade;
    
    @PostConstruct
    public void init(){
        solicitud = new Solicitud();
        estadoSolicitud = new EstadoSolicitud();
        tipoSolicitud = new TipoSolicitud();
        residente = new Residente();
        administrador = new Administrador();
    }

    public Solicitud getSolicitud() {
        return solicitud;
    }

    public void setSolicitud(Solicitud solicitud) {
        this.solicitud = solicitud;
    }

    public EstadoSolicitud getEstadoSolicitud() {
        return estadoSolicitud;
    }

    public void setEstadoSolicitud(EstadoSolicitud estadoSolicitud) {
        this.estadoSolicitud = estadoSolicitud;
    }

    public TipoSolicitud getTipoSolicitud() {
        return tipoSolicitud;
    }

    public void setTipoSolicitud(TipoSolicitud tipoSolicitud) {
        this.tipoSolicitud = tipoSolicitud;
    }

    public Residente getResidente() {
        return residente;
    }

    public void setResidente(Residente residente) {
        this.residente = residente;
    }

    public Administrador getAdministrador() {
        return administrador;
    }

    public void setAdministrador(Administrador administrador) {
        this.administrador = administrador;
    }
    public String preCreate(){
        return "createRequest";
    }
    public String preInternacionalizacion(){
        return "listRequest";
    }
    public String desInternacionalizar(){
        return "listaSolicitud";
    }
    
    public String preRegistrar(){
        return "registrarSolicitud";
    }
    public String createRequest(){
        solicitud.setIdEstadoSolicitud(estadoSolicitudFacade.find(1));
        solicitud.setIdTipoSolicitud(tipoSolicitudFacade.find(this.tipoSolicitud.getIdTipoSolicitud()));
        solicitud.setIdAdministrador(administradorFacade.find(this.administrador.getIdAdministrador()));
        solicitud.setIdResidente(residenteFacade.find(this.residente.getIdResidente()));
        Date date = new Date();
        solicitud.setFechaHora(date);
        solicitudFacade.create(this.solicitud);
        solicitud = new Solicitud();
        return "listRequest";
    }
    public String registrarSolicitud(){
        solicitud.setIdEstadoSolicitud(estadoSolicitudFacade.find(1));
        solicitud.setIdTipoSolicitud(tipoSolicitudFacade.find(this.tipoSolicitud.getIdTipoSolicitud()));
        solicitud.setIdAdministrador(administradorFacade.find(this.administrador.getIdAdministrador()));
        solicitud.setIdResidente(residenteFacade.find(this.residente.getIdResidente()));
        Date date = new Date();
        solicitud.setFechaHora(date);
        solicitudFacade.create(this.solicitud);
        solicitud = new Solicitud();
        return "listaSolicitud";
    }
    
    public void eliminarSolicitud(Solicitud solicitud){
        solicitudFacade.remove(solicitud);
    }
    
    public String preActualizar(Solicitud solicitud){
        this.solicitud = solicitud;
        return "editarSolicitud";
    }
    public String preEdit(Solicitud solicitud){
        this.solicitud = solicitud;
        return "editRequest";
    }
    public String editRequest(){
        solicitud.setIdEstadoSolicitud(estadoSolicitudFacade.find(1));
        solicitud.setIdTipoSolicitud(tipoSolicitudFacade.find(this.tipoSolicitud.getIdTipoSolicitud()));
        solicitud.setIdAdministrador(administradorFacade.find(this.administrador.getIdAdministrador()));
        solicitud.setIdResidente(residenteFacade.find(this.residente.getIdResidente()));
        solicitudFacade.edit(this.solicitud);
        solicitud = new Solicitud();
        return "listRequest";
    }
    
    public String actualizarSolicitud(){
        solicitud.setIdEstadoSolicitud(estadoSolicitudFacade.find(1));
        solicitud.setIdTipoSolicitud(tipoSolicitudFacade.find(this.tipoSolicitud.getIdTipoSolicitud()));
        solicitud.setIdAdministrador(administradorFacade.find(this.administrador.getIdAdministrador()));
        solicitud.setIdResidente(residenteFacade.find(this.residente.getIdResidente()));
        solicitudFacade.edit(this.solicitud);
        solicitud = new Solicitud();
        return "listaSolicitud";
    }
    
    public List<Solicitud> consultarSolicitud(){
        return solicitudFacade.findAll();
    }
    
    public Solicitud consultarId(){
        return solicitudFacade.find(solicitud.getIdSolicitud());
    }
}
