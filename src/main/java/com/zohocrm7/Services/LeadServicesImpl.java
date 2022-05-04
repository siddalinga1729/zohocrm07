package com.zohocrm7.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zohocrm7.Repositories.LeadRepository;
import com.zohocrm7.entities.Lead;

@Service
public class LeadServicesImpl implements LeadServices {
	@Autowired
	private LeadRepository leadRepo;

	@Override
	public void save(Lead lead) {
		leadRepo.save(lead);
	}

	@Override
	public List<Lead> getAllLeads() {
		List<Lead> leads = leadRepo.findAll();
		return leads;
	}

	@Override
	public Lead getbyId(int id) {
		Optional<Lead> findById = leadRepo.findById(id);
		Lead lead = findById.get();
		return lead;
	}

	@Override
	public void deleteLead(int id) {
		leadRepo.deleteById(id);
	}

}
