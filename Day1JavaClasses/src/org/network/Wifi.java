package org.network;

public class Wifi {
	public void wifiName() {
		System.out.println("Airtel");
	}
	public static void main(String[] args) {
		Wifi wi = new Wifi();
		MobileData mob= new MobileData();
        Lan l  = new Lan();
        Wireless w = new Wireless();
        wi.wifiName();
        l.lanName();
        mob.dataName();
        w.wirelessName();
        
        
	}

}
