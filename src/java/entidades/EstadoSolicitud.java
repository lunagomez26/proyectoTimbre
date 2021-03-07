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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author USER
 */
@Entity
@Table(name = "tbl_estadossolicitud")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EstadoSolicitud.findAll", query = "SELECT e FROM EstadoSolicitud e")
    , @NamedQuery(name = "EstadoSolicitud.findByIdEstadoSolicitud", query = "SELECT e FROM EstadoSolicitud e WHERE e.idEstadoSolicitud = :idEstadoSolicitud")
    , @NamedQuery(name = "EstadoSolicitud.findByCodEstado", query = "SELECT e FROM EstadoSolicitud e WHERE e.codEstado = :codEstado")
    , @NamedQuery(name = "EstadoSolicitud.findByNombreEstado", query = "SELECT e FROM EstadoSolicitud e WHERE e.nombreEstado = :nombreEstado")})
public class EstadoSolicitud implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idEstadoSolicitud")
    private Integer idEstadoSolicitud;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "CodEstado")
    private String codEstado;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "NombreEstado")
    private String nombreEstado;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idEstadoSolicitud", fetch = FetchType.EAGER)
    private List<Solicitud> solicitudList;

    public EstadoSolicitud() {
    }

    public EstadoSolicitud(Integer idEstadoSolicitud) {
        this.idEstadoSolicitud = idEstadoSolicitud;
    }

    public EstadoSolicitud(Integer idEstadoSolicitud, String codEstado, String nombreEstado) {
        this.idEstadoSolicitud = idEstadoSolicitud;
        this.codEstado = codEstado;
        this.nombreEstado = nombreEstado;
    }

    public Integer getIdEstadoSolicitud() {
        return idEstadoSolicitud;
    }

    public void setIdEstadoSolicitud(Integer idEstadoSolicitud) {
        this.idEstadoSolicitud = idEstadoSolicitud;
    }

    public String getCodEstado() {
        return codEstado;
    }

    public void setCodEstado(String codEstado) {
        this.codEstado = codEstado;
    }

    public String getNombreEstado() {
        return nombreEstado;
    }

    public void setNombreEstado(String nombreEstado) {
        this.nombreEstado = nombreEstado;
    }

    @XmlTransient
    public List<Solicitud> getSolicitudList() {
        return solicitudList;
    }

    public void setSolicitudList(List<Solicitud> solicitudList) {
        this.solicitudList = solicitudList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idEstadoSolicitud != null ? idEstadoSolicitud.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EstadoSolicitud)) {
            return false;
        }
        EstadoSolicitud other = (EstadoSolicitud) object;
        if ((this.idEstadoSolicitud == null && other.idEstadoSolicitud != null) || (this.idEstadoSolicitud != null && !this.idEstadoSolicitud.equals(other.idEstadoSolicitud))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.EstadoSolicitud[ idEstadoSolicitud=" + idEstadoSolicitud + " ]";
    }
    
}
