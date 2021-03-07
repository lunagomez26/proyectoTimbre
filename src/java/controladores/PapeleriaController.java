/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import entidades.Correspondencia;
import entidades.Papeleria;
import facade.CorrespondenciaFacade;
import facade.PapeleriaFacade;
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
@Named(value = "papeleriaController")
@SessionScoped
public class PapeleriaController implements Serializable {

    /**
     * Creates a new instance of PapeleriaController
     */
    public PapeleriaController() {
    }
    private Correspondencia Correspondencia;
    private Papeleria Papeleria;
    
    @EJB
    CorrespondenciaFacade CorrespondenciaFacade;
    @EJB
    PapeleriaFacade PapeleriaFacade;   
    
    @PostConstruct
    public void init(){
        Correspondencia = new Correspondencia();
        Papeleria = new Papeleria();
    }

    public Correspondencia getCorrespondencia() {
        return Correspondencia;
    }

    public void setCorrespondencia(Correspondencia Correspondencia) {
        this.Correspondencia = Correspondencia;
    }

    public Papeleria getPapeleria() {
        return Papeleria;
    }

    public void setPapeleria(Papeleria Papeleria) {
        this.Papeleria = Papeleria;
    }
    public String preRegistrar(){
        return "registrarPapeleria";
    }
    
    public String registrarPapeleria(){
        Papeleria.setIdCorrespondencia(CorrespondenciaFacade.find(this.Correspondencia.getIdCorrespondencia()));
        PapeleriaFacade.create(this.Papeleria);
        Papeleria = new Papeleria();
        return "listaPapeleria";
    }
    
    public void eliminarPapeleria(Papeleria Papeleria){
        this.PapeleriaFacade.remove(Papeleria);
    }
    
    public String preActualizar(Papeleria Papeleria){
        this.Papeleria = Papeleria;
        return "editarPapeleria";
    }
    
    public String actualizarPapeleria(){
        Papeleria.setIdCorrespondencia(CorrespondenciaFacade.find(this.Correspondencia.getIdCorrespondencia()));
        PapeleriaFacade.edit(this.Papeleria);
        Papeleria = new Papeleria();
        return "listaPapeleria";
    }
    
    public List<Papeleria> consultarPapeleria(){
        return PapeleriaFacade.findAll();
    }

    public Papeleria consultarId(){
        return PapeleriaFacade.find(Papeleria.getIdPapeleria());
    }
}
