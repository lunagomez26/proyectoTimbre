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
@Table(name = "tbl_zonascomunales")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ZonaComunal.findAll", query = "SELECT z FROM ZonaComunal z")
    , @NamedQuery(name = "ZonaComunal.findByIdZonaComunal", query = "SELECT z FROM ZonaComunal z WHERE z.idZonaComunal = :idZonaComunal")
    , @NamedQuery(name = "ZonaComunal.findByZonaComunal", query = "SELECT z FROM ZonaComunal z WHERE z.zonaComunal = :zonaComunal")
    , @NamedQuery(name = "ZonaComunal.findByValorZonaComunal", query = "SELECT z FROM ZonaComunal z WHERE z.valorZonaComunal = :valorZonaComunal")})
public class ZonaComunal implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idZonaComunal")
    private Integer idZonaComunal;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "ZonaComunal")
    private String zonaComunal;
    @Basic(optional = false)
    @NotNull
    @Column(name = "valorZonaComunal")
    private double valorZonaComunal;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idZonaComunal", fetch = FetchType.EAGER)
    private List<Evento> eventoList;

    public ZonaComunal() {
    }

    public ZonaComunal(Integer idZonaComunal) {
        this.idZonaComunal = idZonaComunal;
    }

    public ZonaComunal(Integer idZonaComunal, String zonaComunal, double valorZonaComunal) {
        this.idZonaComunal = idZonaComunal;
        this.zonaComunal = zonaComunal;
        this.valorZonaComunal = valorZonaComunal;
    }

    public Integer getIdZonaComunal() {
        return idZonaComunal;
    }

    public void setIdZonaComunal(Integer idZonaComunal) {
        this.idZonaComunal = idZonaComunal;
    }

    public String getZonaComunal() {
        return zonaComunal;
    }

    public void setZonaComunal(String zonaComunal) {
        this.zonaComunal = zonaComunal;
    }

    public double getValorZonaComunal() {
        return valorZonaComunal;
    }

    public void setValorZonaComunal(double valorZonaComunal) {
        this.valorZonaComunal = valorZonaComunal;
    }

    @XmlTransient
    public List<Evento> getEventoList() {
        return eventoList;
    }

    public void setEventoList(List<Evento> eventoList) {
        this.eventoList = eventoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idZonaComunal != null ? idZonaComunal.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ZonaComunal)) {
            return false;
        }
        ZonaComunal other = (ZonaComunal) object;
        if ((this.idZonaComunal == null && other.idZonaComunal != null) || (this.idZonaComunal != null && !this.idZonaComunal.equals(other.idZonaComunal))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.ZonaComunal[ idZonaComunal=" + idZonaComunal + " ]";
    }
    
}
