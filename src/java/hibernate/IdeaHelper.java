package hibernate;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author Elkeno
 */
public class IdeaHelper {
    Session session = null;
    
    public IdeaHelper(){
//        this.session = HibernateUtil.getSessionFactory().getCurrentSession();
        this.session = HibernateUtil.getSessionFactory().openSession();
    }
    
    public List<Idea> getIdeas(){
        List<Idea> ideaList = new ArrayList<>();
        org.hibernate.Transaction tx = null;
        try {
            tx = session.beginTransaction();
            Query q = session.createQuery ("from Idea");
            for(int i=0;i<q.list().size(); i++){
                ideaList.add((Idea) q.list().get(i));
            }
//            ideaList = (List<Idea>) q.list();
            tx.commit();
            session.clear();
            session.flush();

        } catch (Exception e) {
            e.printStackTrace();
            tx.rollback();
        } finally {
//            session.close();
        }
        return ideaList;
    }
}
