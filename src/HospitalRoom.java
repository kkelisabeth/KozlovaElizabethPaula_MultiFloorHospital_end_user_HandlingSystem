
public class HospitalRoom extends HospitalFloor{

	protected int roomNumber;
	protected String roomType;
	protected int roomCapacity;
	protected int numberOfPatients; 
	
	protected Patient[] roomPatients = new Patient[roomCapacity]; 
	
	HospitalRoom()
	{
		roomNumber = 0;
		roomType = "RoomType_Unknown";
		roomCapacity = 0; 
		numberOfPatients = 0;
	}
	
	HospitalRoom(int number, String type)
	{
		roomNumber = number;
		roomType = type;
		roomCapacity = 0; 
		numberOfPatients = 0;
	}
	
	HospitalRoom(int number, String type, int capacity, int numberP)
	{
		roomNumber = number;
		roomType = type;
		roomCapacity = capacity; 
		numberOfPatients = numberP;
	}
	
	public int getRoomNumber() {
		return roomNumber;
	}
	
	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}
	
	public String getRoomType() {
		return roomType;
	}
	
	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}
	
	public int getRoomCapacity() {
		return roomCapacity;
	}
	
	public void setRoomCapacity(int roomCapacity) {
		this.roomCapacity = roomCapacity;
	} 
	
	
	public int getNumberOfPatients() {
		return numberOfPatients;
	}

	public void setNumberOfPatients(int numberOfPatients) {
		if(numberOfPatients <= roomCapacity)
			this.numberOfPatients = numberOfPatients;
		else 
			System.out.println("Invalid number of patients");
	}

	public void addPatient(Patient p)
	{
		for (int i = 0; i < numberOfPatients; i++)
		{
			if (roomPatients[i] == null) 
				roomPatients[i] = p; 
		}
	}
	
	public void removePatient(Patient p)
	{
		for (int i = 0; i < numberOfPatients; i++)
		{
			if (roomPatients[i] == p) 
				roomPatients[i] = null; 
		}
	}
	
	public String getPatients()
	{
		String patientsInfo = "";
		
		if (numberOfPatients == 0)
			patientsInfo += "There are no patients in this room"; 
		
		else
		{
			patientsInfo += "There are " + numberOfPatients + " patients in this room. Here the detailed information about them: "; 
			for (int i = 0; i < numberOfPatients; i++)
			{
				patientsInfo += "\nName: " + roomPatients[i].getPatientName() + "\nID: " + roomPatients[i].getPatientID() + "\nAge: " + roomPatients[i].getPatientAge() + "\nGender: " + roomPatients[i].getPatientGender(); 

			}
		}
		
		return patientsInfo; 
	}
	
}
