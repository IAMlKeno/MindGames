package controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import model.Feature;
import model.Idea;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import util.IdeaHelper;

/**
 *
 * @author Elkeno Jones
 */
@Controller
public class MindGamesController {
    
    @Autowired
    private static IdeaHelper ideaHelper;
    
    public MindGamesController(){
        this.ideaHelper = new IdeaHelper();
    }
    
    @RequestMapping("")
    public ModelAndView page() {
        ModelAndView mv = new ModelAndView();
        return mv;
    }
    
    @RequestMapping(value = "/hello")
    public String sayhello(Model model) {
        List<Idea> ideaList = ideaHelper.getIdeas();
        Idea test = (Idea) ideaList.get(0);
        System.out.println("********" + Idea.class.toString());
        
        model.addAttribute("idea", new Idea());
        
        return "hello";
    }
    
    @RequestMapping(value="/develop", method = RequestMethod.POST)
    public String develop(Model model, @ModelAttribute("idea") Idea idea) {
        System.out.println("*********" + idea.getIdeaTitle());
        model.addAttribute("idea", idea);
        model.addAttribute("newFeature", new Feature());
        
        return "developIdea";
    }
    
    @RequestMapping(value="/develop/add", method = RequestMethod.POST)
    public String addFeature(Model model, @ModelAttribute("newFeature") Feature newFeature,
            @RequestParam Idea idea) {
        
        System.out.println("*********" + idea.getIdeaTitle());
//        System.out.println("*********" + newFeature.getFeatureTitle());
        idea.getFeatures().add(newFeature);
        model.addAttribute("idea", idea);
        model.addAttribute("newFeature", new Feature());
        
        return "developIdea";
    }
}
