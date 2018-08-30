import java.util.ArrayList;

public class Garage {
	
	ArrayList<Vehicle> vehicleList = new ArrayList<>();

	public ArrayList<Vehicle> getVehicleList() {
		
		return vehicleList;
	}
	
	public void addToGarage(Vehicle vehicle) {
		
		vehicleList.add(vehicle);
	}
	
	public void printing() {
		
		for (Vehicle vehicle : vehicleList) {
			
			System.out.println(vehicle.getEngine());
			System.out.println(vehicle.getColour());
			System.out.println("");
		}
	}
}
