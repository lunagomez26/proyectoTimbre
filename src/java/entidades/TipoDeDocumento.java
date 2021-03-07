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
@Table(name = "tbl_tiposdedocumento")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TipoDeDocumento.findAll", query = "SELECT t FROM TipoDeDocumento t")
    , @NamedQuery(name = "TipoDeDocumento.findByIdTipo", query = "SELECT t FROM TipoDeDocumento t WHERE t.idTipo = :idTipo")
    , @NamedQuery(name = "TipoDeDocumento.findByCodTipoDocumento", query = "SELECT t FROM TipoDeDocumento t WHERE t.codTipoDocumento = :codTipoDocumento")
    , @NamedQuery(name = "TipoDeDocumento.findByNombreTipoDocumento", query = "SELECT t FROM TipoDeDocumento t WHERE t.nombreTipoDocumento = :nombreTipoDocumento")})
public class TipoDeDocumento implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idTipo")
    private Integer idTipo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "CodTipoDocumento")
    private String codTipoDocumento;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "NombreTipoDocumento")
    private String nombreTipoDocumento;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tipoDocumento", fetch = FetchType.EAGER)
    private List<Usuario> usuarioList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tipoDocumento", fetch = FetchType.EAGER)
    private List<Visitante> visitanteList;

    public TipoDeDocumento() {
    }

    public TipoDeDocumento(Integer idTipo) {
        this.idTipo = idTipo;
    }

    public TipoDeDocumento(Integer idTipo, String codTipoDocumento, String nombreTipoDocumento) {
        this.idTipo = idTipo;
        this.codTipoDocumento = codTipoDocumento;
        this.nombreTipoDocumento = nombreTipoDocumento;
    }

    public Integer getIdTipo() {
        return idTipo;
    }

    public void setIdTipo(Integer idTipo) {
        this.idTipo = idTipo;
    }

    public String getCodTipoDocumento() {
        return codTipoDocumento;
    }

    public void setCodTipoDocumento(String codTipoDocumento) {
        this.codTipoDocumento = codTipoDocumento;
    }

    public String getNombreTipoDocumento() {
        return nombreTipoDocumento;
    }

    public void setNombreTipoDocumento(String nombreTipoDocumento) {
        this.nombreTipoDocumento = nombreTipoDocumento;
    }

    @XmlTransient
    public List<Usuario> getUsuarioList() {
        return usuarioList;
    }

    public void setUsuarioList(List<Usuario> usuarioList) {
        this.usuarioList = usuarioList;
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
        hash += (idTipo != null ? idTipo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TipoDeDocumento)) {
            return false;
        }
        TipoDeDocumento other = (TipoDeDocumento) object;
        if ((this.idTipo == null && other.idTipo != null) || (this.idTipo != null && !this.idTipo.equals(other.idTipo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.TipoDeDocumento[ idTipo=" + idTipo + " ]";
    }
    
}
