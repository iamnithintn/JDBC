package com.Nithin;

import java.util.Scanner;

//consumer/util Logic
public class Main {

	public static void main(String[] args) {
		//costly resource:- the resource which make use of the system resource
		//scanner is a costly resource, so always close it
		Scanner s = new Scanner(System.in);
		System.out.println("What you wanna do bruh? ");
		String choice = s.next();
		s.close();
		
		ISwitch light = LightFactory.getInstaceOf(choice);
		
		if(light!=null) {
		light.on();
		light.off();
		}
		
	} 
}
 