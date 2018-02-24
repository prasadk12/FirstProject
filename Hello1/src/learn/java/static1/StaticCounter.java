package learn.java.static1;

/**
 * 
 * @author prasadk12
 *
 */

public class StaticCounter {
	
    
    int count=0;//will get memory when instance is created  
      
    StaticCounter(){  
    count++;  
    System.out.println(count);  
    }  
      
    public static void main(String args[]){  
      
    	StaticCounter c1=new StaticCounter();  
    	StaticCounter c2=new StaticCounter();  
    	StaticCounter c3=new StaticCounter();  
      
     }  
    }  


