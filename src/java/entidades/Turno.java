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
@Table(name = "tbl_turnos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Turno.findAll", query = "SELECT t FROM Turno t")
    , @NamedQuery(name = "Turno.findByIdTurno", query = "SELECT t FROM Turno t WHERE t.idTurno = :idTurno")
    , @NamedQuery(name = "Turno.findByHoraLlegada", query = "SELECT t FROM Turno t WHERE t.horaLlegada = :horaLlegada")
    , @NamedQuery(name = "Turno.findByHoraSalida", query = "SELECT t FROM Turno t WHERE t.horaSalida = :horaSalida")
    , @NamedQuery(name = "Turno.findByDescripcionTurno", query = "SELECT t FROM Turno t WHERE t.descripcionTurno = :descripcionTurno")})
public class Turno implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idTurno")
    private Integer idTurno;
    @Basic(optional = false)
    @NotNull
    @Column(name = "HoraLlegada")
    @Temporal(TemporalType.TIME)
    private Date horaLlegada;
    @Basic(optional = false)
    @NotNull
    @Column(name = "HoraSalida")
    @Temporal(TemporalType.TIME)
    private Date horaSalida;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "DescripcionTurno")
    private String descripcionTurno;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idTurno", fetch = FetchType.EAGER)
    private List<Administrador> administradorList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idTurno", fetch = FetchType.EAGER)
    private List<GuardiaDeSeguridad> guardiaDeSeguridadList;

    public Turno() {
    }

    public Turno(Integer idTurno) {
        this.idTurno = idTurno;
    }

    public Turno(Integer idTurno, Date horaLlegada, Date horaSalida, String descripcionTurno) {
        this.idTurno = idTurno;
        this.horaLlegada = horaLlegada;
        this.horaSalida = horaSalida;
        this.descripcionTurno = descripcionTurno;
    }

    public Integer getIdTurno() {
        return idTurno;
    }

    public void setIdTurno(Integer idTurno) {
        this.idTurno = idTurno;
    }

    public Date getHoraLlegada() {
        return horaLlegada;
    }

    public void setHoraLlegada(Date horaLlegada) {
        this.horaLlegada = horaLlegada;
    }

    public Date getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(Date horaSalida) {
        this.horaSalida = horaSalida;
    }

    public String getDescripcionTurno() {
        return descripcionTurno;
    }

    public void setDescripcionTurno(String descripcionTurno) {
        this.descripcionTurno = descripcionTurno;
    }

    @XmlTransient
    public List<Administrador> getAdministradorList() {
        return administradorList;
    }

    public void setAdministradorList(List<Administrador> administradorList) {
        this.administradorList = administradorList;
    }

    @XmlTransient
    public List<GuardiaDeSeguridad> getGuardiaDeSeguridadList() {
        return guardiaDeSeguridadList;
    }

    public void setGuardiaDeSeguridadList(List<GuardiaDeSeguridad> guardiaDeSeguridadList) {
        this.guardiaDeSeguridadList = guardiaDeSeguridadList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTurno != null ? idTurno.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Turno)) {
            return false;
        }
        Turno other = (Turno) object;
        if ((this.idTurno == null && other.idTurno != null) || (this.idTurno != null && !this.idTurno.equals(other.idTurno))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.Turno[ idTurno=" + idTurno + " ]";
    }
    
}
