package arrayCall;

public class Hotel {

	String name="";
	float cost;
	String typeofRooms[]=new String[3];
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getCost() {
		return cost;
	}
	public void setCost(float cost) {
		this.cost = cost;
	}
	public String[] getTypeofRooms() {
		return typeofRooms;
	}
	public void setTypeofRooms(String[] typeofRooms) {
		this.typeofRooms = typeofRooms;
	}
	
}
