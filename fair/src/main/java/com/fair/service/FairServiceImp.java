package com.fair.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fair.model.Fair;
import com.fair.repositary.FairRepo;

@Service
public class FairServiceImp implements FairService {
	@Autowired
	private FairRepo repository;

	@Override
	public Fair save(Fair fair) {
		Fair e= repository.save(fair);
		return e;
	}

	@Override
	public List<Fair> getAll() {
		
		return repository.findAll();
	}

	@Override
	public Optional<Fair> getFairById(String id) {
		
		return repository.findById(id);
	}

	@Override
	public String deleteFairById(String id) {
		repository.deleteById(id);
		return "deleted id:"+id;
	}

	@Override
	public String updateFair(Fair fair, String id) {
		repository.findById(id);
		repository.save(fair);
		return "updated fair"+id;
	}
}
