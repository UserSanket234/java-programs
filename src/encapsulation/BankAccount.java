package encapsulation;

public class BankAccount {
          private String userName;
          private String bankName;
          private long accno;
          private int pin;
          private double balance;
          private String ifsc;
          private String branch;
		 
          
		  public BankAccount() {
			
		  }


		  public BankAccount(String userName, String bankName, long accno, int pin, double balance, String ifsc,
				String branch) {
			super();
			this.userName = userName;
			this.bankName = bankName;
			this.accno = accno;
			this.pin = pin;
			this.balance = balance;
			this.ifsc = ifsc;
			this.branch = branch;
		  }


		  public String getUserName() {
			  return userName;
		  }


		  public String getBankName() {
			  return bankName;
		  }


		  public  long getAccno() {
			  return accno;
		  }


		  public double getBalance(long accno,int pin) {
			  if(validate(accno,pin)) {
				  return balance;
			  }
			  else {
				  System.out.println("invalid credentials");
				  return 0.0;
			  }
		  }


		  public String getIfsc() {
			  return ifsc;
		  }


		  public String getBranch() {
			  return branch;
		  }
		  
		  public void setPin(long accno,int oldPin, int newPin) {
			  if(validate(accno,oldPin)) {
				  pin=newPin;
				  System.out.println("pin updated");
			  }
		  }
		  public void withdraw(long accno,int pin, double amt) {
			  if(validate(accno,pin)) {
				  if(amt>0) {
					  if(balance-amt>1000) {
						  balance-=amt;
						  System.out.println(amt+"rs Debited");
						  System.out.println("Current balance is:"+balance+"rs");
					  }
					  else {
						  System.out.println("insufficient balance");
						  }
				  }
				  else {
				  System.out.println("invalid amount");
				  }
				  
			  }
			  else{
				  System.out.println("invalid credentials");
			  }
			  
		  }

		   public void deposit(long accno,int pin, double amt){
			  if(validate(accno,pin)) {
				  if(amt>0) {
					  balance+=amt;
					  System.out.println(amt+"Amount Credited");
					  System.out.println("Current Balance is "+amt+"rs");
					  
				  }
				  else {
				  System.out.println("invalid amount");
				  }
			  }
			  else {
			  System.out.println("invalid credentials");
			  }
		  }
		  public boolean validate(long accno, int pin) {
			  return this.accno==accno&& this.pin==pin;
		  }
}        
          
          
          
          

