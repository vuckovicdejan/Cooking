package demo.cooking.dao;

import demo.cooking.entity.Koliko;
import demo.cooking.entity.Recepti;
import demo.cooking.entity.Sastojci;
import demo.cooking.entity.cooking;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Repository;


import java.util.List;

@Repository
public class CookingDAOImpl implements CookingDAO {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<cooking> getUsers() {
        Session currentSession = sessionFactory.getCurrentSession();


        Query<cooking> theQuery =
                currentSession.createQuery("from cooking order by username",
                        cooking.class);


        List<cooking> users = theQuery.getResultList();


        return users;
    }

    @Override
    public Recepti getId(int theId) {
        Session currentSession = sessionFactory.getCurrentSession();

        Recepti theRecepti = currentSession.get(Recepti.class, theId);

        return theRecepti;
    }

    @Override
    public cooking getUser(String username) {

        Session currentSession = sessionFactory.getCurrentSession();
//        @SuppressWarnings("unchecked")
        Query query = sessionFactory.getCurrentSession().createQuery("FROM cooking u WHERE u.username = :username");
        query.setParameter("username", username);
        cooking user = (cooking) query.uniqueResult();
        return user;
    }


    @SuppressWarnings("unchecked")
    @Override
    public List<Koliko> showSastojci(int theId) {

        Session currentSession = sessionFactory.getCurrentSession();

        Query query = currentSession.createQuery("from Koliko where sastojci.id=:id_sastojci and  recepti.id=:id_recepti  ");
        query.setParameter("id_recepti", theId);
        query.setParameter("id_sastojci", theId);

        List<Koliko> koliko = query.list();

        return koliko;
    }

}
