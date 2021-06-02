package br.com.customwork.rest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/conta")
public class CustomController {

	@GetMapping
	public String custom() {
		return "exemplo";
	}
}