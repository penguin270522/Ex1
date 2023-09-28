package com.laptrinhweb.model.input;

public class BuildingSearchInput {
	private String name;
	private String street;
	private String ward;
	private String district;
	private Integer floararea;
	private String type;
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getWard() {
		return ward;
	}

	public void setWard(String ward) {
		this.ward = ward;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public Integer getFloararea() {
		return floararea;
	}

	public void setFloararea(Integer floararea) {
		this.floararea = floararea;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
