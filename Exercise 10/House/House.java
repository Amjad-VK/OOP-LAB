/* 6. Using 2D graphics commands in an Applet, construct a house.
On mouse click event, change the color of the door from blue to
red.
*/

import java.awt.*;
import java.awt.event.*;

public class House extends Frame
implements MouseListener, MouseMotionListener  {

Color c1 = new Color(0,0,255);


public House() {
addMouseListener(this);
addMouseMotionListener(this);
addWindowListener(new MyWindowAdapter());
}
// Handle mouse clicked.
  public void mouseClicked(MouseEvent e) {  
      
       c1 = new Color(0,0,0); 
	repaint();  
    }  
    public void mouseEntered(MouseEvent e) {}  
    public void mouseExited(MouseEvent e) {}  
    public void mousePressed(MouseEvent e) {}  
    public void mouseReleased(MouseEvent e) {}
    public void mouseDragged(MouseEvent e) {}
    public void mouseMoved(MouseEvent e) {}

public void paint(Graphics g)
{ int [] x = {150, 300, 225};
int [] y = {150, 150, 25};
g.setColor(Color.red);
g.fillRect(150, 150, 150, 200); //House
g.setColor(c1);
g.fillRect(200, 200, 50, 150); // Door
g.setColor(Color.orange);
g.fillPolygon(x, y, 3); // Roof
g.setColor(Color.pink);
g.fillOval(200, 75, 50, 50); 

}
public static void main(String[] args) {
House appwin = new House();

appwin.setSize(new Dimension(1280,720));
appwin.setTitle("House");
appwin.setVisible(true);
}
}
// When the close box in the frame is clicked,
// close the window and exit the program.
class MyWindowAdapter extends WindowAdapter {
public void windowClosing(WindowEvent we) {
System.exit(0);
} }
Verified
