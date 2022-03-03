import java.awt.*;
import java.awt.event.*;
import java.applet.Applet;
class MouseEventDemo extends Frame implements MouseMotionListener,MouseListener,ActionListener{
Button b;
List l2;
Label l3;
MouseEventDemo(){
b=new Button("Refresh");
b.setBackground(Color.WHITE);
b.addActionListener(this);
b.setBounds(100,100,80,50);
add(b);
Label l=new Label("Colors");
l.setBounds(500,100,50,20);
add(l);
l2=new List(3);
l2.setSize(70,100);
l2.add("red");
l2.add("blue");
l2.add("yellow");
l2.add("green");
l2.add("orange");
l2.add("white");
l2.setBounds(600,100,50,100);
add(l2);
l3=new Label();
l3.setBounds(100,650,100,50);
add(l3);
addMouseMotionListener(this);
addMouseListener(this);
}
public void actionPerformed(ActionEvent e){
setBackground(Color.WHITE);
repaint();
}
public void mouseDragged(MouseEvent e){
Graphics g=this.getGraphics();
String c=l2.getSelectedItem();
switch(c){
case "red":
g.setColor(Color.RED);
break;
case "blue":
g.setColor(Color.BLUE);
break;
case "yellow":
g.setColor(Color.YELLOW);
break;
case "green":
g.setColor(Color.GREEN);
break;
case "orange":
g.setColor(Color.ORANGE);
break;
case "white":
g.setColor(Color.WHITE);
break;
}
g.fillOval(e.getX(),e.getY(),10,10);
}

public void mouseClicked(MouseEvent e){
Graphics g=getGraphics();
String c=l2.getSelectedItem();
switch(c){
case "red":
g.setColor(Color.RED);
break;
case "blue":
g.setColor(Color.BLUE);
break;
case "yellow":
g.setColor(Color.YELLOW);
break;
case "green":
g.setColor(Color.GREEN);
break;
case "orange":
g.setColor(Color.ORANGE);
break;
case "white":
g.setColor(Color.WHITE);
break;
}
g.fillOval(e.getX(),e.getY(),30,30);
}
public void mouseReleased(MouseEvent e){
String msg="Mouse Released at the position ";
int x=e.getX();
int y=e.getY();
msg=msg+x+" "+y;
l3.setText(msg);
}
public void mouseEntered(MouseEvent e){
l3.setText("Mouse Entered ");
}
public void mouseExited(MouseEvent e){
l3.setText("Mouse Exited ");
}
public void mousePressed(MouseEvent e){
String msg="Mouse Pressed at the position ";
int x=e.getX();
int y=e.getY();
msg=msg+x+" "+y;
l3.setText(msg);
}
public void mouseMoved(MouseEvent e){
String msg="Mouse Moved at the position ";
int x=e.getX();
int y=e.getY();
msg=msg+x+" "+y;
l3.setText(msg);
}
}
class MouseEvents{
public static void main(String args[]){
MouseEventDemo f=new MouseEventDemo();
f.setLayout(null);
f.setTitle("Mouse Events");
f.setSize(700,700);
f.setVisible(true);
}
}