package controller;

import hibernate.Feature;
import hibernate.FeatureDAO;
import hibernate.Idea;
import hibernate.IdeaDAO;
import hibernate.IdeaHelper;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import model.IdeaWithNewFeature;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Elkeno Jones
 */
@Controller
public class MindGamesController {

    private static IdeaDAO ideaDAO;
    private static FeatureDAO featureDAO;
    
    @Autowired
    private static IdeaHelper ideaHelper;
    
//    public MindGamesController(IdeaDAO ideaDAO, FeatureDAO featureDAO){
//        this.ideaDAO = ideaDAO;
//        this.featureDAO = featureDAO;
//    }
    
    public MindGamesController(){
        this.ideaDAO = new IdeaDAO();
        this.featureDAO = new FeatureDAO();
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
//        System.out.println("********" + ideaList.get(0).getClass().toString());
        System.out.println("********" + Idea.class.toString());
        model.addAttribute("ideaList", ideaList);
        model.addAttribute("idea", new Idea());

        return "ideaHub";
    }

    @RequestMapping(value = "/develop", method = RequestMethod.POST)
    public String develop(Model model, @ModelAttribute("idea") Idea idea) {
        IdeaWithNewFeature newFeature = new IdeaWithNewFeature();
        newFeature.setIdea(idea);
        newFeature.setNewFeature(new Feature());
        model.addAttribute("ideaWithNewFeature", newFeature);

        return "developIdea";
    }

    @RequestMapping(value = "/develop/add", method = RequestMethod.POST)
    public String addFeature(Model model,
            @ModelAttribute("ideaWithNewFeature") IdeaWithNewFeature ideaWithNewFeature) {
        // get the idea, add new feature to the idea's feature list
        Idea theIdea = ideaWithNewFeature.getIdea();
        Feature featureToAdd = ideaWithNewFeature.getNewFeature();
        theIdea.getFeatures().add(featureToAdd);
        ideaWithNewFeature.setNewFeature(new Feature());
        ideaWithNewFeature.setIdea(theIdea);
        model.addAttribute("ideaWithNewFeature", ideaWithNewFeature);

        return "developIdea";
    }
    
    @RequestMapping(value = "/develop/done", method = RequestMethod.POST)
    public String doneDeveloping(Model model,
            @ModelAttribute("ideaWithNewFeature") IdeaWithNewFeature ideaWithNewFeature) {
        Idea theIdea = ideaWithNewFeature.getIdea();
        
        ideaDAO.save(theIdea);
//        featureDAO.save(theIdea.getFeatures(), theIdea.getIdeaId());
        
        ArrayList<Idea> ideaList = new ArrayList<>();
        ideaList.add(theIdea);
        
        model.addAttribute("ideaList", ideaList);
        model.addAttribute("idea", new Idea());
        return "ideaHub";
    }
}
