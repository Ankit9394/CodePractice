package google;

public class ExceptionTheory {

	public static void main(String[] args) {
		// Java exceptions are events that disrupt the normal execution of the program
		//missing resources, coding errors, memory errors, and others. In Java, there are two kinds of exceptions:
		//Unchecked exceptions (runtime exceptions)
		//Checked exceptions (compile-time exceptions)
		
		//Unchecked exceptions are issues that occur at runtime
//there’s nothing at index 10, the above code example throws ArrayIndexOutOfBoundsException array example
		
		//Checked exceptions are also called compile-time exceptions
		//IOException is one of the most common checked exceptions in Java. It’s caused by different 
		//input-output problems such as invalid file access or networking errors.
		
		//Exception classes are Java classes that include all checked and unchecked exceptions. The exceptions
		//I mentioned before such as ArithmeticException and IOException are all represented by an exception class
	
		//The Throwable class is the superclass of all Java exceptions and errors. 
		
		/*Exception handling in Java happens with the try, catch, and finally blocks. You can use them to define 
		how you want to handle exceptions when they occur. The try block should include the code that may or may 
		not throw an exception. Each catch block is an exception handler that deals with an exception thrown by 
		the try block. The finally block executes in any case, whether an exception has been thrown or not.
	*/
		
		
		
		
		/*The throws keyword is used to declare which exceptions can be thrown from a method,
	 	The throws keyword can be used to declare multiple exceptions
	while the throw  It can throw only one exception at a time.
		keyword is used to explicitly throw an exception within a method or block of code*/
	
	}
	
	

}
