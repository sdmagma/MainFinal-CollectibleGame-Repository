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
 * Rarity class for Common Collectibles.
 * Sets the name and uses a toString().
 */
public class Common extends Collectibles
{
	/**
	 * Purpose: Constructor that sets the name of the Collectible.
	 * @param name
	 */
	public Common(String name) 
	{
		super(name);
	}
	
	/**
	 * Purpose: Used to return Rarity and name. Will be used for messages on GUI.
	 * @return rarity, name, and exclamation mark
	 */
	public String toString()
	{
		return "Common " + getName() + "!";
	}
}
