import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
public class aa {
   public static void main(String[] args) {
      JButton btnA = new JButton("Button1");
      JButton btnB = new JButton("Button2");

      btnA.setPreferredSize(new Dimension(150, 20));
      btnB.setPreferredSize(new Dimension(150, 20));

      JPanel btnAPanel = new JPanel();
      JPanel btnBPanel = new JPanel();

      btnAPanel.add(btnA);
      btnBPanel.add(btnB);

      JPanel panelGrid = new JPanel(new GridLayout(10, 5, 10, 10));
      panelGrid.add(new JCheckBox("Demo CheckBox1"));
      panelGrid.add(new JCheckBox("Demo CheckBox2"));
      panelGrid.add(btnAPanel);
      panelGrid.add(btnBPanel);

      JPanel panelBrdLayout = new JPanel(new BorderLayout());
      panelBrdLayout.add(panelGrid, BorderLayout.NORTH);
      panelBrdLayout.setPreferredSize(new Dimension(550, 300));
      JFrame frame = new JFrame();
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.add(panelBrdLayout);
      frame.setSize(550, 300);
      frame.setVisible(true);
   }
}