/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DAL;

import java.io.Serializable;
import java.math.BigInteger;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author 11627
 */
@Entity
@Table(name = "UMPIRE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Umpire.findAll", query = "SELECT u FROM Umpire u"),
    @NamedQuery(name = "Umpire.findById", query = "SELECT u FROM Umpire u WHERE u.id = :id"),
    @NamedQuery(name = "Umpire.findByPhone", query = "SELECT u FROM Umpire u WHERE u.phone = :phone"),
    @NamedQuery(name = "Umpire.findByEmail", query = "SELECT u FROM Umpire u WHERE u.email = :email"),
    @NamedQuery(name = "Umpire.findByLevel", query = "SELECT u FROM Umpire u WHERE u.level = :level")})
public class Umpire implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private Short id;
    @Basic(optional = false)
    @Column(name = "PHONE")
    private BigInteger phone;
    @Basic(optional = false)
    @Column(name = "EMAIL")
    private String email;
    @Basic(optional = false)
    @Column(name = "LEVEL")
    private String level;

    public Umpire() {
    }

    public Umpire(Short id) {
        this.id = id;
    }

    public Umpire(Short id, BigInteger phone, String email, String level) {
        this.id = id;
        this.phone = phone;
        this.email = email;
        this.level = level;
    }

    public Short getId() {
        return id;
    }

    public void setId(Short id) {
        this.id = id;
    }

    public BigInteger getPhone() {
        return phone;
    }

    public void setPhone(BigInteger phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Umpire)) {
            return false;
        }
        Umpire other = (Umpire) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "DAL.Umpire[ id=" + id + " ]";
    }
    
}
