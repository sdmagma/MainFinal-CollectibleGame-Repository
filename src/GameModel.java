import java.util.Random;

import javax.swing.JOptionPane;
/**
 * Lead Author(s):
 * @author Stephen Basilio
 * 
 * Other contributors:
 * None
 * 
 * References:
 * GoneFishingModel
 * 
 * Version/date: 2024-06 (4.32.0)
 * 
 * Responsibilities of class:
 * GameModel creates the map and fills rooms with Collectibles and monsters.
 * Can also check what is in a room with its entityAt() method.
 */
public class GameModel
{
	private static final int MAPSIZE = 10; //GameModel has-a MAPSIZE. Sets the mapsize to be a 10x10 square.
	private static final int MONSTERCHANCE = 10; //GameModel has-a MONSTERCHANCE. Sets the chance to have a monster in a room. Cannot be 100 or more.
	private boolean[][] monsterChecker = new boolean[MAPSIZE][MAPSIZE]; //GameModel has-a monsterChecker. Will set the room to have a monster.
	private boolean[][] collectibleChecker = new boolean[MAPSIZE][MAPSIZE]; //GameModel has-a collectibleChecker. Will set the room to have a collectible.
	private boolean[][] emptyRoomChecker = new boolean[MAPSIZE][MAPSIZE]; //GameModel has-a emptyRoomCheck. Will set the room to be empty.
	private boolean[][] playerPosition = new boolean[MAPSIZE][MAPSIZE]; //GameModel has-a playerPosition. Sets the position of the player.
	private static int playerRowPosition = 0;
	private static int playerColumnPosition = 0;
	
	/**
	 * Purpose: GameModel places monsters and collectibles in the map using booleans and if statements.
	 */
	public GameModel()
	{
		Random randomNumberGenerator = new Random();
		ItemReader itemReader = new ItemReader();
		itemReader.readTextFile("ItemFileUpdated.txt");
		
		playerPosition[playerRowPosition][playerColumnPosition] = true;
		for(int room = 0; room < MAPSIZE*MAPSIZE; room++)
		{
			int row, column; //Used to fill a location on the map
			int roomTypeChooser = randomNumberGenerator.nextInt(100); //Used to choose the type of room
			
			//Do-while finds a valid room to fill with a monster or collectible
			do
			{
				row = randomNumberGenerator.nextInt(MAPSIZE);
				column = randomNumberGenerator.nextInt(MAPSIZE);
			} while(monsterChecker[row][column] || collectibleChecker[row][column]);
			//Based on the MONSTERCHANCE, it will set the room to have a monster or collectible
			if(roomTypeChooser < MONSTERCHANCE)
			{
				monsterChecker[row][column] = true;
			}
			else
			{
				collectibleChecker[row][column] = true;
			}
		}
		monsterChecker[playerRowPosition][playerColumnPosition] = false;
		collectibleChecker[playerRowPosition][playerColumnPosition] = false;
		emptyRoomChecker[playerRowPosition][playerColumnPosition] = true;
	}
	
	public void updatePlayerPosition(String direction)
	{
		System.out.println("I am going " + direction);
		try
		{
			boolean[][] temporaryPosition = new boolean[MAPSIZE][MAPSIZE];
			switch(direction)
			{
			case "Left":
				temporaryPosition[playerRowPosition-1][playerColumnPosition] = true;
				playerPosition[playerRowPosition][playerColumnPosition] = false;
				playerRowPosition--;
				break;
			case "Right":
				temporaryPosition[playerRowPosition+1][playerColumnPosition] = true;
				playerPosition[playerRowPosition][playerColumnPosition] = false;
				playerRowPosition++;
				break;
			case "Up":
				temporaryPosition[playerRowPosition][playerColumnPosition+1] = true;
				playerPosition[playerRowPosition][playerColumnPosition] = false;
				playerColumnPosition++;
				break;
			case "Down":
				temporaryPosition[playerRowPosition][playerColumnPosition-1] = true;
				playerPosition[playerRowPosition][playerColumnPosition] = false;
				playerColumnPosition--;
				break;
				default:
					System.out.println("Didn't get a direction");
			}
			playerPosition[playerRowPosition][playerColumnPosition] = true; 
			System.out.println("Row: " + playerRowPosition + "\nColumn: " + playerColumnPosition);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			JOptionPane.showMessageDialog(null, "Out of Bounds!", "Error", JOptionPane.INFORMATION_MESSAGE);
			System.out.println("Didn't work mane");
		}
	}
	
	public int getRow()
	{
		return playerRowPosition;
	}
	
	public int getColumn()
	{
		return playerColumnPosition;
	}
	
	/**
	 * Purpose: Checks the coordinate to see if anything is there. Will return a String that says whether it is Nothing, a Collectible, or a Monster.
	 * @param row is the row coordinate of the room
	 * @param column is the column coordinate of the room
	 * @return String that details what is in the room
	 */
	public String entityAt(int row, int column)
	{
		//Booleans are used to determine what is in the room
		boolean emptyRoom = emptyRoomChecker[row][column];
		boolean foundCollectible = collectibleChecker[row][column];
		boolean foundMonster = monsterChecker[row][column];
		String entity = null; //Sets whether there is a collectible, monster, or none at the coordinates
		
		//Does a few checks on what is in the room. Will set the entity variable and change the boolean status
		if(emptyRoom)
		{
			entity = "Nothing"; //This means that this room is empty
		}
		else if(foundCollectible)
		{
			entity = "Collectible"; //This means that there is a collectible in the room
			emptyRoomChecker[row][column] = true;
			collectibleChecker[row][column] = false;
		}
		else if(foundMonster)
		{
			entity = "Monster"; //This means that there is a monster in the room
			emptyRoomChecker[row][column] = true;
			monsterChecker[row][column] = false;
		}
		return entity; //Finally, return what is currently in the room
	}
}
