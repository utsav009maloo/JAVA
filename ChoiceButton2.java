import java.awt.*;  
import java.awt.event.*;
public class ChoiceButton2  
{  
        ChoiceButton2(){  
        Frame f= new Frame();  
		final Label label = new Label();          
        label.setAlignment(Label.CENTER);  
        label.setSize(400,100);  
        Button b1=new Button("Show");  
        b1.setBounds(200,150,50,20); 
        Button b2=new Button("Clear");  
        b2.setBounds(200,200,50,20); 		
        Choice c=new Choice();  
        c.setBounds(100,100, 110,110);  
        c.add("Indore");  
        c.add("Bhopal");  
        c.add("Dewas");  
        c.add("Dhar");  
        c.add("Sehore");
		c.add("Ujjain");  
        c.add("Rajgarh");  
        c.add("Harda");  
        c.add("Khandwa");  
        c.add("Shajapur");
		c.add("Alirajpur");  
        c.add("Maheshwar");  
        c.add("Jhabua");  
        c.add("Mandsaur");  
        c.add("Guna");
		c.add("Gwalior");  
        c.add("Shivpuri");  
        c.add("Damoh");  
        c.add("Betul");  
        c.add("Burhanpur");
        f.add(c); f.add(label); f.add(b1);f.add(b2);  
        f.setSize(400,400);  
        f.setLayout(null);  
        f.setVisible(true);  
		f.addWindowListener(new myclass());
		 b1.addActionListener(new ActionListener() {  
            public void actionPerformed(ActionEvent e) {       
         String data = " Selected: "+ c.getItem(c.getSelectedIndex());  
         label.setText(data);  
        }  
        });    
		b2.addActionListener(new ActionListener() {  
            public void actionPerformed(ActionEvent e) {         
         label.setText("");  
        }  
        });    
     }  
public static void main(String args[])  
{  
   new ChoiceButton2();  
}
class myclass extends WindowAdapter
{
	public void windowClosing(WindowEvent e)
	{
		System.exit(0);
	}
}  
}  