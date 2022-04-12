package google;

public class singletonClass {

	public static void main(String[] args) {
		// a singleton class is a class that can have only once onject(instance of the class) at a time
		//design singleton class:
		//1. make constructor as private
	    //2.write a static method that has return type of object of this singleton class(Lazy initialization)
		
		
		/*In Java, Singleton is a design pattern that ensures that a class can only have one object.
		private static SingletonExample singleObject - a reference to the object of the class.
		private SingletonExample() - a private constructor that restricts creating objects outside of the class.
		public static SingletonExample getInstance() - this method returns the reference to the only object of the class.
		 Since the method static, it can be accessed using the class name.
		 
		 https://www.programiz.com/java-programming/singleton#:~:text=In%20Java%2C%20Singleton%20is%20a,creation%20outside%20of%20the%20class.link
*/
		
	}

}
