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
	private String direction;
	
	public DoorButton(String newDirection)
	{
		super(newDirection);
		direction = newDirection;
	}
	
	public String getDirection()
	{
		switch(direction)
		{
		case "Left":
			return "Left";
		case "Right":
			return "Right";
		case "Up":
			return "Up";
		case "Down":
			return "Down";
			default:
				return null;
		}
	}
}
