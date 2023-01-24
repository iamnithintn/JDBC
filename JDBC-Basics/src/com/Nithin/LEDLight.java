package com.Nithin;

//implementation logic
public class LEDLight implements ISwitch{

	@Override
	public void on() {
		System.out.println("LEDLight is Switched on");
		
	}

	@Override
	public void off() {
		System.out.println("LEDLight is Switched off");

		
	}

	
}
