import javax.swing.*;
import java.awt.event.*;
import java.awt.Color;
import java.awt.Cursor;


class LoginScreen extends JFrame
{
JLabel l1,l2,l3,l4;
JTextField t1,t2;
JButton b1,b2,b3,b4;
LoginScreen(String s1)
{
	super(s1);
}
LoginScreen()
{
}
void setComponents()
{
	
	Cursor c1 = new Cursor(Cursor.HAND_CURSOR);
l1 = new JLabel("Welcome to Java Learning By Saurabhh");
l2 = new JLabel("USERNAME");
l3 = new JLabel("PASSWORD");
l4 = new JLabel();
t1 = new JTextField();
t2 = new JPasswordField();
b1 = new JButton("Login");
b1.setCursor(c1);

b2 = new JButton("Clear");
b3 = new JButton("Add");
b4 = new JButton("Autofill");
setLayout(null);
add(l1);
add(l2);
add(l3);
add(l4);
add(t1);
add(t2);
add(b1);
add(b2);
add(b3);
add(b4);
l1.setBounds(100, 50, 300, 30);
l2.setBounds(100, 200, 100, 30);
l3.setBounds(100, 350, 100, 30);
l4.setBounds(100, 550, 200, 30);
t1.setBounds(350, 200, 100, 30);
t2.setBounds(350, 350, 100, 30);
b1.setBounds(200, 450, 100, 30);
b2.setBounds(400, 450, 100, 30);
b3.setBounds(500, 450, 100, 30);
b4.setBounds(300, 450, 100, 30);
b1.addActionListener(new LoginButton());
b2.addActionListener(new ClearButton());
b3.addActionListener(new Add());
b4.addActionListener(new Autofill());
}
public static void main(String [] args)
{
LoginScreen s1 = new LoginScreen("Structure Way To Learn Java 9LPA JOB OFFER");
s1.setVisible(true);
s1.setSize(700,700);
s1.setComponents();
s1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
class LoginButton implements ActionListener
{
public void actionPerformed(ActionEvent e1)	
{
String s1 = t1.getText();
String s2 = t2.getText();
if(s1.equals("Saurabhh") && s2.equals("Java"))
{
	JOptionPane.showMessageDialog(null,"Login Successfull","Login Success",JOptionPane.OK_CANCEL_OPTION);
	l4.setText("Login Successfull..");
	l4.setForeground(Color.BLUE); // ✅ Set blue color
}		
else
{
	JOptionPane.showMessageDialog(null,"Login UnSuccessfull","Error",JOptionPane.ERROR_MESSAGE);
	l4.setText("Login UnSuccessfull..");
	l4.setForeground(Color.RED); // ✅ Set red Color
}
}
}
class ClearButton implements ActionListener
{
public void actionPerformed(ActionEvent e1)	
{
t1.setText("");
t2.setText("");
JOptionPane.showMessageDialog(null,"Cleared");
l4.setText("Cleared..");
l4.setForeground(Color.GREEN); // ✅ Set green color
}
}
class Add implements ActionListener
{
public void actionPerformed(ActionEvent e1)	
{
	try
	{
int a = Integer.parseInt(t1.getText());
int b = Integer.parseInt(t2.getText());
int c = a+b;
l4.setText("Your Answer is: "+c);
l4.setForeground(Color.GREEN); // ✅ Set green color
	}
	catch(Exception e2)
	{
		JOptionPane.showMessageDialog(null,"Please enter number only!");
		l4.setText("Please enter number only!!");
		l4.setForeground(Color.RED);
	}
}
}
class Autofill implements ActionListener
{
public void actionPerformed(ActionEvent e1)	
{
t1.setText("Saurabhh");
t2.setText("Java");
}
}


}