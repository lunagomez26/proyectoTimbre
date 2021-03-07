/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

import entidades.PermisoRol;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author USER
 */
@Stateless
public class PermisoRolFacade extends AbstractFacade<PermisoRol> {

    @PersistenceContext(unitName = "ProyectoTimbreSIPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public PermisoRolFacade() {
        super(PermisoRol.class);
    }
    
}
