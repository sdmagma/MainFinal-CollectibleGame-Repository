
public class Common extends Collectibles
{
	private String name;
	
	public Common(String name) 
	{
		super(name);
	}
	
	public String toString()
	{
		return "Common " + getName() + "!";
	}
}
