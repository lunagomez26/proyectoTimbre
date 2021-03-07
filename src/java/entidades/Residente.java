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
@Table(name = "tbl_residentes")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Residente.findAll", query = "SELECT r FROM Residente r")
    , @NamedQuery(name = "Residente.findByIdResidente", query = "SELECT r FROM Residente r WHERE r.idResidente = :idResidente")})
public class Residente implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idResidente")
    private Integer idResidente;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idResidente", fetch = FetchType.EAGER)
    private List<Reserva> reservaList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idResidente", fetch = FetchType.EAGER)
    private List<Solicitud> solicitudList;
    @JoinColumn(name = "idApartamento", referencedColumnName = "idApartamento")
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private Apartamento idApartamento;
    @JoinColumn(name = "idUsuario", referencedColumnName = "idUsuario")
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private Usuario idUsuario;

    public Residente() {
    }

    public Residente(Integer idResidente) {
        this.idResidente = idResidente;
    }

    public Integer getIdResidente() {
        return idResidente;
    }

    public void setIdResidente(Integer idResidente) {
        this.idResidente = idResidente;
    }

    @XmlTransient
    public List<Reserva> getReservaList() {
        return reservaList;
    }

    public void setReservaList(List<Reserva> reservaList) {
        this.reservaList = reservaList;
    }

    @XmlTransient
    public List<Solicitud> getSolicitudList() {
        return solicitudList;
    }

    public void setSolicitudList(List<Solicitud> solicitudList) {
        this.solicitudList = solicitudList;
    }

    public Apartamento getIdApartamento() {
        return idApartamento;
    }

    public void setIdApartamento(Apartamento idApartamento) {
        this.idApartamento = idApartamento;
    }

    public Usuario getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Usuario idUsuario) {
        this.idUsuario = idUsuario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idResidente != null ? idResidente.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Residente)) {
            return false;
        }
        Residente other = (Residente) object;
        if ((this.idResidente == null && other.idResidente != null) || (this.idResidente != null && !this.idResidente.equals(other.idResidente))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.Residente[ idResidente=" + idResidente + " ]";
    }
    
}
