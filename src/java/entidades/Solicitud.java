/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.io.Serializable;
import java.util.Date;
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
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author USER
 */
@Entity
@Table(name = "tbl_solicitudes")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Solicitud.findAll", query = "SELECT s FROM Solicitud s")
    , @NamedQuery(name = "Solicitud.findByIdSolicitud", query = "SELECT s FROM Solicitud s WHERE s.idSolicitud = :idSolicitud")
    , @NamedQuery(name = "Solicitud.findByFechaHora", query = "SELECT s FROM Solicitud s WHERE s.fechaHora = :fechaHora")})
public class Solicitud implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idSolicitud")
    private Integer idSolicitud;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FechaHora")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaHora;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "Descirpcion")
    private String descirpcion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idSolicitud", fetch = FetchType.EAGER)
    private List<Cita> citaList;
    @JoinColumn(name = "idAdministrador", referencedColumnName = "idAdministrador")
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private Administrador idAdministrador;
    @JoinColumn(name = "idEstadoSolicitud", referencedColumnName = "idEstadoSolicitud")
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private EstadoSolicitud idEstadoSolicitud;
    @JoinColumn(name = "idResidente", referencedColumnName = "idResidente")
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private Residente idResidente;
    @JoinColumn(name = "idTipoSolicitud", referencedColumnName = "idTipoSolicitud")
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private TipoSolicitud idTipoSolicitud;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idSolicitud", fetch = FetchType.EAGER)
    private List<RespuestaSolicitud> respuestaSolicitudList;

    public Solicitud() {
    }

    public Solicitud(Integer idSolicitud) {
        this.idSolicitud = idSolicitud;
    }

    public Solicitud(Integer idSolicitud, Date fechaHora, String descirpcion) {
        this.idSolicitud = idSolicitud;
        this.fechaHora = fechaHora;
        this.descirpcion = descirpcion;
    }

    public Integer getIdSolicitud() {
        return idSolicitud;
    }

    public void setIdSolicitud(Integer idSolicitud) {
        this.idSolicitud = idSolicitud;
    }

    public Date getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(Date fechaHora) {
        this.fechaHora = fechaHora;
    }

    public String getDescirpcion() {
        return descirpcion;
    }

    public void setDescirpcion(String descirpcion) {
        this.descirpcion = descirpcion;
    }

    @XmlTransient
    public List<Cita> getCitaList() {
        return citaList;
    }

    public void setCitaList(List<Cita> citaList) {
        this.citaList = citaList;
    }

    public Administrador getIdAdministrador() {
        return idAdministrador;
    }

    public void setIdAdministrador(Administrador idAdministrador) {
        this.idAdministrador = idAdministrador;
    }

    public EstadoSolicitud getIdEstadoSolicitud() {
        return idEstadoSolicitud;
    }

    public void setIdEstadoSolicitud(EstadoSolicitud idEstadoSolicitud) {
        this.idEstadoSolicitud = idEstadoSolicitud;
    }

    public Residente getIdResidente() {
        return idResidente;
    }

    public void setIdResidente(Residente idResidente) {
        this.idResidente = idResidente;
    }

    public TipoSolicitud getIdTipoSolicitud() {
        return idTipoSolicitud;
    }

    public void setIdTipoSolicitud(TipoSolicitud idTipoSolicitud) {
        this.idTipoSolicitud = idTipoSolicitud;
    }

    @XmlTransient
    public List<RespuestaSolicitud> getRespuestaSolicitudList() {
        return respuestaSolicitudList;
    }

    public void setRespuestaSolicitudList(List<RespuestaSolicitud> respuestaSolicitudList) {
        this.respuestaSolicitudList = respuestaSolicitudList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idSolicitud != null ? idSolicitud.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Solicitud)) {
            return false;
        }
        Solicitud other = (Solicitud) object;
        if ((this.idSolicitud == null && other.idSolicitud != null) || (this.idSolicitud != null && !this.idSolicitud.equals(other.idSolicitud))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.Solicitud[ idSolicitud=" + idSolicitud + " ]";
    }
    
}
