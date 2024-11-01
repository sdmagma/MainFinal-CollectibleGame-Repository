
public class Epic extends Collectibles
{
	private String name;
	
	public Epic(String name) 
	{
		super(name);
	}
	
	public String toString()
	{
		return "Epic " + getName() + "!";
	}
}
