package demo.cooking.dao;

import demo.cooking.entity.Koliko;
import demo.cooking.entity.Recepti;
import demo.cooking.entity.Sastojci;
import demo.cooking.entity.cooking;

import java.util.List;

public interface CookingDAO {

    public List<cooking> getUsers();
    public Recepti getId(int theId);
    public cooking getUser(String username);
    public  List<Koliko> showSastojci(int theId);

}
