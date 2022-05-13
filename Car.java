package friProject;

public class Car extends Vehicle {
	private int doors;
	private String brand;
	private boolean electric;

	public Car(boolean engine, String colour, int doors, String brand, boolean electric) {
		super(engine, colour);
		this.doors = doors;
		this.brand = brand;
		this.electric = electric;
	}

	@Override
	public float fixCost() {
		float fixCost = 300;
		if (electric == true) {
			fixCost += 500;
		}
		if (doors > 3) {
			fixCost += 400;
		}
		if (brand == "bmw") {
			fixCost -= 300;
		}
		return fixCost;
	}

	public int getDoors() {
		return doors;
	}

	public void setDoors(int doors) {
		this.doors = doors;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public boolean isElectric() {
		return electric;
	}

	public void setElectric(boolean electric) {
		this.electric = electric;
	}

	@Override
	public String toString() {
		return "Car [doors=" + doors + ", brand=" + brand + ", electric=" + electric + "]";
	}

}
