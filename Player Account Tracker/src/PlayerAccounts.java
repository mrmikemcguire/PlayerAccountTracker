import java.util.Scanner;

public class PlayerAccounts

	{
	static String playerName;
	static int initialAmount;
	
	public static int determineStartupAmount()
		{
		System.out.println();
		System.out.println("How much should each player start with? ");
		Scanner userInput1 = new Scanner(System.in);
		int initialAmount = userInput1.nextInt();
		
		setInitialAmount(initialAmount);
		return initialAmount;
		}
	
	public static void setInitialAmount(int a)
		{
		initialAmount = a;
		}

	public static int getInitialAmount()
		{
		return initialAmount;
		}

	public static void adjustAmounts()
		{
		
		}
	}
