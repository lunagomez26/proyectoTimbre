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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author USER
 */
@Entity
@Table(name = "tbl_visitantes")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Visitante.findAll", query = "SELECT v FROM Visitante v")
    , @NamedQuery(name = "Visitante.findByIdVisitante", query = "SELECT v FROM Visitante v WHERE v.idVisitante = :idVisitante")
    , @NamedQuery(name = "Visitante.findByPrimerNombre", query = "SELECT v FROM Visitante v WHERE v.primerNombre = :primerNombre")
    , @NamedQuery(name = "Visitante.findBySegundoNombre", query = "SELECT v FROM Visitante v WHERE v.segundoNombre = :segundoNombre")
    , @NamedQuery(name = "Visitante.findByPrimerApellido", query = "SELECT v FROM Visitante v WHERE v.primerApellido = :primerApellido")
    , @NamedQuery(name = "Visitante.findBySegundoApellido", query = "SELECT v FROM Visitante v WHERE v.segundoApellido = :segundoApellido")
    , @NamedQuery(name = "Visitante.findByDocumento", query = "SELECT v FROM Visitante v WHERE v.documento = :documento")})
public class Visitante implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idVisitante")
    private Integer idVisitante;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "PrimerNombre")
    private String primerNombre;
    @Size(max = 45)
    @Column(name = "SegundoNombre")
    private String segundoNombre;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "PrimerApellido")
    private String primerApellido;
    @Size(max = 45)
    @Column(name = "SegundoApellido")
    private String segundoApellido;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "Documento")
    private String documento;
    @JoinColumn(name = "idRegistro", referencedColumnName = "idRegistro")
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private RegistroIngreso idRegistro;
    @JoinColumn(name = "TipoDocumento", referencedColumnName = "idTipo")
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private TipoDeDocumento tipoDocumento;

    public Visitante() {
    }

    public Visitante(Integer idVisitante) {
        this.idVisitante = idVisitante;
    }

    public Visitante(Integer idVisitante, String primerNombre, String primerApellido, String documento) {
        this.idVisitante = idVisitante;
        this.primerNombre = primerNombre;
        this.primerApellido = primerApellido;
        this.documento = documento;
    }

    public Integer getIdVisitante() {
        return idVisitante;
    }

    public void setIdVisitante(Integer idVisitante) {
        this.idVisitante = idVisitante;
    }

    public String getPrimerNombre() {
        return primerNombre;
    }

    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    public String getSegundoNombre() {
        return segundoNombre;
    }

    public void setSegundoNombre(String segundoNombre) {
        this.segundoNombre = segundoNombre;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public RegistroIngreso getIdRegistro() {
        return idRegistro;
    }

    public void setIdRegistro(RegistroIngreso idRegistro) {
        this.idRegistro = idRegistro;
    }

    public TipoDeDocumento getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(TipoDeDocumento tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idVisitante != null ? idVisitante.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Visitante)) {
            return false;
        }
        Visitante other = (Visitante) object;
        if ((this.idVisitante == null && other.idVisitante != null) || (this.idVisitante != null && !this.idVisitante.equals(other.idVisitante))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.Visitante[ idVisitante=" + idVisitante + " ]";
    }
    
}
