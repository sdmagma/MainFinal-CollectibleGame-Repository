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
 * FishingButtonListener
 * 
 * Version/date: 2024-06 (4.32.0)
 * 
 * Responsibilities of class:
 * DoorButtonListener checks what kind of room the button sends you in.
 */
public class DoorButtonListener implements ActionListener //DoorButtonListener is an Action Listener
{
	private GameModel gameModel;
	private GameView gameView;
	private DoorButton doorButton;
	
	public DoorButtonListener(GameModel gameModel, GameView gameView, DoorButton doorButton)
	{
		this.gameModel = gameModel;
		this.gameView = gameView;
		this.doorButton = doorButton;
	}

	public void actionPerformed(ActionEvent e)
	{	
		//if and if else cases for when player goes up, down, left, right. 
		//Button itself tells whether to go which direction.
		
		String direction = doorButton.getDirection();
		gameModel.updatePlayerPosition(direction);
		System.out.println(direction + " has been pressed");
		int row = gameModel.getRow();
		int column = gameModel.getColumn();
		switch(gameModel.entityAt(row, column))
		{
		case("Monster"):
			JOptionPane.showMessageDialog(null, "Dude... you died", "Found", JOptionPane.INFORMATION_MESSAGE);
			System.exit(0);
			break;
		case("Collectible"):
			Randomizer randomizer = new Randomizer();
			JOptionPane.showMessageDialog(null, randomizer.chooseCollectible(), "Found", JOptionPane.INFORMATION_MESSAGE);
			break;
			default:
				JOptionPane.showMessageDialog(null, "Found... Nothing.", "Found", JOptionPane.INFORMATION_MESSAGE);
		}
	}
}