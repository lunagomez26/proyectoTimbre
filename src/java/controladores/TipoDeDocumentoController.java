/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import entidades.TipoDeDocumento;
import facade.TipoDeDocumentoFacade;
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
@Named(value = "tipoDeDocumentoController")
@SessionScoped
public class TipoDeDocumentoController implements Serializable {

    /**
     * Creates a new instance of TipoDeDocumentoController
     */
    public TipoDeDocumentoController() {
    }
    
    private TipoDeDocumento tipoDeDocumento;
    @EJB
    TipoDeDocumentoFacade tipoDeDocumentoFacade;
    
    @PostConstruct
    public void init(){
        tipoDeDocumento = new TipoDeDocumento();
    }

    public TipoDeDocumento getTipoDeDocumento() {
        return tipoDeDocumento;
    }

    public void setTipoDeDocumento(TipoDeDocumento tipoDeDocumento) {
        this.tipoDeDocumento = tipoDeDocumento;
    }
    public String preRegistrar(){
        return "registrarTipoDeDocumento";
    }
    
    public String registarTipoDeDocumento(){
        tipoDeDocumentoFacade.create(this.tipoDeDocumento);
        tipoDeDocumento = new TipoDeDocumento();
        return "listaTipoDeDocumento";
    }
    
    public void eliminarTipoDeDocumento(TipoDeDocumento tipoDeDocumento){
        tipoDeDocumentoFacade.remove(tipoDeDocumento);
    }
    
    public String preActualizar(TipoDeDocumento tipoDeDocumento){
        this.tipoDeDocumento = tipoDeDocumento;
        return "editarTipoDeDocumento";
    }
    
    public String actualizarTipoDeDocumento(){
        tipoDeDocumentoFacade.edit(this.tipoDeDocumento);
        tipoDeDocumento = new TipoDeDocumento();
        return "listaTipoDeDocumento";
    }
    
    public List<TipoDeDocumento> consultarTipoDeDocumento(){
        return tipoDeDocumentoFacade.findAll();
    }
    
   public TipoDeDocumento consultarId(){
       return tipoDeDocumentoFacade.find(tipoDeDocumento.getIdTipo());
   }
    
 
}
