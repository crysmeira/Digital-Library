package com.crystianemeira.digitallibrary.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BookController {

	@GetMapping("/books")
	public String home() {
		return "RegisterBook";
	}
}
