import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.applet.*;
class KeyEventDemo extends Frame implements KeyListener{
int xin=10,yin=10;
String x;
Label jf;
String MSG="KEY TYPED IS ";
KeyEventDemo(){
jf=new Label();
jf.setBounds(100,650,300,30);
add(jf);
addKeyListener(this);
}
public void paint(Graphics g){
int x=40+xin;
int y=40+yin;
g.setColor(Color.yellow);
g.fillRect(x,y,100,50);
}
public void keyPressed(KeyEvent evt){
int key=evt.getKeyCode();
if(key==KeyEvent.VK_LEFT){
xin-=10;
repaint();
}
else if(key==KeyEvent.VK_RIGHT){
xin+=10;
repaint();
}
if(key==KeyEvent.VK_UP){
yin-=10;
repaint();
}
if(key==KeyEvent.VK_DOWN){
yin+=10;
repaint();
}
}
public void keyTyped(KeyEvent evt){
MSG="KEY TYPED IS ";
x=x+evt.getKeyChar();
MSG=MSG+" "+x;
jf.setText(MSG);
}
public void keyReleased(KeyEvent evt){
int x=evt.getKeyCode();
switch(x){
case KeyEvent.VK_RIGHT:
MSG="KEY RELEASE IS RIGHT ARROW";
break;
case KeyEvent.VK_LEFT:
MSG="KEY RELEASE IS LEFT ARROW";
break;
case KeyEvent.VK_UP:
MSG="KEY RELEASE IS UP ARROW";
break;
case KeyEvent.VK_DOWN:
MSG="KEY RELEASE IS DOWN ARROW";
break;
}
jf.setText(MSG);
}
}
class KeyEvents{
public static void main(String args[]){
KeyEventDemo f=new KeyEventDemo();
f.setTitle("KEY EVENTS");
f.setSize(700,700);
f.setLayout(null);
f.setVisible(true);
}
}