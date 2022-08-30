package com.example.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;


@RestController
@RequestMapping("/api")
public class AddressbookResource {
	
	
	ConcurrentHashMap<String, Contact> contacts = new ConcurrentHashMap<>();
	@GetMapping("/{id}")
	@ApiOperation(value = "finds contacs by id",
	notes = "provide an id to look up specific contac from the address book",
	response = Contact.class)
	public Contact getContact(@ApiParam(value = "ID value for the contact you need to retrieve", required = true)
	                          @PathVariable String id) {
		return contacts.get(id);
	}
	
	@GetMapping("/")
	public List<Contact> getAllContact(){
		return new ArrayList<Contact>(contacts.values());
		
	}
	
	@PostMapping("/")
	public Contact addContact(@RequestBody Contact contact) {
		contacts.put(contact.getId(),contact);
		return contact;
		
	}

}
