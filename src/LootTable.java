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
	private static LinkedList<Common> commonLootTable = new LinkedList<Common>(); //LootTable has-a commonLT, or common loot table
	private static LinkedList<Rare> rareLootTable = new LinkedList<Rare>(); //LootTable has-a rareLT, or rare loot table
	private static LinkedList<Epic> epicLootTable = new LinkedList<Epic>(); //LootTable has-a epicLT, or epic loot table
	private static LinkedList<Legendary> legendaryLootTable = new LinkedList<Legendary>(); //LootTable has-a legendaryLT, or legendary loot table
	
	/**
	 * Purpose: Adds collectible with common rarity.
	 * @param item
	 */
	public void addCommon(Common item)
	{
		commonLootTable.add(item);
	}
	
	/**
	 * Purpose: Adds collectible with rare rarity.
	 * @param item
	 */
	public void addRare(Rare item)
	{
		rareLootTable.add(item);
	}
	
	/**
	 * Purpose: Adds collectible with epic rarity.
	 * @param item
	 */
	public void addEpic(Epic item)
	{
		epicLootTable.add(item);
	}
	
	/**
	 * Purpose: Adds collectible with legendary rarity.
	 * @param item
	 */
	public void addLegendary(Legendary item)
	{
		legendaryLootTable.add(item);
	}

	/**
	 * Purpose: Returns collectible with common rarity.
	 * @param item
	 */
	public Common getCommon(int index)
	{
		return commonLootTable.get(index);
	}
	
	/**
	 * Purpose: Returns collectible with rare rarity.
	 * @param item
	 */
	public Rare getRare(int index)
	{
		return rareLootTable.get(index);
	}
	
	/**
	 * Purpose: Returns collectible with epic rarity.
	 * @param item
	 */
	public Epic getEpic(int index)
	{
		return epicLootTable.get(index);
	}
	
	/**
	 * Purpose: Returns collectible with legendary rarity.
	 * @param item
	 */
	public Legendary getLegendary(int index)
	{
		return legendaryLootTable.get(index);
	}
	
	/**
	 * Purpose: Returns size of common loot table.
	 * @param item
	 */
	public int getCommonSize()
	{
		return commonLootTable.size();
	}
	
	/**
	 * Purpose: Returns size of rare loot table.
	 * @param item
	 */
	public int getRareSize()
	{
		return rareLootTable.size();
	}
	
	/**
	 * Purpose: Returns size of epic loot table.
	 * @param item
	 */
	public int getEpicSize()
	{
		return epicLootTable.size();
	}
	
	/**
	 * Purpose: Returns size of legendary loot table.
	 * @param item
	 */
	public int getLegendarySize()
	{
		return legendaryLootTable.size();
	}
}
