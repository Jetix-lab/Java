package org.univ;

public class College extends University {
@Override
public void ug() {
   System.out.println("College: Undergraduate method");
}
@Override
public void pg() {
   System.out.println("College: Postgraduate method");
}

public static void main(String[] args) {
   College college = new College();
   college.ug();
   college.pg(); }
}
