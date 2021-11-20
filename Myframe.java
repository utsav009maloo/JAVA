import java.awt.*;
import java.awt.event.*;
class Myframe extends Frame
{
   public static void main(String args[])
   {
	   
    Myframe f= new Myframe();
    f.setVisible(true);
    f.setSize(500,300);
    f.setTitle("Myframe");
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