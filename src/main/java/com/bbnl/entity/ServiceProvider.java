package com.bbnl.entity;

import java.util.Objects;

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
	private String addressLine2;

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

	public ServiceProvider(Long spId, String spName, int serviceType, String authorizedSignatory,
			String signatoryAadharNo, String pan, String licenseNo, String tan, String gst, boolean isRequired,
			int serviceState, int serviceDistrict, int serviceBlock, String addressLine1, String addressLine2,
			int state, int district, String emailId, String mobileNo) {
		super();
		this.spId = spId;
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
		this.addressLine2 = addressLine2;
		this.state = state;
		this.district = district;
		this.emailId = emailId;
		this.mobileNo = mobileNo;
	}

	public Long getSpId() {
		return spId;
	}

	public void setSpId(Long spId) {
		this.spId = spId;
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

	public String getAddressLine2() {
		return addressLine2;
	}

	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
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
	public int hashCode() {
		return Objects.hash(addressLine1, addressLine2, authorizedSignatory, district, emailId, gst, isRequired,
				licenseNo, mobileNo, pan, serviceBlock, serviceDistrict, serviceState, serviceType, signatoryAadharNo,
				spId, spName, state, tan);
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
		return Objects.equals(addressLine1, other.addressLine1) && Objects.equals(addressLine2, other.addressLine2)
				&& Objects.equals(authorizedSignatory, other.authorizedSignatory) && district == other.district
				&& Objects.equals(emailId, other.emailId) && Objects.equals(gst, other.gst)
				&& isRequired == other.isRequired && Objects.equals(licenseNo, other.licenseNo)
				&& Objects.equals(mobileNo, other.mobileNo) && Objects.equals(pan, other.pan)
				&& serviceBlock == other.serviceBlock && serviceDistrict == other.serviceDistrict
				&& serviceState == other.serviceState && serviceType == other.serviceType
				&& Objects.equals(signatoryAadharNo, other.signatoryAadharNo) && Objects.equals(spId, other.spId)
				&& Objects.equals(spName, other.spName) && state == other.state && Objects.equals(tan, other.tan);
	}

	@Override
	public String toString() {
		return "ServiceProvider [spId=" + spId + ", spName=" + spName + ", serviceType=" + serviceType
				+ ", authorizedSignatory=" + authorizedSignatory + ", signatoryAadharNo=" + signatoryAadharNo + ", pan="
				+ pan + ", licenseNo=" + licenseNo + ", tan=" + tan + ", gst=" + gst + ", isRequired=" + isRequired
				+ ", serviceState=" + serviceState + ", serviceDistrict=" + serviceDistrict + ", serviceBlock="
				+ serviceBlock + ", addressLine1=" + addressLine1 + ", addressLine2=" + addressLine2 + ", state="
				+ state + ", district=" + district + ", emailId=" + emailId + ", mobileNo=" + mobileNo + "]";
	}

	

}
