package com.henry.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.henry.entity.PopData;
import com.henry.repository.PopDataRepository;

@Service
public class PopDataService {
	
	private PopDataRepository popDataRepository;
	
	public PopDataService(PopDataRepository popDataRepository) {
		this.popDataRepository = popDataRepository;
	}
	
	public Iterable<PopData> getAllPopData() {
		return popDataRepository.findAll();
	}
	
	// save method to take a single pop data
	public PopData save(PopData popData) {
		return popDataRepository.save(popData);
	}
	
	// save method to take multiple pop data
	public void save(List<PopData> popData) {
		popDataRepository.save(popData);
	}
}
