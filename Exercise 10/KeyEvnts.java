//8.Develop a program to handle Key events

import java.awt.*;
import java.awt.event.*;

public class KeyEvnts extends Frame
implements KeyListener {

	String msg ="";
	String keyState = "";
	public KeyEvnts() {
		addKeyListener(this);
		addWindowListener(new
		MyWindowAdapter());
	}

	// Handle a key press.
	public void keyPressed(KeyEvent ke) {
		setBackground(Color.green);
		keyState = "Key Pressed";
		repaint();
	}

	// Handle a key release.
	public void keyReleased(KeyEvent ke) {
		setBackground(Color.red);
		keyState = "Key Released";
		repaint();
	}

	// Handle key typed.
	public void keyTyped(KeyEvent ke) {
		msg += ke.getKeyChar();
		repaint();
	}

	// Display keystrokes.
	public void paint(Graphics g) {
		g.drawString(msg, 20, 100);
		g.drawString(keyState, 20, 50);
	}

	public static void main(String[] args) {
		KeyEvnts appwin = new KeyEvnts();

		appwin.setSize(new Dimension(200, 150));
		appwin.setTitle("KEY EVENTS");
		appwin.setVisible(true);
	}
}


class MyWindowAdapter extends WindowAdapter {
	public void windowClosing(WindowEvent we) {
		System.exit(0);
	}
}