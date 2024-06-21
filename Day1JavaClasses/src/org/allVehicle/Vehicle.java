package org.allVehicle;

import org.fourwheeler.FourWheeler;
import org.threewheeler.Threewheeler;
import org.twowheeler.TwoWheeler;

public class Vehicle {
	public void VehicleNecessery() {
		System.out.println("Rc,Insurance,Tax");
	}
	public static void main(String[] args) {
		Vehicle v = new Vehicle();
		TwoWheeler t = new TwoWheeler();
		Threewheeler th = new Threewheeler();
		FourWheeler f = new FourWheeler();
		
		v.VehicleNecessery();
		t.bike();
		t.cycle();
		th.auto();
		f.bus();
		f.car();
		f.lorry();
	}

}
