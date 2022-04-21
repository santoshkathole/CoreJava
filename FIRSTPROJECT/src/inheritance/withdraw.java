package inheritance;

public class withdraw {
int amt_withdraw=20000;
}
class atm extends withdraw
{
	int amt_left=5000;
	public static void main(String[] args) {
		atm ob1=new atm();
		System.out.println("amount withdraw"+ob1.amt_withdraw);
		System.out.println("amount withdraw"+ob1.amt_left);	
	}
}
