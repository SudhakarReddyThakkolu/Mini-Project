package com.cognizant.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.cognizant.dao.ContentsDao;
import com.cognizant.dao.CreatorDao;
import com.cognizant.entity.Admin;
import com.cognizant.entity.Contents;
import com.cognizant.entity.Creator;

@Controller
public class CreatorController {
	
	@Autowired
	Admin admin;
	
	@Autowired
	Creator creator;
	
	@Autowired
	CreatorDao creatorDao;
	
	@Autowired
	Contents contents;
	
	@Autowired
	ContentsDao contentsDao;
	
	String msg;
	
	@RequestMapping("CreatorRegister")
	public String CreatorRegistration(Model model) {
		model.addAttribute("creator", creator);
		return "RegisterCreator";
	}
	
	@RequestMapping("addCreator")
	public ModelAndView addCreator(@ModelAttribute("creator") Creator creator, ModelAndView mv, @RequestParam("pic") MultipartFile file)throws IOException{
		System.out.println("In Save Creator");
		byte[] creatorPic = file.getBytes();
		creator.setCreatorPic(creatorPic);
		creatorDao.addCreator(creator);
		mv.addObject("msg","Creator Added Successfully");
		mv.setViewName("RegisterCreator");
		return mv;
	}
	
	@RequestMapping("ViewAllCreator")
	public ModelAndView viewAllCreator(ModelAndView mv) {
		List<Creator> creatorList = creatorDao.getAllCreator();
		System.out.println(creatorList);
		mv.addObject("creators",creatorList);
		mv.addObject("msg",msg);
		mv.setViewName("viewCreators");
		return mv;
	}
	
	@RequestMapping("creator")
	public String creatorMode(Model model) {
		model.addAttribute("msg",msg);
		model.addAttribute("creator",creator);
		return "creatorMode";
	}
	
	@RequestMapping("validateCreator")
	public String validateCreator(@ModelAttribute("creator") Creator creator, Model mv, HttpSession session) {
        Creator creator1 = creatorDao.validateCreator(creator);
		
		if(creator1 != null) {
			msg = "Login Successfull";
			session.setAttribute("creator", creator.getEmailId());
			System.out.println("Login Successfull");
			return "CreatorHome";
		}else {
			System.out.println("Login Failed");
			msg = "Login Failed";
			return "redirect:/creator";
		}
	}
	
	@RequestMapping("addContents")
	public String addContents(Model model) {
		model.addAttribute("msg", msg);
		model.addAttribute("contents",contents);
		return "addContent";
	}
	
	@RequestMapping("addition")
	public ModelAndView addition(@ModelAttribute("contents") Contents contents, ModelAndView mv, @RequestParam("pic") MultipartFile file1, @RequestParam("source") MultipartFile file2, @RequestParam("the") String the, @RequestParam("exp") String exp, @RequestParam("ast") String ast, @RequestParam("nuc") String nuc, @RequestParam("par") String par)throws IOException{
		System.out.println("In Save Contents");
		byte[] contentPic = file1.getBytes();
		byte[] contentSource = file1.getBytes();
		contents.setThumbnail(contentPic);
		contents.setSourceFile(contentSource);
		boolean b1=Boolean.parseBoolean(the);
		boolean b2=Boolean.parseBoolean(exp);
		boolean b3=Boolean.parseBoolean(ast);
		boolean b4=Boolean.parseBoolean(nuc);
		boolean b5=Boolean.parseBoolean(par);
		contents.setTheoritical(b1);
		contents.setExperimental(b2);
		contents.setAstronomical(b3);
		contents.setNuclear(b4);
		contents.setParticle(b5);
		
		contentsDao.addContents(contents);
		mv.addObject("msg","Contents Added Successfully");
		mv.setViewName("addContent");
		return mv;
	}
	
	@RequestMapping("/showAllContents")
	public ModelAndView mainHome(ModelAndView model) {
		List<Contents> contentsList = contentsDao.getAllContents();
		System.out.println(contentsList);
		model.addObject("contents", contentsList);
		model.addObject("msg",msg);
		model.setViewName("viewAllContents");
		return model;
	}
	
	@RequestMapping("deleteCreator/{id}")
	public String deleteCreator(@PathVariable int id) {
		creatorDao.deleteCreator(id);
		return "redirect:/ViewAllCreator";
	}

}
