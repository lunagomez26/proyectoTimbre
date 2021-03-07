/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import entidades.Administrador;
import entidades.Reserva;
import entidades.RespuestaReserva;
import facade.AdministradorFacade;
import facade.ReservaFacade;
import facade.RespuestaReservaFacade;
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
@Named(value = "respuestaReservaController")
@SessionScoped
public class RespuestaReservaController implements Serializable {

    /**
     * Creates a new instance of RespuestaReservaController
     */
    public RespuestaReservaController() {
    }
    private RespuestaReserva respuestaReserva;
    private Reserva reserva;
    private Administrador administrador;
    @EJB
    RespuestaReservaFacade respuestaReservaFacade;
    @EJB
    ReservaFacade reservaFacade;
    @EJB
    AdministradorFacade administradorFacade;
    
    @PostConstruct
    public void init(){
        respuestaReserva = new RespuestaReserva();
        reserva = new Reserva();
        administrador = new Administrador();
    }

    public RespuestaReserva getRespuestaReserva() {
        return respuestaReserva;
    }

    public void setRespuestaReserva(RespuestaReserva respuestaReserva) {
        this.respuestaReserva = respuestaReserva;
    }

    public Reserva getReserva() {
        return reserva;
    }

    public void setReserva(Reserva reserva) {
        this.reserva = reserva;
    }

    public Administrador getAdministrador() {
        return administrador;
    }

    public void setAdministrador(Administrador administrador) {
        this.administrador = administrador;
    }
    
    public String preRegistrar(){
        return "registrarRespuestaReserva";
    }
    
    public String registrarRespuestaReserva(){
        respuestaReserva.setIdReserva(reservaFacade.find(this.reserva.getIdReserva()));
        respuestaReserva.setIdAdministrador(administradorFacade.find(this.administrador.getIdAdministrador()));
        respuestaReservaFacade.create(this.respuestaReserva);
        respuestaReserva= new RespuestaReserva();
        return "listaRespuestaReserva";
                
    }
     
    public void eliminarRespuestaReserva(RespuestaReserva respuestaReserva){
        respuestaReservaFacade.remove(respuestaReserva);
    }
    
    public String preActualizar(RespuestaReserva respuestaReserva){
        this.respuestaReserva = respuestaReserva;
        return "editarRespuestaReserva";
    }
    
    public String actualizarRespuestaReserva(){
        respuestaReserva.setIdReserva(reservaFacade.find(this.reserva.getIdReserva()));
        respuestaReserva.setIdAdministrador(administradorFacade.find(this.administrador.getIdAdministrador()));
        respuestaReservaFacade.edit(this.respuestaReserva);
        respuestaReserva =  new RespuestaReserva();
        return "listaRespuestaReserva";
    }
    
    public List<RespuestaReserva> consultarRespuestaReserva(){
        return respuestaReservaFacade.findAll();
    }
    
    public RespuestaReserva consultarId(){
        return respuestaReservaFacade.find(respuestaReserva.getIdRespuestaReserva());
    }

}
