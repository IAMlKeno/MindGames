package model;

/**
 *
 * @author Elkeno
 */
public class Feature {
    private String featureTitle;

    public Feature(){
        
    }
    public Feature(String title){
        this.featureTitle = title;
    }
    public String getFeatureTitle() {
        return featureTitle;
    }

    public void setFeatureTitle(String featureTitle) {
        this.featureTitle = featureTitle;
    }
    
    
}
