package com.example.demo;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
@ApiModel(description="Details about the contact")
public class Contact {
	@ApiModelProperty(notes="the unique id of the contact")
	String id;
	@ApiModelProperty(notes = "the person's name")
	String name;
	@ApiModelProperty(notes="the person's phone number")
	String phone;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	

}
