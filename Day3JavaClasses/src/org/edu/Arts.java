package org.edu;

public class Arts extends Education {
   
    public void bSc() {
        System.out.println("Bachelor of Science in Arts method");
    }
    
    public void bEd() {
        System.out.println("Bachelor of Education in Arts method");
    }
  
    public void bA() {
        System.out.println("Bachelor of Arts method");
    }
    
    public void bBA() {
        System.out.println("Bachelor of Business Administration in Arts method");
    }
    
    @Override
    public void ug() {
        System.out.println("Undergraduate education method in Arts");
    }
    
    @Override
    public void pg() {
        System.out.println("Postgraduate education method in Arts");
    }

    public static void main(String[] args) {
        Education education = new Education();
        Arts arts = new Arts();
     
        education.ug();
        education.pg(); 
        arts.bSc();     
        arts.bEd();     
        arts.bA();      
        arts.bBA();      
        arts.ug();       
        arts.pg(); 
    }
}
