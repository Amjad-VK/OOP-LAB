// 3.Program to find maximum of three numbers using AWT

import java.awt .*;
import java.awt.event .*;
public class Maxof3 extends Frame implements ActionListener {
TextField nm1,nm2,nm3;
public Maxof3 () {
setLayout(new FlowLayout());
Label a = new Label("Number1: ",Label.RIGHT );
Label b = new Label("Number2: ",Label.RIGHT );
Label c = new Label("Number3: ",Label.RIGHT );

nm1 = new TextField (8);
nm2 = new TextField (8);
nm3 = new TextField (8);

add(a);
add(nm1);
add(b);
add(nm2);
add(c);
add(nm3);

nm1.addActionListener(this);
nm2.addActionListener(this);
nm3.addActionListener(this);

addWindowListener(new WindowAdapter (){
public void windowClosing(WindowEvent we) {
System.exit(0);
}
});
}

public void actionPerformed(ActionEvent ae) {
repaint();
}
public void paint(Graphics g) {
	int a,b,c;

    g.drawString("First No:" + nm1.getText(),20, 120);		//print 3 nos
	g.drawString("Second No: " +nm2.getText(), 20, 140);
	g.drawString("Third No: " +nm3.getText(), 20, 160);

        //  String a = nm1.getText();
		// String b = nm2.getText();
		// String c = nm3.getText();
        
		a = Integer.parseInt(nm1.getText());
		b= Integer.parseInt(nm2.getText());
		c= Integer.parseInt(nm3.getText());




  if((a > b)&&(a > c))
        {
            g.drawString("Maximum no is:"+a,20,200);
        }
        else if(b > c)
        {
            g.drawString("Maximum no is:"+b,20,200);
        }
        else
        {
            g.drawString("Maximum no is:"+c,20,200);
        }



	  	}		



public static void main(String[] args) {
	Maxof3 appwin = new Maxof3();
	appwin.setSize(new Dimension(700,700));
	appwin.setTitle("Maximum of 3 number");
	appwin.setVisible(true);
}
}       
