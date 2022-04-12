package OopsConceptAbstraction;

public interface DenaBank {

	//no method body only method declaration
	//can not create the object of Interface
	//no static method
	//interface variables are static in nature
	//can create the interface reference variable 
	// can achieve 100% abstraction in interface class 
	
	int min_Bal= 100;
	
	public void withdrawMoney();// this method are called abstract method
	
	public void tranferMoney();
	
	public void investMoney();
}
