package com.vinita.survey.models;


public class Survey {
	private String name;
	private String language;
	private String location;
	private String comment;
	public Survey(String name, String language, String location, String comment) {
		
		this.name = name;
		this.language = language;
		this.location = location;
		this.comment = comment;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	
	
	

}


