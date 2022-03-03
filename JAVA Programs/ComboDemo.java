import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
class ComboDemo implements ItemListener
{
    JFrame f;
    JLabel l, l1;
    JComboBox c1;

    ComboDemo()
    {
        f=new JFrame();
        f.setLayout(new FlowLayout());
        f.setTitle("LIST OF INDIAN STATES     ");
        String states[] = {"Telangana","AndhraPradesh","Bihar","Assam","Goa","Kerala"};
        c1=new JComboBox(states);
        c1.addItemListener(this);
        l=new JLabel("Select your state");
        l1=new JLabel();
        f.add(l);
        f.add(c1);
        f.add(l1);
        f.setSize(400, 300);
        f.setVisible(true);

    }
    public void itemStateChanged(ItemEvent e)
    {
        if(e.getSource()==c1)
        {
            l1.setText(" "+c1.getSelectedItem()+"Selected");

        }
    }
    public static void main(String[] args)
    {
        ComboDemo s=new ComboDemo();
    }
}