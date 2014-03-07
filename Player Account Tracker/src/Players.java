import java.util.Scanner;

public class Players

	{	
	public static int numberOfPlayers;
	private static String playerName;
	private static int initialAmount;
	
	Players(String n,int ia)
		{
		playerName = n;
		initialAmount = ia;
		}
	
	public static void setUpPlayers()
		{
		System.out.println("How many players are there? ");
		Scanner userInput1 = new Scanner(System.in);
		int numberOfPlayers = userInput1.nextInt();
		
		Players[] players = new Players[numberOfPlayers];

		Scanner userInput2 = new Scanner(System.in);
		
		for (int i = 0;i < numberOfPlayers;i++)
			{
			System.out.println("Please input the name of player number "+ (i + 1));
			playerName = userInput2.nextLine();
			initialAmount = PlayerAccounts.initialAmount;
			
			Players individual = new Players(playerName,initialAmount);
			players[i] = individual;
			
			System.out.println("The player named " + players[i].playerName + " has $" + players[i].initialAmount);
			}
		
		System.out.println();
		System.out.println("The " + numberOfPlayers + " players and their starting amounts are:");
		System.out.println();
		
		for (int j = 0;j < numberOfPlayers;j++)
			{
			System.out.println(players[j].playerName);
			System.out.println(players[j].initialAmount);
			}
		}
	}
