import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.applet.*;
class Card2 extends Panel implements ActionListener
{
	JFrame jf1;
	Label l1,l2,l3,l4;
	TextField t1,t2,t3,t4;
	Button b3;
	Card2()
	{
		
		l1 = new Label("Name");
		l2 = new Label("Branch");
		l3 = new Label("Email");
		l4 = new Label("Address");
		t1 = new TextField(50);
		t2 = new TextField(50);
		t3 = new TextField(50);
		t4 = new TextField(50);  
		b3 = new Button("Submit");
		
		add(l1);
		add(l2);
		add(l3);
		add(l4);
		add(t1);
		add(t2);
		add(t3);
		add(t4);
		add(b3);
		
		b3.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		JOptionPane.showMessageDialog(jf1,"Succsefully Registered!");
	}
}
class Card1 extends Panel
{
	Label l7,l8;
	TextField t7,t8;
	Button b5,b6;
	Card1()
	{
	//	b4 = new Button("Register");
		l7 = new Label("Username");
		l8 = new Label("Password");
		t7 = new TextField(50);
		t8 = new TextField(50);
                t7.setSize(50,10);
t8.setSize(50,10);		
b5 = new Button("Login");
		b6 = new Button("Sign Up");
		
		add(l7);
		add(l8);
		add(t7);
		add(t8);
		add(b5);
		add(b6);
		
	}
}
public class RtuApp extends Applet implements ActionListener
{
	Label l5,l6;
	Button b7,b8;
	Panel p1,p2;
	CardLayout cl;
	Card1 cl1;
	Card2 cl2;
	public void init()
	{
		GridLayout gl = new GridLayout(1,1);
		setLayout(gl);
		p1 = new Panel();
		p2 = new Panel();
		p1.setBackground(Color.yellow);
		cl = new CardLayout(0,0);
		p2.setLayout(cl);
		l5 = new Label("RAJASTHAN TECHNICAL UNIVERSITY");
		l6 = new Label("ABOUT RTU");
		b7 = new Button("Login");
		b8 = new Button("SignUp");
		
		add(p1);
        add(p2);
		p1.add(l5);
		p1.add(l6);
		p1.add(b7);
		p1.add(b8);
		cl1 = new Card1();
		p2.add(cl1,"First");
		cl2 = new Card2();
		p2.add(cl2,"Second");
		b7.addActionListener(this);
		b8.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		String s = ae.getActionCommand();
		if(s.equals("Login"))
		{
			cl.show(p2,"First");
		}
		else if(s.equals("SignUp"))
		{
			cl.show(p2,"Second");
		}
	}
	//<applet code="RtuApp" width=600 height=600></applet>
}
