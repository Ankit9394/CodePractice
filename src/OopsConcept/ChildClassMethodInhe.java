package OopsConcept;

public class ChildClassMethodInhe { // is a super class

	public static void main(String[] args) {
		
		//when same method is available in parent class as well as in child class with same number of arguments 
		//is called method overriding
		
		//method overloading
		// when the method name is same with different parameters called method overloading
		// we can not create the method inside the main method
		// yes we can overload the main method but outside the class
		//JVM call only main method at execution time
		 
		
		
		// this is called compile time or static polymorphism means one to many method
		//why so at complie time java will decide which method i need to call
		UsingExtendsKeywordconcept ue= new UsingExtendsKeywordconcept();
		ue.sleep();
		ue.run();
		
		ue.walk();
		ue.talk();
		
		
		//
		InheritenceConcept ic= new InheritenceConcept();
		ic.walk();
		ic.speak();
		ic.talk();
		
		
		
		InheritenceConcept ic1=new UsingExtendsKeywordconcept();// top casting 
		// child class object cab be reffered by parent class object
		// this is called runtime polymorphism r dynamic polymorphism
		//common method and parent class method can be called 
		 ic1.walk();
		 ic1.talk();
		 ic1.speak();
		 
		 
		
		// casting is possible but will see error at run time classcastException

	}
	/* public static void main(Double[] args) overload example
	    {
	        System.out.println("main() overloaded"
	                           + " method 3 Executing");
	    }*/
	  
}
