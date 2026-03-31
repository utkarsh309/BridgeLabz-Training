package Inheritance;

//Class definition
class Device{
	
	//Attributes
	protected int deviceId;
	protected String status;
	
	//Constructor
	Device(int deviceId,String status){
		this.deviceId=deviceId;
		this.status=status;
	}
	
	//Method displayInfo
	public void displayInfo() {
		System.out.println("Device ID: "+deviceId);
		System.out.println("Status: "+status);
	}
}

//Class Definition
class Thermostat extends Device{
	
	//Attributes
	private String temperatureSetting;
	
	//Constructor
	Thermostat(int deviceId,String status,String temperatureSetting){
		super(deviceId,status);//Call parent constructor
		this.temperatureSetting=temperatureSetting;
		
	}
	//Overriding displayInfo()
	@Override
	public void displayInfo() {
		super.displayInfo();//calls parent displayInfo method
		System.out.println("Temperature Setting: "+temperatureSetting);
	}
	
}


public class SmartHome {

	public static void main(String[] args) {
		

		Thermostat thermostat1=new Thermostat(101,"On","High");
		thermostat1.displayInfo();
	}

}
