/**
 * 
 */
package com.godel.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author Godel
 *
 */
@Controller
public class ContactController {
	
	@RequestMapping(value="/contact/add",method=RequestMethod.GET)
	public String showContactGroup()
	{
		System.out.print("Inside Add");
		
		return "contact";
	}

}
