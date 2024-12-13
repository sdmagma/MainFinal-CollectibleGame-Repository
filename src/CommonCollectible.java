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
 * Also returns rarity.
 */
public class CommonCollectible extends Collectibles
{
	/**
	 * Purpose: Constructor that sets the name of the Collectible.
	 * @param name
	 */
	public CommonCollectible(String name) 
	{
		super(name);
	}
	
	/**
	 * Purpose: Returns the rarity.
	 * @return "Common"
	 */
	public String getRarity()
	{
		return "Common";
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