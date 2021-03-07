/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import entidades.EstadoReserva;
import entidades.Evento;
import entidades.Reserva;
import entidades.Residente;
import facade.EstadoReservaFacade;
import facade.EventoFacade;
import facade.ReservaFacade;
import facade.ResidenteFacade;
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
@Named(value = "reservaController")
@SessionScoped
public class ReservaController implements Serializable {

    /**
     * Creates a new instance of ReservaController
     */
    public ReservaController() {
    }
    private Reserva reserva;
    private Residente residente;
    private EstadoReserva estadoReserva;
    private Evento evento;
    @EJB
    ReservaFacade reservaFacade;
    @EJB
    ResidenteFacade residenteFacade;
    @EJB
    EventoFacade eventoFacade;
    @EJB
    EstadoReservaFacade estadoReservaFacade;
    @PostConstruct
    public void init(){
        reserva = new Reserva();
        residente = new Residente();
        estadoReserva = new EstadoReserva();
        evento = new Evento();
    }

    public Reserva getReserva() {
        return reserva;
    }

    public void setReserva(Reserva reserva) {
        this.reserva = reserva;
    }

    public Residente getResidente() {
        return residente;
    }

    public void setResidente(Residente residente) {
        this.residente = residente;
    }

    public EstadoReserva getEstadoReserva() {
        return estadoReserva;
    }

    public void setEstadoReserva(EstadoReserva estadoReserva) {
        this.estadoReserva = estadoReserva;
    }

    public Evento getEvento() {
        return evento;
    }

    public void setEvento(Evento evento) {
        this.evento = evento;
    }
    public String preRegistrar(){
        return "registrarReservar";
    }
    
    public String registrarReserva(){
        reserva.setIdResidente(residenteFacade.find(this.residente.getIdResidente()));
        reserva.setIdEstadoReserva(estadoReservaFacade.find(this.estadoReserva.getIdEstadoReserva()));
        reserva.setIdEvento(eventoFacade.find(this.evento.getIdEvento()));
        reservaFacade.create(this.reserva);
        reserva = new Reserva();
        return "listaReserva";
    }
    
    public void eliminarReserva(Reserva reserva){
        reservaFacade.remove(reserva);
    }
    
    public String preActualizar(Reserva reserva){
        this.reserva = reserva;
        return "editarReservas";
    }
    
    public String actualizarReserva(){
        reserva.setIdResidente(residenteFacade.find(this.residente.getIdResidente()));
        reserva.setIdEstadoReserva(estadoReservaFacade.find(this.estadoReserva.getIdEstadoReserva()));
        reserva.setIdEvento(eventoFacade.find(this.evento.getIdEvento()));
        reserva = new Reserva();
        return "listaReserva";
    }
   
    public List<Reserva> consultarReserva(){
        return reservaFacade.findAll();
    }
    
    public Reserva consultarId(){
        return reservaFacade.find(reserva.getIdReserva());
    }
   
    
}
