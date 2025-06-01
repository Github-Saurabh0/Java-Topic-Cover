import javax.swing.*;
import java.awt.event.*;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;  

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

Font f = new Font("Calibri", Font.BOLD, 25);
Font lablel1 = new Font("Calibri", Font.BOLD, 25);	

Cursor c1 = new Cursor(Cursor.HAND_CURSOR);
l1 = new JLabel("Welcome to Java Learning By Saurabhh");
l1.setFont(lablel1);
l2 = new JLabel("USERNAME");
l2.setFont(f);
l3 = new JLabel("PASSWORD");
l3.setFont(f);
l4 = new JLabel();
t1 = new JTextField();
t2 = new JPasswordField();
b1 = new JButton("Login");
b1.setBackground(Color.BLUE);
b1.setForeground(Color.WHITE);
b1.setCursor(c1);
b2 = new JButton("Clear");
b2.setBackground(Color.GREEN);
b2.setForeground(Color.WHITE);
b2.setCursor(c1);
b3 = new JButton("Add");
b3.setBackground(Color.YELLOW);
b3.setForeground(Color.BLACK);
b3.setCursor(c1);
b4 = new JButton("Autofill");
b4.setBackground(Color.PINK);
b4.setForeground(Color.WHITE);
b4.setCursor(c1);
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
l1.setBounds(130, 50, 450, 40);
l2.setBounds(150, 150, 200, 50);
l3.setBounds(150, 250, 200, 50);
l4.setBounds(100, 550, 200, 30);
t1.setBounds(350, 150, 100, 30);
t2.setBounds(350, 250, 100, 30);
b1.setBounds(130, 350, 100, 30);
b2.setBounds(230, 350, 100, 30);
b3.setBounds(330, 350, 100, 30);
b4.setBounds(430, 350, 100, 30);
b1.addActionListener(new LoginButton());
b2.addActionListener(new ClearButton());
b3.addActionListener(new Add());
b4.addActionListener(new Autofill());
l2.addMouseListener(new MouseL());

}
public static void main(String [] args)
{
LoginScreen s1 = new LoginScreen("Structure Way To Learn Java 9LPA JOB OFFER");
s1.setVisible(true);
s1.setSize(700,700);
s1.setComponents();
s1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}

class MouseL  implements MouseListener
{
	
	public void mouseClicked(MouseEvent e) {  
        l2.setText("Mouse Clicked");  
    }  
    public void mouseEntered(MouseEvent e) {  
        l2.setText("Mouse Entered");  
    }  
    public void mouseExited(MouseEvent e) {  
        l2.setText("USERNAME");  
    }  
    public void mousePressed(MouseEvent e) {  
        l2.setText("Mouse Pressed");  
    }  
    public void mouseReleased(MouseEvent e) {  
        l2.setText("Mouse Released");  
    }  
	
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