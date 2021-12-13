package com.fair.service;

import java.util.List;
import java.util.Optional;

import com.fair.model.Fair;

public interface FairService {

	public Fair save( Fair fair);
	public List<Fair> getAll();
	public Optional<Fair> getFairById( String id);
	public String deleteFairById( String id);
	public String updateFair( Fair fair,  String id);
	
	
}



