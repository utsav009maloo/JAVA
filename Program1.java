import java.awt.*;  
import java.awt.event.*;  
public class Program1 {  
public static void main(String[] args) {  
    Frame f=new Frame("Four Button");  
    final TextField tf=new TextField();  
    tf.setBounds(50,50, 150,20);  
    Button b1=new Button("Hindi");  
    b1.setBounds(50,100,60,30);  
    b1.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){  
            tf.setText("hindi language");  
        }  
    });
Button b2=new Button("English");  
    b2.setBounds(50,150,60,30);  
    b2.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){  
            tf.setText("English language");  
        }  
    });	
	Button b3=new Button("English+Hindi");  
    b3.setBounds(50,200,60,30);  
    b3.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){  
            tf.setText("English+Hindi language");  
        }  
    });	
	Button b4=new Button("None");  
    b4.setBounds(50,250,60,30);  
    b4.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){  
            tf.setText("Not any Language");  
        }  
    });	
    f.add(b1);f.add(b2);f.add(b3);f.add(b4);f.add(tf);  
    f.setSize(400,400);  
    f.setLayout(null);  
    f.setVisible(true);   
}  
}  