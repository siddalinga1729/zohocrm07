package com.zohocrm7.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zohocrm7.Services.ContactServices;
import com.zohocrm7.Services.LeadServices;
import com.zohocrm7.entities.Contact;
import com.zohocrm7.entities.Lead;

@Controller
public class ContactController {
@Autowired
private LeadServices leadServices;
@Autowired
private ContactServices contactService;
	
	@RequestMapping("convert")
	public String convertLead(@RequestParam("id")int id,ModelMap model) {
		Lead lead = leadServices.getbyId(id);
		
		Contact contact=new Contact();
		contact.setFirstName(lead.getFirstName());
		contact.setLastName(lead.getLastName());
		contact.setEmail(lead.getEmail());
		contact.setLeadSource(lead.getLeadSource());
		contact.setMobile(lead.getMobile());
		contactService.save(contact);
		leadServices.deleteLead(id);
		List<Contact> contacts = contactService.getAllContacts();
		model.addAttribute("contacts", contacts);
		return "All_contacts";
	}
}
