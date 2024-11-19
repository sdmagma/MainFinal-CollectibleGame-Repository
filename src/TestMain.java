import java.util.Random;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.NoSuchElementException;
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
 * Tests classes and methods. No actual contribution to the project. 
 * Will be deleted once project is finished. For now, tests will be saved here. 
 */
public class TestMain
{
	public static void main(String[] args)
	{
		//Testing how the Random class works
//		Random random = new Random();
//		System.out.println(random.nextInt());
//		System.out.println(random.nextInt());
//		System.out.println(random.nextInt());
//		System.out.println(random.nextInt());
//		System.out.println(random.nextInt());
//		
//		System.out.println(random.nextInt(100));
//		System.out.println(random.nextInt(100));
//		System.out.println(random.nextInt(100));
//		System.out.println(random.nextInt(100));
//		System.out.println(random.nextInt(100));
		
		//Tried to make an item randomizer based on code from the Randomizer class. 
		//Did not work because of bound errors and the difficulty of working with 2d arrays for storing objects.
		//The plan was to store Collectible rarities into different rows and then randomly pick columns to choose collectibles
		//However, this would come with problems such as empty spots in the array and difficulty adding new collectibles
//		Randomizer random = new Randomizer();
//		
//		Collectibles[][] loot = new Collectibles[4][10];
//		Common watch = new Common("Watch");
//		Common boots = new Common("Pair of Boots");
//		Common disarmednuke = new Common("Disarmed Nuke");
//		loot[0][0] = watch;
//		loot[0][1] = boots;
//		loot[0][2] = disarmednuke;
//		Rare pancakes = new Rare("Pancakes");
//		loot[1][0] = pancakes;
//		Epic jetpack = new Epic("Jetpack");
//		loot[2][0] = jetpack;
//		Legendary mcchicken = new Legendary("McChicken");
//		loot[3][0] = mcchicken;
//		
//		System.out.println(loot[0][0].toString());
//		System.out.println(watch.toString());
//		System.out.println(watch.getRarity());
//		
//		System.out.println(random.chooseCollectible(loot).toString());
//		System.out.println(random.chooseCollectible(loot).toString());
//		System.out.println(random.chooseCollectible(loot).toString());
//		System.out.println(random.chooseCollectible(loot).toString());
//		System.out.println(random.chooseCollectible(loot).toString());
		
		//Tested a proper item randomizer using LinkedList. Now I am able to fill a LootTable with Lists, and can fill those lists with collectibles
//		Randomizer random = new Randomizer();
//		
//		LinkedList<Common> common = new LinkedList<Common>();
//		LinkedList<Rare> rare = new LinkedList<Rare>();
//		LinkedList<Epic> epic = new LinkedList<Epic>();
//		LinkedList<Legendary> legendary = new LinkedList<Legendary>();
//		LootTable lootTable = new LootTable(common, rare, epic, legendary);
//		Common testCom = new Common("TestCom");
//		Rare testRare = new Rare("TestRare");
//		Epic testEpic = new Epic("TestEpic");
//		Legendary testLeg = new Legendary("TestLeg");
//		
//		lootTable.addCommon(testCom);
//		lootTable.addRare(testRare);
//		lootTable.addEpic(testEpic);
//		lootTable.addLegendary(testLeg);
//		
//		System.out.println(random.chooseCollectible(lootTable));
//		System.out.println(random.chooseCollectible(lootTable));
//		System.out.println(random.chooseCollectible(lootTable));
//		System.out.println(random.chooseCollectible(lootTable));
//		System.out.println(random.chooseCollectible(lootTable));
		
//		Randomizer random = new Randomizer();
//		
//		LinkedList<Common> common = new LinkedList<Common>();
//		LinkedList<Rare> rare = new LinkedList<Rare>();
//		LinkedList<Epic> epic = new LinkedList<Epic>();
//		LinkedList<Legendary> legendary = new LinkedList<Legendary>();
//		LootTable lootTable = new LootTable(common, rare, epic, legendary);
//		
//		Common watch = new Common("Watch");
//		Common boots = new Common("Pair of Boots");
//		Common disarmednuke = new Common("Disarmed Nuke");
//		Common coin = new Common("Coin");
//		Common torch = new Common("Torch");
//		Common brick = new Common("Relatively Heavy Brick");
//		Common fish = new Common("Fish");
//		Common thread = new Common("Thread");
//		Common slotmachine = new Common("Broken Slot Machine");
//		Common picture = new Common("Forgotten Memory");
//		
//		lootTable.addCommon(watch);
//		lootTable.addCommon(boots);
//		lootTable.addCommon(disarmednuke);
//		lootTable.addCommon(coin);
//		lootTable.addCommon(torch);
//		lootTable.addCommon(brick);
//		lootTable.addCommon(fish);
//		lootTable.addCommon(thread);
//		lootTable.addCommon(slotmachine);
//		lootTable.addCommon(picture);
//		
//		Rare pancake = new Rare("Pancake");
//		Rare giftcard = new Rare("Giftcard");
//		Rare shrek2 = new Rare("Copy of Shrek 2 on BluRay");
//		Rare lawnmower = new Rare("Lawnmower");
//		Rare sword = new Rare("Shiny Sword");
//		
//		lootTable.addRare(pancake);
//		lootTable.addRare(giftcard);
//		lootTable.addRare(shrek2);
//		lootTable.addRare(lawnmower);
//		lootTable.addRare(sword);
//		
//		Epic jetpack = new Epic("Jetpack");
//		Epic tungsten = new Epic("Tungsten Rod");
//		Epic armednuke = new Epic("Armed Nuke");
//		
//		lootTable.addEpic(jetpack);
//		lootTable.addEpic(tungsten);
//		lootTable.addEpic(armednuke);
//		
//		Legendary mcchicken = new Legendary("McChicken");
//		
//		lootTable.addLegendary(mcchicken);
//		
//		System.out.println(random.chooseCollectible(lootTable));
//		System.out.println(random.chooseCollectible(lootTable));
//		System.out.println(random.chooseCollectible(lootTable));
//		System.out.println(random.chooseCollectible(lootTable));
//		System.out.println(random.chooseCollectible(lootTable));
		System.out.println("Test");
		Randomizer random = new Randomizer();
		ItemReader.readTextFile("ItemFileUpdated.txt");
		if(random.chooseCollectible() != null)
		{
			System.out.println(random.chooseCollectible().toString());
		}
		
//		LinkedList<Common> common = new LinkedList<Common>();
//		LinkedList<Rare> rare = new LinkedList<Rare>();
//		LinkedList<Epic> epic = new LinkedList<Epic>();
//		LinkedList<Legendary> legendary = new LinkedList<Legendary>();
//		LootTable lootTable = new LootTable(common, rare, epic, legendary);
//		File myFile = new File("ItemFileUpdated.txt");
//		//Next, create a new scanner that starts with null
//		//In the try block, we will create a new scanner as long as the file exists
//		Scanner scan = null;
//		
//		//In the try block, scan is defined to read the file myFile, and will return the content of the file in a long String
//		try
//		{
//			scan = new Scanner(myFile); //defines scanner. If the file does not exist, throw FileNotFoundException
//			
//			//Code is meant to check if the next line has a keyword such as Common, Rare, Epic, or Legendary
//			//If it does, it will skip a line and then scan the next line
//			//The next line will become a Collectible Object, and will then be added to the LootTable
//			while(scan.hasNext())
//			{
//				String[] newCollectible = scan.nextLine().split(",", 2);
//				
//				if(newCollectible[0].equals("Common"))
//				{
//					Common item = new Common(newCollectible[1]);
//					lootTable.addCommon(item);
//					System.out.println(item.toString());
//				}
//				else if(newCollectible[0].equals("Rare"))
//				{
//					Rare item = new Rare(newCollectible[1]);
//					lootTable.addRare(item);
//					System.out.println(item.toString());
//				}
//				else if(newCollectible[0].equals("Epic"))
//				{
//					Epic item = new Epic(newCollectible[1]);
//					lootTable.addEpic(item);
//					System.out.println(item.toString());
//				}
//				else if(newCollectible[0].equals("Legendary"))
//				{
//					Legendary item = new Legendary(newCollectible[1]);
//					lootTable.addLegendary(item);
//					System.out.println(item.toString());
//				}
//			}
//		}
//		catch(FileNotFoundException exception) //Catches an exception if a file does not exist
//		{
//			System.out.println("File was not found");
//		}
//		catch(Exception exception)
//		{
//			System.out.println("Problem was found");
//		}
//		finally //Closes the scanner once it is empty
//		{
//			if(scan!=null)
//			{
//				scan.close();
//			}
//		}
	}
}
