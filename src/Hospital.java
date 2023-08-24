
public class Hospital {

	protected String hospitalName; 
	protected String hospitalLocation; 
	protected int hospitalCapacity; 
	protected int hospitalStaffCapacity; 
	protected int hospitalEquipmentNumber; 
	protected int numberOfPatients = 0; 
	protected int numberOfStaffMembers = 0; 
	
	protected Patient[] hospitalPatients = new Patient[hospitalCapacity];
	protected HospitalStaff[] hospitalStaff = new HospitalStaff[hospitalStaffCapacity]; 
	protected HospitalEquipment[] hospitalEquipment = new HospitalEquipment[hospitalEquipmentNumber]; 
	
	Hospital()
	{
		hospitalName = "HospitalName_Unknown"; 
		hospitalLocation = "HospitalLocation_Unknown"; 
		hospitalCapacity = 0; 
		hospitalStaffCapacity = 0; 
		hospitalEquipmentNumber = 0; 
	}
	
	Hospital(String name, String location)
	{
		hospitalName = name; 
		hospitalLocation = location;
		hospitalCapacity = 0; 
		hospitalStaffCapacity = 0; 
		hospitalEquipmentNumber = 0; 
	}
	
	Hospital(String name, String location, int capacity, int staffCapacity, int equipmentNumber)
	{
		hospitalName = name; 
		hospitalLocation = location; 
		hospitalCapacity = capacity; 
		hospitalStaffCapacity = staffCapacity; 
		hospitalEquipmentNumber = equipmentNumber; 
	}
	
	public String getHospitalName() {
		return hospitalName;
	}

	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}

	public String getHospitalLocation() {
		return hospitalLocation;
	}

	public void setHospitalLocation(String hospitalLocation) {
		this.hospitalLocation = hospitalLocation;
	}

	public int getHospitalCapacity() {
		return hospitalCapacity;
	}

	public void setHospitalCapacity(int hospitalCapacity) {
		this.hospitalCapacity = hospitalCapacity;
	}

	public int getHospitalStaffCapacity() {
		return hospitalStaffCapacity;
	}

	public void setHospitalStaffCapacity(int hospitalStaffCapacity) {
		this.hospitalStaffCapacity = hospitalStaffCapacity;
	}

	public int getHospitalEquipmentNumber() {
		return hospitalEquipmentNumber;
	}

	public void setHospitalEquipmentNumber(int hospitalEquipmentNumber) {
		this.hospitalEquipmentNumber = hospitalEquipmentNumber;
	}
	
	public void addPatient(Patient p)
	{
		for (int i = 0; i < numberOfPatients; i++)
		{
			if (hospitalPatients[i] == null) 
				hospitalPatients[i] = p; 
		}
	}
	
	public void removePatient(Patient p)
	{
		for (int i = 0; i < numberOfPatients; i++)
		{
			if (hospitalPatients[i] == p) 
				hospitalPatients[i] = null; 
		}
	}
	
	public void addStaff(HospitalStaff h)
	{
		for (int i = 0; i < numberOfStaffMembers; i++)
		{
			if (hospitalStaff[i] == null) 
				hospitalStaff[i] = h; 
		}
	}
	
	public void removeStaff(HospitalStaff h)
	{
		for (int i = 0; i < numberOfStaffMembers; i++)
		{
			if (hospitalStaff[i] == h) 
				hospitalStaff[i] = null; 
		}
	}
	
	public void addEquipment(HospitalEquipment e)
	{
		for (int i = 0; i < hospitalEquipmentNumber; i++)
		{
			if (hospitalEquipment[i] == null) 
				hospitalEquipment[i] = e; 
		}
	}
	
	public void removeEquipment(HospitalEquipment e)
	{
		for (int i = 0; i < hospitalEquipmentNumber; i++)
		{
			if (hospitalEquipment[i] == e) 
				hospitalEquipment[i] = null; 
		}
	}
	
	//same for staff, equipment

	public String getPatient()
	{
		String patientsInfo = ""; 
		patientsInfo += "There are " + numberOfPatients + " patient in the hospital at the moment. Here is their description: \n";
		
		for (int i = 0; i < numberOfPatients; i++)
		{
			patientsInfo += "\nName: " + hospitalPatients[i].getPatientName() + "\nID: " + hospitalPatients[i].getPatientID() + "\nAge: " + hospitalPatients[i].getPatientAge() + "\nGender: " + hospitalPatients[i].getPatientGender(); 
		}
		
		return patientsInfo;
	}
	
	public String getStaff()
	{
		String staffInfo = ""; 
		staffInfo += "There are " + numberOfStaffMembers + " staff members in the hospital at the moment. Here is their description: \n";
		
		for (int i = 0; i < numberOfStaffMembers; i++)
		{
			staffInfo += "\nName: " + hospitalStaff[i].getStaffName() + "\nID: " + hospitalStaff[i].getStaffID() + "\nPosition: " + hospitalStaff[i].getStaffPosition(); 
		}
		
		return staffInfo;
	}
	
	public String toString()
	{
		String equipmentInfo = ""; 
		equipmentInfo += "There are " + hospitalEquipmentNumber + " equipment in the hospital at the moment. Here is their description: \n";
		
		for (int i = 0; i < hospitalEquipmentNumber; i++)
		{
			equipmentInfo += "\nName: " + hospitalEquipment[i].getEquipmentName() + "\nSerial Number: " + hospitalEquipment[i].getEquipmentSerialNumber() + "\nStatus: " + hospitalEquipment[i].getEquipmentStatus() + "\nUse: " + hospitalEquipment[i].getEquipmentUse(); 
		}
		
		return equipmentInfo;
	}
}
