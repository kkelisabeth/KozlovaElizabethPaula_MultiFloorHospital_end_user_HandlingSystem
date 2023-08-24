import java.util.*; 

public class PatientAdmission extends Patient{

	protected Date admissionDate;
	protected String reasonOfAdmission; 
	protected String preAdmissionInstructions;
	
	PatientAdmission(String name, int id, int age, String gender)
	{
		super(name, id, age, gender);
		admissionDate = new Date(2000, 01, 01); 
		reasonOfAdmission = "ReasonOfAdmission_Unknown"; 
		preAdmissionInstructions = "PreAdmissionInstructions_Unknown"; 
	}
	
	PatientAdmission(Date date, String name, int id, int age, String gender)
	{
		super(name, id, age, gender);
		admissionDate = date;
		reasonOfAdmission = "ReasonOfAdmission_Unknown"; 
		preAdmissionInstructions = "PreAdmissionInstructions_Unknown";
	}
	
	PatientAdmission(Date date, String reason, String instructions, String name, int id, int age, String gender)
	{
		super(name, id, age, gender);
		admissionDate = date;
		reasonOfAdmission = reason; 
		preAdmissionInstructions = instructions; 
	}

	public Date getDate() {
		return admissionDate;
	}
	
	public void setDate(Date date) {
		this.admissionDate = date;
	}
	
	public String getReasonOfAdmission() {
		return reasonOfAdmission;
	}
	
	public void setReasonOfAdmission(String reasonOfAdmission) {
		this.reasonOfAdmission = reasonOfAdmission;
	}
	
	public String getInstructions() {
		return preAdmissionInstructions;
	}
	
	public void setInstructions(String instructions) {
		this.preAdmissionInstructions = instructions;
	} 
	
}
