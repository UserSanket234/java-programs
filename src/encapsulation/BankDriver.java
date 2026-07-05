package encapsulation;

public class BankDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        BankAccount b1 = new BankAccount("Sanket","ICICI",9876543210l,4343,340005.0,"icici00008","phaltan");
        System.out.println(b1.getBalance(9876543210l, 4343));
        b1.withdraw(9876543210l, 4343, 10000.0);
	}

}
