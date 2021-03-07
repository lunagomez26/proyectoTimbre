/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import entidades.Administrador;
import entidades.Turno;
import entidades.Usuario;
import facade.AdministradorFacade;
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
 * @author USER
 */
@Named(value = "administradorController")
@SessionScoped
public class AdministradorController implements Serializable {

    /**
     * Creates a new instance of AdministradorController
     */
    public AdministradorController() {
    }
    
    private Administrador administrador;
    private Usuario usuario;
    private Turno turno;
    @EJB
    AdministradorFacade administradorFacade;
    @EJB
    UsuarioFacade usuarioFacade;
    @EJB
    TurnoFacade turnoFacade;
    
    @PostConstruct
    public void init(){
        administrador = new Administrador();
        usuario = new Usuario();
        turno = new Turno();
    }

    public Administrador getAdministrador() {
        return administrador;
    }

    public void setAdministrador(Administrador administrador) {
        this.administrador = administrador;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Turno getTurno() {
        return turno;
    }

    public void setTurno(Turno turno) {
        this.turno = turno;
    }
    
    public String preRegistrar(){
        return "registrarAdministrador";
    }
    
    public String registrarAdministrador(){
        administrador.setIdUsuario(usuarioFacade.find(this.usuario.getIdUsuario()));
        administrador.setIdTurno(turnoFacade.find(this.turno.getIdTurno()));
        administradorFacade.create(this.administrador);
        administrador = new Administrador();
        return "listaAdministrador";
    }
    
    public void eliminarAdministrador(Administrador administrador){
        administradorFacade.remove(administrador);
    }
    
    public String preActualizar(Administrador administrador){
        this.administrador = administrador;
        return "editarAdministrador";
    }
    
    public String actualizarAdministrador(){
        administrador.setIdUsuario(usuarioFacade.find(this.usuario.getIdUsuario()));
        administrador.setIdTurno(turnoFacade.find(this.turno.getIdTurno()));
        administradorFacade.edit(this.administrador);
        administrador = new Administrador();
        return "listaAdministrador";
    }
    
    public List<Administrador> consultarAdministrador(){
        return administradorFacade.findAll();
    }

    public Administrador consultarId(){
        return administradorFacade.find(administrador.getIdAdministrador());
    }
    
}
