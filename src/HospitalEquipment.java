
public class HospitalEquipment extends Hospital{

	protected String equipmentName; 
	protected int equipmentSerialNumber; 
	protected String equipmentStatus; 
	protected String equipmentUse; 
	
	HospitalEquipment()
	{
		equipmentName = "EquipmentName_Unknown"; 
		equipmentSerialNumber = 0000; 
		equipmentStatus = "EquipmentSerialNumber_Unknown"; 
		equipmentUse = "EquipmentUse_Unknown"; 
	}
	
	HospitalEquipment(String name, int number)
	{
		equipmentName = name; 
		equipmentSerialNumber = number; 
		equipmentStatus = "EquipmentSerialNumber_Unknown"; 
		equipmentUse = "EquipmentUse_Unknown"; 
	}
	
	HospitalEquipment(String name, int number, String status, String use)
	{
		equipmentName = name; 
		equipmentSerialNumber = number; 
		equipmentStatus = status; 
		equipmentUse = use; 
	}

	public String getEquipmentName() {
		return equipmentName;
	}

	public void setEquipmentName(String equipmentName) {
		this.equipmentName = equipmentName;
	}

	public int getEquipmentSerialNumber() {
		return equipmentSerialNumber;
	}

	public void setEquipmentSerialNumber(int equipmentSerialNumber) {
		this.equipmentSerialNumber = equipmentSerialNumber;
	}

	public String getEquipmentStatus() {
		return equipmentStatus;
	}

	public void setEquipmentStatus(String equipmentStatus) {
		this.equipmentStatus = equipmentStatus;
	}

	public String getEquipmentUse() {
		return equipmentUse;
	}

	public void setEquipmentUse(String equipmentUse) {
		this.equipmentUse = "\nEquipment Use: " + equipmentUse;
	}
	
	public void setEquipmentUse(String equipmentUse, String specialist) {
		this.equipmentUse = "\nSpecialist: " + specialist + "\nEquipment Use: " + equipmentUse;
	}
	
}
