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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author USER
 */
@Entity
@Table(name = "tbl_apartamentos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Apartamento.findAll", query = "SELECT a FROM Apartamento a")
    , @NamedQuery(name = "Apartamento.findByIdApartamento", query = "SELECT a FROM Apartamento a WHERE a.idApartamento = :idApartamento")
    , @NamedQuery(name = "Apartamento.findByPlaca", query = "SELECT a FROM Apartamento a WHERE a.placa = :placa")
    , @NamedQuery(name = "Apartamento.findByDatafono", query = "SELECT a FROM Apartamento a WHERE a.datafono = :datafono")})
public class Apartamento implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idApartamento")
    private Integer idApartamento;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "Placa")
    private String placa;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Datafono")
    private int datafono;
    @JoinColumn(name = "idTorre", referencedColumnName = "idTorre")
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private Torre idTorre;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idApartamento", fetch = FetchType.EAGER)
    private List<RegistroIngreso> registroIngresoList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idApartamento", fetch = FetchType.EAGER)
    private List<Residente> residenteList;

    public Apartamento() {
    }

    public Apartamento(Integer idApartamento) {
        this.idApartamento = idApartamento;
    }

    public Apartamento(Integer idApartamento, String placa, int datafono) {
        this.idApartamento = idApartamento;
        this.placa = placa;
        this.datafono = datafono;
    }

    public Integer getIdApartamento() {
        return idApartamento;
    }

    public void setIdApartamento(Integer idApartamento) {
        this.idApartamento = idApartamento;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getDatafono() {
        return datafono;
    }

    public void setDatafono(int datafono) {
        this.datafono = datafono;
    }

    public Torre getIdTorre() {
        return idTorre;
    }

    public void setIdTorre(Torre idTorre) {
        this.idTorre = idTorre;
    }

    @XmlTransient
    public List<RegistroIngreso> getRegistroIngresoList() {
        return registroIngresoList;
    }

    public void setRegistroIngresoList(List<RegistroIngreso> registroIngresoList) {
        this.registroIngresoList = registroIngresoList;
    }

    @XmlTransient
    public List<Residente> getResidenteList() {
        return residenteList;
    }

    public void setResidenteList(List<Residente> residenteList) {
        this.residenteList = residenteList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idApartamento != null ? idApartamento.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Apartamento)) {
            return false;
        }
        Apartamento other = (Apartamento) object;
        if ((this.idApartamento == null && other.idApartamento != null) || (this.idApartamento != null && !this.idApartamento.equals(other.idApartamento))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.Apartamento[ idApartamento=" + idApartamento + " ]";
    }
    
}
