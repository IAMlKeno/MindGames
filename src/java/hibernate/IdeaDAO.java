package hibernate;

import java.util.List;
import hibernate.Idea;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class IdeaDAO {
    @Autowired
    SessionFactory sessionFactory;
    
    public void save(Idea theIdea){
        Session curSession = sessionFactory.getCurrentSession();
        curSession.save(theIdea);
    }
    
    public List<Idea> getIdeaByTitle(String title){
        Session curSession = sessionFactory.getCurrentSession();
        List<Idea> ideas = curSession.createCriteria(Idea.class)
                .add(Restrictions.eq("ideaTitle", title))
                .list();
        
        return ideas;
    }
}
