/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
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
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author USER
 */
@Entity
@Table(name = "tbl_respuestassolicitud")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RespuestaSolicitud.findAll", query = "SELECT r FROM RespuestaSolicitud r")
    , @NamedQuery(name = "RespuestaSolicitud.findByIdRespuestaSolicitud", query = "SELECT r FROM RespuestaSolicitud r WHERE r.idRespuestaSolicitud = :idRespuestaSolicitud")
    , @NamedQuery(name = "RespuestaSolicitud.findByFechaHora", query = "SELECT r FROM RespuestaSolicitud r WHERE r.fechaHora = :fechaHora")})
public class RespuestaSolicitud implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idRespuestaSolicitud")
    private Integer idRespuestaSolicitud;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FechaHora")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaHora;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "Respuesta")
    private String respuesta;
    @JoinColumn(name = "idSolicitud", referencedColumnName = "idSolicitud")
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private Solicitud idSolicitud;

    public RespuestaSolicitud() {
    }

    public RespuestaSolicitud(Integer idRespuestaSolicitud) {
        this.idRespuestaSolicitud = idRespuestaSolicitud;
    }

    public RespuestaSolicitud(Integer idRespuestaSolicitud, Date fechaHora, String respuesta) {
        this.idRespuestaSolicitud = idRespuestaSolicitud;
        this.fechaHora = fechaHora;
        this.respuesta = respuesta;
    }

    public Integer getIdRespuestaSolicitud() {
        return idRespuestaSolicitud;
    }

    public void setIdRespuestaSolicitud(Integer idRespuestaSolicitud) {
        this.idRespuestaSolicitud = idRespuestaSolicitud;
    }

    public Date getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(Date fechaHora) {
        this.fechaHora = fechaHora;
    }

    public String getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }

    public Solicitud getIdSolicitud() {
        return idSolicitud;
    }

    public void setIdSolicitud(Solicitud idSolicitud) {
        this.idSolicitud = idSolicitud;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idRespuestaSolicitud != null ? idRespuestaSolicitud.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RespuestaSolicitud)) {
            return false;
        }
        RespuestaSolicitud other = (RespuestaSolicitud) object;
        if ((this.idRespuestaSolicitud == null && other.idRespuestaSolicitud != null) || (this.idRespuestaSolicitud != null && !this.idRespuestaSolicitud.equals(other.idRespuestaSolicitud))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.RespuestaSolicitud[ idRespuestaSolicitud=" + idRespuestaSolicitud + " ]";
    }
    
}
