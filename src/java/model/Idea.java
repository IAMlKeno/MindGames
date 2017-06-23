package model;

import java.util.ArrayList;

/**
 *
 * @author Elkeno
 */
public class Idea {
    private String ideaTitle;
    private ArrayList<Feature> features;

    public Idea(){
        
    }
    public Idea(String ideaTitle){
        this.ideaTitle = ideaTitle;
        this.features = new ArrayList<>();
    }
    public Idea(String ideaTitle, ArrayList<Feature> features){
        this.ideaTitle = ideaTitle;
        this.features = features;
    }
    public String getIdeaTitle() {
        return ideaTitle;
    }

    public void setIdeaTitle(String ideaTitle) {
        this.ideaTitle = ideaTitle;
    }

    public ArrayList<Feature> getFeatures() {
        return features;
    }

    public void setFeatures(ArrayList<Feature> features) {
        this.features = features;
    }

    @Override
    public String toString() {
        return "Idea{" + "ideaTitle=" + ideaTitle + '}';
    }
    
    
}
