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
@Table(name = "tbl_respuestasreservas")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RespuestaReserva.findAll", query = "SELECT r FROM RespuestaReserva r")
    , @NamedQuery(name = "RespuestaReserva.findByIdRespuestaReserva", query = "SELECT r FROM RespuestaReserva r WHERE r.idRespuestaReserva = :idRespuestaReserva")
    , @NamedQuery(name = "RespuestaReserva.findByFechaHora", query = "SELECT r FROM RespuestaReserva r WHERE r.fechaHora = :fechaHora")})
public class RespuestaReserva implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idRespuestaReserva")
    private Integer idRespuestaReserva;
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
    @JoinColumn(name = "idAdministrador", referencedColumnName = "idAdministrador")
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private Administrador idAdministrador;
    @JoinColumn(name = "idReserva", referencedColumnName = "idReserva")
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private Reserva idReserva;

    public RespuestaReserva() {
    }

    public RespuestaReserva(Integer idRespuestaReserva) {
        this.idRespuestaReserva = idRespuestaReserva;
    }

    public RespuestaReserva(Integer idRespuestaReserva, Date fechaHora, String respuesta) {
        this.idRespuestaReserva = idRespuestaReserva;
        this.fechaHora = fechaHora;
        this.respuesta = respuesta;
    }

    public Integer getIdRespuestaReserva() {
        return idRespuestaReserva;
    }

    public void setIdRespuestaReserva(Integer idRespuestaReserva) {
        this.idRespuestaReserva = idRespuestaReserva;
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

    public Administrador getIdAdministrador() {
        return idAdministrador;
    }

    public void setIdAdministrador(Administrador idAdministrador) {
        this.idAdministrador = idAdministrador;
    }

    public Reserva getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(Reserva idReserva) {
        this.idReserva = idReserva;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idRespuestaReserva != null ? idRespuestaReserva.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RespuestaReserva)) {
            return false;
        }
        RespuestaReserva other = (RespuestaReserva) object;
        if ((this.idRespuestaReserva == null && other.idRespuestaReserva != null) || (this.idRespuestaReserva != null && !this.idRespuestaReserva.equals(other.idRespuestaReserva))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.RespuestaReserva[ idRespuestaReserva=" + idRespuestaReserva + " ]";
    }
    
}
