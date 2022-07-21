package com.bbnl.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "demand")
public class Demand {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "demand_id", nullable = false)
	private Integer demandId;
	@Column(name = "demand_type")
	private Integer demandType;
	@Column(name = "state_id")
	private Integer stateId;
	@Column(name = "district_id")
	private Integer districtId;
	@Column(name = "block_id")
	private Integer blockId;
	@Column(name = "gp_id")
	private Integer gpId;
	@Column(name = "status")
	private Integer status;
	@Column(name = "demand_user_id")
	private String demandUserId;
	@Column(name = "demand_date")
	private Date demandDate;
	
	public Demand() {
		super();
	}
	
	public Demand(Integer demandId, Integer demandType, Integer stateId, Integer districtId, Integer blockId,
			Integer gpId, Integer status, String demandUserId, Date demandDate) {
		super();
		this.demandId = demandId;
		this.demandType = demandType;
		this.stateId = stateId;
		this.districtId = districtId;
		this.blockId = blockId;
		this.gpId = gpId;
		this.status = status;
		this.demandUserId = demandUserId;
		this.demandDate = demandDate;
	}



	public Integer getDemandId() {
		return demandId;
	}
	public void setDemandId(Integer demandId) {
		this.demandId = demandId;
	}
	public Integer getDemandType() {
		return demandType;
	}
	public void setDemandType(Integer demandType) {
		this.demandType = demandType;
	}
	public Integer getStateId() {
		return stateId;
	}
	public void setStateId(Integer stateId) {
		this.stateId = stateId;
	}
	public Integer getDistrictId() {
		return districtId;
	}
	public void setDistrictId(Integer districtId) {
		this.districtId = districtId;
	}
	public Integer getBlockId() {
		return blockId;
	}
	public void setBlockId(Integer blockId) {
		this.blockId = blockId;
	}
	public Integer getGpId() {
		return gpId;
	}
	public void setGpId(Integer gpId) {
		this.gpId = gpId;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public String getDemandUserId() {
		return demandUserId;
	}
	public void setDemandUserId(String demandUserId) {
		this.demandUserId = demandUserId;
	}
	public Date getDemandDate() {
		return demandDate;
	}
	public void setDemandDate(Date demandDate) {
		this.demandDate = demandDate;
	}
}
