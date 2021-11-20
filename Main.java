import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main {
  public static void main(String[] args) {
    JFrame frame = new JFrame();
    JPanel panel = new JPanel();
    frame.setSize(300, 200);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    JButton redButton = new JButton("Red");
    JButton greenButton = new JButton("Green");
    JButton blueButton = new JButton("Blue");
    class Listener extends JPanel implements ActionListener {
      public void actionPerformed(ActionEvent event) {
        Color color;
        if (event.getSource() == redButton) {
          color = Color.red;
          redButton.setBackground(color);
          panel.setBackground(color);
        } else if (event.getSource() == greenButton) {
          color = Color.green;
          greenButton.setBackground(color);
          panel.setBackground(color);
        } else {
          color = Color.blue;
          blueButton.setBackground(color);
          panel.setBackground(color);
        }
        setBackground(color);
        repaint();
      }
    }
    redButton.addActionListener(new Listener());
    greenButton.addActionListener(new Listener());
    blueButton.addActionListener(new Listener());
    panel.add(redButton);
    panel.add(greenButton);
    panel.add(blueButton);
    frame.add(panel);
    frame.setVisible(true);
  }
}