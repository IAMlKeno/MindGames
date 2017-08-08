package test;
// Generated 8-Aug-2017 1:24:39 AM by Hibernate Tools 4.3.1



/**
 * Feature generated by hbm2java
 */
public class Feature  implements java.io.Serializable {


     private Integer featureId;
     private Idea idea;
     private String descriptionShort;
     private byte[] descriptionLong;

    public Feature() {
    }

	
    public Feature(Idea idea, String descriptionShort) {
        this.idea = idea;
        this.descriptionShort = descriptionShort;
    }
    public Feature(Idea idea, String descriptionShort, byte[] descriptionLong) {
       this.idea = idea;
       this.descriptionShort = descriptionShort;
       this.descriptionLong = descriptionLong;
    }
   
    public Integer getFeatureId() {
        return this.featureId;
    }
    
    public void setFeatureId(Integer featureId) {
        this.featureId = featureId;
    }
    public Idea getIdea() {
        return this.idea;
    }
    
    public void setIdea(Idea idea) {
        this.idea = idea;
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




}


