/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import entidades.Correspondencia;
import entidades.RegistroIngreso;
import facade.CorrespondenciaFacade;
import facade.RegistroIngresoFacade;
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
@Named(value = "correspondenciaController")
@SessionScoped
public class CorrespondenciaController implements Serializable {

    /**
     * Creates a new instance of CorrespondenciaController
     */
    public CorrespondenciaController() {
    }
    private Correspondencia Correspondencia;
    private RegistroIngreso RegistroIngreso;
    
    @EJB
    CorrespondenciaFacade CorrespondenciaFacade;
    @EJB
    RegistroIngresoFacade RegistroIngresoFacade;   
    
    @PostConstruct
    public void init(){
        Correspondencia = new Correspondencia();
        RegistroIngreso = new RegistroIngreso();
    }

    public Correspondencia getCorrespondencia() {
        return Correspondencia;
    }

    public void setCorrespondencia(Correspondencia Correspondencia) {
        this.Correspondencia = Correspondencia;
    }

    public RegistroIngreso getRegistroIngreso() {
        return RegistroIngreso;
    }

    public void setRegistroIngreso(RegistroIngreso RegistroIngreso) {
        this.RegistroIngreso = RegistroIngreso;
    }
    public String preRegistrar(){
        return "registrarCorrespondencia";
    }
    
    public String registrarCorrespondencia(){
        Correspondencia.setIdRegistro(RegistroIngresoFacade.find(this.RegistroIngreso.getIdRegistro()));
        CorrespondenciaFacade.create(this.Correspondencia);
        Correspondencia = new Correspondencia();
        return "listaCorrespondencia";
    }
    
    public void eliminarCorrespondencia(Correspondencia Correspondencia){
        this.CorrespondenciaFacade.remove(Correspondencia);
    }
    
    public String preActualizar(Correspondencia Correspondencia){
        this.Correspondencia = Correspondencia;
        return "editarCorrespondencia";
    }
    
    public String actualizarCorrespondencia(){
        Correspondencia.setIdRegistro(RegistroIngresoFacade.find(this.RegistroIngreso.getIdRegistro()));
        CorrespondenciaFacade.edit(this.Correspondencia);
        Correspondencia = new Correspondencia();
        return "listaCorrespondencia";
    }
    
    public List<Correspondencia> consultarCorrespondencia(){
        return CorrespondenciaFacade.findAll();
    }

    public Correspondencia consultarId(){
        return CorrespondenciaFacade.find(Correspondencia.getIdCorrespondencia());
    }
}
