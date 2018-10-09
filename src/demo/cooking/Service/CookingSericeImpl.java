package demo.cooking.Service;

import demo.cooking.dao.CookingDAO;
import demo.cooking.entity.Koliko;
import demo.cooking.entity.Recepti;
import demo.cooking.entity.Sastojci;
import demo.cooking.entity.cooking;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
public class CookingSericeImpl implements CookingService {
    @Autowired
    private CookingDAO cookingDAO;

    @Override
    @Transactional
    public List<cooking> getUsers() {
        return cookingDAO.getUsers();
    }

    @Override
    @Transactional
    public  List<Koliko> showSastojci(int theId) {
        return cookingDAO.showSastojci(theId);
    }

    @Override
    @Transactional
    public cooking getUser(String username) {
        return cookingDAO.getUser(username);
    }

    @Override
    @Transactional
    public Recepti getId(int theId) {
        return cookingDAO.getId(theId);
    }
}
