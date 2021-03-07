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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author USER
 */
@Entity
@Table(name = "tbl_correspondencia")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Correspondencia.findAll", query = "SELECT c FROM Correspondencia c")
    , @NamedQuery(name = "Correspondencia.findByIdCorrespondencia", query = "SELECT c FROM Correspondencia c WHERE c.idCorrespondencia = :idCorrespondencia")
    , @NamedQuery(name = "Correspondencia.findByRemitente", query = "SELECT c FROM Correspondencia c WHERE c.remitente = :remitente")
    , @NamedQuery(name = "Correspondencia.findByFechaHoraEntrega", query = "SELECT c FROM Correspondencia c WHERE c.fechaHoraEntrega = :fechaHoraEntrega")
    , @NamedQuery(name = "Correspondencia.findByDescripcion", query = "SELECT c FROM Correspondencia c WHERE c.descripcion = :descripcion")})
public class Correspondencia implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idCorrespondencia")
    private Integer idCorrespondencia;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "Remitente")
    private String remitente;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FechaHoraEntrega")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaHoraEntrega;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "Descripcion")
    private String descripcion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idCorrespondencia", fetch = FetchType.EAGER)
    private List<Papeleria> papeleriaList;
    @JoinColumn(name = "idRegistro", referencedColumnName = "idRegistro")
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private RegistroIngreso idRegistro;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idCorrespondencia", fetch = FetchType.EAGER)
    private List<Paqueteria> paqueteriaList;

    public Correspondencia() {
    }

    public Correspondencia(Integer idCorrespondencia) {
        this.idCorrespondencia = idCorrespondencia;
    }

    public Correspondencia(Integer idCorrespondencia, String remitente, Date fechaHoraEntrega, String descripcion) {
        this.idCorrespondencia = idCorrespondencia;
        this.remitente = remitente;
        this.fechaHoraEntrega = fechaHoraEntrega;
        this.descripcion = descripcion;
    }

    public Integer getIdCorrespondencia() {
        return idCorrespondencia;
    }

    public void setIdCorrespondencia(Integer idCorrespondencia) {
        this.idCorrespondencia = idCorrespondencia;
    }

    public String getRemitente() {
        return remitente;
    }

    public void setRemitente(String remitente) {
        this.remitente = remitente;
    }

    public Date getFechaHoraEntrega() {
        return fechaHoraEntrega;
    }

    public void setFechaHoraEntrega(Date fechaHoraEntrega) {
        this.fechaHoraEntrega = fechaHoraEntrega;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @XmlTransient
    public List<Papeleria> getPapeleriaList() {
        return papeleriaList;
    }

    public void setPapeleriaList(List<Papeleria> papeleriaList) {
        this.papeleriaList = papeleriaList;
    }

    public RegistroIngreso getIdRegistro() {
        return idRegistro;
    }

    public void setIdRegistro(RegistroIngreso idRegistro) {
        this.idRegistro = idRegistro;
    }

    @XmlTransient
    public List<Paqueteria> getPaqueteriaList() {
        return paqueteriaList;
    }

    public void setPaqueteriaList(List<Paqueteria> paqueteriaList) {
        this.paqueteriaList = paqueteriaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCorrespondencia != null ? idCorrespondencia.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Correspondencia)) {
            return false;
        }
        Correspondencia other = (Correspondencia) object;
        if ((this.idCorrespondencia == null && other.idCorrespondencia != null) || (this.idCorrespondencia != null && !this.idCorrespondencia.equals(other.idCorrespondencia))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.Correspondencia[ idCorrespondencia=" + idCorrespondencia + " ]";
    }
    
}
