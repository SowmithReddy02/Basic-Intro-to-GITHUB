import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
class WindowListenerDemo extends JFrame implements WindowListener{
   WindowListenerDemo(){
     addWindowListener(this);
    }
   public void windowClosing(WindowEvent e){
     System.out.println("Window Closing");System.exit(0);
    }
   public void windowOpened(WindowEvent e){
     System.out.println("Window Open");
    }
   public void windowClosed(WindowEvent e){
     System.out.println("Window Closed");
    }
   public void windowActivated(WindowEvent e){
     System.out.println("Window Activated");
    }
   public void windowDeactivated(WindowEvent e){
     System.out.println("Window Deactivated");
    }
   public void windowIconified(WindowEvent e){
     System.out.println("Window Iconified");
    }
   public void windowDeiconified(WindowEvent e){
     System.out.println("Window Deiconified");
    }
 }
class WindowListenerTest{
   public static void main(String[] args){
      WindowListenerDemo frame=new WindowListenerDemo();
      frame.setTitle("Window Listener Java Example");
      frame.setBounds(100,200,200,200);
      frame.setVisible(true);
   }
}