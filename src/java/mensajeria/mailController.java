/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mensajeria;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;

/**
 *
 * @author USUARIO
 */
@Named(value = "mailController")
@SessionScoped
public class mailController implements Serializable {

    /**
     * Creates a new instance of mailController
     */
    public mailController() {
    }
    
    Integer codigo; 
    String asunto="";
    String mensaje="";
    String destinatario="";

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getAsunto() {
        return asunto;
    }

    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }

    public void enviarCorreo() throws UnsupportedEncodingException{
        
        Mailer.content(codigo, asunto, mensajeEstilo(), destinatario);
        
    }
    
    public String mensajeEstilo()
{
        return "<h1 style=\"font-size: 20px; color:#990000; font-weight: bold; text-transform: uppercase ; \">Mensajeria TIMBRE" + "</h1>";

            }
}
