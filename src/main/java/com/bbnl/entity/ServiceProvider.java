package com.bbnl.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="service_provider")
public class ServiceProvider {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "sp_id")
	private Long spId;

	@Column(name = "sp_name", length = 250)
	private String spName;

	@Column(name = "service_type")
	private int serviceType;

	@Column(name = "authorized_signatory", length = 250)
	private String authorizedSignatory;

	@Column(name = "signatory_aadhar_no", length = 12)
	private String signatoryAadharNo;

	@Column(name = "pan", length = 10)
	private String pan;

	@Column(name = "license_no", length = 100)
	private String licenseNo;

	@Column(name = "tan", length = 10)
	private String tan;

	@Column(name = "gst", length = 15)
	private String gst;

	@Column(name = "is_required")
	private boolean isRequired;

	@Column(name = "service_state")
	private int serviceState;

	@Column(name = "service_district")
	private int serviceDistrict;

	@Column(name = "service_block")
	private int serviceBlock;

	@Column(name = "address_line1", length = 250)
	private String addressLine1;

	@Column(name = "address_line2", length = 250)
	private String address_line2;

	@Column(name = "state")
	private int state;

	@Column(name = "district")
	private int district;

	@Column(name = "email_id", length = 100)
	private String emailId;

	@Column(name = "mobile_no", length = 10)
	private String mobileNo;

	public ServiceProvider() {
		super();
	}

	public ServiceProvider(String spName, int serviceType, String authorizedSignatory, String signatoryAadharNo,
			String pan, String licenseNo, String tan, String gst, boolean isRequired, int serviceState,
			int serviceDistrict, int serviceBlock, String addressLine1, String address_line2, int state, int district,
			String emailId, String mobileNo) {
		super();
		this.spName = spName;
		this.serviceType = serviceType;
		this.authorizedSignatory = authorizedSignatory;
		this.signatoryAadharNo = signatoryAadharNo;
		this.pan = pan;
		this.licenseNo = licenseNo;
		this.tan = tan;
		this.gst = gst;
		this.isRequired = isRequired;
		this.serviceState = serviceState;
		this.serviceDistrict = serviceDistrict;
		this.serviceBlock = serviceBlock;
		this.addressLine1 = addressLine1;
		this.address_line2 = address_line2;
		this.state = state;
		this.district = district;
		this.emailId = emailId;
		this.mobileNo = mobileNo;
	}

	public String getSpName() {
		return spName;
	}

	public void setSpName(String spName) {
		this.spName = spName;
	}

	public int getServiceType() {
		return serviceType;
	}

	public void setServiceType(int serviceType) {
		this.serviceType = serviceType;
	}

	public String getAuthorizedSignatory() {
		return authorizedSignatory;
	}

	public void setAuthorizedSignatory(String authorizedSignatory) {
		this.authorizedSignatory = authorizedSignatory;
	}

	public String getSignatoryAadharNo() {
		return signatoryAadharNo;
	}

	public void setSignatoryAadharNo(String signatoryAadharNo) {
		this.signatoryAadharNo = signatoryAadharNo;
	}

	public String getPan() {
		return pan;
	}

	public void setPan(String pan) {
		this.pan = pan;
	}

	public String getLicenseNo() {
		return licenseNo;
	}

	public void setLicenseNo(String licenseNo) {
		this.licenseNo = licenseNo;
	}

	public String getTan() {
		return tan;
	}

	public void setTan(String tan) {
		this.tan = tan;
	}

	public String getGst() {
		return gst;
	}

	public void setGst(String gst) {
		this.gst = gst;
	}

	public boolean isRequired() {
		return isRequired;
	}

	public void setRequired(boolean isRequired) {
		this.isRequired = isRequired;
	}

	public int getServiceState() {
		return serviceState;
	}

	public void setServiceState(int serviceState) {
		this.serviceState = serviceState;
	}

	public int getServiceDistrict() {
		return serviceDistrict;
	}

	public void setServiceDistrict(int serviceDistrict) {
		this.serviceDistrict = serviceDistrict;
	}

	public int getServiceBlock() {
		return serviceBlock;
	}

	public void setServiceBlock(int serviceBlock) {
		this.serviceBlock = serviceBlock;
	}

	public String getAddressLine1() {
		return addressLine1;
	}

	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	public String getAddress_line2() {
		return address_line2;
	}

	public void setAddress_line2(String address_line2) {
		this.address_line2 = address_line2;
	}

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}

	public int getDistrict() {
		return district;
	}

	public void setDistrict(int district) {
		this.district = district;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	@Override
	public String toString() {
		return "ServiceProvider [spId=" + spId + ", spName=" + spName + ", serviceType=" + serviceType
				+ ", authorizedSignatory=" + authorizedSignatory + ", signatoryAadharNo=" + signatoryAadharNo + ", pan="
				+ pan + ", licenseNo=" + licenseNo + ", tan=" + tan + ", gst=" + gst + ", isRequired=" + isRequired
				+ ", serviceState=" + serviceState + ", serviceDistrict=" + serviceDistrict + ", serviceBlock="
				+ serviceBlock + ", addressLine1=" + addressLine1 + ", address_line2=" + address_line2 + ", state="
				+ state + ", district=" + district + ", emailId=" + emailId + ", mobileNo=" + mobileNo + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((addressLine1 == null) ? 0 : addressLine1.hashCode());
		result = prime * result + ((address_line2 == null) ? 0 : address_line2.hashCode());
		result = prime * result + ((authorizedSignatory == null) ? 0 : authorizedSignatory.hashCode());
		result = prime * result + district;
		result = prime * result + ((emailId == null) ? 0 : emailId.hashCode());
		result = prime * result + ((gst == null) ? 0 : gst.hashCode());
		result = prime * result + (isRequired ? 1231 : 1237);
		result = prime * result + ((licenseNo == null) ? 0 : licenseNo.hashCode());
		result = prime * result + ((mobileNo == null) ? 0 : mobileNo.hashCode());
		result = prime * result + ((pan == null) ? 0 : pan.hashCode());
		result = prime * result + serviceBlock;
		result = prime * result + serviceDistrict;
		result = prime * result + serviceState;
		result = prime * result + serviceType;
		result = prime * result + ((signatoryAadharNo == null) ? 0 : signatoryAadharNo.hashCode());
		result = prime * result + ((spName == null) ? 0 : spName.hashCode());
		result = prime * result + state;
		result = prime * result + ((tan == null) ? 0 : tan.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ServiceProvider other = (ServiceProvider) obj;
		if (addressLine1 == null) {
			if (other.addressLine1 != null)
				return false;
		} else if (!addressLine1.equals(other.addressLine1))
			return false;
		if (address_line2 == null) {
			if (other.address_line2 != null)
				return false;
		} else if (!address_line2.equals(other.address_line2))
			return false;
		if (authorizedSignatory == null) {
			if (other.authorizedSignatory != null)
				return false;
		} else if (!authorizedSignatory.equals(other.authorizedSignatory))
			return false;
		if (district != other.district)
			return false;
		if (emailId == null) {
			if (other.emailId != null)
				return false;
		} else if (!emailId.equals(other.emailId))
			return false;
		if (gst == null) {
			if (other.gst != null)
				return false;
		} else if (!gst.equals(other.gst))
			return false;
		if (isRequired != other.isRequired)
			return false;
		if (licenseNo == null) {
			if (other.licenseNo != null)
				return false;
		} else if (!licenseNo.equals(other.licenseNo))
			return false;
		if (mobileNo == null) {
			if (other.mobileNo != null)
				return false;
		} else if (!mobileNo.equals(other.mobileNo))
			return false;
		if (pan == null) {
			if (other.pan != null)
				return false;
		} else if (!pan.equals(other.pan))
			return false;
		if (serviceBlock != other.serviceBlock)
			return false;
		if (serviceDistrict != other.serviceDistrict)
			return false;
		if (serviceState != other.serviceState)
			return false;
		if (serviceType != other.serviceType)
			return false;
		if (signatoryAadharNo == null) {
			if (other.signatoryAadharNo != null)
				return false;
		} else if (!signatoryAadharNo.equals(other.signatoryAadharNo))
			return false;
		if (spName == null) {
			if (other.spName != null)
				return false;
		} else if (!spName.equals(other.spName))
			return false;
		if (state != other.state)
			return false;
		if (tan == null) {
			if (other.tan != null)
				return false;
		} else if (!tan.equals(other.tan))
			return false;
		return true;
	}

}
