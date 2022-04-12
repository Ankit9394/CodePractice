package OopsConceptAbstraction;

public abstract class Shape {
	
// in abstract class we can have abstract method as well as non abstract method
	//0 to 100% abstraction 
	// we can also achieve 
	// parent class constructor get called first
	// then child class constructor called 
	//once you declare the method "Final" means can not override 

	Shape(){
		System.out.println("parent Constructor");
	}
	
	abstract void ankit();
	
	public void dipali() {
		System.out.println("Ankit's wife");
	}
	
}
