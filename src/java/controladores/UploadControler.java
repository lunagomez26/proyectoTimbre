package controladores;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import facade.UsuarioFacade;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.servlet.http.Part;

@ManagedBean(name = "uplCtrl")
public class UploadControler {
@EJB
UsuarioFacade usuarioFacade;
    private Part file;
    private String nombre;
    private String pathReal;

    public String getPathReal() {
        return pathReal;
    }

    public void setPathReal(String pathReal) {
        this.pathReal = pathReal;
    }
    
    
    public Part getFile() {
        return file;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void setFile(Part file) {
        this.file = file;
    }
    

    public String upload() {
        String path = FacesContext.getCurrentInstance().getExternalContext().getRealPath("Archivos");
        path = path.substring(0, path.indexOf("\\build"));
        path = path + "\\web\\Archivos\\";
       
        
        try {
            this.nombre = file.getSubmittedFileName();
            pathReal = "/UploadFile/Archivos/" + nombre;
            path = path + this.nombre;
            
            InputStream in = file.getInputStream();
            
            byte[] data = new byte[in.available()];
            in.read(data);
            File archivo=new File(path);
            FileOutputStream out = new FileOutputStream(archivo);
            out.write(data);
            in.close();
            out.close();
            
          path=path.replace("\\", "\\\\");
            usuarioFacade.cargaDatos(path,"tbl_usuarios");
            archivo.delete();
            
            return "Cargado";
        } catch (Exception e) {
            e.printStackTrace();
        }

        return "Cargado";
    }
  
}
