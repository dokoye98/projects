package friProject;

public abstract class Vehicle {
	//variables
	private boolean engine;
	private String colour;
	//constructor
	public abstract float fixCost();
	public Vehicle(boolean engine, String colour) {
		super();
		this.engine = engine;
		this.colour = colour;
	}
//setters
	public boolean isEngine() {
		return engine;
	}
	public void setEngine(boolean engine) {
		this.engine = engine;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	
}
