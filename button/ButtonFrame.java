package button;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
* A frame with a button panel
*/

public class ButtonFrame extends JFrame
{

	private JPanel buttonPanel;
	private static final int DEFAULT_WITH = 300;
	private static final int DEFAULT_HEIGHT = 200;

	public ButtonFrame()
	{
		setSize(DEFAULT_WITH, DEFAULT_HEIGHT);

		//Create buttons
		JButton yellowButton = new JButton("Yellow");
		JButton blueButton = new JButton("Blue");
		JButton redButton = new JButton("Red");

		buttonPanel = new JPanel();

		//add buttons to panel
		buttonPanel.add(yellowButton);
		buttonPanel.add(blueButton);
		buttonPanel.add(redButton);

		//add panel to Frame
		add(buttonPanel);

		//create button actions
		ColorAction yellowAction = new ColorAction(Color.YELLOW);
		ColorAction blueAction = new ColorAction(Color.BLUE);
		ColorAction redAction = new ColorAction(Color.RED);

		//associate actions with buttons
		yellowButton.addActionListener(yellowAction);
		blueButton.addActionListener(blueAction);
		redButton.addActionListener(redAction);
	}

	/**
	*Action listener that sets the panel's background color.
	*/

	private class ColorAction implements ActionListener
	{
		private Color backgroundColor;
		public ColorAction(Color c)
		{
			backgroundColor = c;
		}

		public void actionPerformed(ActionEvent event)
		{
			buttonPanel.setBackground(backgroundColor);
		}

	}



}