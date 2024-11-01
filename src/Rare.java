
public class Rare extends Collectibles
{
	private String name;
	
	public Rare(String name) 
	{
		super(name);
	}
	
	public String toString()
	{
		return "Rare " + getName() + "!";
	}
}

