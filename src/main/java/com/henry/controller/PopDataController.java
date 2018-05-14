package com.henry.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.henry.entity.PopData;
import com.henry.service.PopDataService;

@Controller
@RestController
@RequestMapping("/api")
public class PopDataController {
	private PopDataService popDataService;
	
	public PopDataController(PopDataService popDataService) {
		this.popDataService = popDataService;
	}
	
	@GetMapping("/all")
	@ResponseBody
	public Iterable<PopData> list() {
		return popDataService.getAllPopData();
	}
}
