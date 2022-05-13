package friProject;

public class Bike extends Vehicle {
	private boolean radio;
	private boolean sidecar;
	private int wheels;

	public Bike(boolean engine, String colour, boolean radio, boolean sidecar, int wheels) {
		super(engine, colour);
		this.radio = radio;
		this.sidecar = sidecar;
		this.wheels = wheels;
	}

	@Override
	public float fixCost() {
		float fixCost = 50;
		if (radio == true) {
			fixCost += 25;
		}
		if (sidecar == true) {
			fixCost += 75;
		}
		if (wheels > 2) {
			fixCost += 55;
		}
		// TODO Auto-generated method stub
		return fixCost;
	}

	@Override
	public String toString() {
		return "Bike [radio=" + radio + ", sidecar=" + sidecar + ", wheels=" + wheels + "]";
	}

}
