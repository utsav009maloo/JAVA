import java.awt.*;  
import java.awt.event.*;  
public class ClearButton0 {  
public static void main(String[] args) {  
    Frame f=new Frame("Clear Option");  
    final TextField tf=new TextField();  
    tf.setBounds(50,50, 150,20);  
    Button b1=new Button("Click");  
    b1.setBounds(50,100,60,30);  
    b1.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){  
            tf.setText("Hello everyone");  
        }  
    });
Button b2=new Button("CLEAR");  
    b2.setBounds(50,150,60,30);  
    b2.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){  
            tf.setText("");  
        }  
    });	
	 f.add(b1);f.add(b2);f.add(tf);
	 f.setSize(400,400);  
    f.setLayout(null);  
    f.setVisible(true);   
}  
}  