package com.crystianemeira.digitallibrary.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.crystianemeira.digitallibrary.model.Book;
import com.crystianemeira.digitallibrary.repository.Books;

@Controller
@RequestMapping("/books")
public class BookController {

	@Autowired
	private Books books;
	
	@GetMapping
	public String home() {
		return "RegisterBook";
	}
	
	@PostMapping
	public String save(Book book) {
		books.save(book);
		return "redirect:/books";
	}
}
