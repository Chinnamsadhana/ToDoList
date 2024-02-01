import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
    
class BuildGUI extends JFrame implements ActionListener {
        JFrame actualWindow;
        JPanel container;
        JTextField txt_num1, txt_num2, txt_result;
        JLabel l1,l2,l3;
        JButton btn_div;
        
        BuildGUI() {
            actualWindow = new JFrame("Experiment 4");
            container = new JPanel();
            container.setLayout(new FlowLayout());

            l1 = new JLabel("Enter 1st number");
            l1.setBounds(100,120,150,30);
            l2 = new JLabel("Enter 2nd number");
            l2.setBounds(100,180,150,30);    
            l3 = new JLabel("Result");
            l3.setBounds(300,250,150,30);
            txt_num1 = new JTextField(20);
            txt_num1.setBounds(300,120,150,30);
            txt_num2 = new JTextField(20);
            txt_num2.setBounds(300,180,150,30);
            txt_result = new JTextField(20);
            txt_result.setBounds(400,250,150,30);
    
            btn_div = new JButton("Divide");
            btn_div.addActionListener(this);
            
            container.add(l1);
            container.add(txt_num1);
            container.add(l2);
            container.add(txt_num2);
            container.add(btn_div);
            container.add(l3);
            container.add(txt_result);
            
            actualWindow.add(container);
            actualWindow.setSize(300, 300);
            actualWindow.setVisible(true);
        }
    
        @Override
        public void actionPerformed(ActionEvent e) {
            int num1, num2;
            try {
                num1 = Integer.parseInt(txt_num1.getText());
                num2 = Integer.parseInt(txt_num2.getText());
                txt_result.setText(num1/num2+"");
            }
            catch(NumberFormatException nfe) {
                JOptionPane.showMessageDialog(actualWindow,"Please do enter only integers");  
            }
            catch(ArithmeticException ae) {
                JOptionPane.showMessageDialog(actualWindow,"Divisor can not be ZERO");  
            }
        }
}
public class App {
    
    public static void main(String[] args) {
        new BuildGUI();
    }
    
    }