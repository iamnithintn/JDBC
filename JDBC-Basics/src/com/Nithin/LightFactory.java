package com.Nithin;

//object creation logic
//helper class
public class LightFactory {

	//helper method
	public static ISwitch getInstaceOf(String type) {
		if(type.equalsIgnoreCase("TubeLight")) {
			System.out.println("Tubelight object is created");
			return new Tubelight();
		}
		else if(type.equalsIgnoreCase("LedLight")) {
			System.out.println("LEDlight object is created");
			return new LEDLight();
		}
		else {
			System.out.println("No device found");
			return null;
		}
	}
}
