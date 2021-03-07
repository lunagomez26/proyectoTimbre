/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;


import entidades.Permiso;
import facade.PermisoFacade;
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
@Named(value = "permisoControlador")
@SessionScoped
public class PermisoController implements Serializable {

    /**
     * Creates a new instance of PermisoControlador
     */
    public PermisoController() {
    }
    private Permiso Permiso;
    @EJB
    PermisoFacade PermisoFacade;   
    
    @PostConstruct
    public void init(){
        Permiso = new Permiso();       
    }

    public Permiso getPermiso() {
        return Permiso;
    }

    public void setPermiso(Permiso Permiso) {
        this.Permiso = Permiso;
    }
    public String preRegistrar(){
        return "registrarPermiso";
    }
    
    public String registrarPermiso(){        
        PermisoFacade.create(this.Permiso);
        Permiso = new Permiso();
        return "listaPermiso";
    }
    
    public void eliminarPermiso(Permiso Permiso){
        PermisoFacade.remove(Permiso);
    }
    
    public String preActualizar(Permiso Permiso){
        this.Permiso = Permiso;
        return "editarPermiso";
    }
    
    public String actualizarPermiso(){
        PermisoFacade.edit(this.Permiso);
        Permiso = new Permiso();
        return "listaPermiso";
    }
    
    public List<Permiso> consultarPermiso(){
        return PermisoFacade.findAll();
    }

    public Permiso consultarId(){
        return PermisoFacade.find(Permiso.getIdPermiso());
    }
    
}
