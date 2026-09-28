package com.oops;

abstract class SmartDevice{
	int deviceId;
	String deviceName;
	SmartDevice(int deviceId,String deviceName){
		this.deviceId=deviceId;
		this.deviceName=deviceName;
	}
	void displayDevice() {
		System.out.println("Device Id :"+deviceId);
		System.out.println("Device Name :"+deviceName);
	}
	abstract void turnOn() ;

	abstract void turnOff() ;
}
class SmartLight extends SmartDevice{

	SmartLight(int deviceId, String deviceName) {
		super(deviceId, deviceName);
	}

	@Override
	void turnOn() {
		System.out.println("Smart Light is On");
	}

	@Override
	void turnOff() {
		System.out.println("Smart Light is Off");		
	}
	
}
class SmartFan extends SmartDevice{

	SmartFan(int deviceId, String deviceName) {
		super(deviceId, deviceName);
	}

	@Override
	void turnOn() {
		System.out.println("Smart Fan is On");		
	}

	@Override
	void turnOff() {
		System.out.println("Smart Fan is Off");		
	}
	
}
class SmartAC extends SmartDevice{

	SmartAC(int deviceId, String deviceName) {
		super(deviceId, deviceName);
	}

	@Override
	void turnOn() {
		System.out.println("Smart AC is On");
	}

	@Override
	void turnOff() {
		System.out.println("Smart AC is Off");		
	}
	
}

public class SmartDeviceDriver {

	public static void main(String[] args) {
		SmartDevice[] arr=new SmartDevice[3];
		SmartDevice light= new SmartLight(101,"Light");
		SmartDevice fan= new SmartFan(102,"Fan");
		SmartDevice ac= new SmartAC(103,"AC");
		arr[0]=light;
		arr[1]=fan;
		arr[2]=ac;
		for(SmartDevice d:arr) {
			d.turnOff();
			d.turnOn();
			d.displayDevice();
			System.out.println();
		}
//		light.turnOff();
//		light.turnOn();
//		light.displayDevice();
//		fan.turnOff();
//		fan.turnOn();
//		fan.displayDevice();
//		ac.turnOff();
//		ac.turnOn();
//		ac.displayDevice();
		
	}

}
