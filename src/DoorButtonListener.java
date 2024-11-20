import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
		//TO DO
		int row;
		int column;
		
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
