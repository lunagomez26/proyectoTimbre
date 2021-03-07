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
@Table(name = "tbl_tama\u00f1os")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tamanio.findAll", query = "SELECT t FROM Tamanio t")
    , @NamedQuery(name = "Tamanio.findByIdTama\u00f1o", query = "SELECT t FROM Tamanio t WHERE t.idTama\u00f1o = :idTama\u00f1o")
    , @NamedQuery(name = "Tamanio.findByCodTama\u00f1o", query = "SELECT t FROM Tamanio t WHERE t.codTama\u00f1o = :codTama\u00f1o")
    , @NamedQuery(name = "Tamanio.findByNombreTama\u00f1o", query = "SELECT t FROM Tamanio t WHERE t.nombreTama\u00f1o = :nombreTama\u00f1o")})
public class Tamanio implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idTama\u00f1o")
    private Integer idTamaño;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "CodTama\u00f1o")
    private String codTamaño;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "NombreTama\u00f1o")
    private String nombreTamaño;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idTama\u00f1o", fetch = FetchType.EAGER)
    private List<Paqueteria> paqueteriaList;

    public Tamanio() {
    }

    public Tamanio(Integer idTamaño) {
        this.idTamaño = idTamaño;
    }

    public Tamanio(Integer idTamaño, String codTamaño, String nombreTamaño) {
        this.idTamaño = idTamaño;
        this.codTamaño = codTamaño;
        this.nombreTamaño = nombreTamaño;
    }

    public Integer getIdTamaño() {
        return idTamaño;
    }

    public void setIdTamaño(Integer idTamaño) {
        this.idTamaño = idTamaño;
    }

    public String getCodTamaño() {
        return codTamaño;
    }

    public void setCodTamaño(String codTamaño) {
        this.codTamaño = codTamaño;
    }

    public String getNombreTamaño() {
        return nombreTamaño;
    }

    public void setNombreTamaño(String nombreTamaño) {
        this.nombreTamaño = nombreTamaño;
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
        hash += (idTamaño != null ? idTamaño.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tamanio)) {
            return false;
        }
        Tamanio other = (Tamanio) object;
        if ((this.idTamaño == null && other.idTamaño != null) || (this.idTamaño != null && !this.idTamaño.equals(other.idTamaño))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.Tamanio[ idTama\u00f1o=" + idTamaño + " ]";
    }
    
}
