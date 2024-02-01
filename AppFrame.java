package ToDo;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.*;

public class AppFrame extends JFrame {
    private JButton addtask;
    private JButton clear;
     TitleBar title = new TitleBar();
     BtnPanel btnpanel = new BtnPanel();
     List list = new List();

    public AppFrame() {
        // Set up the frame
        this.setSize(400, 700);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
        // Create components
        this.add(this.title, BorderLayout.NORTH);
        this.add(this.btnpanel, BorderLayout.SOUTH);
        this.add(this.list, BorderLayout.CENTER);
        addtask = btnpanel.getaddtaskbtn();
        clear = btnpanel.getclearbtn();

        // Add listeners
        addlistener();

    }

    public void addlistener() {
        addtask.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                Task task1 = new Task();
                list.add(task1);
                list.indexnum();
                revalidate();

                JButton done = task1.getdone1();
                done.addMouseListener(new MouseAdapter() {
                    public void mousePressed(MouseEvent e) {
                        task1.done1();
                        revalidate();
                    }
                });

                JButton remove = task1.getdel1();
                remove.addMouseListener(new MouseAdapter() {
                    public void mousePressed(MouseEvent e) {
                        list.remove(task1);
                        list.indexnum();
                        repaint();
                    }
                });
            }
        });

        clear.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                Component[] tasklist = list.getComponents();
                for (int i = 0; i < tasklist.length; i++) {
                    if (tasklist[i] instanceof Task) {
                        list.remove((Task) tasklist[i]);
                    }
                }
                revalidate();
                repaint();
            }
        });
    }

    public static void main(String args[]) {
            new AppFrame();
}
}

