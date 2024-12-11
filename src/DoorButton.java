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
 * DoorButton is a JButton that .
 */
public class DoorButton extends JButton
{
	private String direction; //DoorButton has-a direction
	
	/**
	 * Purpose: Sets button name and direction.
	 * @param newDirection
	 */
	public DoorButton(String newDirection)
	{
		super(newDirection);
		direction = newDirection;
	}
	
	/**
	 * Purpose: Returns the direction.
	 * @return
	 */
	public String getDirection()
	{
		return direction;
	}
}
