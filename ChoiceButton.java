import java.awt.*;  
import java.awt.event.*;
public class ChoiceButton  
{  
        ChoiceButton(){  
        Frame f= new Frame();  
        Choice c=new Choice();  
        c.setBounds(100,100, 100,110);  
        c.add("Indore");  
        c.add("Bhopal");  
        c.add("Dewas");  
        c.add("Khandwa");  
        c.add("Shajapur");
		c.add("Alirajpur");  
        c.add("Maheshwar");  
        c.add("Jhabua");  
        f.add(c);  
        f.setSize(400,400);  
        f.setLayout(null);  
        f.setVisible(true);  
		f.addWindowListener(new myclass());
     }  
public static void main(String args[])  
{  
   new ChoiceButton();  
}
class myclass extends WindowAdapter
{
	public void windowClosing(WindowEvent e)
	{
		System.exit(0);
	}
}  
}  