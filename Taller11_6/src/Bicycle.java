
public class Bicycle extends Vehicle {
	
//Mountain bike, road bike, recumbent bike.. etc
	private String bikeType;

	public Bicycle(int numWheels, String bikeType) {
		super(numWheels);
		this.bikeType = bikeType;
	}

	public String getBikeType() {
		return bikeType;
	}
}
