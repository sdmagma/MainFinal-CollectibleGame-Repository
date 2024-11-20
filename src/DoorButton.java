import javax.swing.JButton;

public class DoorButton extends JButton
{

	public DoorButton()
	{
		
	}

	/**
	 * Purpose: Returns the row location of the room
	 * @return row
	 */
	public int getRow()
	{
		return row;
	}
	
	/**
	 * Purpose: Returns the column location of the room
	 * @return column
	 */
	public int getColumn()
	{
		return column;
	}
}
