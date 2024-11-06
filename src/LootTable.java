import java.util.LinkedList;
/**
 * Lead Author(s):
 * @author Stephen Basilio
 * 
 * Other contributors:
 * None
 * 
 * References:
 * https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/LinkedList.html
 * 
 * Version/date: 2024-06 (4.32.0)
 * 
 * Responsibilities of class:
 * Used to insert custom Collectibles into different Lists based on their rarity. 
 * Can be used to add and return Collectibles, while also being able to get the size of the loottable for that rarity. 
 */
public class LootTable
{
	private LinkedList<Common> commonLT; //LootTable has-a commonLT, or common loot table
	private LinkedList<Rare> rareLT; //LootTable has-a rareLT, or rare loot table
	private LinkedList<Epic> epicLT; //LootTable has-a epicLT, or epic loot table
	private LinkedList<Legendary> legendaryLT; //LootTable has-a legendaryLT, or legendary loot table
	
	/**
	 * Purpose: Constructor that stores Lists for all rarities.
	 * @param commonLT
	 * @param rareLT
	 * @param epicLT
	 * @param legendaryLT
	 */
	public LootTable(LinkedList<Common> commonLT, LinkedList<Rare> rareLT, LinkedList<Epic> epicLT, LinkedList<Legendary> legendaryLT)
	{
		this.commonLT = commonLT;
		this.rareLT = rareLT;
		this.epicLT = epicLT;
		this.legendaryLT = legendaryLT;
	}
	
	/**
	 * Purpose: Adds collectible with common rarity.
	 * @param item
	 */
	public void addCommon(Common item)
	{
		commonLT.add(item);
	}
	
	/**
	 * Purpose: Adds collectible with rare rarity.
	 * @param item
	 */
	public void addRare(Rare item)
	{
		rareLT.add(item);
	}
	
	/**
	 * Purpose: Adds collectible with epic rarity.
	 * @param item
	 */
	public void addEpic(Epic item)
	{
		epicLT.add(item);
	}
	
	/**
	 * Purpose: Adds collectible with legendary rarity.
	 * @param item
	 */
	public void addLegendary(Legendary item)
	{
		legendaryLT.add(item);
	}

	/**
	 * Purpose: Returns collectible with common rarity.
	 * @param item
	 */
	public Common getCommon(int index)
	{
		return commonLT.get(index);
	}
	
	/**
	 * Purpose: Returns collectible with rare rarity.
	 * @param item
	 */
	public Rare getRare(int index)
	{
		return rareLT.get(index);
	}
	
	/**
	 * Purpose: Returns collectible with epic rarity.
	 * @param item
	 */
	public Epic getEpic(int index)
	{
		return epicLT.get(index);
	}
	
	/**
	 * Purpose: Returns collectible with legendary rarity.
	 * @param item
	 */
	public Legendary getLegendary(int index)
	{
		return legendaryLT.get(index);
	}
	
	/**
	 * Purpose: Returns size of common loot table.
	 * @param item
	 */
	public int getCommonSize()
	{
		return commonLT.size();
	}
	
	/**
	 * Purpose: Returns size of rare loot table.
	 * @param item
	 */
	public int getRareSize()
	{
		return rareLT.size();
	}
	
	/**
	 * Purpose: Returns size of epic loot table.
	 * @param item
	 */
	public int getEpicSize()
	{
		return epicLT.size();
	}
	
	/**
	 * Purpose: Returns size of legendary loot table.
	 * @param item
	 */
	public int getLegendarySize()
	{
		return legendaryLT.size();
	}
}
