/*1. Program to draw Circle, Rectangle, Line*/

import java.awt.*;
import java.awt.event.*;

public class Graphicsrlc extends Frame {

	public Graphicsrlc() {
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
			System.exit(0);
			}
		});
	}

									// To Draw in colors.
	public void paint(Graphics g) {
		Color c1 = new Color(100, 100, 100);
		



		g.setColor(Color.red);					//for draw circle
		g.drawOval(20, 40, 50, 50);
		

		

		g.setColor(Color.green);					//for draw rectangle
		g.drawRect(20, 200, 60, 60);
		
		

		g.setColor(c1);						//for draw line
		g.drawLine(20, 400, 50, 600);
		



}

public static void main(String[] args) {
	Graphicsrlc appwin = new Graphicsrlc();							//craete object for Graphicsrlc

	appwin.setSize(new Dimension(640,640));
	appwin.setTitle("Circle,Rectangle & Line");
	appwin.setVisible(true);
	}
}