package com.laptrinhweb.view;

import java.util.List;
import java.util.Scanner;

import com.laptrinhweb.controller.BuildingController;
import com.laptrinhweb.model.input.BuildingSearchInput;
import com.laptrinhweb.model.output.BuildingSearchOutput;

public class BuildingListView {
	public static void main(String[] args) {
		// view input
		String name = null;
		String ward = null;
		String street = null;
		String district = null;
		Integer floararea = 123;
		
		// model
		BuildingSearchInput buildingSearchInput = new BuildingSearchInput();
		buildingSearchInput.setName(name);
		buildingSearchInput.setStreet(street);
		buildingSearchInput.setWard(ward);
		buildingSearchInput.setDistrict(district);
		buildingSearchInput.setFloararea(floararea);
			
		
		// controller 
		BuildingController buildingController = new BuildingController();
		List<BuildingSearchOutput> buildingSearchOutputs = buildingController.findBuilding(buildingSearchInput);
		
		// view output
		for(BuildingSearchOutput item : buildingSearchOutputs) {
			System.out.print("ID: " + item.getId());
			System.out.println(", name: " + item.getName());
			System.out.println(", address: " + item.getStreet());
			System.out.println(", type: " + item.getTpye());
		}
	
	}
}
