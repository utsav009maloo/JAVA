import java.awt.*;  
import java.awt.event.*;  
public class Program3  
{  
     Program3(){  
        Frame f= new Frame("Multi box Checked Status");  
        final Label label = new Label();          
        label.setAlignment(Label.CENTER);  
        label.setSize(400,100);  
        Checkbox c1 = new Checkbox("C++");  
        c1.setBounds(100,100, 50,50);  
        Checkbox c2 = new Checkbox("Java");  
        c2.setBounds(100,150, 50,50); 
        Checkbox c3 = new Checkbox("C");  
        c3.setBounds(100,200, 50,50);  		
        f.add(c1); f.add(c2); f.add(c3) ; f.add(label);  
        c1.addItemListener(new ItemListener() {  
             public void itemStateChanged(ItemEvent e) {               
                label.setText("C++ Checkbox: "   
                + (e.getStateChange()==1?"checked":"unchecked"));  
             }  
          });  
        c2.addItemListener(new ItemListener() {  
             public void itemStateChanged(ItemEvent e) {               
                label.setText("Java Checkbox: "   
                + (e.getStateChange()==1?"checked":"unchecked"));  
             }  
          });  
		  c3.addItemListener(new ItemListener() {  
             public void itemStateChanged(ItemEvent e) {               
                label.setText("C Checkbox: "   
                + (e.getStateChange()==1?"checked":"unchecked"));  
             }  
          });  
        f.setSize(400,400);  
        f.setLayout(null);  
        f.setVisible(true);
		f.addWindowListener(new myclass());
     }  
public static void main(String args[])  
{  
    new Program3();  
}  
 
class myclass extends WindowAdapter
{
	public void windowClosing(WindowEvent e)
	{
		System.exit(0);
	}
}
}