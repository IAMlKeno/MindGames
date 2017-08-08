package test;
// Generated 8-Aug-2017 1:24:39 AM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Idea generated by hbm2java
 */
public class Idea  implements java.io.Serializable {


     private Integer ideaId;
     private User user;
     private String ideaTitle;
     private String alias;
     private String descriptionShort;
     private byte[] descriptionLong;
     private boolean isInProgress;
     private boolean isCompleted;
     private String rating;
     private Date dateCreated;
     private Set<Feature> features = new HashSet<Feature>(0);

    public Idea() {
    }

	
    public Idea(User user, String ideaTitle, String alias, String descriptionShort, boolean isInProgress, boolean isCompleted) {
        this.user = user;
        this.ideaTitle = ideaTitle;
        this.alias = alias;
        this.descriptionShort = descriptionShort;
        this.isInProgress = isInProgress;
        this.isCompleted = isCompleted;
    }
    public Idea(User user, String ideaTitle, String alias, String descriptionShort, byte[] descriptionLong, boolean isInProgress, boolean isCompleted, String rating, Date dateCreated, Set<Feature> features) {
       this.user = user;
       this.ideaTitle = ideaTitle;
       this.alias = alias;
       this.descriptionShort = descriptionShort;
       this.descriptionLong = descriptionLong;
       this.isInProgress = isInProgress;
       this.isCompleted = isCompleted;
       this.rating = rating;
       this.dateCreated = dateCreated;
       this.features = features;
    }
   
    public Integer getIdeaId() {
        return this.ideaId;
    }
    
    public void setIdeaId(Integer ideaId) {
        this.ideaId = ideaId;
    }
    public User getUser() {
        return this.user;
    }
    
    public void setUser(User user) {
        this.user = user;
    }
    public String getIdeaTitle() {
        return this.ideaTitle;
    }
    
    public void setIdeaTitle(String ideaTitle) {
        this.ideaTitle = ideaTitle;
    }
    public String getAlias() {
        return this.alias;
    }
    
    public void setAlias(String alias) {
        this.alias = alias;
    }
    public String getDescriptionShort() {
        return this.descriptionShort;
    }
    
    public void setDescriptionShort(String descriptionShort) {
        this.descriptionShort = descriptionShort;
    }
    public byte[] getDescriptionLong() {
        return this.descriptionLong;
    }
    
    public void setDescriptionLong(byte[] descriptionLong) {
        this.descriptionLong = descriptionLong;
    }
    public boolean isIsInProgress() {
        return this.isInProgress;
    }
    
    public void setIsInProgress(boolean isInProgress) {
        this.isInProgress = isInProgress;
    }
    public boolean isIsCompleted() {
        return this.isCompleted;
    }
    
    public void setIsCompleted(boolean isCompleted) {
        this.isCompleted = isCompleted;
    }
    public String getRating() {
        return this.rating;
    }
    
    public void setRating(String rating) {
        this.rating = rating;
    }
    public Date getDateCreated() {
        return this.dateCreated;
    }
    
    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }
    public Set<Feature> getFeatures() {
        return this.features;
    }
    
    public void setFeatures(Set<Feature> features) {
        this.features = features;
    }




}


