/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import entidades.Apartamento;
import entidades.Residente;
import entidades.Usuario;
import facade.ApartamentoFacade;
import facade.ResidenteFacade;
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
@Named(value = "residenteController")
@SessionScoped
public class ResidenteController implements Serializable {

    /**
     * Creates a new instance of ResidenteController
     */
    public ResidenteController() {
    }
    
    private Residente residente;
    private Usuario usuario;
    private Apartamento apartamento;
    @EJB
    ResidenteFacade residenteFacade;
    @EJB
    UsuarioFacade usuarioFacade;
    @EJB
    ApartamentoFacade apartamentoFacade;
    
    @PostConstruct
    public void init(){
        residente = new Residente();
        usuario = new Usuario();
        apartamento = new Apartamento();
    }

    public Residente getResidente() {
        return residente;
    }

    public void setResidente(Residente residente) {
        this.residente = residente;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Apartamento getApartamento() {
        return apartamento;
    }

    public void setApartamento(Apartamento apartamento) {
        this.apartamento = apartamento;
    }
    public String preRegistrar(){
        return "registrarResidente";
    }
    public String registrarResidente(){
        residente.setIdUsuario(usuarioFacade.find(this.usuario.getIdUsuario()));
        residente.setIdApartamento(apartamentoFacade.find(this.apartamento.getIdApartamento()));
        residenteFacade.create(this.residente);
        residente = new Residente();
        return "listarResidente";
    }
    
    public void eliminarResidente(Residente residente){
        residenteFacade.remove(residente);
    }
    
    public String preActualizar(Residente residente){
        this.residente = residente;
        return "editarResidente";
    }
    
    public String actualizarResidente(){
        residente.setIdUsuario(usuarioFacade.find(this.usuario.getIdUsuario()));
        residente.setIdApartamento(apartamentoFacade.find(this.apartamento.getIdApartamento()));
        residenteFacade.edit(this.residente);
        residente = new Residente();
        return "listarResidente";
    }
    
    public List<Residente> consultarResidente(){
        return residenteFacade.findAll();
    }
    
    public Residente consultarId(){
        return residenteFacade.find(residente.getIdResidente());
    }
}
