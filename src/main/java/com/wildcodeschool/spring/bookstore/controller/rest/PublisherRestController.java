package com.wildcodeschool.spring.bookstore.controller.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wildcodeschool.spring.bookstore.entity.Publisher;
import com.wildcodeschool.spring.bookstore.repository.PublisherRepository;

@RestController
public class PublisherRestController {

	@Autowired
	private PublisherRepository repo;

	@GetMapping("/rest/publishers/init")
	public List<Publisher> init() {

		for (int i = 0; i < 10; i++) {
			Publisher p = new Publisher();
			p.setName("Publisher" + i);
			repo.save(p);
		}
		return repo.findAll();

	}

	@GetMapping("/rest/publishers")
	public List<Publisher> getAll() {

		return repo.findAll();

	}

}
