import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.*;
/**
 * Lead Author(s):
 * @author Stephen Basilio
 * 
 * Other contributors:
 * None
 * 
 * References:
 * GoneFishingView
 * 
 * Version/date: 2024-06 (4.32.0)
 * 
 * Responsibilities of class:
 * Generates the Game Window.
 */
public class GameView extends JFrame
{
	private GameModel model; //GameView has-a model
	
	/**
	 * Purpose: Sets the main view of the game. Used to start the game. 
	 * @param model
	 */
	public GameView(GameModel model)
	{
		super(); //Calls the superclass JFrame to make the constructor a JFrame. This helps give it JFrame properties
		this.model = model;
		//Sets the title
		this.setTitle("Collectible Hunt");
		//Sets layout for the window for buttons
		this.setLayout(new BorderLayout()); 
		
		//Left Button
		DoorButton leftButton = new DoorButton("Left");
		leftButton.setPreferredSize(new Dimension(200, 100));
		leftButton.addActionListener(new DoorButtonListener(model, this, leftButton));
		//Right Button
		DoorButton rightButton = new DoorButton("Right");
		rightButton.setPreferredSize(new Dimension(200, 100));
		rightButton.addActionListener(new DoorButtonListener(model, this, rightButton));
		//Up Button
		DoorButton upButton = new DoorButton("Up");
		upButton.setPreferredSize(new Dimension(100, 100));
		upButton.addActionListener(new DoorButtonListener(model, this, upButton));
		//Down Button
		DoorButton downButton = new DoorButton("Down");
		downButton.setPreferredSize(new Dimension(100, 100));
		downButton.addActionListener(new DoorButtonListener(model, this, downButton));
		
		//Add buttons to each side of the screen
		this.add(leftButton, BorderLayout.WEST);
		this.add(rightButton, BorderLayout.EAST);
		this.add(upButton, BorderLayout.NORTH);
		this.add(downButton, BorderLayout.SOUTH);
		
		//Label for instructions
		JPanel instructionsPanel = new JPanel();
		JLabel instructionsLabel = new JLabel("Click the buttons to move. See how many Collectibles you can get without dying!");
		instructionsPanel.add(instructionsLabel);
		this.add(instructionsPanel, BorderLayout.CENTER);
		
		//Default settings for Jframe
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1000,800);
		setVisible(true);
	}

	/**
	 * Starts the game
	 * @param args 
	 */
	public static void main(String[] args)
	{
		new GameView(new GameModel());
	}
}
