package com.julie.mikaelson.test.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="ts_common_address")
public class Address {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id ;
	private int provenceId ;
	private int cityId ;
	private int districtId ;
	private String fullAddress ;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public int getProvenceId() {
		return provenceId;
	}
	public void setProvenceId(int provenceId) {
		this.provenceId = provenceId;
	}
	public int getCityId() {
		return cityId;
	}
	public void setCityId(int cityId) {
		this.cityId = cityId;
	}
	public int getDistrictId() {
		return districtId;
	}
	public void setDistrictId(int districtId) {
		this.districtId = districtId;
	}
	public String getFullAddress() {
		return fullAddress;
	}
	public void setFullAddress(String fullAddress) {
		this.fullAddress = fullAddress;
	}
	@Override
	public String toString() {
		return "Address [id=" + id + ", provenceId=" + provenceId + ", cityId="
				+ cityId + ", districtId=" + districtId + ", fullAddress="
				+ fullAddress + "]";
	}
	
	
	

}
