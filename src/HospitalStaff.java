
public class HospitalStaff extends Hospital{

	protected String staffName; 
	protected int staffID;
	protected String staffPosition; 
	
	HospitalStaff()
	{
		staffName = "StaffName_Unknown"; 
		staffID = 0000;
		staffPosition = "StaffPosition_Unknown"; 
	}
	
	HospitalStaff(String name, int id)
	{
		staffName = name; 
		staffID = id;
		staffPosition = "StaffPosition_Unknown"; 
	}
	
	HospitalStaff(String name, int id, String position)
	{
		staffName = name; 
		staffID = id;
		staffPosition = position; 
	}

	public String getStaffName() {
		return staffName;
	}

	public void setStaffName(String staffName) {
		this.staffName = staffName;
	}

	public int getStaffID() {
		return staffID;
	}

	public void setStaffID(int staffID) {
		this.staffID = staffID;
	}

	public String getStaffPosition() {
		return staffPosition;
	}

	public void setStaffPosition(String staffPosition) {
		this.staffPosition = staffPosition;
	}
	
	
}
