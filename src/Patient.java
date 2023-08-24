
public class Patient {

	protected String patientName; 
	protected int patientID;
	protected int patientAge;
	protected String patientGender; 
	
	Patient()
	{
		patientName = "PatientName_Unknown"; 
		patientID = 0000; 
		patientAge = 0; 
		patientGender = "PatientGender_Unknown"; 
	}

	Patient(String name, int id)
	{
		patientName = name; 
		patientID = id; 
		patientAge = 0; 
		patientGender = "PatientGender_Unknown";  
	}

	Patient(String name, int id, int age, String gender)
	{
		patientName = name; 
		patientID = id; 
		patientAge = age; 
		patientGender = gender; 
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public int getPatientID() {
		return patientID;
	}

	public void setPatientID(int patientID) {
		this.patientID = patientID;
	}

	public int getPatientAge() {
		return patientAge;
	}

	public void setPatientAge(int patientAge) {
		this.patientAge = patientAge;
	}

	public String getPatientGender() {
		return patientGender;
	}

	public void setPatientGender(String patientGender) {
		this.patientGender = patientGender;
	}
	
	
}
