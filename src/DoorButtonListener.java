import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
/**
 * Lead Author(s):
 * @author Stephen Basilio
 * 
 * Other contributors:
 * None
 * 
 * References:
 * FishingButtonListener from CISC191GUI.
 * 
 * Version/date: 2024-06 (4.32.0)
 * 
 * Responsibilities of class:
 * DoorButtonListener checks what kind of room the button sends you in.
 */
public class DoorButtonListener implements ActionListener //DoorButtonListener is an Action Listener
{
	private GameModel gameModel; //DoorButtonListener has-a gameModel
	private GameView gameView; //DoorButtonListener has-a gameView
	private DoorButton doorButton; //DoorButtonListener has-a doorButton
	
	/**
	 * Purpose: Sets the MVC for the DoorButtonListener.
	 * @param gameModel
	 * @param gameView
	 * @param doorButton
	 */
	public DoorButtonListener(GameModel gameModel, GameView gameView, DoorButton doorButton)
	{
		this.gameModel = gameModel;
		this.gameView = gameView;
		this.doorButton = doorButton;
	}

	/**
	 * Purpose: Updates player position and checks what is on the tile the player lands on.
	 * @param e
	 */
	public void actionPerformed(ActionEvent e)
	{	
		//Get the direction of the button pressed
		String direction = doorButton.getDirection();
		//Update the gameModel with the new direction. Will update player position
		gameModel.updatePlayerPosition(direction);
		System.out.println(direction + " has been pressed\n"); //Message for the console when button has been successfully pressed
		//Get positions to check entityAt that location in the switch case
		int row = gameModel.getRow(); 
		int column = gameModel.getColumn(); 
		//Will check entity in new location. Will kill player and end game when it is a monster, otherwise keep the game going.
		switch(gameModel.entityAt(row, column))
		{
		case("Monster"):
			JOptionPane.showMessageDialog(null, "A monster got you! Game Over.", "Game Over", JOptionPane.INFORMATION_MESSAGE);
			System.exit(0);
			break;
		case("Collectible"):
			Randomizer randomizer = new Randomizer(); //Chooses collectible.
			Collectibles newItem = randomizer.chooseCollectible(); //Get new collectible.
			String rarity = newItem.getRarity(); //Get collectible rarity.
			//Write to the file on the collectible you've obtained.
			ItemReader.appendCollectiblesInventory("CollectiblesInventory.txt", rarity, newItem);
			
			JOptionPane.showMessageDialog(null, newItem, "Found", JOptionPane.INFORMATION_MESSAGE);
			break;
		case("Nothing"):
			default:
				JOptionPane.showMessageDialog(null, "Found... Nothing.", "Empty Room", JOptionPane.INFORMATION_MESSAGE);
		}
	}
}