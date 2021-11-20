import java.awt.* ;
import java.awt.event.*;

class Car extends Frame
{
	public final int FIGUREHEIGHT = 280;
	public final int FIGUREWIDTH  = 445;
        Color RED = new Color ( 255, 0, 0 ) ;
        Color GREEN = new Color ( 0, 255, 0 ) ;
        Color LTBLUE = new Color ( 35, 206, 255 ) ;
        Color DARKGOLD = new Color ( 240, 220, 0 ) ;

	public void paint (Graphics g)
			
	{
			
                g.setColor ( Color.white ) ;
                g.fillRect ( 0, 0, FIGUREWIDTH, FIGUREHEIGHT ) ;

			
                g.setColor ( Color.black ) ;
  		g.fillOval ( 20, 170, 100, 100 ) ;
                g.setColor ( Color.white ) ;
  		g.fillOval ( 30, 180, 80, 80 ) ;
                g.setColor ( Color.black ) ;
  		g.drawOval ( 40, 190, 60, 60 ) ;

			
                g.setColor ( Color.black ) ;
  		g.fillOval ( 270, 170, 100, 100 ) ;
                g.setColor ( Color.white ) ;
  		g.fillOval ( 280, 180, 80, 80 ) ;
                g.setColor ( Color.black ) ;
  		g.drawOval ( 290, 190, 60, 60 ) ;

			
                g.setColor ( GREEN ) ;
  		g.fillRect ( 10, 113, 122, 12 ) ;
                g.setColor ( RED ) ;
  		g.fillRect ( 10, 123, 122, 82 ) ;

			
                g.setColor ( DARKGOLD ) ;
  		g.fillOval ( 10, 105, 10, 10 ) ;

		
                g.setColor ( LTBLUE ) ;
                g.fillRect ( 130, 15, 130, 100 ) ; 

			
                g.setColor ( RED ) ;
  		g.fillRect ( 130, 113, 130, 92 ) ;

			
                g.setColor ( RED ) ;
  		g.fillRect ( 258, 15, 122, 190 ) ;

			
                g.setColor ( RED ) ;
  		g.fillRect ( 378, 80, 57, 125 ) ;

			
                g.setColor ( GREEN ) ;
  		g.fillRect ( 118, 205, 154, 10 ) ;

			
                g.setColor ( Color.black ) ;
		g.drawLine ( 131, 15, 110, 30) ;
		g.drawLine ( 131, 16, 110, 31) ;
		g.drawLine ( 131, 17, 110, 32) ;

			
                g.setColor ( Color.black ) ;
		g.drawLine ( 145, 125, 170, 125) ;
		g.drawLine ( 145, 124, 170, 124) ;
		g.drawLine ( 145, 123, 170, 123) ;
	}
	public static void main(String args[])
   {
	   
    Car d= new Car();
    d.setVisible(true);
    d.setSize(500,300);
    d.setTitle("MyCar");
	d.addWindowListener(new myclass());
   }
}

