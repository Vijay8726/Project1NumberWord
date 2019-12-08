package com.virtusa.numbertoword.controller;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.virtusa.numbertoword.model.UserNumber;
import com.virtusa.numbertoword.service.ConvertServiceIface;


/**
 * @author vijay
 *
 */
@Controller
public class ConvertController {

	@Autowired
	ConvertServiceIface convertServiceIface;
	
	/**
	 * @return
	 */
	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String home() {
		return "index";
	}
	/**
	 * @param number
	 * @param model
	 * @return
	 */
	@RequestMapping(value="/getValue", method= RequestMethod.GET)
	public ModelAndView getValue(@RequestParam String number,Model model) {
		UserNumber userNumber=new UserNumber();
		model.addAttribute("userNumber",userNumber);
		userNumber.setNumber(number);
		String inWord= convertServiceIface.convertService(userNumber);
		return new ModelAndView("index","Words",inWord);
	}
}
