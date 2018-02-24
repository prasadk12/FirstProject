package learn.java;
/**
 * Aggregation is a special form of association. 
 * It is a relationship between two classes like association, however its a directional association, which means it is strictly a one way association. 
 * It represents a HAS-A relationship.
 * @author prasadk12
 *
 */
class Address {

	String city,state,country;  

	public Address(String city, String state, String country) {  
		this.city = city;  
		this.state = state;  
		this.country = country; 

	}  

}  



class Emp {

	int id;  
	String name;  
	Address address;  

	public Emp(int id, String name,Address address) {  
		this.id = id;  
		this.name = name;  
		this.address=address;  
	}  

	void display(){  
		System.out.println(id+" "+name);  
		System.out.println(address.city+" "+address.state+" "+address.country);  
	}  
}
class Aggreation{
	public static void main(String[] args) {  
		Address address1=new Address("gzb","UP","india");  
		Address address2=new Address("gno","UP","india");  

		Emp e=new Emp(111,"varun",address1);  
		Emp e2=new Emp(112,"arun",address2);  

		e.display();  
		e2.display();  

	}  
}  