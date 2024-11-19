import java.util.Scanner;
import java.io.*;
/**
 * Lead Author(s):
 * @author Stephen Basilio
 * 
 * Other contributors:
 * None
 * 
 * References:
 * https://www.youtube.com/watch?v=T7M3Avf46TU
 * ChatGPT
 * 
 * Version/date: 2024-06 (4.32.0)
 * 
 * Responsibilities of class:
 * Reads an ItemFile text file to create new Collectible objects to be stored in the LootTable
 */
public class ItemReader
{
	/**
	 * Purpose: Reads a text file and creates new Collectibles to be stored in LootTable.
	 * @param fileName
	 */
	public static void readTextFile(String fileName)
	{
		LootTable lootTable = new LootTable(); //ItemReader has-a LootTable
		//Start by making a file object to open the file
		File myFile = new File(fileName);
		//Next, create a new scanner that starts with null
		//In the try block, we will create a new scanner as long as the file exists
		Scanner scan = null;
		
		//In the try block, scan is defined to read the file myFile, and will return the content of the file in a long String
		try
		{
			scan = new Scanner(myFile); //defines scanner. If the file does not exist, throw FileNotFoundException
			
			//Checks if the next line has a keyword such as Common, Rare, Epic, or Legendary
			//If it does, use index 1, since it has the name, to create a new Collectible
			//It will then be added to the LootTable
			while(scan.hasNext())
			{
				//Stores next scan in a String array. This will then be used to create Collectibles
				//Index 0 is the rarity, while index 1 is the name
				String[] newCollectible = scan.nextLine().split(",", 2);
				String rarity = newCollectible[0];
				String itemName = newCollectible[1];
				
				if(rarity.equals("Common"))
				{
					Common item = new Common(itemName);
					lootTable.addCommon(item);
				}
				else if(rarity.equals("Rare"))
				{
					Rare item = new Rare(itemName);
					lootTable.addRare(item);
				}
				else if(rarity.equals("Epic"))
				{
					Epic item = new Epic(itemName);
					lootTable.addEpic(item);
				}
				else if(rarity.equals("Legendary"))
				{
					Legendary item = new Legendary(itemName);
					lootTable.addLegendary(item);
				}
			}
		}
		catch(FileNotFoundException exception) //Catches an exception if a file does not exist
		{
			System.out.println("File was not found");
		}
		finally //Closes the scanner once it is empty
		{
			if(scan!=null)
			{
				scan.close();
			}
		}
	}
}
