
public class MedicalRecord extends Patient{

	protected String medicalHistory; 
	protected String currentConditions; 
	protected String examinationsDone;
	
	MedicalRecord(String name, int id, int age, String gender)
	{
		super(name, id, age, gender);
		medicalHistory = "MedicalHistory_Unknown"; 
		currentConditions = "CurrentConditions_Unknown"; 
		examinationsDone = "ExaminationsDone_Unknown"; 
	}
	
	MedicalRecord(String name, int id, int age, String gender, String medHistory)
	{
		super(name, id, age, gender);
		medicalHistory = medHistory; 
		currentConditions = "CurrentConditions_Unknown"; 
		examinationsDone = "ExaminationsDone_Unknown"; 
	}
	
	MedicalRecord(String name, int id, int age, String gender, String medHistory, String condition, String examinations)
	{
		super(name, id, age, gender);
		medicalHistory = medHistory; 
		currentConditions = condition; 
		examinationsDone = examinations; 
	}

	
	public String getMedicalHistory() {
		return medicalHistory;
	}
	
	public void setMedicalHistory(String medicalHistory) {
		this.medicalHistory = medicalHistory;
	}
	
	public String getCurrentConditions() {
		return currentConditions;
	}
	
	public void setCurrentConditions(String currentConditions) {
		this.currentConditions = currentConditions;
	}
	
	public String getExaminationsDone() {
		return examinationsDone;
	}
	
	public void setExaminationsDone(String examinationsDone) {
		this.examinationsDone = examinationsDone;
	} 
	
	
}
