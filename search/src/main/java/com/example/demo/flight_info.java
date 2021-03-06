package com.example.demo;

import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="flight-info")
public class flight_info {
	@Indexed(unique=true)
	String fid;
String name,route,date;

public String getFid() {
	return fid;
}

public void setFid(String fid) {
	this.fid = fid;
}

public flight_info(String name, String route, String date, String fid) {
	super();
	this.name = name;
	this.route = route;
	this.date = date;
	this.fid = fid;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getRoute() {
	return route;
}

public void setRoute(String route) {
	this.route = route;
}

public String getDate() {
	return date;
}

public void setDate(String date) {
	this.date = date;
}

public flight_info() {
	// TODO Auto-generated constructor stub
}
public String sorry() {
	return "unable to find the flight on given route";
}
}
