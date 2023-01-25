import java.awt.*;
import java.io.IOException;

import javax.swing.*;
import javax.swing.border.Border;


@SuppressWarnings("serial")
public abstract class Base extends JFrame{
	Image img = Toolkit.getDefaultToolkit().getImage("image/pixel-art.gif");
	Image newImage = img.getScaledInstance(1500, 800, Image.SCALE_DEFAULT);
	public int score[];
	
	
	//Constructor: Defines state/behavior that all child frames will inherit
	public Base() {
			super("snakegame");
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			this.setSize(1500, 800); //setting size of all game screens
			this.setResizable(false); //user cannot resize frame
			this.setVisible(true);
	}//end of ScreenFrame constructor
	
	/**
	 * This method creates a custom JButton
	 * @param text Text to be put on button
	 * @param x X coordinate of button
	 * @param y Y coordinate of button
	 * @param width Width of button
	 * @param height Height of button
	 * @param fg Foreground color
	 * @param bg Background color
	 * @param font Font of button
	 * @return Customized JButton
	 */
	public JButton addCustomButton(String text, int x, int y, int width, int height,Border bd, Color fg, Color bg, Font font) {
		JButton button = new JButton(text);
		button.setBounds(x, y, width, height);
		button.setForeground(fg);
		button.setBackground(bg);
		button.setFont(font);
		button.setFocusable(false);
		button.setBorder(bd);
		return button;
	}//end of addCustomButton method
	
	/**
	 * This method creates a custom JButton without x and y coordinates in case the JButton is being 
	 * placed with a layout manager
	 * @param text Text to be put on button
	 * @param width Width of button
	 * @param height Height of button
	 * @param fg Foreground color
	 * @param bg Background color
	 * @param font Font of button
	 * @return Customized JButton
	 */
	protected JButton addCustomButton(String text, int width, int height,Border bd, Color fg, Color bg, Font font) {
		JButton button = new JButton(text);
		button.setPreferredSize(new Dimension(width, height));
		button.setForeground(fg);
		button.setBackground(bg);
		button.setFont(font);
		button.setBorder(bd);
		button.setFocusable(false);
		return button;
	}//end of addCustomButton method
	
	/**
	 * This method creates a custom JLabel
	 * @param text Text to be put on label
	 * @param fg Foreground color
	 * @param font Font of label
	 * @return Customized JLabel
	 */
	protected JLabel addCustomLabel(String text, Color fg, Font font) {
		JLabel label = new JLabel(text);
		label.setForeground(fg);
		label.setFont(font);
		return label;
	}//end of addCustomLabel method
	
}