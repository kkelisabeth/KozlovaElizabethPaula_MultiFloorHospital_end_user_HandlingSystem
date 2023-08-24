
public class HospitalPharmacy extends Hospital{

	protected String pharmacyName;
	protected String pharmacyLocation; 
	protected String inventory = ""; 
	
	HospitalPharmacy()
	{
		pharmacyName = "PharmacyName_Unknown";
		pharmacyLocation = "PharmacyLocation_Unknown"; 
	}
	
	HospitalPharmacy(String name)
	{
		pharmacyName = name;
		pharmacyLocation = "PharmacyLocation_Unknown"; 
	}
	
	HospitalPharmacy(String name, String location)
	{
		pharmacyName = name;
		pharmacyLocation = location; 
	}

	public String getPharmacyName() {
		return pharmacyName;
	}

	public void setPharmacyName(String pharmacyName) {
		this.pharmacyName = pharmacyName;
	}

	public String getPharmacyLocation() {
		return pharmacyLocation;
	}

	public void setPharmacyLocation(String pharmacyLocation) {
		this.pharmacyLocation = pharmacyLocation;
	}

	public void addInventory(String name)
	{
		inventory += "\nItem: " + name + "\nQuantity: Unknown" ; 
	}
	
	public void addInventory(String name, int quantity)
	{
		inventory += "\nItem: " + name + "\nQuantity: " + quantity; 
	}
	
}
