import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class CompArea extends JFrame implements ActionListener{
JTextField t1,t2;
   JLabel l1,l2;
   JButton b1;
 CompArea(){
	l1=new JLabel("Enter Radius");

	l2=new JLabel("Area of Circle is ");

	t1=new JTextField(30);

	t2=new JTextField(30);

	b1=new JButton("CompArea");
    this.add(l1);
	this.add(t1);
	this.add(l2);
    this.add(t2);
	this.add(b1);

	l1.setBounds(50,100,100,20);
	l2.setBounds(50,140,100,20);

	t1.setBounds(200,100,150,20);
	t2.setBounds(200,140,150,20);


	b1.setBounds(100,200,100,50);


	setTitle("Area of Circle");
	setLayout(null);
	setVisible(true);
	setBounds(450,250,500,300);
	setBackground(Color.WHITE);
	b1.addActionListener(this);

}
public void actionPerformed(ActionEvent e)
{
  float n1=Float.parseFloat(t1.getText());


if(e.getSource()==b1)
{
t2.setText(String.valueOf(3.14*n1*n1));
}

}
}
class AreaOfCircle{
		public static void main(String args[])
    {
		new CompArea();
	}
 }