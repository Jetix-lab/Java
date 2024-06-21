package org.demo;

class Desktop implements Hardware, Software {
	 
	@Override
	 public void hardwareResources() {
	     System.out.println("Desktop Hardware Resources");
	 }
      @Override
	 public void softwareResources() {
	     System.out.println("Desktop Software Resources");
	 }
	 public void desktopModel() {
	     System.out.println("Desktop Model");
	 }

	 public static void main(String[] args) {
	     Desktop desktop = new Desktop();
	     desktop.hardwareResources(); // Output: Desktop Hardware Resources
	     desktop.softwareResources(); // Output: Desktop Software Resources
	     desktop.desktopModel(); // Output: Desktop Model
	 }
	}