import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class StudentRegistrationForm extends JFrame implements ActionListener
{
    JCheckBox c1, c2;
    JLabel title;
    JLabel name;
    JTextField tname;
    JLabel gender;
    JRadioButton male;
    JRadioButton female;
    ButtonGroup gengp;
    JLabel add, label1;
    JTextArea tadd;
    JCheckBox term;
    JButton sub;
    JTextArea tout;
    JLabel res;
    StudentRegistrationForm()
    {
        setTitle("Course registration form");
        setBounds(300, 90, 900, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);

        setLayout(null);
        title=new JLabel("Course registration form");

        title.setSize(300,30);
        title.setLocation(300, 30);
        add(title);
        name=new JLabel("Name");

        name.setSize(100, 20);
        name.setLocation(100, 100);
        add(name);
        tname=new JTextField();

        tname.setSize(100, 20);
        tname.setLocation(150, 100);
        add(tname);
        gender=new JLabel("Gender");

        gender.setSize(100, 30);
        gender.setLocation(100, 140);
        add(gender);

        male=new JRadioButton("Male");

        male.setSelected(true);
        male.setSize(100, 30);
        male.setLocation(200, 140);
        add(male);

        female=new JRadioButton("Female");

        female.setSize(100, 30);
        female.setLocation(270, 140);
        add(female);

        gengp=new ButtonGroup();
        gengp.add(male);
        gengp.add(female);
        label1=new JLabel("COURSES: ");
        label1.setBounds(100, 160, 100, 30);
        c1=new JCheckBox("C++",false);
        c1.setBounds(150, 190, 100, 50);
        c2=new JCheckBox("Java",false);
        c2.setBounds(150, 220, 100,50);
        add(c1);
        add(c2);
        add(label1);

        c1.addActionListener(this);
        c2.addActionListener(this);
        add=new JLabel("Address: ");

        add.setSize(100, 20);
        add.setLocation(100, 300);
        add(add);

        tadd=new JTextArea();

        tadd.setSize(200, 75);
        tadd.setLocation(200, 300);
        tadd.setLineWrap(true);
        add(tadd);

        term=new JCheckBox("Accept Terms and Conditions");

        term.setSize(250,20);
        term.setLocation(150, 400);
        add(term);
        sub=new JButton("Submit");

        sub.setSize(100, 20);
        sub.setLocation(150, 450);
        sub.addActionListener(this);
        add(sub);
        tout=new JTextArea();

        tout.setSize(300, 400);
        tout.setLocation(500, 100);
        tout.setLineWrap(true);
        tout.setEditable(false);
        add(tout);
        res=new JLabel("");

        res.setSize(500, 25);
        res.setLocation(100, 500);
        add(res);
        setVisible(true);


    }

    public void actionPerformed(ActionEvent e)
    {
        String data="", data1="", data2="", data3="";
        if(term.isSelected())
        {
            data="Name:"+tname.getText()+"\n";
            if(male.isSelected())
                 data1="Gender:Male"+"\n";
            else
                 data1="Gender:Female"+"\n";
            if(c1.isSelected())
                 data2="COURSES:C++"+"\n";
            if(c2.isSelected())
                 data2=data2+"Java"+"\n";

        data3="Address:"+tadd.getText();
        tout.setText(data+data1+data2+data3);

        res.setText("Registration successful");
        }
        else
        {
            tout.setText("");
            res.setText("Please accept the terms and conditions");
        }
    }

}

class RF
{
    public static void main(String[] args) throws Exception
    {
        StudentRegistrationForm f=new StudentRegistrationForm();
    }
}