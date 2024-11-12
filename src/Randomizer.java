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
	//Currently temporary location since it will be moved to a file or something
//	Common watch = new Common("Watch");
//	Common boots = new Common("Pair of Boots");
//	Common disarmednuke = new Common("Disarmed Nuke");
//	Common coin = new Common("Coin");
//	Common torch = new Common("Torch");
//	Common brick = new Common("Relatively Heavy Brick");
//	Common fish = new Common("Fish");
//	Common thread = new Common("Thread");
//	Common slotmachine = new Common("Broken Slot Machine");
//	Common picture = new Common("Forgotten Memory");
//	
//	Rare pancake = new Rare("Pancake");
//	Rare giftcard = new Rare("Giftcard");
//	Rare shrek2 = new Rare("Copy of Shrek 2 on BluRay");
//	Rare lawnmower = new Rare("Lawnmower");
//	Rare sword = new Rare("Shiny Sword");
//	
//	Epic jetpack = new Epic("Jetpack");
//	Epic tungsten = new Epic("Tungsten Rod");
//	Epic armednuke = new Epic("Armed Nuke");
//	
//	Legendary mcchicken = new Legendary("McChicken");
	
	/**
	 * Purpose: Used to choose a rarity and collectible using the LootTable class and Random
	 * @param lootTable is necessary for all collectible items to be gotten from the LootTable LinkedList.
	 * @return Collectible of varying rarity
	 */
	public static Collectibles chooseCollectible()
	{
		LinkedList<Common> common = new LinkedList<Common>();
		LinkedList<Rare> rare = new LinkedList<Rare>();
		LinkedList<Epic> epic = new LinkedList<Epic>();
		LinkedList<Legendary> legendary = new LinkedList<Legendary>();
		LootTable lootTable = new LootTable(common, rare, epic, legendary);
		
		Random rarityPicker = new Random(); //Necessary to pick out a random number.
		int rarity = rarityPicker.nextInt(100); //Picks a random number from 0 inclusive to 100 exclusive.
		//If and else if statements will pick rarity. If the number is low, get a legendary. If the number is higher, get a lower rarity item. 
		//Picks through the lootTable and gets a specific rarity, then gets a collectible by choosing a random number based on the size of the lootTable on the rarity.
		if(rarity < 3)
		{
			if(lootTable.getLegendarySize() == 0)
			{
				return null;
			}
			return lootTable.getLegendary(rarityPicker.nextInt(lootTable.getLegendarySize()));
		}
		else if(rarity < 10)
		{
			if(lootTable.getEpicSize() != 0)
			{
				return null;
			}
			return lootTable.getEpic(rarityPicker.nextInt(lootTable.getEpicSize()));
		}
		else if(rarity < 30)
		{
			if(lootTable.getLegendarySize() != 0)
			{
				return null;
			}
			return lootTable.getRare(rarityPicker.nextInt(lootTable.getRareSize()));
		}
		else
		{
			if(lootTable.getLegendarySize() != 0)
			{
				return null;
			}
			return lootTable.getCommon(rarityPicker.nextInt(lootTable.getCommonSize()));
		}
	}
}