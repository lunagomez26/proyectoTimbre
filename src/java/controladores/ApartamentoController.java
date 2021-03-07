/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import entidades.Apartamento;
import entidades.Torre;
import facade.ApartamentoFacade;
import facade.TorreFacade;
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
@Named(value = "apartamentoController")
@SessionScoped
public class ApartamentoController implements Serializable {

    /**
     * Creates a new instance of ApartamentoController
     */
    public ApartamentoController() {
    }
    
    private Apartamento apartamento;
    private Torre torre;
    @EJB
    ApartamentoFacade apartamentoFacade;
    @EJB
    TorreFacade torreFacade;
    
    @PostConstruct
    public void init(){
        apartamento = new Apartamento();
        torre = new Torre();
    }

    public Apartamento getApartamento() {
        return apartamento;
    }

    public void setApartamento(Apartamento apartamento) {
        this.apartamento = apartamento;
    }

    public Torre getTorre() {
        return torre;
    }

    public void setTorre(Torre torre) {
        this.torre = torre;
    }
    
    public String preRegistrar(){
        return "registrarApartamento";
    }
    
    public String registrarApartamento(){
        apartamento.setIdTorre(torreFacade.find(this.torre.getIdTorre()));
        apartamentoFacade.create(this.apartamento);
        apartamento = new Apartamento();
        return "listaApartamento";
    }
    
    public void elimnarApartamento(Apartamento apartamento){
        apartamentoFacade.remove(apartamento);
    }
    
    public String preActualizar(Apartamento apartamento){
        this.apartamento = apartamento;
        return "editarApartamento";
    }
    
    public String actualizarApartamento(){
        apartamento.setIdTorre(torreFacade.find(this.torre.getIdTorre()));
        apartamentoFacade.edit(this.apartamento);
        apartamento = new Apartamento();
        return "listaApartamento";
    }
    
    public List<Apartamento> consultarApartamento(){
        return apartamentoFacade.findAll();
    }
    
    public Apartamento consultarId(){
        return apartamentoFacade.find(apartamento.getIdApartamento());
    }
    
    
}
