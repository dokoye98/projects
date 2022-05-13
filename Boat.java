package friProject;

public class Boat extends Vehicle {
	private int mileage;
	private int sails;
	private String brand;

	public Boat(boolean engine, String colour, int mileage, int sails, String brand) {
		super(engine, colour);
		this.mileage = mileage;
		this.sails = sails;
		this.brand = brand;
	}

	@Override
	public float fixCost() {
		float fixCost = 250;
		if (mileage > 200) {
			fixCost += 200;
		}
		if (mileage > 100) {
			fixCost += 100;
		}
		if (mileage > 50) {
			fixCost += 50;
		}
		if (mileage < 0) {
			fixCost -= 50;
		}
		if (sails > 2) {
			fixCost += 1000;
		}
		if (brand == "cool boat") {
			fixCost -= 25;
		}

		if (brand == "pirate") {
			System.out.println("haha pirates don't pay *thumbs up*");
			fixCost = 0;
		}
		return fixCost;
	}

	public int getMileage() {
		return mileage;
	}

	public void setMileage(int mileage) {
		this.mileage = mileage;
	}

	public int getSails() {
		return sails;
	}

	public void setSails(int sails) {
		this.sails = sails;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	@Override
	public String toString() {
		return "Boat [mileage=" + mileage + ", sails=" + sails + ", brand=" + brand + "]";
	}

}
