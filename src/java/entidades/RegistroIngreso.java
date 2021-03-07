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
@Table(name = "tbl_registrosingreso")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegistroIngreso.findAll", query = "SELECT r FROM RegistroIngreso r")
    , @NamedQuery(name = "RegistroIngreso.findByIdRegistro", query = "SELECT r FROM RegistroIngreso r WHERE r.idRegistro = :idRegistro")
    , @NamedQuery(name = "RegistroIngreso.findByFechaHoraRegistro", query = "SELECT r FROM RegistroIngreso r WHERE r.fechaHoraRegistro = :fechaHoraRegistro")})
public class RegistroIngreso implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idRegistro")
    private Integer idRegistro;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FechaHoraRegistro")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaHoraRegistro;
    @JoinColumn(name = "idApartamento", referencedColumnName = "idApartamento")
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private Apartamento idApartamento;
    @JoinColumn(name = "idGuardia", referencedColumnName = "idGuardia")
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private GuardiaDeSeguridad idGuardia;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idRegistro", fetch = FetchType.EAGER)
    private List<Correspondencia> correspondenciaList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idRegistro", fetch = FetchType.EAGER)
    private List<Visitante> visitanteList;

    public RegistroIngreso() {
    }

    public RegistroIngreso(Integer idRegistro) {
        this.idRegistro = idRegistro;
    }

    public RegistroIngreso(Integer idRegistro, Date fechaHoraRegistro) {
        this.idRegistro = idRegistro;
        this.fechaHoraRegistro = fechaHoraRegistro;
    }

    public Integer getIdRegistro() {
        return idRegistro;
    }

    public void setIdRegistro(Integer idRegistro) {
        this.idRegistro = idRegistro;
    }

    public Date getFechaHoraRegistro() {
        return fechaHoraRegistro;
    }

    public void setFechaHoraRegistro(Date fechaHoraRegistro) {
        this.fechaHoraRegistro = fechaHoraRegistro;
    }

    public Apartamento getIdApartamento() {
        return idApartamento;
    }

    public void setIdApartamento(Apartamento idApartamento) {
        this.idApartamento = idApartamento;
    }

    public GuardiaDeSeguridad getIdGuardia() {
        return idGuardia;
    }

    public void setIdGuardia(GuardiaDeSeguridad idGuardia) {
        this.idGuardia = idGuardia;
    }

    @XmlTransient
    public List<Correspondencia> getCorrespondenciaList() {
        return correspondenciaList;
    }

    public void setCorrespondenciaList(List<Correspondencia> correspondenciaList) {
        this.correspondenciaList = correspondenciaList;
    }

    @XmlTransient
    public List<Visitante> getVisitanteList() {
        return visitanteList;
    }

    public void setVisitanteList(List<Visitante> visitanteList) {
        this.visitanteList = visitanteList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idRegistro != null ? idRegistro.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RegistroIngreso)) {
            return false;
        }
        RegistroIngreso other = (RegistroIngreso) object;
        if ((this.idRegistro == null && other.idRegistro != null) || (this.idRegistro != null && !this.idRegistro.equals(other.idRegistro))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.RegistroIngreso[ idRegistro=" + idRegistro + " ]";
    }
    
}
