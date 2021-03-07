/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
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
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author USER
 */
@Entity
@Table(name = "tbl_guardiasdeseguridad")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "GuardiaDeSeguridad.findAll", query = "SELECT g FROM GuardiaDeSeguridad g")
    , @NamedQuery(name = "GuardiaDeSeguridad.findByIdGuardia", query = "SELECT g FROM GuardiaDeSeguridad g WHERE g.idGuardia = :idGuardia")})
public class GuardiaDeSeguridad implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idGuardia")
    private Integer idGuardia;
    @JoinColumn(name = "idUsuario", referencedColumnName = "idUsuario")
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private Usuario idUsuario;
    @JoinColumn(name = "idTurno", referencedColumnName = "idTurno")
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private Turno idTurno;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idGuardia", fetch = FetchType.EAGER)
    private List<RegistroIngreso> registroIngresoList;

    public GuardiaDeSeguridad() {
    }

    public GuardiaDeSeguridad(Integer idGuardia) {
        this.idGuardia = idGuardia;
    }

    public Integer getIdGuardia() {
        return idGuardia;
    }

    public void setIdGuardia(Integer idGuardia) {
        this.idGuardia = idGuardia;
    }

    public Usuario getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Usuario idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Turno getIdTurno() {
        return idTurno;
    }

    public void setIdTurno(Turno idTurno) {
        this.idTurno = idTurno;
    }

    @XmlTransient
    public List<RegistroIngreso> getRegistroIngresoList() {
        return registroIngresoList;
    }

    public void setRegistroIngresoList(List<RegistroIngreso> registroIngresoList) {
        this.registroIngresoList = registroIngresoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idGuardia != null ? idGuardia.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof GuardiaDeSeguridad)) {
            return false;
        }
        GuardiaDeSeguridad other = (GuardiaDeSeguridad) object;
        if ((this.idGuardia == null && other.idGuardia != null) || (this.idGuardia != null && !this.idGuardia.equals(other.idGuardia))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.GuardiaDeSeguridad[ idGuardia=" + idGuardia + " ]";
    }
    
}
