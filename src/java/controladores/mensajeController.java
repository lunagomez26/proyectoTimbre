/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import entidades.Mensaje;
import entidades.Usuario;
import facade.MensajeFacade;
import facade.UsuarioFacade;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import mensajeria.Mailer;

/**
 *
 * @author USUARIO
 */
@Named(value = "mensajeController")
@SessionScoped
public class mensajeController implements Serializable {

    /**
     * Creates a new instance of mensajeController
     */
    public mensajeController() {
    }
    
    private Mensaje mensaje;
    private Usuario usuario;
    @EJB
    MensajeFacade mensajeFacade;
    @EJB
    UsuarioFacade usuarioFacade;
    
    @PostConstruct
    public void init(){
        mensaje = new Mensaje();
        usuario = new Usuario();
    }
    
    public Mensaje getMensaje() {
        return mensaje;
    }

    public void setMensaje(Mensaje mensaje) {
        this.mensaje = mensaje;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
    public void registrarMensaje() throws UnsupportedEncodingException{
        Mailer.content(mensaje.getCodmensaje(), mensaje.getAsunto(), mensajeEstilo(), mensaje.getDestinatario());
        mensaje.setCodUsuario(usuarioFacade.find(this.usuario.getIdUsuario()));
        mensajeFacade.create(this.mensaje);
        mensaje = new Mensaje();
    }
    
    public String preActualizarMensaje(Mensaje mensaje){
        this.mensaje = mensaje;
        return "actualizarMensaje";
    }
    
    public void actualizarMensaje(){
        mensajeFacade.edit(this.mensaje);
        mensaje.setCodUsuario(usuarioFacade.find(this.usuario.getIdUsuario()));
        mensaje = new Mensaje();
    }
    
    public void eliminarMensaje(Mensaje mensaje){
        mensajeFacade.remove(mensaje);
    }
    
    public List<Mensaje> consultarMensajes(){
        return mensajeFacade.findAll();
    }
    
    public Mensaje consultarID(){
        return mensajeFacade.find(this.mensaje.getCodmensaje());
    }
    
    public String mensajeEstilo()
{
        return  "<h1 style=\"font-size: 20px; color:#990000; font-weight: bold; text-transform: uppercase ; \">Control de mensajeria Timbre" + "</h1>" 
                + "<img src='https://i.pinimg.com/originals/0a/0a/66/0a0a66a3b3e26c06265a0bfa2a91fd22.jpg'/ style=\"float: left; width: 200px; height: 200px;\"><p>" + mensaje.getContenido() + "<br>\n"
                + "<p style=\"text-align: center; color: #307EDF\">\n"
                + "</p> \n"
                + "<br>\n"
                + "<p style=\"color:#990000;font-weight: bold;\"> Gracias por ser parte Timbre </p> ";

            }
    
    
}
