/**
 * 
 */
package com.godel.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.godel.domain.Calculate;

/**
 * @author Godel
 *
 */
@Controller
public class CalculateController {
	
	@RequestMapping(value="/",method=RequestMethod.GET)
	public String home()
	{
		
		
		System.out.print("inside home");
		return "hello";
	}
	
	@RequestMapping(value="/show",method=RequestMethod.GET)
	public String showAdd()
	{
		return "add";
	}
	
	@RequestMapping(value="/add",method=RequestMethod.POST)
	public ModelAndView Add(String first,String second,String result)
	{
		System.out.print(first);
		int a = Integer.parseInt(first);
		int b = Integer.parseInt(second);
		int res = a+b;
		result = String.valueOf(res);
        Map<String, Object> model = new HashMap<String, Object>();  
		model.put("first", first);
		model.put("second", second);
		model.put("result", result);
		
		return new ModelAndView("add",model);
	}
	
	@RequestMapping(value="/showSub",method=RequestMethod.GET)
	public String showSubtract()
	{
		return "subtract";
	}
	
	@RequestMapping(value="/sub",method=RequestMethod.POST)
	public ModelAndView Subtract(@ModelAttribute("calculate")Calculate calculate,BindingResult result)
	{
		
		int a = calculate.getFirst();
		int b = calculate.getSecond();
		int res = a-b;
		calculate.setResult(res);
        Map<String, Object> model = new HashMap<String, Object>();  
		model.put("calculate", calculate);
		
		
		return new ModelAndView("subtract",model);
	}
	
	@RequestMapping(value="/showMul",method=RequestMethod.GET)
	public String showMul()
	{
		return "mul";
	}
	
	@RequestMapping(value="/mul",method=RequestMethod.POST)
	public String Multiply(String first,String second,Map<String,Object> model)
	{
		System.out.print(first);
		int a = Integer.parseInt(first);
		int b = Integer.parseInt(second);
		int res = a*b;
		String result = String.valueOf(res);
		
		model.put("first", first);
		model.put("second", second);
		model.put("result", result);
       
		
		return  "mul";
	}
	
	
	/*@RequestMapping(value="/mul2",method=RequestMethod.POST)
	public String Multiply2(Map<String,Object> model)
	{
		if(model != null)
			System.out.print(model.size());
		String f = model.get("first").toString();
		String s = model.get("second").toString();
		int a = Integer.parseInt(f);
		int b = Integer.parseInt(s);
		int res = a*b;
		String result = String.valueOf(res);
		
		model.put("result", result);
       
		
		return  "mul";
	}*/
	
	
	

}
