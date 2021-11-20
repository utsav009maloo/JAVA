import java.awt.*;  
import javax.swing.*;  
public class New3 {  
     New3()  
        {  
        JFrame f= new JFrame("Panel Example");    
        JPanel panel=new JPanel();  
        panel.setBounds(50,50,500,500);    
        panel.setBackground(Color.gray);    
		JSlider slider = new JSlider(JSlider.HORIZONTAL, 0, 200, 120);  
        slider.setMinorTickSpacing(5);  
        slider.setMajorTickSpacing(50);  
        slider.setPaintTicks(true);  
        slider.setPaintLabels(true);
		JTextArea area=new JTextArea("Hello ,My name is Sourabh");  
        area.setBounds(50,50, 150,200);  
        panel.add(area); 
		panel.add(slider);
        f.add(panel);  
                f.setSize(700,700);    
                f.setLayout(null);    
                f.setVisible(true);    
        }  
        public static void main(String args[])  
        {  
        new New3();  
        }  
    }  