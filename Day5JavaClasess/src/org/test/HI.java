package org.test;


public class HI extends Bye{
  public HI() {
    super(12);
    System.out.println("Default const...");
  }

  public static void main(String[] args) {
    HI a = new HI();
  }

}