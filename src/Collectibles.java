/**
 * Lead Author(s):
 * @author Stephen Basilio
 * 
 * Other contributors:
 * None
 * 
 * References:
 * 
 * Version/date: 2024-06 (4.32.0)
 * 
 * Responsibilities of class:
 * Superclass for all Collectibles.
 */
public class Collectibles
{
	private String name; //Collectibles has-a name
	
	/**
	 * Purpose: Super Constructor that sets the name for the Collectible.
	 * @param name
	 */
	public Collectibles(String name) 
	{
		this.name = name;
	}
	
	/**
	 * Purpose: Returns the name for the Collectible. Used for Rarity toString();
	 * @return name
	 */
	public String getName()
	{
		return name;
	}
}
