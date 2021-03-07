package controladores;


import facade.RolFacade;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.servlet.http.Part;

    

    

@ManagedBean(name = "uplCtrlReportes")
public class UploadControlerReportes {

@EJB
        
RolFacade usuariosFacade;
      
    private Part file;
    private Part file2;
    private Part file3;
    private String nombre;
    private String nombre2;
    private String nombre3;
    private String pathReal;
    private String pathReal2;
    private String pathReal3;
    
    private String correo="";

     public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getPathReal() {
        return pathReal;
    }

    public void setPathReal(String pathReal) {
        this.pathReal = pathReal;
    }
    
    public String getPathReal2() {
        return pathReal2;
    }

    public void setPathReal2(String pathReal2) {
        this.pathReal2 = pathReal2;
    }

    public String getPathReal3() {
        return pathReal3;
    }

    public void setPathReal3(String pathReal3) {
        this.pathReal3 = pathReal3;
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
      public String getNombre2() {
        return nombre2;
    }

    public void setNombre2(String nombre2) {
        this.nombre2 = nombre2;
    }

    public String getNombre3() {
        return nombre3;
    }

    public void setNombre3(String nombre3) {
        this.nombre3 = nombre3;
    }

    public void setFile(Part file) {
        this.file = file;
    }
      public Part getFile2() {
        return file2;
    }

    public void setFile2(Part file2) {
        this.file2 = file2;
    }

    public Part getFile3() {
        return file3;
    }

    public void setFile3(Part file3) {
        this.file3 = file3;
    }

    public String upload() throws UnsupportedEncodingException {
        String path = FacesContext.getCurrentInstance().getExternalContext().getRealPath("Archivos");
        path = path.substring(0, path.indexOf("\\build"));
        path = path + "\\web\\Archivos\\";
        
        String path2 = FacesContext.getCurrentInstance().getExternalContext().getRealPath("Archivos");
        path2 = path2.substring(0, path2.indexOf("\\build"));
        path2 = path2 + "\\web\\Archivos\\";
        
        String path3 = FacesContext.getCurrentInstance().getExternalContext().getRealPath("Archivos");
        path3 = path3.substring(0, path3.indexOf("\\build"));
        path3 = path3 + "\\web\\Archivos\\";
        
  
        
        
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
          
            
            this.nombre2 = file2.getSubmittedFileName();
            pathReal2 = "/UploadFile/Archivos/" + nombre2;
            path2 = path2 + this.nombre2;
       
            InputStream in2 = file2.getInputStream();
            
            byte[] data2 = new byte[in2.available()];
            in2.read(data2);
            File archivo2=new File(path2);
            FileOutputStream out2 = new FileOutputStream(archivo2);
            out2.write(data2);
            in2.close();
            out2.close();
                  
            
            this.nombre3 = file3.getSubmittedFileName();            
            pathReal3 = "/UploadFile/Archivos/" + nombre3;            
            path3 = path3 + this.nombre3;
            
            InputStream in3 = file3.getInputStream();
            
             byte[] data3 = new byte[in3.available()];
            in3.read(data3);
            File archivo3=new File(path3);
            FileOutputStream out3 = new FileOutputStream(archivo3);
            out3.write(data3);
            in3.close();
            out3.close();     
          
          
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "administradorIni";
    }
}
