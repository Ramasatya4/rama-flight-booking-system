package com.fair.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fair.model.Fair;
import com.fair.service.FairServiceImp;


@RestController

public class FairController {
	@Autowired
	FairServiceImp fairserviceimp;
	
	

	@PostMapping("/addfair")
	public String saveFair(@RequestBody Fair fair ) {
	     fairserviceimp.save(fair);
		return " added a fair" +fair.getFair();
		
	}
	@GetMapping("/findallfairs")
	public List<Fair>getFair(){
		return fairserviceimp.getAll();
		
		
	}
	@GetMapping("/findallfairs/{id}")
	public Optional<Fair> getFair(@PathVariable String id ){
		return fairserviceimp.getFairById(id);
	
	}
	@GetMapping("/delete/{id}")
	public String deleteFlight(@PathVariable String id) {
		fairserviceimp.deleteFairById(id);
		return "fair delete with id:" + id;
		
		
	}
	@PutMapping("/update/{id}")
	public String updateFair(@RequestBody Fair fair , @PathVariable String id) {
		fairserviceimp.updateFair(fair, id);
		return"updated checkin:" +id;
	}
	
	


}
