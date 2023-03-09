package com.tibil.BecknBAP.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BppRequestController {

	@PostMapping(path = "/search")
	public String search() {
		return "Success";
		
	}
}
