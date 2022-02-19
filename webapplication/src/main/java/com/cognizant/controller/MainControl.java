package com.cognizant.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.cognizant.dao.ContentsDao;
import com.cognizant.dao.LearnerDao;
import com.cognizant.entity.Admin;
import com.cognizant.entity.Contents;
import com.cognizant.entity.Learner;

@Controller
public class MainControl {
	@Autowired
	Admin admin;
	
	@Autowired
	Contents contents;
	
	@Autowired
	ContentsDao contentsDao;
	
	@Autowired
	Learner learner;
	
	@Autowired
	LearnerDao learnerDao;
	
	String msg;
	
	/*This method is going to return About Us*/
	@RequestMapping("/")
	public ModelAndView mainHome(ModelAndView model) {
		List<Contents> contentsList = contentsDao.getAllContents();
		System.out.println(contentsList);
		model.addObject("contents", contentsList);
		//m.addAttribute("learners", learner);
		model.addObject("learners", learner);
		model.addObject("msg",msg);
		model.setViewName("index");
		return model;
	}
	
	@RequestMapping("/pdfView/{id}")
	public ModelAndView pdfView(@PathVariable int id, ModelAndView model) {
		Contents contents1 = contentsDao.getContentsById(id);
		model.addObject("contents", contents1);
		model.setViewName("pdfView");
		return model;
	}
	
	@RequestMapping("/validateLearner")
	public ModelAndView validateLearner(ModelAndView model,@ModelAttribute("learners") Learner learner, @RequestParam("emailId") String emailId,@RequestParam("password") String password, Model m, HttpSession session ) {
		Learner learner1 = learnerDao.validateLearner(emailId,password);
		if(learner1!=null) {
			msg = "Login Successfull";
			session.setAttribute("learner", learner.getEmailId());
			msg = "Hi! "+learner1.getName();
			System.out.println("Login Successful");
			List<Contents> contentsList = contentsDao.getAllContents();
			System.out.println(contentsList);
			model.addObject("contents", contentsList);
			//m.addAttribute("learners", learner);
			model.addObject("learners", learner);
			model.addObject("msg",msg);
			model.setViewName("index1");
			return model;
		}else {
			System.out.println("Login Failed");
			msg = "Login Failed";
		    model.setViewName("/");
		    return model;
		}
	}
	
	@RequestMapping("/registerLearner_")
	public String addLearner(@ModelAttribute("learner") Learner learner,@RequestParam("the") String the, @RequestParam("exp") String exp, @RequestParam("ast") String ast, @RequestParam("nuc") String nuc, @RequestParam("par") String par) {
		boolean b1=Boolean.parseBoolean(the);
		boolean b2=Boolean.parseBoolean(exp);
		boolean b3=Boolean.parseBoolean(ast);
		boolean b4=Boolean.parseBoolean(nuc);
		boolean b5=Boolean.parseBoolean(par);
		learner.setTheoritical(b1);
		learner.setExperimental(b2);
		learner.setAstronomical(b3);
		learner.setNuclear(b4);
		learner.setParticle(b5);
		System.out.println("learner"+learner);
		learnerDao.addLearner(learner);
		msg="register successfull";
		return "redirect:/";
	}
	
	@RequestMapping("learnerRegister")
	public String regLearner(Model m) {
		m.addAttribute("learner",learner);
		return "registerLearner";
	}

	
	
}
