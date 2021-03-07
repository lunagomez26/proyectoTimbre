/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import entidades.GuardiaDeSeguridad;
import entidades.Turno;
import entidades.Usuario;
import facade.GuardiaDeSeguridadFacade;
import facade.TurnoFacade;
import facade.UsuarioFacade;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;

/**
 *
 * @author Camilo Vera
 */
@Named(value = "guardiaDeSeguridadController")
@SessionScoped
public class GuardiaDeSeguridadController implements Serializable {

    /**
     * Creates a new instance of GuardiaDeSeguridadController
     */
    public GuardiaDeSeguridadController() {
    }
    private GuardiaDeSeguridad GuardiaDeSeguridad;
    private Usuario Usuario;
    private Turno Turno;
    @EJB
    GuardiaDeSeguridadFacade GuardiaDeSeguridadFacade;
    @EJB 
    UsuarioFacade UsuarioFacade;
    @EJB
    TurnoFacade TurnoFacade;
    
    @PostConstruct
    public void init(){
        GuardiaDeSeguridad= new GuardiaDeSeguridad();
        Usuario=new Usuario();
        Turno=new Turno();
    }

    public GuardiaDeSeguridad getGuardiaDeSeguridad() {
        return GuardiaDeSeguridad;
    }

    public void setGuardiaDeSeguridad(GuardiaDeSeguridad GuardiaDeSeguridad) {
        this.GuardiaDeSeguridad = GuardiaDeSeguridad;
    }

    public Usuario getUsuario() {
        return Usuario;
    }

    public void setUsuario(Usuario Usuario) {
        this.Usuario = Usuario;
    }

    public Turno getTurno() {
        return Turno;
    }

    public void setTurno(Turno Turno) {
        this.Turno = Turno;
    }
    public String preRegistrar(){
        return "registrarGuardiaDeSeguridad";
    }
    public String registrarGuardiaDeSeguridad(){
        GuardiaDeSeguridad.setIdUsuario(UsuarioFacade.find(this.Usuario.getIdUsuario()));
        GuardiaDeSeguridad.setIdTurno(TurnoFacade.find(this.Turno.getIdTurno()));
        GuardiaDeSeguridadFacade.create(this.GuardiaDeSeguridad);
        GuardiaDeSeguridad = new GuardiaDeSeguridad();
        return "listaGuardiaDeSeguridad";
    }
    public String preActualizar(GuardiaDeSeguridad GuardiaDeSeguridad){
        this.GuardiaDeSeguridad = GuardiaDeSeguridad;
        return "EditarGuardiaDeSeguridad";
    }
    public String ActualizarGuardiaDeSeguridad(){
        GuardiaDeSeguridad.setIdUsuario(UsuarioFacade.find(this.Usuario.getIdUsuario()));
        GuardiaDeSeguridad.setIdTurno(TurnoFacade.find(this.Turno.getIdTurno()));
        GuardiaDeSeguridadFacade.edit(this.GuardiaDeSeguridad);
        GuardiaDeSeguridad = new GuardiaDeSeguridad();
        return "listaGuardiaDeSeguridad";
    }
    public void EliminarGuardiaDeSeguridad(GuardiaDeSeguridad GuardiaDeSeguridad){
        this.GuardiaDeSeguridadFacade.remove(GuardiaDeSeguridad);
    }
    public List<GuardiaDeSeguridad> consultarGuardiaDeSeguridad(){
        return GuardiaDeSeguridadFacade.findAll();
    }

    public GuardiaDeSeguridad consultarId(){
        return GuardiaDeSeguridadFacade.find(GuardiaDeSeguridad.getIdGuardia());
    }
}
