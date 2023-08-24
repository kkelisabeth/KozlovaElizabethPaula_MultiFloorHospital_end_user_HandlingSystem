
public class PatientMonitoring extends Patient{

	protected String medicationPlan;
	protected String treatmentPlan;
	
	PatientMonitoring(String name, int id, int age, String gender)
	{
		super(name, id, age, gender);
		medicationPlan = "MedicationPlan_Unknown"; 
		treatmentPlan = "TreatmentPlan_Unknown"; 
	}
	
	PatientMonitoring(String name, int id, int age, String gender, String medPlan)
	{
		super(name, id, age, gender);
		medicationPlan = medPlan; 
		treatmentPlan = "TreatmentPlan_Unknown"; 
	}
	
	PatientMonitoring(String name, int id, int age, String gender, String medPlan, String treatPlan)
	{
		super(name, id, age, gender);
		medicationPlan = medPlan; 
		treatmentPlan = treatPlan; 
	}
	
	public String getMedicationPlan() {
		return medicationPlan;
	}
	
	public void setMedicationPlan(String medicationPlan) {
		this.medicationPlan = medicationPlan;
	}
	
	public String getTreatmentPlan() {
		return treatmentPlan;
	}
	
	public void setTreatmentPlan(String treatmentPlan) {
		this.treatmentPlan = treatmentPlan;
	} 
	
	public void addMedication(String medication)
	{
		medicationPlan += "\nAdditional Medication: " + medication; 
	}
	
	public void addMedication(String medication, String dosage)
	{
		medicationPlan += "\nAdditional Medication: " + medication + "\nDosage: " + dosage; 

	}
	
	public void addTreatment(String treatment)
	{
		treatmentPlan += "\nAdditional Treatment: " + treatment; 
	}
	
}
