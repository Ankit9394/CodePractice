package google;

import java.net.StandardSocketOptions;

public class WrapperClass {

	public static void main(String[] args) {
		
		//we use this for data conversion
		
		String s= "100";
		System.out.println(s+20);// string concatenation
		
		int i=Integer.parseInt(s);// convert String to Integer
		System.out.println(i);
		
		//Integer, Double Character< Boolean
		
		//String to double
		String d="12.33";
		System.out.println(d+100);
		
		double z=Double.parseDouble(d);
		System.out.println(z+10);
		
		//String to character we cant do that we dont have any parse method
		
		//String to boolean
		
		String f= "True";
		System.out.println(f+"Hello");
		
		boolean g=Boolean.parseBoolean(f);
		System.out.println(g);
		
		//Int to string
		int h= 100;
		System.out.println(h+ 100);
		
		String j=String.valueOf(h);
		System.out.println(j+ 100);
		
		
	}

}
