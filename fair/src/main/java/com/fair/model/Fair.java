package com.fair.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="price")
public class Fair {

	@Id
	String id;
	String flightNumber;
	String flightDate;
	String fair;
	

	
	
     public Fair(String id, String flightNumber, String flightDate, String fair) {
		super();
		this.id = id;
		this.flightNumber = flightNumber;
		this.flightDate = flightDate;
		this.fair = fair;
	}
     
     
     
     

	public String getId() {
		return id;
	}





	public void setId(String id) {
		this.id = id;
	}





	public String getFlightNumber() {
		return flightNumber;
	}





	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}





	public String getFlightDate() {
		return flightDate;
	}





	public void setFlightDate(String flightDate) {
		this.flightDate = flightDate;
	}





	public String getFair() {
		return fair;
	}





	public void setFair(String fair) {
		this.fair = fair;
	}





	public Fair() {
		
	}


	@Override
	public String toString() {
		return "Fair [" + id + ", " + flightNumber + ", " + flightDate + ", " + fair+ "]";
	}
	
	
	
}


