/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import entidades.Turno;
import facade.TurnoFacade;
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
@Named(value = "turnoController")
@SessionScoped
public class TurnoController implements Serializable {

    /**
     * Creates a new instance of TurnoController
     */
    public TurnoController() {
    }
    private Turno turno;
    @EJB
    TurnoFacade turnoFacade;
    
    @PostConstruct
    public void init(){
        turno = new Turno();
    }

    public Turno getTurno() {
        return turno;
    }

    public void setTurno(Turno turno) {
        this.turno = turno;
    }
    
    public String preRegistrar(){
        return "registrarTurno";
    }
    
    public String registrarTurno(){
        turnoFacade.create(this.turno);
        turno = new Turno();
        return "listaTurno";
    }
    
    public void eliminarTurno(Turno turno){
        turnoFacade.remove(turno);
    }
    
    public String preActualizar(Turno turno){
        this.turno = turno;
        return "editarTurno";
    }
    
    public String actualizarTurno(){
        turnoFacade.edit(this.turno);
        turno = new Turno();
        return "listaTurno";
    }
    
    public List<Turno> consultarTurno(){
        return turnoFacade.findAll();
    }
    
    public Turno consultarId(){
        return turnoFacade.find(turno.getIdTurno());
    }
   
}
