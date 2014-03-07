public class Player

	{
	private String name;
	private int currentAmount;
	
	public Player(String name, int currentAmount)
		{
		this.name = name;
		this.currentAmount = currentAmount;
		}
	
	public String getName()
		{
		return name;
		}
	
	public void setName(String name)
		{
		this.name = name;
		}
	
	public int getCurrentAmount()
		{
		return currentAmount;
		}
	
	public void setCurrentAmount(int currentAmount)
		{
		this.currentAmount = currentAmount;
		}	
	}
