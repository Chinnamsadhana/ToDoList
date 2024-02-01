package ToDo;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Task extends JPanel{
    private JLabel index;
    private JTextField taskname;
    private JButton done;
    private JButton remove;

    public Task(){
        GridLayout Layoutask = new GridLayout(1, 4);
        Layoutask.setHgap(5);
        this.setPreferredSize(new Dimension(400,20));
        this.setBackground(new Color(255, 234 , 17));
        this.setLayout(Layoutask);
        
        index = new JLabel("");
        index.setPreferredSize(new Dimension(10,20));
        index.setHorizontalAlignment(JLabel.LEFT);
        index.setBackground(new Color(255, 234, 17));
        this.add(this.index);

        taskname = new JTextField("Enter Your Task");
        taskname.setPreferredSize(new Dimension(20,40));
        taskname.setBorder(BorderFactory.createEmptyBorder());
        taskname.setBackground(new Color(255,200,20));
        this.add(taskname);

        done = new JButton("Done");
        done.setPreferredSize(new Dimension(10,20));
        this.add(this.done);

        remove = new JButton("Delete");
        remove.setPreferredSize(new Dimension(10,20));
        this.add(this.remove);
    }
    public void writeindexj1(int n){
        this.index.setText(String.valueOf(n));
        this.revalidate();
    }
    public JButton getdone1(){
        return this.done;
    }
    public JButton getdel1(){
        return this.remove;
    }
    public void done1(){
        this.taskname.setBackground(Color.CYAN);
        this.index.setBackground(Color.CYAN);
        this.remove.setBackground(Color.CYAN);
        this.done.setBackground(Color.CYAN);
        this.setBackground(Color.CYAN);
        revalidate();
    }
}

