import java.util.LinkedList;
/**
 * Lead Author(s):
 * @author Stephen Basilio
 * 
 * Other contributors:
 * None
 * 
 * References:
 * Oracle. Class LinkedList<E>.
 * Retrieved from https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/LinkedList.html
 * 
 * Version/date: 2024-06 (4.32.0)
 * 
 * Responsibilities of class:
 * Used to insert custom Collectibles into different Lists based on their rarity. 
 * Can be used to add and return Collectibles, while also being able to get the size of the lootTable for that rarity.
 * LinkedLists are static to make LootTable have the same lootTable
 */
public class LootTable
{
	private static LinkedList<CommonCollectible> commonLootTable = new LinkedList<CommonCollectible>(); //LootTable has-a common loot table
	private static LinkedList<RareCollectible> rareLootTable = new LinkedList<RareCollectible>(); //LootTable has-a rare loot table
	private static LinkedList<EpicCollectible> epicLootTable = new LinkedList<EpicCollectible>(); //LootTable has-a epic loot table
	private static LinkedList<LegendaryCollectible> legendaryLootTable = new LinkedList<LegendaryCollectible>(); //LootTable has-a legendary loot table
	
	/**
	 * Purpose: Adds collectible with common rarity.
	 * @param item
	 */
	public void addCommon(CommonCollectible item)
	{
		commonLootTable.add(item);
	}
	
	/**
	 * Purpose: Adds collectible with rare rarity.
	 * @param item
	 */
	public void addRare(RareCollectible item)
	{
		rareLootTable.add(item);
	}
	
	/**
	 * Purpose: Adds collectible with epic rarity.
	 * @param item
	 */
	public void addEpic(EpicCollectible item)
	{
		epicLootTable.add(item);
	}
	
	/**
	 * Purpose: Adds collectible with legendary rarity.
	 * @param item
	 */
	public void addLegendary(LegendaryCollectible item)
	{
		legendaryLootTable.add(item);
	}

	/**
	 * Purpose: Returns collectible with common rarity.
	 * @param item
	 */
	public CommonCollectible getCommon(int index)
	{
		return commonLootTable.get(index);
	}
	
	/**
	 * Purpose: Returns collectible with rare rarity.
	 * @param item
	 */
	public RareCollectible getRare(int index)
	{
		return rareLootTable.get(index);
	}
	
	/**
	 * Purpose: Returns collectible with epic rarity.
	 * @param item
	 */
	public EpicCollectible getEpic(int index)
	{
		return epicLootTable.get(index);
	}
	
	/**
	 * Purpose: Returns collectible with legendary rarity.
	 * @param item
	 */
	public LegendaryCollectible getLegendary(int index)
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
