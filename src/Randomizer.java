import java.util.Random;
//https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Random.html
//https://www.digitalocean.com/community/tutorials/java-random
//GoneFishingModel

public class Randomizer
{
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

	public Randomizer()
	{
		
	}
	
	public Collectibles chooseCollectible(LootTable lootTable)
	{
		Random rarityPicker = new Random();
		int rarity = rarityPicker.nextInt(100);
		if(rarity < 3)
		{
			return lootTable.getLegendary(rarityPicker.nextInt(lootTable.getLegendarySize()));
		}
		else if(rarity < 10)
		{
			return lootTable.getEpic(rarityPicker.nextInt(lootTable.getEpicSize()));
		}
		else if(rarity < 30)
		{
			return lootTable.getRare(rarityPicker.nextInt(lootTable.getRareSize()));
		}
		else
		{
			return lootTable.getCommon(rarityPicker.nextInt(lootTable.getCommonSize()));
		}
	}
}
