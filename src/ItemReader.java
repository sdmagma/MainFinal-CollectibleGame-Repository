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
 * TheDickw (2011). Reading Text Files Using Eclipse.
 * Retrieved from https://www.youtube.com/watch?v=T7M3Avf46TU
 * IO.java (2024) from CISC191IO.
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
			
			while(scan.hasNext())
			{
				//Stores next scan in a String array. This will then be used to create Collectibles
				//Index 0 is the rarity, while index 1 is the name
				String[] newCollectible = scan.nextLine().split(",", 2);
				String rarity = newCollectible[0];
				String itemName = newCollectible[1];
				
				//Checks if the next line has a keyword such as Common, Rare, Epic, or Legendary
				//If it does, use index 1, since it has the name, to create a new Collectible
				//It will then be added to the LootTable
				if(rarity.equals("Common"))
				{
					CommonCollectible item = new CommonCollectible(itemName);
					lootTable.addCommon(item);
				}
				else if(rarity.equals("Rare"))
				{
					RareCollectible item = new RareCollectible(itemName);
					lootTable.addRare(item);
				}
				else if(rarity.equals("Epic"))
				{
					EpicCollectible item = new EpicCollectible(itemName);
					lootTable.addEpic(item);
				}
				else if(rarity.equals("Legendary"))
				{
					LegendaryCollectible item = new LegendaryCollectible(itemName);
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
	
	/**
	 * Purpose: Writes to a text file the collectibles and rarities that were obtained from the game.
	 * @param fileName
	 * @param itemRarity
	 * @param collectible
	 */
	public static void appendCollectiblesInventory(String fileName, String itemRarity, Collectibles collectible)
	{
		//Printwriter used for writing into file
		PrintWriter outputFileWriter = null;
		
		try
		{
			//Set PrintWriter to append to file
			outputFileWriter = new PrintWriter(new FileWriter(new File(fileName), true));
			//Write to file
			outputFileWriter.println(itemRarity + "," + collectible.getName());
		}
		catch(Exception e) //For if any exception happens during file writing.
		{
			System.out.println("Cannot write file. File will not be written.");
		}
		finally //Closes file writer after it is finished writing.
		{
			if(outputFileWriter!=null)
			{
				outputFileWriter.close();
			}
		}
	}
	
	/**
	 * Purpose: Clears the contents of the Inventory file.
	 * @param fileName
	 */
	public static void clearContents(String fileName)
	{	
		//Printwriter used for clearing the file
		PrintWriter outputFileWriter = null;
		try
		{
			//Set PrintWriter to NOT append to the file
			outputFileWriter = new PrintWriter(new FileWriter(new File(fileName), false));
		}
		catch(Exception e) //For if any exception happens during file clearing.
		{
			System.out.println("Something went wrong. Cannot clear file.");
		}
		finally
		{
			if(outputFileWriter!=null)
			{
				//Close the file writer
				outputFileWriter.close();
			}
		}
	}
}