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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author USER
 */
@Entity
@Table(name = "tbl_paqueteria")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Paqueteria.findAll", query = "SELECT p FROM Paqueteria p")
    , @NamedQuery(name = "Paqueteria.findByIdPaqueteria", query = "SELECT p FROM Paqueteria p WHERE p.idPaqueteria = :idPaqueteria")})
public class Paqueteria implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idPaqueteria")
    private Integer idPaqueteria;
    @JoinColumn(name = "idCorrespondencia", referencedColumnName = "idCorrespondencia")
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private Correspondencia idCorrespondencia;
    @JoinColumn(name = "idTama\u00f1o", referencedColumnName = "idTama\u00f1o")
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private Tamanio idTamaño;

    public Paqueteria() {
    }

    public Paqueteria(Integer idPaqueteria) {
        this.idPaqueteria = idPaqueteria;
    }

    public Integer getIdPaqueteria() {
        return idPaqueteria;
    }

    public void setIdPaqueteria(Integer idPaqueteria) {
        this.idPaqueteria = idPaqueteria;
    }

    public Correspondencia getIdCorrespondencia() {
        return idCorrespondencia;
    }

    public void setIdCorrespondencia(Correspondencia idCorrespondencia) {
        this.idCorrespondencia = idCorrespondencia;
    }

    public Tamanio getIdTamaño() {
        return idTamaño;
    }

    public void setIdTamaño(Tamanio idTamaño) {
        this.idTamaño = idTamaño;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPaqueteria != null ? idPaqueteria.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Paqueteria)) {
            return false;
        }
        Paqueteria other = (Paqueteria) object;
        if ((this.idPaqueteria == null && other.idPaqueteria != null) || (this.idPaqueteria != null && !this.idPaqueteria.equals(other.idPaqueteria))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.Paqueteria[ idPaqueteria=" + idPaqueteria + " ]";
    }
    
}
