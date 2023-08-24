import java.util.Date; 

public class PatientDischarge extends Patient{

	protected Date dischargeDate; 
	protected String dischargeInstructions; 
	
	PatientDischarge(String name, int id, int age, String gender)
	{
		super(name, id, age, gender);
		dischargeDate = new Date(2000, 01, 01);
		dischargeInstructions = "DischargeInstructions_Unknown"; 
	}

	PatientDischarge(Date date, String name, int id, int age, String gender)
	{
		super(name, id, age, gender);
		dischargeDate = date;
		dischargeInstructions = "DischargeInstructions_Unknown"; 
	}

	PatientDischarge(Date date, String instructions, String name, int id, int age, String gender)
	{
		super(name, id, age, gender);
		dischargeDate = date;
		dischargeInstructions = instructions; 
	}

	
	public Date getDate() {
		return dischargeDate;
	}

	public void setDate(Date date) {
		this.dischargeDate = date;
	}

	public String getInstructions() {
		return dischargeInstructions;
	}

	public void setInstructions(String instructions) {
		this.dischargeInstructions = instructions;
	}
	
	
}
