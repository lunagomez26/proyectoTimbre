/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;


import entidades.Tamanio;
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
@Named(value = "tamanioController")
@SessionScoped
public class TamanioController implements Serializable {

    /**
     * Creates a new instance of TamañoController
     */
    public TamanioController() {
    }
    private Tamanio Tamanio;
    
    @EJB
    TamanioFacade TamanioFacade;  
    
    @PostConstruct
    public void init(){
        Tamanio = new Tamanio();
    }

    public Tamanio getTamanio() {
        return Tamanio;
    }

    public void setTamanio(Tamanio Tamanio) {
        this.Tamanio = Tamanio;
    }
    
    public String preRegistrar(){
        return "registrarTamaño";
    }
    
    public String registrarTamanio(){      
        TamanioFacade.create(this.Tamanio);
        Tamanio = new Tamanio();
        return "listaTamaño";
    }
    
    public void eliminarTamanio(Tamanio Tamanio){
        this.TamanioFacade.remove(Tamanio);
    }
    
    public String preActualizar(Tamanio Tamanio){
        this.Tamanio =Tamanio;
        return "editarTamaño";
    }
    
    public String actualizarTamanio(){   
        TamanioFacade.edit(this.Tamanio);
        Tamanio = new Tamanio();
        return "listaTamaño";
    }
    
    public List<Tamanio> consultarTamanio(){
        return TamanioFacade.findAll();
    }

    public Tamanio consultarId(){
        return TamanioFacade.find(Tamanio.getIdTamaño());
    }
}
