import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
		int row = doorButton.getRow();
		int column = doorButton.getColumn();
		
		String roomStatus = gameModel.entityAt(row, column);
		if(roomStatus == "Nothing")
		{
			
		}
		else if(roomStatus == "Collectible")
		{
			
		}
		else if(roomStatus == "Monster")
		{
			
		}
	}
}
