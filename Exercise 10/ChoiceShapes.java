/*2.Develop a program that has a Choice component which contains
the names of shapes such as rectangle, triangle, square and circle
Draw the corresponding shapes for given parameters as per user’s
choice*/

import java.awt.*;
import java.awt.event.*;
public class ChoiceShapes extends Frame
implements ItemListener{
    Choice shape;
    String msg="";
    public ChoiceShapes(){
        setLayout(new FlowLayout());
        shape=new Choice();
        
        shape.add("Rectangle");
        shape.add("Triangle");
        shape.add("Square");
        shape.add("Circle");

        add(shape);

        shape.addItemListener(this);

addWindowListener(new WindowAdapter (){
public void windowClosing(WindowEvent we) {
System.exit(0);
}
});
}
public void itemStateChanged(ItemEvent ie) {
repaint();
}
public void paint(Graphics g) {
    String ch=shape.getSelectedItem();
		switch(ch){
			case "Circle":   g.fillOval(100, 200, 100, 100); //fill an ellipse with parameter for top,left,width and height
					 break;

			case "Triangle": g.drawLine(120, 130, 280, 130);
        				     g.drawLine(120, 130, 200, 65);
        				     g.drawLine(200, 65, 280, 130);
					 break;

			case "Rectangle":g.fillRect(200, 160, 30, 80); //filled rectangle method with parameter for top,left,width and height
					 break;

			case "Square":g.fillRect(200, 160, 70, 70); //filled rectangle method with parameter for top,left,width and height
					 break;

		}
	}
    
    public static void main(String[] args){
ChoiceShapes appwin = new ChoiceShapes();
appwin.setSize(new Dimension(240,180));
appwin.setTitle("ChoiceShapes");
appwin.setVisible(true);

}

}
Verified
