import java.awt.*;
import java.awt.event.*;
public class Arithmetic3 extends Frame implements ActionListener{
TextField t1,t2,t3;
 Label l1, l2,l3;
 Button b1,b2;
 Arithmetic3(){
 l1=new Label("NUM1 ");
 l2=new Label("NUM2 ");
 l3=new Label("RESULT ");
 t1=new TextField(50);
 t2=new TextField(50);
 t3=new TextField(50);
 b1=new Button("ADD");
 b2=new Button("SUB");
 setVisible(true);
 setSize(500,300);
 setTitle("Arithemetic app");
 setBackground(Color.yellow);
 setLayout(new FlowLayout());
 add(l1); add(t1); add(l2); add(t2); add(l3); add(t3); add(b1);add(b2);
 b1.addActionListener(this);
 b2.addActionListener(this);
 }
 public void actionPerformed(ActionEvent ae){
 int N1,N2,R;
 N1=Integer.parseInt(t1.getText());
 N2=Integer.parseInt(t2.getText()) ;
 if(ae.getSource().equals(b1)) {
 R=N1+N2;
 t3.setText(String.valueOf(R));
 }
 else if(ae.getSource().equals(b2)) {
 R=N1-N2;
 t3.setText(String.valueOf(R));
 }
 }
 public static void main(String[] args)
{ Arithmetic3 Ar=new Arithmetic3();
}}