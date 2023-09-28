package com.laptrinhweb.controller;

import java.util.List;

import com.laptrinhweb.dao.entity.BuildingEntity;
import com.laptrinhweb.model.input.BuildingSearchInput;
import com.laptrinhweb.model.output.BuildingSearchOutput;
import com.laptrinhweb.service.BuildingService;

import com.laptrinhweb.service.impl.BuildingServiceImpl;

public class BuildingController {
	private BuildingService buildingService = new BuildingServiceImpl();
	
	public List<BuildingSearchOutput> findBuilding(BuildingSearchInput buildingSearchInput) {
		List<BuildingSearchOutput> results = buildingService.findBuilding(buildingSearchInput);
		
		return results;
	}
}
