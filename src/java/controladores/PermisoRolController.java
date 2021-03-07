/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;


import entidades.Permiso;
import entidades.PermisoRol;
import entidades.Rol;
import facade.PermisoFacade;
import facade.PermisoRolFacade;
import facade.RolFacade;
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
@Named(value = "permisoRolControlador")
@SessionScoped
public class PermisoRolController implements Serializable {

    /**
     * Creates a new instance of PermisoRolControlador
     */
    public PermisoRolController() {
    }
    private PermisoRol PermisoRol;
    private Permiso Permiso;
    private Rol Rol;
    @EJB
    PermisoRolFacade PermisoRolFacade;
    @EJB
    PermisoFacade PermisoFacade;
    @EJB
    RolFacade RolFacade;
    
    @PostConstruct
    public void init(){
        PermisoRol = new PermisoRol();
        Permiso = new Permiso();
        Rol = new Rol();
    }

    public PermisoRol getPermisoRol() {
        return PermisoRol;
    }

    public void setPermisoRol(PermisoRol PermisoRol) {
        this.PermisoRol = PermisoRol;
    }

    public Permiso getPermiso() {
        return Permiso;
    }

    public void setPermiso(Permiso Permiso) {
        this.Permiso = Permiso;
    }

    public Rol getRol() {
        return Rol;
    }

    public void setRol(Rol Rol) {
        this.Rol = Rol;
    }
    
    
    
    public String preRegistrar(){
        return "registrarPermisoRol";
    }
    
    public String registrarPermisoRol(){
        PermisoRol.setIdPermiso(PermisoFacade.find(this.Permiso.getIdPermiso()));
        PermisoRol.setIdRol(RolFacade.find(this.Rol.getIdRol()));
        PermisoRolFacade.create(this.PermisoRol);
        PermisoRol = new PermisoRol();
        return "listaPermisoRol";
    }
    
    public void eliminarPermisoRol(PermisoRol PermisoRol){
        PermisoRolFacade.remove(PermisoRol);
    }
    
    public String preActualizar(PermisoRol PermisoRol){
        this.PermisoRol = PermisoRol;
        return "editarPermisoRol";
    }
    
    public String actualizarPermisoRol(){
       PermisoRol.setIdPermiso(PermisoFacade.find(this.Permiso.getIdPermiso()));
        PermisoRol.setIdRol(RolFacade.find(this.Rol.getIdRol()));
        PermisoRolFacade.edit(this.PermisoRol);
        PermisoRol = new PermisoRol();
        return "listaPermisoRol"; 
    }
    
    public List<PermisoRol> consultarPermisoRol(){
        return PermisoRolFacade.findAll();
    }

    public PermisoRol consultarId(){
        return PermisoRolFacade.find(PermisoRol.getIdPermisoRol());
    }
}
