package tut10.to_do.bridge;

import tut10.to_do.bridge.devices.Device;
import tut10.to_do.bridge.devices.Radio;
import tut10.to_do.bridge.devices.Tv;
import tut10.to_do.bridge.remotes.AdvancedRemote;
import tut10.to_do.bridge.remotes.BasicRemote;
import tut10.to_do.bridge.remotes.Remote;

public class Demo {
	public static void main(String[] args) {
		testDevice(new Tv());
		testDevice(new Radio());
	}

	//TO-DO: Implement the method testDevice()
	public static void testDevice(Device device) {
		System.out.println("Tests with basic remote.");
		//Create the new BasicRemote instance
		Remote br = new BasicRemote(device);

		//Power on the device
		br.power();
		 
		//Display the status of device
		device.printStatus();
		
		br.channelUp();
		br.volumeUp();
		System.out.println(device.getChannel());
		System.out.println(device.getVolume());
		
		System.out.println("-----------------------------------------");

		System.out.println("Tests with advanced remote.");
		//Create the new advancedRemote instance
		AdvancedRemote ar = new AdvancedRemote(device);

		//Power on the device
		ar.power();
		
		//Mute the device
		ar.mute();
		 
		//Display the status of device
		device.printStatus();
				 
		ar.channelDown();
		ar.volumeDown();
		System.out.println(device.getChannel());
		System.out.println(device.getVolume());
	}
}
