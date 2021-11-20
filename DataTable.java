import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingUtilities;
public class DataTable extends JFrame
{
    public DataTable()
    {
        String[] columns = new String[] {
            "Id", "Name", "Pincode", "City"
        };
        Object[][] data = new Object[][] {
            {1, "Utsav", 452002, "Indore" },
            {2, "Harshit", 452008, "Indore" },
            {3, "JeetRaj", 452005, "Indore" },
			{4, "Anant", 4520054, "Indore" },
        };
        JTable table = new JTable(data, columns);
        this.add(new JScrollPane(table));
         
        this.setTitle("Table");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);       
        this.pack();
        this.setVisible(true);
    }
     
    public static void main(String[] args)
    {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new DataTable();
            }
        });
    }
}	