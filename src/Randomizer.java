import java.util.LinkedList;
import java.util.Random;
/**
 * Lead Author(s):
 * @author Stephen Basilio
 * 
 * Other contributors:
 * None
 * 
 * References:
 * https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Random.html
 * https://www.digitalocean.com/community/tutorials/java-random
 * GoneFishingModel
 * 
 * Version/date: 2024-06 (4.32.0)
 * 
 * Responsibilities of class:
 * Used to choose rarity and item.
 */
public class Randomizer
{	
	/**
	 * Purpose: Used to choose a rarity and collectible using the LootTable class and Random
	 * @param lootTable is necessary for all collectible items to be gotten from the LootTable LinkedList.
	 * @return Collectible of varying rarity
	 */
	public Collectibles chooseCollectible()
	{
		Random rarityPicker = new Random(); //Necessary to pick out a random number.
		int rarity = rarityPicker.nextInt(100); //Picks a random number from 0 inclusive to 100 exclusive.
		//If and else if statements will pick rarity. If the number is low, get a legendary. If the number is higher, get a lower rarity item. 
		//Picks through the lootTable and gets a specific rarity, then gets a collectible by choosing a random number based on the size of the lootTable on the rarity.
		if(rarity < 3)
		{
			if(LootTable.getLegendarySize() == 0)
			{
				return null;
			}
			return LootTable.getLegendary(rarityPicker.nextInt(LootTable.getLegendarySize()));
		}
		else if(rarity < 10)
		{
			if(LootTable.getEpicSize() != 0)
			{
				return null;
			}
			return LootTable.getEpic(rarityPicker.nextInt(LootTable.getEpicSize()));
		}
		else if(rarity < 30)
		{
			if(LootTable.getLegendarySize() != 0)
			{
				return null;
			}
			return LootTable.getRare(rarityPicker.nextInt(LootTable.getRareSize()));
		}
		else
		{
			if(LootTable.getLegendarySize() != 0)
			{
				return null;
			}
			return LootTable.getCommon(rarityPicker.nextInt(LootTable.getCommonSize()));
		}
	}
}