package com.zohocrm7.Services;

import java.util.List;

import com.zohocrm7.entities.Lead;

public interface LeadServices {
public void save(Lead lead);//abstraction is done here

public List<Lead> getAllLeads();

public Lead getbyId(int id);

public void deleteLead(int id);
}
