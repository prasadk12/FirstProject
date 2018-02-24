package learn.java.static1;
/**
 * Restrictions for static method
There are two main restrictions for the static method. They are:

    The static method can not use non static data member or call non-static method directly.
    this and super cannot be used in static context.

If you apply static keyword with any method, it is known as static method.

    A static method belongs to the class rather than object of a class.
    A static method can be invoked without the need for creating an instance of a class.
    static method can access static data member and can change the value of it.
 * @author prasadk12
 *
 */

public class StaticMethod {
	  static int cube(int x){  
	  return x*x*x;  
	  }  
	  
	  public static void main(String args[]){  
	  int result=StaticMethod.cube(5);
//	  int result=StaticMetthishod.cube(5);
	  System.out.println(result);  
	  }  
	}  


