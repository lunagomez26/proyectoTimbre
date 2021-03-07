/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author USER
 */
@Entity
@Table(name = "tbl_permisosroles")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PermisoRol.findAll", query = "SELECT p FROM PermisoRol p")
    , @NamedQuery(name = "PermisoRol.findByIdPermisoRol", query = "SELECT p FROM PermisoRol p WHERE p.idPermisoRol = :idPermisoRol")})
public class PermisoRol implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idPermisoRol")
    private Integer idPermisoRol;
    @JoinColumn(name = "idPermiso", referencedColumnName = "idPermiso")
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private Permiso idPermiso;
    @JoinColumn(name = "idRol", referencedColumnName = "idRol")
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private Rol idRol;

    public PermisoRol() {
    }

    public PermisoRol(Integer idPermisoRol) {
        this.idPermisoRol = idPermisoRol;
    }

    public Integer getIdPermisoRol() {
        return idPermisoRol;
    }

    public void setIdPermisoRol(Integer idPermisoRol) {
        this.idPermisoRol = idPermisoRol;
    }

    public Permiso getIdPermiso() {
        return idPermiso;
    }

    public void setIdPermiso(Permiso idPermiso) {
        this.idPermiso = idPermiso;
    }

    public Rol getIdRol() {
        return idRol;
    }

    public void setIdRol(Rol idRol) {
        this.idRol = idRol;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPermisoRol != null ? idPermisoRol.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PermisoRol)) {
            return false;
        }
        PermisoRol other = (PermisoRol) object;
        if ((this.idPermisoRol == null && other.idPermisoRol != null) || (this.idPermisoRol != null && !this.idPermisoRol.equals(other.idPermisoRol))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.PermisoRol[ idPermisoRol=" + idPermisoRol + " ]";
    }
    
}
