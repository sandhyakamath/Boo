/**
 * 
 */
package com.godel.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.godel.DAO.ContactGroupDAO;
import com.godel.domain.ContactGroup;
import com.godel.DAO.ContactGroupDAOImpl;


/**
 * @author Godel
 *
 */

@Controller
public class ContactGroupController {
	
	private  ArrayList<ContactGroup> grpList = new ArrayList<ContactGroup>();
	private int id = 0 ;
	
	
	@RequestMapping(value="/contactGrp/add",method=RequestMethod.GET)
	public String showContactGroup()
	{
		System.out.print("Inside Add");

		return "contactGroup";
	}
	
	@RequestMapping(value="/contactGrp/add",method=RequestMethod.POST)
	public String AddContactGrp(@ModelAttribute("contactGrp") ContactGroup contactGrp,Map<String,Object> model)
	{
		System.out.print("Inside Add");

		if(contactGrp != null)
		{
			//contactGrp.setGrpId(++id);
			//grpList.add(contactGrp);
			ContactGroupDAO contactGroupDAO = new ContactGroupDAOImpl();
			contactGroupDAO.addContactGrp(contactGrp);
		}
		
		return "redirect:/contactGrp/edit/"+id;
	}
	
	@RequestMapping("/contactGrp/list")
	public String ListContactGrp(Map<String,Object> model)
	{
		
		model.put("grpList",grpList);
		
		return "listContactGroup";
	}
	
	@RequestMapping("/contactGrp/delete/{id}")
	public String DeleteContactGrp(@PathVariable("id") int grpId)
	{
		System.out.println("------------ "+grpId);
		try{
			int i = 0;
			for(ContactGroup grp:grpList)
			{
				System.out.println("------------ "+grp.getGrpId());
				if(grpId == grp.getGrpId())
				{
					System.out.println("------------ "+grpId);
					grpList.remove(i);
					break;
				}
				i++;
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		
		return "redirect:/contactGrp/list";
	}
	
	@RequestMapping("/contactGrp/update")
	public String UpdateContactGrp(@ModelAttribute("contactGrp") ContactGroup contactGrp,Map<String,Object> model)
	{
		System.out.println("Inside update");

		if(contactGrp != null)
		{
			int grpId = contactGrp.getGrpId();
			System.out.println("------------ "+grpId);

			try{
				int i = 0;
				for(ContactGroup grp:grpList)
				{
					System.out.println("------------ "+grp.getGrpId());
					if(grpId == grp.getGrpId())
					{
						System.out.println("------------ "+grpId);
						grpList.remove(i);
						grpList.add(contactGrp);
						break;
					}
					i++;
				}
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
		
		return "redirect:/contactGrp/list";
	}
	
	@RequestMapping("/contactGrp/edit/{id}")
	public ModelAndView GetContactGrp(@PathVariable("id") int grpId)
	{
		System.out.println("Inside Edit------------ "+grpId);
		Map<String,Object> map = new HashMap<String,Object>();
		ContactGroup temp = null;
		try{
			
			for(ContactGroup contactGrp:grpList)
			{
				System.out.println("------------ "+contactGrp.getGrpId());
				if(grpId == contactGrp.getGrpId())
				{
					System.out.println("------------ "+contactGrp.getGrpName());
					temp = contactGrp;
					map.put("contactGrp",contactGrp);
					map.put("grpList",grpList);

					break;
				}
				
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		System.out.println(map.size());
		return new ModelAndView("editContactGroup",map);
	}
}
