import java.awt.*; 
import java.awt.event.*; 
class TextFieldGroup{  
public static void main(String args[]){  
    Frame f= new Frame("TextField");  
    TextField t1,t2;  
    t1=new TextField("Sourabh");  
    t1.setBounds(50,100, 200,30);  
    t2=new TextField("IT B");  
    t2.setBounds(50,150, 200,30);  
    f.add(t1); f.add(t2);  
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