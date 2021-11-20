import java.awt.*;
import java.awt.event.*;
public class CheckboxGroup1  
{  
     CheckboxGroup1(){  
       Frame f= new Frame("Checkbox");  
        Checkbox c1 = new Checkbox("Good");  
        c1.setBounds(100,100, 50,50);  
        Checkbox c2 = new Checkbox("Bad");  
        c2.setBounds(100,150, 50,50);  
		Checkbox c3 = new Checkbox("Average");  
        c3.setBounds(100,200, 50,50);  
        f.add(c1);  
        f.add(c2);
		f.add(c3);
        f.setSize(400,400);  
        f.setLayout(null);  
        f.setVisible(true); 
        f.addWindowListener(new myclass());		
     }  
public static void main(String args[])  
{  
    new CheckboxGroup1();  
}  
}  
class myclass extends WindowAdapter
{
	public void windowClosing(WindowEvent e)
	{
		System.exit(0);
	}
}