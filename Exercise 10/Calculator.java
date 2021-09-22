/*5.Implement a simple calculator using AWT components.
*/
import java.awt.*;
import java.awt.event.*;

class CalculatorDesign extends Frame implements ActionListener{
  TextField num1View, num2View;
  Button add,substract,multiply,divide;
  float result;
  public CalculatorDesign() {
    setLayout(new FlowLayout());
    Label lbl1 = new Label("Enter Value 1:",Label.RIGHT);
    Label lbl2 = new Label("Enter Value 2:", Label.RIGHT);
    num1View = new TextField();
    num2View = new TextField();
    add = new Button("+");
    substract = new Button("-");
    multiply = new Button("X");
    divide = new Button("/");
    add(lbl1);
    add(num1View);
    add(lbl2);
    add(num2View);
    add(add);
    add(substract);
    add(multiply);
    add(divide);
    add.addActionListener(this);
    substract.addActionListener(this);
    divide.addActionListener(this);
    multiply.addActionListener(this);
  }

  public void actionPerformed(ActionEvent e) {
    float num1 = Float.parseFloat(num1View.getText()); //Integer.valueOf(num1View.getText());
    float num2 = Float.parseFloat(num2View.getText()); //Integer.valueOf(num2View.getText());
    if(e.getSource() == add) {
         result = num1 + num2;
    } else if(e.getSource() == substract) {
         result = num1 - num2;
    } else if(e.getSource() == multiply) {
         result = num1 * num2;
    } else if(e.getSource() == divide) {
         result = num1 / num2;
    }
    repaint();
  }

  public void paint(Graphics g) {
    g.drawString("Result:"+String.valueOf(result), 200,200);
  }
}

class Calculator {
  public static void main(String[] args) {
    CalculatorDesign calc = new CalculatorDesign();
    calc.setSize(new Dimension(450,450));
    calc.setTitle("CalculatorDesign");
    calc.setVisible(true);
  }
}