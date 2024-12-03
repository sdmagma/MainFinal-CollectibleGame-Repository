import javax.swing.JButton;
/**
 * Lead Author(s):
 * @author Stephen Basilio
 * 
 * Other contributors:
 * None
 * 
 * References:
 * FishingButton
 * 
 * Version/date: 2024-06 (4.32.0)
 * 
 * Responsibilities of class:
 * DoorButton is a JButton that includes changing the location of the character on the map.
 */
public class DoorButton extends JButton
{
	private int upDistance, downDistance, leftDistance, rightDistance;
	private int rowLocation;
	private int columnLocation;
	
	public DoorButton(int up, int down, int left, int right)
	{
		upDistance = up;
		downDistance = down;
		leftDistance = left;
		rightDistance = right;
	}

	public void setRow(int row)
	{
		rowLocation = row;
	}
	
	public void setColumn(int column)
	{
		columnLocation = column;
	}
	
	public int getRow()
	{
		return rowLocation;
	}
	
	public int getColumn()
	{
		return columnLocation;
	}
}
