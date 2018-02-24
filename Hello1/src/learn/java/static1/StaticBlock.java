package learn.java.static1;
/**
 * Java static block
    Is used to initialize the static data member.
    It is executed before main method at the time of classloading.
    
 * @author prasadk12
 * 
 * 
 *
 */

public class StaticBlock {
	static{System.out.println("static block is invoked");}  
	public static void main(String args[]){  
		System.out.println("Hello main");  
	}  
}  