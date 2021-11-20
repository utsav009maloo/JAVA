import javax.swing.*;    
import java.awt.event.*;    
public class MenuProgram implements ActionListener{    
JFrame f;    
JMenuBar mb;    
JMenu file,edit,help;    
JMenuItem NewPage,Open,Save,cut,copy,paste,selectAll;    
JTextArea ta;    
MenuProgram(){    
f=new JFrame();  
NewPage=new JMenuItem("New Page");
Open=new JMenuItem("Open");
Save=new JMenuItem("Save");
cut=new JMenuItem("cut");    
copy=new JMenuItem("copy");    
paste=new JMenuItem("paste");    
selectAll=new JMenuItem("selectAll");
NewPage.addActionListener(this);
Open.addActionListener(this);
Save.addActionListener(this);
cut.addActionListener(this);    
copy.addActionListener(this);    
paste.addActionListener(this);    
selectAll.addActionListener(this);    
mb=new JMenuBar();    
file=new JMenu("File");    
edit=new JMenu("Edit");    
help=new JMenu("Help");     
file.add(NewPage);file.add(Open);file.add(Save);edit.add(cut);edit.add(copy);edit.add(paste);edit.add(selectAll);    
mb.add(file);mb.add(edit);mb.add(help);    
ta=new JTextArea();    
ta.setBounds(5,5,360,320);    
f.add(mb);f.add(ta);    
f.setJMenuBar(mb);  
f.setLayout(null);    
f.setSize(400,400);    
f.setVisible(true);    
}     
public void actionPerformed(ActionEvent e) {    
if(e.getSource()==cut)    
ta.cut();    
if(e.getSource()==paste)    
ta.paste();    
if(e.getSource()==copy)    
ta.copy();    
if(e.getSource()==selectAll)    
ta.selectAll();    
}     
public static void main(String[] args) {    
    new MenuProgram();    
}    
}    