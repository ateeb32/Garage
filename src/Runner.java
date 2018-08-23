
public class Runner {

	public static void main(String[] args) {
		
		Boat B1 = new Boat("3000", "Pink", 2);
		Car C1 = new Car("6300", "White", 6);			// 
		Plane P1 = new Plane ("15000", "Green", 2);
		
		Garage myGarage = new Garage();
		
		myGarage.addToGarage(B1);
		myGarage.addToGarage(C1);
		myGarage.addToGarage(P1);
		
		myGarage.printing();

	}

}
