/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import entidades.Cita;
import entidades.Solicitud;
import facade.CitaFacade;
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
@Named ("citaController")
@SessionScoped
public class CitaController implements Serializable{
    
    public CitaController(){
        
    }
    
    private Cita cita;
    private Solicitud solicitud;
    @EJB
    CitaFacade citaFacade;
    @EJB
    SolicitudFacade solicitudFacade;
    
    @PostConstruct
    public void Init(){
        cita = new Cita();
        solicitud = new Solicitud();
    }

    public Cita getCita() {
        return cita;
    }

    public void setCita(Cita cita) {
        this.cita = cita;
    }

    public Solicitud getSolicitud() {
        return solicitud;
    }

    public void setSolicitud(Solicitud solicitud) {
        this.solicitud = solicitud;
    }
    
    public String preRegitrar(){
        return "registrarCita";
    }
    
    public String registrarCita(){
        cita.setIdSolicitud(solicitudFacade.find(this.solicitud.getIdSolicitud()));
        citaFacade.create(this.cita);
        cita = new Cita();
        return "listaCita";
    }
    
    public String preActualizar(Cita cita){
        this.cita = cita;
        return "editarCita";
    }
    
    public String actualizarCita(){
        cita.setIdSolicitud(solicitudFacade.find(this.solicitud.getIdSolicitud()));
        citaFacade.edit(this.cita);
        cita = new Cita();
        return "listaCita";
    }
    
    public void eliminarCita(Cita cita){
        citaFacade.remove(cita);
    }
    
    public List<Cita> consultarCita(){
        return citaFacade.findAll();
    }
    
    public Cita consultarId(){
        return citaFacade.find(cita.getIdCita());
    }
}
