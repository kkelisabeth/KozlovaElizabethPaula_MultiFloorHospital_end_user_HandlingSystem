
public class HospitalFloor extends Hospital{

	protected int floorNumber;
	protected int floorCapacity; 
	protected int numberOfRooms; 
	
	protected HospitalRoom[] rooms = new HospitalRoom[floorCapacity];
	
	HospitalFloor()
	{
		floorNumber = 0;
		floorCapacity = 0; 
		numberOfRooms = 0; 
	}
	
	HospitalFloor(int number)
	{
		floorNumber = number;
		floorCapacity = 0; 
		numberOfRooms = 0; 
	}
	
	HospitalFloor(int number, int capacity, int numberR)
	{
		floorNumber = number;
		floorCapacity = capacity; 
		numberOfRooms = numberR; 
	}
	
	public int getFloorNumber() {
		return floorNumber;
	}
	
	public void setFloorNumber(int floorNumber) {
		this.floorNumber = floorNumber;
	}
	
	public int getFloorCapacity() {
		return floorCapacity;
	}
	
	public void setFloorCapacity(int floorCapacity) {
		this.floorCapacity = floorCapacity;
	} 
	
	public int getNumberOfRooms() {
		return numberOfRooms;
	}

	public void setNumberOfRooms(int numberOfRooms) {
		if (numberOfRooms <= floorCapacity)
			this.numberOfRooms = numberOfRooms;
		else 
			System.out.println("Invalid number of rooms");
	}

	public void addRoom(HospitalRoom room)
	{
		for (int i = 0; i < numberOfRooms; i++)
		{
			if (rooms[i] == null) 
				rooms[i] = room; 
		}
	}
	
	public void removeRoom(HospitalRoom room)
	{
		for (int i = 0; i < numberOfRooms; i++)
		{
			if (rooms[i] == room) 
				rooms[i] = null; 
		}
	}
	
	public String toString()
	{
		String roomsInfo = "";
		
		if (numberOfRooms == 0)
			roomsInfo += "There are no rooms on this floor"; 
		
		else
		{
			roomsInfo += "There are " + numberOfRooms + " patients in this room. Here the detailed information about them: "; 
			for (int i = 0; i < numberOfRooms; i++)
			{
				roomsInfo += "\nRoom Number: " + rooms[i].getRoomNumber() + "\nRoom Type: " + rooms[i].getRoomType() + "\nRoom Capacity: " + rooms[i].getRoomCapacity() + "\nNumber of Patients in the Room: " + rooms[i].getNumberOfPatients(); 

			}
		}
		
		return roomsInfo; 
	}
	
}
