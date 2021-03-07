/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

import entidades.GuardiaDeSeguridad;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author USER
 */
@Stateless
public class GuardiaDeSeguridadFacade extends AbstractFacade<GuardiaDeSeguridad> {

    @PersistenceContext(unitName = "ProyectoTimbreSIPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public GuardiaDeSeguridadFacade() {
        super(GuardiaDeSeguridad.class);
    }
    
}
