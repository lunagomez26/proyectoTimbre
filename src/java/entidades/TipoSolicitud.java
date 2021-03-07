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
@Table(name = "tbl_tipossolicitud")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TipoSolicitud.findAll", query = "SELECT t FROM TipoSolicitud t")
    , @NamedQuery(name = "TipoSolicitud.findByIdTipoSolicitud", query = "SELECT t FROM TipoSolicitud t WHERE t.idTipoSolicitud = :idTipoSolicitud")
    , @NamedQuery(name = "TipoSolicitud.findByCodTipoSol", query = "SELECT t FROM TipoSolicitud t WHERE t.codTipoSol = :codTipoSol")
    , @NamedQuery(name = "TipoSolicitud.findByNombreTipoSol", query = "SELECT t FROM TipoSolicitud t WHERE t.nombreTipoSol = :nombreTipoSol")})
public class TipoSolicitud implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idTipoSolicitud")
    private Integer idTipoSolicitud;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "CodTipoSol")
    private String codTipoSol;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "NombreTipoSol")
    private String nombreTipoSol;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idTipoSolicitud", fetch = FetchType.EAGER)
    private List<Solicitud> solicitudList;

    public TipoSolicitud() {
    }

    public TipoSolicitud(Integer idTipoSolicitud) {
        this.idTipoSolicitud = idTipoSolicitud;
    }

    public TipoSolicitud(Integer idTipoSolicitud, String codTipoSol, String nombreTipoSol) {
        this.idTipoSolicitud = idTipoSolicitud;
        this.codTipoSol = codTipoSol;
        this.nombreTipoSol = nombreTipoSol;
    }

    public Integer getIdTipoSolicitud() {
        return idTipoSolicitud;
    }

    public void setIdTipoSolicitud(Integer idTipoSolicitud) {
        this.idTipoSolicitud = idTipoSolicitud;
    }

    public String getCodTipoSol() {
        return codTipoSol;
    }

    public void setCodTipoSol(String codTipoSol) {
        this.codTipoSol = codTipoSol;
    }

    public String getNombreTipoSol() {
        return nombreTipoSol;
    }

    public void setNombreTipoSol(String nombreTipoSol) {
        this.nombreTipoSol = nombreTipoSol;
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
        hash += (idTipoSolicitud != null ? idTipoSolicitud.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TipoSolicitud)) {
            return false;
        }
        TipoSolicitud other = (TipoSolicitud) object;
        if ((this.idTipoSolicitud == null && other.idTipoSolicitud != null) || (this.idTipoSolicitud != null && !this.idTipoSolicitud.equals(other.idTipoSolicitud))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.TipoSolicitud[ idTipoSolicitud=" + idTipoSolicitud + " ]";
    }
    
}
