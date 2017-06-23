/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindException;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.ModelAndView;
//import org.springframework.web.servlet.mvc.SimpleFormController;
import service.HelloService;

/**
 *
 * @author Elkeno
 */
@Controller
public class HelloController {
    
    private HelloService helloService;
    
    public HelloController() {
        //Initialize controller properties here or 
        //in the Web Application Context

//        setCommandClass(Name.class);
//        setCommandName("name");
//        setSuccessView("helloView");
//        setFormView("nameView");
    }
    
//    @RequestMapping("/hello")
//    public ModelAndView sayhello(HttpServletRequest request, 
//            HttpServletResponse response) {
//        ModelAndView mv = new ModelAndView();
//        Name name = new Name();
////        name.setValue(request.getParameter("name"));
//        name.setValue("Elkeno");
//        mv.addObject("hello message", helloService.sayHello(name.getValue()));
//        mv.addObject("name", new Name());
//        System.out.println(helloService.sayHello(name.getValue()));
//        return mv;
//    }
    
//    @RequestMapping(value = "/hello", method = RequestMethod.GET)
//    public String sayhello(Model model) {
//        Name name = new Name();
//        name.setValue("Elkeno");
//        System.out.println("*********sayHello method");
//        model.addAttribute("name", name);
//        return "hello";
//    }
    
//    @RequestMapping(value = "/MindGames/name.jsp", method = RequestMethod.GET)
    @RequestMapping("/name")
    public String hiMethod(@ModelAttribute("name") Name name,
	BindingResult result, SessionStatus status, Model model) {
        String n = name.getValue();
        System.out.println("******hiMethod " + n);
        model.addAttribute("helloMessage", helloService.sayHello(n));
        
        return "name";
    }
    
//    @RequestMapping(value = "/name", method = RequestMethod.GET)
//    public String hiMethod(@ModelAttribute("name") Name name,
//	BindingResult result, SessionStatus status) {
//        ModelAndView mv = new ModelAndView();
//        System.out.println("******hiMethod");
//        
//        return "/jsp/name";
//    }
    
    @ModelAttribute("name")
    public Name nameAttr() {
        return new Name();
    }
    
    
    
    //Use onSubmit instead of doSubmitAction 
    //when you need access to the Request, Response, or BindException objects
    
//    @Override
//    protected ModelAndView onSubmit(
//            HttpServletRequest request, 
//            HttpServletResponse response, 
//            Object command, 
//            BindException errors) throws Exception {
//        Name name = (Name) command;
//        ModelAndView mv = new ModelAndView(getSuccessView());
//        //Do something...
//        mv.addObject("hello message", helloService.sayHello(name.getValue()));
//        return mv;
//    }
    
    public void setHelloService(HelloService helloService) {
        this.helloService = helloService;
    }
    
}
