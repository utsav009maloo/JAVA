import java.awt.*;
import javax.swing.*;
public class Gridlyt
{
JFrame f;
Gridlyt ()
{
  f= new JFrame();
  JButton b1=new JButton("0");
  JButton b2=new JButton("1");
  JButton b3=new JButton("2");
  JButton b4=new JButton("3");
  JButton b5=new JButton("4");
  JButton b6=new JButton("5");
  JButton b7=new JButton("6");
  JButton b8=new JButton("7");
  JButton b9=new JButton("8");
  JButton b10=new JButton("9");

  
  f.add(b1);f.add(b2);f.add(b3);
  f.add(b4);f.add(b5);f.add(b6);
  f.add(b7);f.add(b8);f.add(b9);
  f.add(b10);

  
  f.setLayout(new GridLayout(4,3));
  f.setSize(400,400);
  f.setVisible(true);
  f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  
 }
public static void main(String[]args){
  new Gridlyt();
}
}  