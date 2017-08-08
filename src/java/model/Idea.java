/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
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
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Elkeno
 */
@Entity
@Table(name = "idea")
@NamedQueries({
    @NamedQuery(name = "Idea.findAll", query = "SELECT i FROM Idea i")
    , @NamedQuery(name = "Idea.findByIdeaId", query = "SELECT i FROM Idea i WHERE i.ideaId = :ideaId")
    , @NamedQuery(name = "Idea.findByIdeaTitle", query = "SELECT i FROM Idea i WHERE i.ideaTitle = :ideaTitle")
    , @NamedQuery(name = "Idea.findByAlias", query = "SELECT i FROM Idea i WHERE i.alias = :alias")
    , @NamedQuery(name = "Idea.findByDescriptionShort", query = "SELECT i FROM Idea i WHERE i.descriptionShort = :descriptionShort")
    , @NamedQuery(name = "Idea.findByIsInProgress", query = "SELECT i FROM Idea i WHERE i.isInProgress = :isInProgress")
    , @NamedQuery(name = "Idea.findByIsCompleted", query = "SELECT i FROM Idea i WHERE i.isCompleted = :isCompleted")
    , @NamedQuery(name = "Idea.findByRating", query = "SELECT i FROM Idea i WHERE i.rating = :rating")
    , @NamedQuery(name = "Idea.findByDateCreated", query = "SELECT i FROM Idea i WHERE i.dateCreated = :dateCreated")})
public class Idea implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ideaId")
    private Integer ideaId;
    @Basic(optional = false)
    @Column(name = "ideaTitle")
    private String ideaTitle;
    @Basic(optional = false)
    @Column(name = "alias")
    private String alias;
    @Basic(optional = false)
    @Column(name = "descriptionShort")
    private String descriptionShort;
    @Lob
    @Column(name = "descriptionLong")
    private byte[] descriptionLong;
    @Basic(optional = false)
    @Column(name = "isInProgress")
    private boolean isInProgress;
    @Basic(optional = false)
    @Column(name = "isCompleted")
    private boolean isCompleted;
    @Column(name = "rating")
    private String rating;
    @Column(name = "dateCreated")
    @Temporal(TemporalType.DATE)
    private Date dateCreated;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "ideaId")
    private List<Feature> featureList;
    @JoinColumn(name = "userId", referencedColumnName = "userId")
    @ManyToOne(optional = false)
    private User userId;

    public Idea() {
    }

    public Idea(Integer ideaId) {
        this.ideaId = ideaId;
    }

    public Idea(Integer ideaId, String ideaTitle, String alias, String descriptionShort, boolean isInProgress, boolean isCompleted) {
        this.ideaId = ideaId;
        this.ideaTitle = ideaTitle;
        this.alias = alias;
        this.descriptionShort = descriptionShort;
        this.isInProgress = isInProgress;
        this.isCompleted = isCompleted;
    }

    public Integer getIdeaId() {
        return ideaId;
    }

    public void setIdeaId(Integer ideaId) {
        this.ideaId = ideaId;
    }

    public String getIdeaTitle() {
        return ideaTitle;
    }

    public void setIdeaTitle(String ideaTitle) {
        this.ideaTitle = ideaTitle;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
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

    public boolean getIsInProgress() {
        return isInProgress;
    }

    public void setIsInProgress(boolean isInProgress) {
        this.isInProgress = isInProgress;
    }

    public boolean getIsCompleted() {
        return isCompleted;
    }

    public void setIsCompleted(boolean isCompleted) {
        this.isCompleted = isCompleted;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public List<Feature> getFeatureList() {
        return featureList;
    }

    public void setFeatureList(List<Feature> featureList) {
        this.featureList = featureList;
    }

    public User getUserId() {
        return userId;
    }

    public void setUserId(User userId) {
        this.userId = userId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ideaId != null ? ideaId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Idea)) {
            return false;
        }
        Idea other = (Idea) object;
        if ((this.ideaId == null && other.ideaId != null) || (this.ideaId != null && !this.ideaId.equals(other.ideaId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Idea[ ideaId=" + ideaId + " ]";
    }
    
}
