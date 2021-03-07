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
@Table(name = "tbl_estadosreserva")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EstadoReserva.findAll", query = "SELECT e FROM EstadoReserva e")
    , @NamedQuery(name = "EstadoReserva.findByIdEstadoReserva", query = "SELECT e FROM EstadoReserva e WHERE e.idEstadoReserva = :idEstadoReserva")
    , @NamedQuery(name = "EstadoReserva.findByCodEstadoRe", query = "SELECT e FROM EstadoReserva e WHERE e.codEstadoRe = :codEstadoRe")
    , @NamedQuery(name = "EstadoReserva.findByNombreEstadoRe", query = "SELECT e FROM EstadoReserva e WHERE e.nombreEstadoRe = :nombreEstadoRe")})
public class EstadoReserva implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idEstadoReserva")
    private Integer idEstadoReserva;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "CodEstadoRe")
    private String codEstadoRe;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "NombreEstadoRe")
    private String nombreEstadoRe;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idEstadoReserva", fetch = FetchType.EAGER)
    private List<Reserva> reservaList;

    public EstadoReserva() {
    }

    public EstadoReserva(Integer idEstadoReserva) {
        this.idEstadoReserva = idEstadoReserva;
    }

    public EstadoReserva(Integer idEstadoReserva, String codEstadoRe, String nombreEstadoRe) {
        this.idEstadoReserva = idEstadoReserva;
        this.codEstadoRe = codEstadoRe;
        this.nombreEstadoRe = nombreEstadoRe;
    }

    public Integer getIdEstadoReserva() {
        return idEstadoReserva;
    }

    public void setIdEstadoReserva(Integer idEstadoReserva) {
        this.idEstadoReserva = idEstadoReserva;
    }

    public String getCodEstadoRe() {
        return codEstadoRe;
    }

    public void setCodEstadoRe(String codEstadoRe) {
        this.codEstadoRe = codEstadoRe;
    }

    public String getNombreEstadoRe() {
        return nombreEstadoRe;
    }

    public void setNombreEstadoRe(String nombreEstadoRe) {
        this.nombreEstadoRe = nombreEstadoRe;
    }

    @XmlTransient
    public List<Reserva> getReservaList() {
        return reservaList;
    }

    public void setReservaList(List<Reserva> reservaList) {
        this.reservaList = reservaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idEstadoReserva != null ? idEstadoReserva.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EstadoReserva)) {
            return false;
        }
        EstadoReserva other = (EstadoReserva) object;
        if ((this.idEstadoReserva == null && other.idEstadoReserva != null) || (this.idEstadoReserva != null && !this.idEstadoReserva.equals(other.idEstadoReserva))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.EstadoReserva[ idEstadoReserva=" + idEstadoReserva + " ]";
    }
    
}
