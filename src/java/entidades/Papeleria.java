/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.io.Serializable;
import javax.persistence.Basic;
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
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author USER
 */
@Entity
@Table(name = "tbl_papeleria")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Papeleria.findAll", query = "SELECT p FROM Papeleria p")
    , @NamedQuery(name = "Papeleria.findByIdPapeleria", query = "SELECT p FROM Papeleria p WHERE p.idPapeleria = :idPapeleria")
    , @NamedQuery(name = "Papeleria.findByIsRecibo", query = "SELECT p FROM Papeleria p WHERE p.isRecibo = :isRecibo")})
public class Papeleria implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idPapeleria")
    private Integer idPapeleria;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IsRecibo")
    private short isRecibo;
    @JoinColumn(name = "idCorrespondencia", referencedColumnName = "idCorrespondencia")
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private Correspondencia idCorrespondencia;

    public Papeleria() {
    }

    public Papeleria(Integer idPapeleria) {
        this.idPapeleria = idPapeleria;
    }

    public Papeleria(Integer idPapeleria, short isRecibo) {
        this.idPapeleria = idPapeleria;
        this.isRecibo = isRecibo;
    }

    public Integer getIdPapeleria() {
        return idPapeleria;
    }

    public void setIdPapeleria(Integer idPapeleria) {
        this.idPapeleria = idPapeleria;
    }

    public short getIsRecibo() {
        return isRecibo;
    }

    public void setIsRecibo(short isRecibo) {
        this.isRecibo = isRecibo;
    }

    public Correspondencia getIdCorrespondencia() {
        return idCorrespondencia;
    }

    public void setIdCorrespondencia(Correspondencia idCorrespondencia) {
        this.idCorrespondencia = idCorrespondencia;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPapeleria != null ? idPapeleria.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Papeleria)) {
            return false;
        }
        Papeleria other = (Papeleria) object;
        if ((this.idPapeleria == null && other.idPapeleria != null) || (this.idPapeleria != null && !this.idPapeleria.equals(other.idPapeleria))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.Papeleria[ idPapeleria=" + idPapeleria + " ]";
    }
    
}
