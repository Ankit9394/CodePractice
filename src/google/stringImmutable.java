package google;

public class stringImmutable {

	public static void main(String[] args) {
		
		// String is a class in java and it helps us to store characters ex."Ankit123"
		//string is immutable in java means we can not chage it once we make an object of string cant change at all
		
		String a="Ankit";
		
		String b="Ankit";
		
		String c="Dipali";
		
		stringImmutable si= new stringImmutable();
		
		System.out.println(b);
		//String a="Ankit";
		System.out.println(a);
		
		a=a.concat("Kumar");
		System.out.println(a);
				
	}

}
