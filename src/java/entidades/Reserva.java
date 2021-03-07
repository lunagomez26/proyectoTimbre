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
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author USER
 */
@Entity
@Table(name = "tbl_reservas")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Reserva.findAll", query = "SELECT r FROM Reserva r")
    , @NamedQuery(name = "Reserva.findByIdReserva", query = "SELECT r FROM Reserva r WHERE r.idReserva = :idReserva")
    , @NamedQuery(name = "Reserva.findByFechaHora", query = "SELECT r FROM Reserva r WHERE r.fechaHora = :fechaHora")})
public class Reserva implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idReserva")
    private Integer idReserva;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FechaHora")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaHora;
    @JoinColumn(name = "idEstadoReserva", referencedColumnName = "idEstadoReserva")
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private EstadoReserva idEstadoReserva;
    @JoinColumn(name = "idResidente", referencedColumnName = "idResidente")
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private Residente idResidente;
    @JoinColumn(name = "idEvento", referencedColumnName = "idEvento")
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private Evento idEvento;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idReserva", fetch = FetchType.EAGER)
    private List<RespuestaReserva> respuestaReservaList;

    public Reserva() {
    }

    public Reserva(Integer idReserva) {
        this.idReserva = idReserva;
    }

    public Reserva(Integer idReserva, Date fechaHora) {
        this.idReserva = idReserva;
        this.fechaHora = fechaHora;
    }

    public Integer getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(Integer idReserva) {
        this.idReserva = idReserva;
    }

    public Date getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(Date fechaHora) {
        this.fechaHora = fechaHora;
    }

    public EstadoReserva getIdEstadoReserva() {
        return idEstadoReserva;
    }

    public void setIdEstadoReserva(EstadoReserva idEstadoReserva) {
        this.idEstadoReserva = idEstadoReserva;
    }

    public Residente getIdResidente() {
        return idResidente;
    }

    public void setIdResidente(Residente idResidente) {
        this.idResidente = idResidente;
    }

    public Evento getIdEvento() {
        return idEvento;
    }

    public void setIdEvento(Evento idEvento) {
        this.idEvento = idEvento;
    }

    @XmlTransient
    public List<RespuestaReserva> getRespuestaReservaList() {
        return respuestaReservaList;
    }

    public void setRespuestaReservaList(List<RespuestaReserva> respuestaReservaList) {
        this.respuestaReservaList = respuestaReservaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idReserva != null ? idReserva.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Reserva)) {
            return false;
        }
        Reserva other = (Reserva) object;
        if ((this.idReserva == null && other.idReserva != null) || (this.idReserva != null && !this.idReserva.equals(other.idReserva))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.Reserva[ idReserva=" + idReserva + " ]";
    }
    
}
