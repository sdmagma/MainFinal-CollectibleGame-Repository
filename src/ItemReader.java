import java.util.LinkedList;
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
			
			//Code is meant to check if the next line has a keyword such as Common, Rare, Epic, or Legendary
			//If it does, it will skip a line and then scan the next line
			//The next line will become a Collectible Object, and will then be added to the LootTable
			while(scan.hasNext())
			{
				String[] newCollectible = scan.nextLine().split(",", 2);
				
				if(newCollectible[0].equals("Common"))
				{
					Common item = new Common(newCollectible[1]);
					lootTable.addCommon(item);
				}
				else if(newCollectible[0].equals("Rare"))
				{
					Rare item = new Rare(newCollectible[1]);
					lootTable.addRare(item);
				}
				else if(newCollectible[0].equals("Epic"))
				{
					Epic item = new Epic(newCollectible[1]);
					lootTable.addEpic(item);
				}
				else if(newCollectible[0].equals("Legendary"))
				{
					Legendary item = new Legendary(newCollectible[1]);
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
