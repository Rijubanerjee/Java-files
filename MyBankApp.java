package p1;

public class MyBankApp {
	
	public static void main(String[] args) 
	{
		int accno, bal, pId, pAmount;
		String pName;
		String accName;
		
		Account a=new Account();
		Account b=new Account();
		Account c=new Account();
		
		Policy pa=new Policy();
		Policy pb=new Policy();
		Policy pc=new Policy();
		
		//  Create Accounts 
		a.setAccountNumber(101);
		a.setAccountHolderName("Mr X");
		a.setBalance(100000);
		pa.setPolicyId(33421);
		pa.setPolicyName("Car Insurance");
		pa.setPolicyAmount(17000);
		
		b.setAccountNumber(102);
		b.setAccountHolderName("Mr Y");
		b.setBalance(150000);
		pb.setPolicyId(33425);
		pb.setPolicyName("Life Insurance");
		pb.setPolicyAmount(18500);
		
		c.setAccountNumber(103);
		c.setAccountHolderName("Mr Z");
		c.setBalance(300000);
		pc.setPolicyId(33452);
		pc.setPolicyName("House Insurance");
		pc.setPolicyAmount(40000);
		
		
		// Display Information 
		accno=a.getAccountNumber();
		accName=a.getAccountHolderName();
		bal=a.getBalance();
		System.out.println("Account:\n"+accno+"\n"+accName+"\n"+bal+"\n");
		
		accno=b.getAccountNumber();
		accName=b.getAccountHolderName();
		bal=b.getBalance();
		System.out.println("Account:\n"+accno+"\n"+accName+"\n"+bal+"\n");
		
		accno=c.getAccountNumber();
		accName=c.getAccountHolderName();
		bal=c.getBalance();
		System.out.println("Account:\n"+accno+"\n"+accName+"\n"+bal+"\n");
		
		
		
		
		// Display Information related to Policies 
		pId=pa.getPolicyId();
		pName=pa.getPolicyName();
		pAmount=pa.getPolicyAmount();
		System.out.println("Policy:\n"+pId+"\n"+pName+"\n"+pAmount+"\n");
		
		pId=pb.getPolicyId();
		pName=pb.getPolicyName();
		pAmount=pb.getPolicyAmount();
		System.out.println("Policy:\n"+pId+"\n"+pName+"\n"+pAmount+"\n");
		
		pId=pc.getPolicyId();
		pName=pc.getPolicyName();
		pAmount=pc.getPolicyAmount();
		System.out.println("Policy:\n"+pId+"\n"+pName+"\n"+pAmount+"\n");
		
		
		
		// get the policy by Id for specific account
		//System.out.println(pa.getPolicyId());
		
	}

}
