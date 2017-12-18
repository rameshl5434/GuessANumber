import java.util.Scanner;

public class GuessANumber {

	public static void main(String[] args) {
		final int GUESS_NUM=27;
		boolean cond = true;
		Scanner sc = new Scanner(System.in);
System.out.println("Enter a Number");

while(cond)
{
	int n = sc .nextInt();
	if(n==GUESS_NUM)
	{
		System.out.println("This is the number"+n);
		cond = false;
	}
	else if(n>GUESS_NUM)
	{
		System.out.println("Entered numberd is grater than guess number \n  please re-enter the number");
		
		
	}
	else
	{
		System.out.println("Entered numberd is lesser than guess number \n  please re-enter the number");

	}
	
}


	}

}
