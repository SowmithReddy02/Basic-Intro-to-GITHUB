import java.applet.Applet;
import java.awt.Graphics;
public class DisplayParameter extends Applet{
  public void paint(Graphics g){
   String s=getParameter("MSG");
   g.drawString(s,50,50);
  }
}
/*<applet code="DisplayParameter.class" width="500" height="500">
<param name="MSG" value="WELCOME TO JAVA">
</applet>*/