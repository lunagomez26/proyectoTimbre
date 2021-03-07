/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import entidades.Evento;
import entidades.ZonaComunal;
import facade.EventoFacade;
import facade.ZonaComunalFacade;
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
@Named(value = "eventoController")
@SessionScoped
public class EventoController implements Serializable {

    /**
     * Creates a new instance of EventoController
     */
    public EventoController() {
    }
    private Evento evento;
    private ZonaComunal zonaComunal;
    @EJB
    EventoFacade eventoFacade;
    @EJB
    ZonaComunalFacade zonaComunalFacade;
    
    @PostConstruct
    public void init(){
        evento = new Evento();
        zonaComunal = new ZonaComunal();
    }

    public Evento getEvento() {
        return evento;
    }

    public void setEvento(Evento evento) {
        this.evento = evento;
    }

    public ZonaComunal getZonaComunal() {
        return zonaComunal;
    }

    public void setZonaComunal(ZonaComunal zonaComunal) {
        this.zonaComunal = zonaComunal;
    }
    
    public String preRegistrar(){
        return "registrarEvento";
    }
    
     public String registrarEvento(){
        evento.setIdZonaComunal(zonaComunalFacade.find(this.zonaComunal.getIdZonaComunal()));
        eventoFacade.create(this.evento);
        evento = new Evento();
        return "listaEvento";
    }
    
    public void eliminarEvento(Evento evento){
        eventoFacade.remove(evento);
    }
    
    public String preActualizar(Evento evento){
        this.evento = evento;
        return "editarEvento";
    }
    
    public String actualizarEvento(){
        evento.setIdZonaComunal(zonaComunalFacade.find(this.zonaComunal.getIdZonaComunal()));
        eventoFacade.edit(this.evento);
        evento = new Evento();
        return "listaEvento";
    }
    
    public List<Evento> consultarEvento(){
        return eventoFacade.findAll();
    }
    
    public Evento consultarId(){
        return eventoFacade.find(evento.getIdEvento());
    }
}
