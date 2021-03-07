/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import entidades.Rol;
import facade.RolFacade;
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
@Named(value = "rolController")
@SessionScoped
public class RolController implements Serializable {

    /**
     * Creates a new instance of RolController
     */
    public RolController() {
    }
    
    private Rol rol;
    @EJB
    RolFacade rolFacade;
    
    @PostConstruct
    public void init(){
        rol = new Rol();
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }
    public String preRegistrar(){
        return "registrarRol";
    }
    
    public String registrarRol(){
        rolFacade.create(this.rol);
        rol = new Rol();
        return "listaRol";
    }
    
    public void eliminarRol(Rol rol){
        rolFacade.remove(rol);
    }
    
    public String preActualizar(Rol rol){
        this.rol = rol;
        return "editarRol";
    }
    
    public String actualizarRol(){
        rolFacade.edit(this.rol);
        rol = new Rol();
        return "listaRol";
    }
    
    public List<Rol> consultarRol(){
        return rolFacade.findAll();
    }
    
   public Rol consultarId(){
       return rolFacade.find(rol.getIdRol());
   }
    
}
