package com.laptrinhweb.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.laptrinhweb.constant.SystemConstant;
import com.laptrinhweb.dao.BuildingDAO;
import com.laptrinhweb.dao.entity.BuildingEntity;
import com.laptrinhweb.dao.impl.BuildingDaoImpl;
import com.laptrinhweb.model.input.BuildingSearchInput;
import com.laptrinhweb.model.output.BuildingSearchOutput;
import com.laptrinhweb.service.BuildingService;




public class BuildingServiceImpl implements BuildingService{

	private BuildingDAO buildingDao = new BuildingDaoImpl();
	
	@Override
	public List<BuildingSearchOutput> findBuilding(BuildingSearchInput buildingSearchFilterInput) {
		List<BuildingSearchOutput> results = new ArrayList<>();
		List<BuildingEntity> buildingCkiuVks = buildingDao.findBuiling(
											buildingSearchFilterInput.getName(),
											buildingSearchFilterInput.getStreet(), 
											buildingSearchFilterInput.getWard(), 
											buildingSearchFilterInput.getDistrict(), 
											buildingSearchFilterInput.getFloararea(),
											buildingSearchFilterInput.getType()); // "building"
		
		// for each
		for(BuildingEntity item : buildingCkiuVks) {
			BuildingSearchOutput buildingSearchFilterOutput = new BuildingSearchOutput();
			buildingSearchFilterOutput.setId(item.getId());
			buildingSearchFilterOutput.setName(item.getName());
			buildingSearchFilterOutput.setStreet(item.getStreet() + " - " + item.getWard() + " - " + item.getDistrict() + " - " + item.getFloaInteger());
			String[] tachchuoi = item.getType().split(", ");
			StringBuilder typeBuilder = new StringBuilder(); 

			for (int i = 0; i < tachchuoi.length; i++) {
			    if (tachchuoi[i].equals(SystemConstant.NGUYEN_CAN)) {
			        tachchuoi[i] = "nguyen can";
			    }
			    if (tachchuoi[i].equals(SystemConstant.NOI_THAT)) {
			        tachchuoi[i] = "noi that";
			    }
			    if (tachchuoi[i].equals(SystemConstant.TANG_TRET)) {
			        tachchuoi[i] = "tang tret";
			    }
			    typeBuilder.append(tachchuoi[i]); 
			    if (i < tachchuoi.length - 1) {
			        typeBuilder.append(", "); 
			    }
			}

			buildingSearchFilterOutput.setTpye(typeBuilder.toString()); 
			results.add(buildingSearchFilterOutput);
		}
		
		
		return results;
	}

}
