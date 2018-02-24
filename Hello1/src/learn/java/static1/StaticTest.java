package learn.java.static1;

/**
 * Java static property is shared to all objects.
   It makes your program memory efficient (i.e it saves memory).
 * @author prasadk12
 *
 */

public class StaticTest {
	   int rollno;  
	   String name;  
	   static String college ="ITS";  
	     
	   StaticTest(int r,String n){  
	   rollno = r;  
	   name = n;  
	   }  
	 void display (){System.out.println(rollno+" "+name+" "+college);}  
	  
	 public static void main(String args[]){  
		 StaticTest s1 = new StaticTest(111,"Karan");  
		 StaticTest s2 = new StaticTest(222,"Aryan");  
	   
	 s1.display();  
	 s2.display();  
	 }  

}
