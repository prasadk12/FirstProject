package learn.java;




	     class Address22 {
	    	
	    String city,state,country;  
	      
	    public Address22(String city, String state, String country) {  
	        this.city = city;  
	        this.state = state;  
	        this.country = country; 
	        
	    }  
	      
	    }  



	     class Emp22 {
	    	
	    int id;  
	    String name;  
	    Address22 address;  
	      
	    public Emp22(int id, String name,Address22 address) {  
	        this.id = id;  
	        this.name = name;  
	        this.address=address;  
	    }  
	      
	    void display(){  
	    System.out.println(id+" "+name);  
	    System.out.println(address.city+" "+address.state+" "+address.country);  
	    }  
	     }
	     class Aggreation2{
	    public static void main(String[] args) {  
	    Address22 address1=new Address22("gzb","UP","india");  
	    Address22 address2=new Address22("gno","UP","india");  
	      
	    Emp22 e=new Emp22(111,"varun",address1);  
	    Emp22 e2=new Emp22(112,"arun",address2);  
	          
	    e.display();  
	    e2.display();  
	          
	    }  
	    }  