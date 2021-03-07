/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import entidades.Apartamento;
import entidades.GuardiaDeSeguridad;
import entidades.RegistroIngreso;
import facade.ApartamentoFacade;
import facade.GuardiaDeSeguridadFacade;
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
@Named(value = "registroIngresoController")
@SessionScoped
public class RegistroIngresoController implements Serializable {

    /**
     * Creates a new instance of RegistroIngresoController
     */
    public RegistroIngresoController() {     
    }
    private RegistroIngreso RegistroIngreso;
    private Apartamento Apartamento;
    private GuardiaDeSeguridad GuardiaDeSeguridad;
    
    @EJB
    RegistroIngresoFacade RegistroIngresoFacade;
    @EJB
    ApartamentoFacade ApartamentoFacade;
    @EJB
    GuardiaDeSeguridadFacade GuardiaDeSeguridadFacade;
    
    @PostConstruct
    public void init(){
        RegistroIngreso=new RegistroIngreso();
        Apartamento=new Apartamento();
        GuardiaDeSeguridad=new GuardiaDeSeguridad();     
    }

    public RegistroIngreso getRegistroIngreso() {
        return RegistroIngreso;
    }

    public void setRegistroIngreso(RegistroIngreso RegistroIngreso) {
        this.RegistroIngreso = RegistroIngreso;
    }

    public Apartamento getApartamento() {
        return Apartamento;
    }

    public void setApartamento(Apartamento Apartamento) {
        this.Apartamento = Apartamento;
    }

    public GuardiaDeSeguridad getGuardiaDeSeguridad() {
        return GuardiaDeSeguridad;
    }

    public void setGuardiaDeSeguridad(GuardiaDeSeguridad GuardiaDeSeguridad) {
        this.GuardiaDeSeguridad = GuardiaDeSeguridad;
    }
    
    public String preRegistrar(){
        return "registrarRegistroIngreso";
    }
    public String RegistrarRegistroIngreso(){
        RegistroIngreso.setIdApartamento(ApartamentoFacade.find(this.Apartamento.getIdApartamento()));
        RegistroIngreso.setIdGuardia(GuardiaDeSeguridadFacade.find(this.GuardiaDeSeguridad.getIdGuardia()));
        RegistroIngresoFacade.create(this.RegistroIngreso);
        RegistroIngreso= new RegistroIngreso();
        return "listaRegistroIngreso";
    }
    public void EliminarRegistroIngreso(RegistroIngreso RegistroIngreso){
        this.RegistroIngresoFacade.remove(RegistroIngreso);
    }
    public String preActualizar(RegistroIngreso RegistroIngreso){
        this.RegistroIngreso=RegistroIngreso;
        return "editarRegistroIngreso";
    }
    public String ActualizarRegistroIngreso(){
        RegistroIngreso.setIdApartamento(ApartamentoFacade.find(this.Apartamento.getIdApartamento()));
        RegistroIngreso.setIdGuardia(GuardiaDeSeguridadFacade.find(this.GuardiaDeSeguridad.getIdGuardia()));
        RegistroIngresoFacade.edit(this.RegistroIngreso);
        RegistroIngreso = new RegistroIngreso();      
        return "listaRegistroIngreso";
    }
    public List<RegistroIngreso> ConsultarRegistroIngreso(){
        return RegistroIngresoFacade.findAll();
    }
    public RegistroIngreso ConsultarId(){
        return RegistroIngresoFacade.find(RegistroIngreso.getIdRegistro());
    }
}
