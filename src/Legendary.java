
public class Legendary extends Collectibles
{
	private String name;
	
	public Legendary(String name) 
	{
		super(name);
	}
	
	public String toString()
	{
		return "Legendary " + getName() + "!";
	}
}
