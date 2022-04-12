package google;

public class ReverseString {

	public static void main(String[] args) {
		
		String str= "Ankit"; // declare one string
		
		System.out.println(str.length()); // print the total length of string
		int a= str.length();
		
		String str1=""; // we are going to store the reverse string 
		
		
		for(int i=str.length()-1; i>=0; i--) { //to reverse the string length-1, start with 0 and i--
		str1= str1 + str.charAt(i);
	}
		System.out.println(str1);	// print the reverse value
		
		// by using StringBuffer we can reverse the string 
		StringBuffer sf= new StringBuffer(str);
		System.out.println(sf.reverse());
		
		
		
		
		
 }
}