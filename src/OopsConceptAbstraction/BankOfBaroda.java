package OopsConceptAbstraction;

public class BankOfBaroda implements DenaBank, StateBank {

	@Override
	public void debit() {
		System.out.println("StateBank Method");
		
	}

	@Override
	public void credit() {
		System.out.println("StateBank Method credit");
		
	}

	@Override
	public void homeLoan() {
		System.out.println("StateBank Method homeloan");
		
	}

	@Override
	public void withdrawMoney() {
		System.out.println("DenaBank Method withdraw money");
		
	}

	@Override
	public void tranferMoney() {
		System.out.println("DenaBank Method Transfer Money");
		
	}

	@Override
	public void investMoney() {
		System.out.println("DenaBank Method Invest Money");
		
	}

}
