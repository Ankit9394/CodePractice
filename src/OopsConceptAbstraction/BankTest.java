package OopsConceptAbstraction;

public class BankTest {

	public static void main(String[] args) {
		
		BankOfBaroda bb= new BankOfBaroda();
		
		bb.credit();
		bb.debit();
		bb.homeLoan();
		bb.investMoney();
		bb.tranferMoney();
		bb.withdrawMoney();
		
		System.out.println(DenaBank.min_Bal);
	}

}
