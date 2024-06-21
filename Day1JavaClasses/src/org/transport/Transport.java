package org.transport;

import org.air.Air;
import org.road.Road;
import org.water.Water;

public class Transport {
	public void TransportForm() {
		System.out.println("Vechile Fitness Certificate");
	}
	public static void main(String[] args) {
		Transport t = new Transport();
		Water w  = new Water();
		Road r = new Road();
		Air a = new Air();
		t.TransportForm();
		w.ship();
		w.boat();
		a.aeroPlane();
		a.heliCopter();
		r.bike();
		r.bus();
		r.cycle();
		r.car();
	}

}
