package OopsConceptAbstraction;

public class TestShape extends Shape {
	
	
	TestShape(){
		System.out.println("Child Constructor");
	}

	public static void main(String[] args) {
		
		TestShape ts= new TestShape();
		ts.dipali();
		ts.ankit();
		

	}

	@Override
	void ankit() {
		System.out.println("Dipali's Husband");
		
	}

}
