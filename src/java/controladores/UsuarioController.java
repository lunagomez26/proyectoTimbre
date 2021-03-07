/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import entidades.Rol;
import entidades.TipoDeDocumento;
import entidades.Usuario;
import facade.RolFacade;
import facade.TipoDeDocumentoFacade;
import facade.UsuarioFacade;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import static oracle.jrockit.jfr.events.Bits.shortValue;

/**
 *
 * @author USER
 */
@Named(value = "usuarioController")
@SessionScoped
public class UsuarioController implements Serializable {

    /**
     * Creates a new instance of UsuarioController
     */
    public UsuarioController() {
    }
    private Usuario usuario;
    private Rol rol;
    private TipoDeDocumento tipoDeDocumento;
    @EJB
    UsuarioFacade usuarioFacade;
    @EJB
    RolFacade rolFacade;
    @EJB
    TipoDeDocumentoFacade tipoDeDocumentoFacade;
    
    @PostConstruct
    public void init(){
        usuario = new Usuario();
        rol = new Rol();
        tipoDeDocumento= new TipoDeDocumento();
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }

    public TipoDeDocumento getTipoDeDocumento() {
        return tipoDeDocumento;
    }

    public void setTipoDeDocumento(TipoDeDocumento tipoDeDocumento) {
        this.tipoDeDocumento = tipoDeDocumento;
    }
    
    public String preRegistrar(){
        return "registroUsuario";
    }
    
    public String registrarUsuario(){
        usuario.setIdRol(rolFacade.find(this.rol.getIdRol()));
        usuario.setIsActivo(shortValue(1));
        usuario.setTipoDocumento(tipoDeDocumentoFacade.find(this.tipoDeDocumento.getIdTipo()));
        usuarioFacade.create(this.usuario);
        usuario = new Usuario();
        return "listaUsuario";
    }
    
    public void eliminarUsuario(Usuario usuario){
        usuarioFacade.remove(usuario);
    }
    
    public String preActualizar(Usuario usuario){
        this.usuario = usuario;
        return "editarUsuario";
    }
    
    public String actualizarUsuario(){
        usuario.setIdRol(rolFacade.find(this.rol.getIdRol()));
        usuario.setTipoDocumento(tipoDeDocumentoFacade.find(this.tipoDeDocumento.getIdTipo()));
        usuarioFacade.edit(this.usuario);
        usuario = new Usuario();
        return "listaUsuario";
    }
    
    public List<Usuario> consultarUsuario(){
        return usuarioFacade.findAll();
    }
    
    public Usuario consultarId(){
        return usuarioFacade.find(usuario.getIdUsuario());
    }
    
    public String login(){
        String redireccion = null;
        Usuario usuarioLog = new Usuario(); 
        try{
            usuarioLog= usuarioFacade.login(this.usuario);
            if(usuarioLog.getCorreo() != ""){
                if(usuarioLog.getIdRol().getIdRol() == 1){
                    redireccion = "adminDash";
                }else if(usuarioLog.getIdRol().getIdRol() == 2){
                    redireccion = "residenteDash";
                }else if(usuarioLog.getIdRol().getIdRol() == 3){
                    redireccion = "guardiaDash";
                }
            }
        }catch(Exception e){
            System.out.println("Usuario o contraseña incorrectos "+ e.getMessage());
        }
        return redireccion;
    }
    
}
