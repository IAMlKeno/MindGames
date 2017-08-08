package model;

import hibernate.Feature;
import hibernate.Idea;

/**
 *
 * @author Elkeno
 */
public class IdeaWithNewFeature {
    private Idea idea;
    private Feature newFeature;

    public Idea getIdea() {
        return idea;
    }

    public void setIdea(Idea idea) {
        this.idea = idea;
    }

    public Feature getNewFeature() {
        return newFeature;
    }

    public void setNewFeature(Feature feature) {
        this.newFeature = feature;
    }
    
    
}
