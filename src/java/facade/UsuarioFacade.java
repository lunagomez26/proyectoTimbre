/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

import entidades.Usuario;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author USER
 */
@Stateless
public class UsuarioFacade extends AbstractFacade<Usuario> {

    @PersistenceContext(unitName = "ProyectoTimbreSIPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public UsuarioFacade() {
        super(Usuario.class);
    }
    public Usuario login(Usuario usu){
        Usuario usuario=null;
        String consulta;
        try{
            consulta = "FROM Usuario u WHERE u.correo = ?1 AND u.telefono = ?2";
            Query query = em.createQuery(consulta);
            query.setParameter(1, usu.getCorreo());
            query.setParameter(2, usu.getTelefono());
            List<Usuario> lista = query.getResultList();
            if(!lista.isEmpty()){
                usuario=lista.get(0);
            }
        }catch(Exception e){
            System.out.println("Error: "+ e.getMessage());
        }
        return usuario;
    }
    
    public String cargaDatos(String archivo, String tabla){
        Query query=em.createNativeQuery("LOAD DATA LOCAL INFILE '"+archivo+"' REPLACE INTO TABLE "+tabla+" FIELDS TERMINATED BY ';' ENCLOSED BY '\"' ESCAPED BY '\\\\' LINES TERMINATED BY '\\r\\n'");
        int resultado=query.executeUpdate();
        String mensaje=resultado+ "filas afectadas";
        return mensaje;
    }
}
