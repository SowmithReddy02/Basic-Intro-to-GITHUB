import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;
class JListDemo extends JFrame implements ListSelectionListener
{
  JList jl;
  DefaultListModel jd;
  JLabel l;
  JListDemo()
  {
    JLabel l= new JLabel("Colors");
    l.setBounds(500,100,50,20);
    add(l);
    jd= new DefaultListModel();
    jd.addElement("RED");
    jd.addElement("GREEN");
    jd.addElement("BLUE");
    jd.addElement("YELLOW");
    jd.addElement("ORANGE");
    jd.addElement("WHITE");
    jl= new JList(jd);
    jl.setBounds(600,100,50,100);
    jl.addListSelectionListener(this);
    add(jl);
    setLayout(new GridLayout(1,2));
    setVisible(true);
    setSize(400,400);
    setTitle("JLIST DEMO");
  }
  public void valueChanged(ListSelectionEvent lse)
  {
    JOptionPane.showMessageDialog(this, jl.getSelectedValue());
  }
  public static void main(String[] args)
  {
    new JListDemo();
  }
}