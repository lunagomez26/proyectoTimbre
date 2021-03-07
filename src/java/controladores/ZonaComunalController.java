/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import entidades.ZonaComunal;
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
@Named(value = "zonaComunalController")
@SessionScoped
public class ZonaComunalController implements Serializable {

    /**
     * Creates a new instance of ZonaComunalController
     */
    public ZonaComunalController() {
    }
    
    private ZonaComunal zonaComunal;
    @EJB
    ZonaComunalFacade zonaComunalFacade;
    
    @PostConstruct
    public void init(){
        zonaComunal = new ZonaComunal();
    }

    public ZonaComunal getZonaComunal() {
        return zonaComunal;
    }

    public void setZonaComunal(ZonaComunal zonaComunal) {
        this.zonaComunal = zonaComunal;
    }
    public String preRegistrar(){
        return "registrarZonaComunal";
    }
    public String registrarZonaComunal(){
        zonaComunalFacade.create(this.zonaComunal);
        zonaComunal = new ZonaComunal();
        return "listarZonaComunal";
    }
    
    public void eliminarZonaComunal(ZonaComunal zonaComunal){
        zonaComunalFacade.remove(zonaComunal);
    }
    
    public String preActualizar(ZonaComunal zonaComunal){
        this.zonaComunal = zonaComunal;
        return "editarZonaComunal";
    }
    
    public String actualizarZonaComunal(){
        zonaComunalFacade.edit(this.zonaComunal);
        zonaComunal = new ZonaComunal();
        return "listarZonaComunal";
    }
    
    public List<ZonaComunal> consultarZonaComunal(){
        return zonaComunalFacade.findAll();
    }
    
    public ZonaComunal consultarId(){
        return zonaComunalFacade.find(zonaComunal.getIdZonaComunal());
    }
}
