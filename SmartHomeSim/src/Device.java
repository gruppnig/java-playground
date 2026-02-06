public abstract class Device {
	
	//Attributes
	protected int id;
	protected String name;
	protected boolean isOn;
	
	//Constructor
	public void Device(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	//Methods
	public void turnOn() {
		isOn = true;
	}
	
	public void turnOff() {
		isOn = false;
	}
	
	public boolean isOn() {
		return isOn;
	}
	
	//Abstract methods
	public abstract String getInfo();
	
}
