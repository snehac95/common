package com.xworkz.commonModules.controller;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.commonModules.dto.CommonModulesDTO;
import com.xworkz.commonModules.service.CommonModulesService;

@Controller
@RequestMapping("/")

public class CommonModulesController {
	@Autowired
	private CommonModulesService  commonModulesService;
	

	public CommonModulesController() {
		System.out.println("Created \t " + this.getClass().getSimpleName());
	}

	@RequestMapping("/Submit.do")
	public String onSave(CommonModulesDTO awardDTO,ModelMap map) {
		try {
			System.out.println("invoked onSubmit");
			boolean check = this. commonModulesService.validateAndSave(awardDTO);
			if (check) {
				map.addAttribute("home.jsp", "Data saved");
			} else {
				map.addAttribute("Signup.jsp", "Data not saved");
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "/Signin.jsp";

	}

}





