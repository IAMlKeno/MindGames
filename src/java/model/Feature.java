/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author Elkeno
 */
@Entity
@Table(name = "feature")
@NamedQueries({
    @NamedQuery(name = "Feature.findAll", query = "SELECT f FROM Feature f")
    , @NamedQuery(name = "Feature.findByFeatureId", query = "SELECT f FROM Feature f WHERE f.featureId = :featureId")
    , @NamedQuery(name = "Feature.findByDescriptionShort", query = "SELECT f FROM Feature f WHERE f.descriptionShort = :descriptionShort")})
public class Feature implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "featureId")
    private Integer featureId;
    @Basic(optional = false)
    @Column(name = "descriptionShort")
    private String descriptionShort;
    @Lob
    @Column(name = "descriptionLong")
    private byte[] descriptionLong;
    @JoinColumn(name = "ideaId", referencedColumnName = "ideaId")
    @ManyToOne(optional = false)
    private Idea ideaId;

    public Feature() {
    }

    public Feature(Integer featureId) {
        this.featureId = featureId;
    }

    public Feature(Integer featureId, String descriptionShort) {
        this.featureId = featureId;
        this.descriptionShort = descriptionShort;
    }

    public Integer getFeatureId() {
        return featureId;
    }

    public void setFeatureId(Integer featureId) {
        this.featureId = featureId;
    }

    public String getDescriptionShort() {
        return descriptionShort;
    }

    public void setDescriptionShort(String descriptionShort) {
        this.descriptionShort = descriptionShort;
    }

    public byte[] getDescriptionLong() {
        return descriptionLong;
    }

    public void setDescriptionLong(byte[] descriptionLong) {
        this.descriptionLong = descriptionLong;
    }

    public Idea getIdeaId() {
        return ideaId;
    }

    public void setIdeaId(Idea ideaId) {
        this.ideaId = ideaId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (featureId != null ? featureId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Feature)) {
            return false;
        }
        Feature other = (Feature) object;
        if ((this.featureId == null && other.featureId != null) || (this.featureId != null && !this.featureId.equals(other.featureId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Feature[ featureId=" + featureId + " ]";
    }
    
}
