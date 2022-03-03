import java.awt.*;
import java.awt.event.*;
class AriGui extends Frame implements ActionListener{
TextField t1,t2,t3;
   Label l1,l2,l3;
   Button b1,b2,b3,b4,b5;
 AriGui(){
	
	l1=new Label("First Number");
	l2=new Label("Second Number");
	l3=new Label("Result");
	
	t1=new TextField(30);
	t2=new TextField(30);
	t3=new TextField(40);

	b1=new Button("Add");
	b2=new Button("Sub");
	b3=new Button("Mul");
	b4=new Button("Div");
	b5=new Button("Cancel");
  
        this.add(l1);
	this.add(t1);
	this.add(l2);
        this.add(t2);	
	this.add(l3); 			
	this.add(t3);
	this.add(b1);
	this.add(b2);
	this.add(b3);
	this.add(b4);
	this.add(b5);

	l1.setBounds(50,100,100,20);
	l2.setBounds(50,140,100,20);
	l3.setBounds(50,180,100,20);	
	t1.setBounds(200,100,100,20);
	t2.setBounds(200,140,100,20);
	t3.setBounds(200,180,100,20);
		
	b1.setBounds(50,250,50,20);
	b2.setBounds(110,250,50,20);
	b3.setBounds(170,250,50,20);
	b4.setBounds(230,250,50,20);
	b5.setBounds(290,250,50,20);

	setTitle("Arithmetic operations");
	setLayout(null);
	setVisible(true);
	setBounds(450,300,500,450);
	setBackground(Color.BLUE);
	b1.addActionListener(this);
	
}
public void actionPerformed(ActionEvent e){
int n1=Integer.parseInt(t1.getText());
int n2=Integer.parseInt(t2.getText());
		
if(e.getSource()==b1)
{
t3.setText(String.valueOf(n1+n2));
}

}}
class GUIArmain{
		public static void main(String...s){
		new AriGui();
	}
 }		 
