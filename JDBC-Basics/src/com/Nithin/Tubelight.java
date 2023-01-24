package com.Nithin;

//implementation logic
public class Tubelight implements ISwitch{

	@Override
	public void on() {
		System.out.println("Tubelight is Switched on");

	}

	@Override
	public void off() {
		System.out.println("Tubelight is Switched off");

	}


}
