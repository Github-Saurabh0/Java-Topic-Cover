import javax.swing.*;

class LoginSdemo extends JFrame
{

LoginSdemo(String s1)
{
	super(s1);
}
LoginSdemo()
{
}
void setComponents()
{
JLabel l1 = new JLabel("Welcome to Java By Saurabhh");
JTextField t1 = new JTextField();
setLayout(null);
l1.setBounds(200,100,400,30);
t1.setBounds(200,150,100,30);
add(t1);
add(l1);

}

public static void main(String [] args)
{

LoginSdemo s1 = new LoginSdemo("Welcome to Java Learning 9LPA");
s1.setVisible(true);
s1.setSize(700,700);
s1.setComponents();
s1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
}
}