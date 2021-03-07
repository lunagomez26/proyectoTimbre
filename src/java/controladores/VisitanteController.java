/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import entidades.RegistroIngreso;
import entidades.TipoDeDocumento;
import entidades.Visitante;
import facade.RegistroIngresoFacade;
import facade.TipoDeDocumentoFacade;
import facade.VisitanteFacade;
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
@Named(value = "visitanteController")
@SessionScoped
public class VisitanteController implements Serializable {

    /**
     * Creates a new instance of VisitanteController
     */
    public VisitanteController() {
    }
    private Visitante Visitante;
    private RegistroIngreso RegistroIngreso;
    private TipoDeDocumento TipoDeDocumento;
    @EJB
    VisitanteFacade VisitanteFacade;
    @EJB
    RegistroIngresoFacade RegistroIngresoFacade;
    @EJB
    TipoDeDocumentoFacade TipoDeDocumentoFacade;
    
    @PostConstruct
    public void init(){
        Visitante = new Visitante();
        RegistroIngreso = new RegistroIngreso();
        TipoDeDocumento = new TipoDeDocumento();
    }

    public Visitante getVisitante() {
        return Visitante;
    }

    public void setVisitante(Visitante Visitante) {
        this.Visitante = Visitante;
    }

    public RegistroIngreso getRegistroIngreso() {
        return RegistroIngreso;
    }

    public void setRegistroIngreso(RegistroIngreso RegistroIngreso) {
        this.RegistroIngreso = RegistroIngreso;
    }

    public TipoDeDocumento getTipoDeDocumento() {
        return TipoDeDocumento;
    }

    public void setTipoDeDocumento(TipoDeDocumento TipoDeDocumento) {
        this.TipoDeDocumento = TipoDeDocumento;
    }

    public String preRegistrar(){
        return "registrarVisitante";
    }
    
    public String registrarVisitante(){
        Visitante.setIdRegistro(RegistroIngresoFacade.find(this.RegistroIngreso.getIdRegistro()));
        Visitante.setTipoDocumento(TipoDeDocumentoFacade.find(this.TipoDeDocumento.getIdTipo()));
        VisitanteFacade.create(this.Visitante);
        Visitante = new Visitante();
        return "listaVisitante";
    }
    
    public void eliminarVisitante(Visitante Visitante){
        this.VisitanteFacade.remove(Visitante);
    }
    
    public String preActualizar(Visitante Visitante){
        this.Visitante = Visitante;
        return "editarVisitante";
    }
    
    public String actualizarVisitante(){
        Visitante.setIdRegistro(RegistroIngresoFacade.find(this.RegistroIngreso.getIdRegistro()));
        Visitante.setTipoDocumento(TipoDeDocumentoFacade.find(this.TipoDeDocumento.getIdTipo()));
        VisitanteFacade.edit(this.Visitante);
        Visitante = new Visitante();
        return "listaVisitante";
    }
    
    public List<Visitante> consultarVisitante(){
        return VisitanteFacade.findAll();
    }

    public Visitante consultarId(){
        return VisitanteFacade.find(Visitante.getIdVisitante());
    }
}
