import java.awt.*;  
import java.awt.event.*;
class LabelExample{  
public static void main(String args[]){  
    Frame f= new Frame("Label Example");  
    Label l1,l2,l3;  
    l1=new Label("First Label.");  
    l1.setBounds(50,100, 100,30);  
    l2=new Label("Second Label.");  
    l2.setBounds(50,150, 100,30);  
	l3=new Label("Third Label.");  
    l3.setBounds(50,200, 100,30); 
    f.add(l1); f.add(l2);f.add(l3);  
    f.setSize(400,400);  
    f.setLayout(null);  
    f.setVisible(true);  
	f.addWindowListener(new myclass());
}  
}
class myclass extends WindowAdapter
{
	public void windowClosing(WindowEvent e)
	{
		System.exit(0);
	}
}