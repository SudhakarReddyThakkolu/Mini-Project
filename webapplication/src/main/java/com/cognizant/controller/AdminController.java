package com.cognizant.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.cognizant.dao.AdminDao;
import com.cognizant.dao.ContentsDao;
import com.cognizant.entity.Admin;
import com.cognizant.entity.Contents;

@Controller
public class AdminController {
	
	@Autowired 
	Admin admin;
	
	@Autowired 
	AdminDao adminDao;
	
	@Autowired
	Contents contents;
	
	@Autowired
	ContentsDao contentsDao;

	
	String msg;
	
	@RequestMapping("/admin")
	public String adminMode(Model model) {
		model.addAttribute("admin", admin);
		model.addAttribute("msg", msg);
		return "adminMode";
	}
	
	
	@RequestMapping("validate")
	public String validateAdmin(@ModelAttribute("admin") Admin admin, Model mv, HttpSession session) {
		Admin admin1 = adminDao.validateAdmin(admin);
		
		if(admin1 != null) {
			msg = "Login Successfull";
			session.setAttribute("admin", admin.getEmailId());
			System.out.println("Login Successful");
			return "AdminHome";
		}else {
			System.out.println("Login Failed");
			msg = "Login Failed";
			return "redirect:/admin";
		}
		
	}
	
	@RequestMapping("/RegisterAdmin")
	public String registerAdmin(Model model) {
		model.addAttribute("admin", admin);
		model.addAttribute("msg", msg);
		return "RegisterAdmin";
	}
	
	@RequestMapping("/addAdmin")
	public String addAdmin(@ModelAttribute("admin") Admin admin) {
		adminDao.addAdmin(admin);
		return "AdminHome"; 
	}
	
	@RequestMapping("/adminhome")
	public String adminhome() {
		return "AdminHome";
	}
	
	
	@RequestMapping("deleteContents/{id}")
	public String deleteUser(@PathVariable int id) {
		contentsDao.deleteContents(id);
		return "redirect:/showAllContents";
	}

}
