/* 4. Find the percentage of marks obtained by a student in 5 subjects.Display a happy face if he secures above 50% or a sad face if
otherwise.
*/

import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class PercentageMark extends Frame
implements ActionListener {

	TextField s1, s2, s3, s4, s5;

	public PercentageMark() {
		// Use a flow layout.
		setLayout(new FlowLayout());

		// Create controls.
		Label mark1 = new Label("Enter mark of Subject 1 : ",Label.CENTER);
		Label mark2 = new Label("Enter mark of Subject 2: ",Label.CENTER);
		Label mark3 = new Label("Enter mark of Subject 3: ",Label.CENTER);
		Label mark4 = new Label("Enter mark of Subject 4: ",Label.CENTER);
		Label mark5 = new Label("Enter mark of Subject 5: ",Label.CENTER);

		s1 = new TextField("0");
		s2 = new TextField("0");
		s3 = new TextField("0");
		s4 = new TextField("0");
		s5 = new TextField("0");

		// Add the controls to the frame.
		add(mark1);
		add(s1);
		add(mark2);
		add(s2);
		add(mark3);
		add(s3);
		add(mark4);
		add(s4);
		add(mark5);
		add(s5);

		// Add action event handlers.
		s1.addActionListener(this);
		s2.addActionListener(this);
		s3.addActionListener(this);
		s4.addActionListener(this);
		s5.addActionListener(this);

		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				System.exit(0);
			}
		});
	}

	
	public void actionPerformed(ActionEvent ae) {
		repaint();
	}

	public void paint(Graphics g) {
		int sum, M1, M2, M3, M4, M5;
		float percentage;
		M1 = Integer.parseInt(s1.getText());
		M2 = Integer.parseInt(s2.getText());
		M3 = Integer.parseInt(s3.getText());
		M4 = Integer.parseInt(s4.getText());
		M5 = Integer.parseInt(s5.getText());


		sum = M1 + M2 + M3 + M4 + M5;
		percentage = ((float)sum/500) * 100 ;

		g.drawString("Percentage : " + percentage,20, 100);


		//Change color to blue
        	g.setColor(Color.blue);

        	//Draw and fill the face
        	g.fillOval(100,100,250,250);

        	//Change color to black
        	g.setColor(Color.black);

        	//Draw the left eye       
        	g.fillOval(170,185,25,25);

        	//Draw the right eye        
        	g.fillOval(255,185,25,25);

        	//Draw the smile
		if ( percentage >= 50 )
        		g.drawArc(150,250,150,50,0,-180);
		else 
			g.drawArc(150,250,150,50,0,180);


	}
	public static void main(String[] args) {
		PercentageMark appwin = new PercentageMark();

		appwin.setSize(new Dimension(900, 500));
		appwin.setTitle("TextFieldDemo");
		appwin.setVisible(true);
	}
}