public class ConstructorChain{
	  
	ConstructorChain() {  
		this("Javatpoint");  
		System.out.println("Default constructor called.");  
	}  
	  
	ConstructorChain(String str) {  
		System.out.println("Parameterized constructor called");  
	}     
}   