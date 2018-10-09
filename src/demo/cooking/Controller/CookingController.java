package demo.cooking.Controller;


import demo.cooking.Service.CookingService;
import demo.cooking.dao.CookingDAO;
import demo.cooking.entity.Koliko;
import demo.cooking.entity.Recepti;
import demo.cooking.entity.Sastojci;
import demo.cooking.entity.cooking;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/cooking")
public class CookingController {
    @Autowired
    private CookingService cookingService;

    @RequestMapping("/home")
    public String defaultCooking() {
        return "home";
    }

    @RequestMapping("/forma")
    public String showLog(Model theModel)

    {
        cooking thecooking = new cooking();

        theModel.addAttribute("cooking", thecooking);

        return "forma";
    }

    @RequestMapping("/recepti")
    public String showRecepti(Model theModel) {


        return "recepti";
    }


    @RequestMapping("/processForm")
    public ModelAndView processForm(HttpServletRequest request) {

        String username = request.getParameter("username");
        String password = request.getParameter("password");


        cooking user = cookingService.getUser(username);
        System.out.println(username);


        boolean isOk = true;
        String message = "";

        if (user == null) {
            isOk = false;
            message = "Error: no such a user";
        } else if (!user.getPassword().equals(password)) {
            isOk = false;
            message = "Error: wrong password";
        }


        ModelAndView mv;


        if (isOk) {
            mv = new ModelAndView("recepti");
            List<Recepti> recepti = user.getRecepti();
            mv.addObject("recepti", recepti);


        } else {
            mv = new ModelAndView("error");
            mv.addObject("message", message);
        }

        return mv;
    }

    @RequestMapping("/opis")
    public ModelAndView opis(@RequestParam(value = "id_recepti") int theId) {

        Recepti recipe = cookingService.getId(theId);
        List <Koliko> koliko = cookingService.showSastojci(theId);
        ModelAndView ml;

        ml = new ModelAndView("opis");
        ml.addObject("opis", recipe);
        ml.addObject("kolicina", koliko);

        return ml;
    }


}


