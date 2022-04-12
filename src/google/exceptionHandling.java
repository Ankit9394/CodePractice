package google;

public class exceptionHandling {

	public static void main(String[] args) {
		//an exception is unexpected/unwanted/abnormal situation
		//that occured at runtime called exception.
		//Exception handling: we should have an alternate source through which we can handle the exception
		 
		int a=10;
		int b=0;
		
		try {
		
			int c=a/b;
		System.out.println(c);
		}
		catch(Exception e) // Exception is a super class of exception handling
		{
		System.out.println(e);
		}
		System.out.println("Method is executed");
		
		//try,catch predifine case 
		//throw,throws user define access object 
		//finally 
	
	//Throwable is a super class of Exception handling 
	//which contains 2 subclass 1.exception 2.Error 
	// Exception: Runtime Exception,IOException,SQLException,InterruptedException,classnotfoundException
		//RunTimeException: Arithmetic,Null<Numberformat,Indexoutofbound
		
		//Throws
		// we can use to deligate responsibility of exception handling to the caller(JVm or another method)
		//it is required only for checked exceptional and for unchecked exception there is no use
		//it is required only to convince compiler and its change does not prevent abnormal termination of the program
	
	
	
	}
}
