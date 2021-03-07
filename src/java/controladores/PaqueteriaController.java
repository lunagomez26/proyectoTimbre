/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import entidades.Correspondencia;
import entidades.Paqueteria;
import entidades.Tamanio;
import facade.CorrespondenciaFacade;
import facade.PaqueteriaFacade;
import facade.TamanioFacade;
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
@Named(value = "paqueteriaController")
@SessionScoped
public class PaqueteriaController implements Serializable {

    /**
     * Creates a new instance of PaqueteriaController
     */
    public PaqueteriaController() {
    }
    private Correspondencia Correspondencia;
    private Tamanio Tamaño;
    private Paqueteria Paqueteria;
    @EJB
    CorrespondenciaFacade CorrespondenciaFacade;
    @EJB
    TamanioFacade TamañoFacade;
    @EJB
    PaqueteriaFacade PaqueteriaFacade;
    
    @PostConstruct
    public void init(){
        Correspondencia = new Correspondencia();
        Tamaño = new Tamanio();
        Tamaño = new Tamanio();
    }

    public Correspondencia getCorrespondencia() {
        return Correspondencia;
    }

    public void setCorrespondencia(Correspondencia Correspondencia) {
        this.Correspondencia = Correspondencia;
    }

    public Tamanio getTamanio() {
        return Tamaño;
    }

    public void setTamanio(Tamanio Tamaño) {
        this.Tamaño = Tamaño;
    }

    public Paqueteria getPaqueteria() {
        return Paqueteria;
    }

    public void setPaqueteria(Paqueteria Paqueteria) {
        this.Paqueteria = Paqueteria;
    }    

    public String preRegistrar(){
        return "registrarPaqueteria";
    }
    
    public String registrarPaqueteria(){
        Paqueteria.setIdCorrespondencia(CorrespondenciaFacade.find(this.Correspondencia.getIdCorrespondencia()));
        Paqueteria.setIdTamaño(TamañoFacade.find(this.Tamaño.getIdTamaño()));
        PaqueteriaFacade.create(this.Paqueteria);
        Paqueteria = new Paqueteria();
        return "listaPaqueteria";
    }
    
    public void eliminarPaqueteria(Paqueteria Paqueteria){
        this.PaqueteriaFacade.remove(Paqueteria);
    }
    
    public String preActualizar(Paqueteria Paqueteria){
        this.Paqueteria = Paqueteria;
        return "editarPaqueteria";
    }
    
    public String actualizarPaqueteria(){
        Paqueteria.setIdCorrespondencia(CorrespondenciaFacade.find(this.Correspondencia.getIdCorrespondencia()));
        Paqueteria.setIdTamaño(TamañoFacade.find(this.Tamaño.getIdTamaño()));
        PaqueteriaFacade.edit(this.Paqueteria);
        Paqueteria = new Paqueteria();
        return "listaPaqueteria";
    }
    
    public List<Paqueteria> consultarPaqueteria(){
        return PaqueteriaFacade.findAll();
    }

    public Paqueteria consultarId(){
        return PaqueteriaFacade.find(Paqueteria.getIdPaqueteria());
    }
}
