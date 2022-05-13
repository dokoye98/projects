package friProject;

import java.util.ArrayList;

public class Garage {

	public ArrayList<Vehicle> fixGarage = new ArrayList<>();

	public String addVehicle(Vehicle newVehicle) {
		fixGarage.add(newVehicle);
		return "this is the new Vehicle:" + newVehicle;
	}

public float thebill(int index) {
	return fixGarage.get(index).fixCost();
	
	 }
public String clearQueue() {
	fixGarage.clear();
	return "your request has been deleted";
}

@Override
public String toString() {
	return "Garage [fixGarage=" + fixGarage + "]";
}

}
