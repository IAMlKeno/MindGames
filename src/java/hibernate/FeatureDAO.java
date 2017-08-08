package hibernate;

import java.util.List;
import hibernate.Feature;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional

public class FeatureDAO {
    @Autowired
    SessionFactory sessionFactory;
    
    public void save(List<Feature> features, int ideaId){
        Session curSession = sessionFactory.getCurrentSession();
//        for(Feature feat : features){
//            feat.setIdea(ideaId);
//            curSession.save(feat);
//        }
    }
}
