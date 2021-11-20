import java.awt.*;  
import java.awt.event.*;
public class ChoiceButton1  
{  
        ChoiceButton1(){  
        Frame f= new Frame();  
		final Label label = new Label();          
        label.setAlignment(Label.CENTER);  
        label.setSize(400,100);  
        Button b=new Button("Show");  
        b.setBounds(200,100,50,20);  
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
        f.add(c); f.add(label); f.add(b);  
        f.setSize(400,400);  
        f.setLayout(null);  
        f.setVisible(true);  
		f.addWindowListener(new myclass());
		 b.addActionListener(new ActionListener() {  
            public void actionPerformed(ActionEvent e) {       
         String data = " Selected: "+ c.getItem(c.getSelectedIndex());  
         label.setText(data);  
        }  
        });    
     }  
public static void main(String args[])  
{  
   new ChoiceButton1();  
}
class myclass extends WindowAdapter
{
	public void windowClosing(WindowEvent e)
	{
		System.exit(0);
	}
}  
}  