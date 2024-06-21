package org.day1;

public class GreensTech {
	public void greensOmr() {
		System.out.println(" Plot No.19,\r\n" + "Balamurugan Garden,\r\n" + "OMR Road,Kancheepuram District,\r\n"
				+ "Okkiam, Thoraipakkam,\r\n" + "Jain college bus stop,");
		System.out.println("--------");
	}

	public void greensAdayar() {
		System.out.println(
				"No:11,\r\n" + "First Street,\r\n" + "padmanabha Nagar,\r\n" + "Adyar,\r\n" + "Chennai-600 020.");
		System.out.println("--------");
	}

	public void greensTambaram() {
		System.out.println("No.1, Apparao Colony,\r\n" + "Tambaram,\r\n" + "Sanatorium,\r\n"
				+ "Near HP Petrol Bunk,\r\n" + "Chennai - 600047");
		System.out.println("--------");
	}

	public void greensVelacherry() {
		System.out.println("51-A, 2nd floor,\r\n" + "Velachery Road,\r\n" + "Dhadeswaram Nagar,\r\n" + "Velachery,\r\n"
				+ "Chennai 600042.");
		System.out.println("--------");
	}

	public void greensAnnaNagar() {
		System.out.println("4th Floor, W122, 3rd Ave,\r\n" + "W Block, Annanagar East, Chennai,\r\n"
				+ "Tamil Nadu - 600040.\r\n" + "(Landmark : Above Erode\r\n" + "Amman Mess Restaurant).");
	}

	public static void main(String[] args) {
		GreensTech address = new GreensTech();
		address.greensOmr();
		address.greensAdayar();
		address.greensTambaram();
		address.greensVelacherry();
		address.greensAnnaNagar();
	}

}
