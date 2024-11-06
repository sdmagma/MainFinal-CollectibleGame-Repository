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
 * Rarity class for Rare Collectibles.
 * Sets the name and uses a toString().
 */
public class Rare extends Collectibles
{
	private String name; //Rare has-a name
	
	/**
	 * Purpose: Constructor that sets the name of the Collectible.
	 * @param name
	 */
	public Rare(String name) 
	{
		super(name);
	}
	
	/**
	 * Purpose: Used to return Rarity and name. Will be used for messages on GUI.
	 * @return rarity, name, and exclamation mark
	 */
	public String toString()
	{
		return "Rare " + getName() + "!";
	}
}

