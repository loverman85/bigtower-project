package com.team4.project.hospital.hospitalizationOperation.domain;

public class HoHospitalization {

private String hoHospitalizationRequstCode;
private String hoTreatmentCode;
private String hoHospitalizationCode;
private String hoHospitalizationRequestCode;
private String hoHospitalizationStartDate;
private String hoHospitalizationEndDate;
private String hoPatientName;
private String hoGoSendstate;
private int hoHospitalizationStateCode;


public int getHoHospitalizationStateCode() {
	return hoHospitalizationStateCode;
}
public void setHoHospitalizationStateCode(int hoHospitalizationStateCode) {
	this.hoHospitalizationStateCode = hoHospitalizationStateCode;
}
public String getHoPatientName() {
	return hoPatientName;
}
public void setHoPatientName(String hoPatientName) {
	this.hoPatientName = hoPatientName;
}
public String getHoHospitalizationStartDate() {
	return hoHospitalizationStartDate;
}
public void setHoHospitalizationStartDate(String hoHospitalizationStartDate) {
	this.hoHospitalizationStartDate = hoHospitalizationStartDate;
}
public String getHoHospitalizationEndDate() {
	return hoHospitalizationEndDate;
}
public void setHoHospitalizationEndDate(String hoHospitalizationEndDate) {
	this.hoHospitalizationEndDate = hoHospitalizationEndDate;
}
public String getHoGoSendstate() {
	return hoGoSendstate;
}
public void setHoGoSendstate(String hoGoSendstate) {
	this.hoGoSendstate = hoGoSendstate;
}
public String getHoHospitalizationRequstCode() {
	return hoHospitalizationRequstCode;
}
public void setHoHospitalizationRequstCode(String hoHospitalizationRequstCode) {
	this.hoHospitalizationRequstCode = hoHospitalizationRequstCode;
}
public String getHoTreatmentCode() {
	return hoTreatmentCode;
}
public void setHoTreatmentCode(String hoTreatmentCode) {
	this.hoTreatmentCode = hoTreatmentCode;
}
public String getHoHospitalizationCode() {
	return hoHospitalizationCode;
}
public void setHoHospitalizationCode(String hoHospitalizationCode) {
	this.hoHospitalizationCode = hoHospitalizationCode;
}
public String getHoHospitalizationRequestCode() {
	return hoHospitalizationRequestCode;
}
public void setHoHospitalizationRequestCode(String hoHospitalizationRequestCode) {
	this.hoHospitalizationRequestCode = hoHospitalizationRequestCode;
}

@Override
public String toString() {
	return "HoHospitalization [hoHospitalizationRequstCode=" + hoHospitalizationRequstCode + ", hoTreatmentCode="
			+ hoTreatmentCode + ", hoHospitalizationCode=" + hoHospitalizationCode + ", hoHospitalizationRequestCode="
			+ hoHospitalizationRequestCode + ", hoHospitalizationStartDate=" + hoHospitalizationStartDate
			+ ", hoHospitalizationEndDate=" + hoHospitalizationEndDate + ", hoPatientName=" + hoPatientName
			+ ", hoGoSendstate=" + hoGoSendstate + "]";
}


}
