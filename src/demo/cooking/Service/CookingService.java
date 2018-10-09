package demo.cooking.Service;

import demo.cooking.entity.Koliko;
import demo.cooking.entity.Recepti;
import demo.cooking.entity.Sastojci;
import demo.cooking.entity.cooking;

import java.util.List;

public interface CookingService {

    public cooking getUser(String username) ;

    public Recepti getId(int theId);

    public List<cooking> getUsers();

    public  List<Koliko> showSastojci(int theId);


}
