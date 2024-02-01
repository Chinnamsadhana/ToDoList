package ToDo;
import java.awt.*;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.*;
public class TitleBar extends JPanel{
    JLabel TitleText = new JLabel("To do list App");
    public TitleBar(){
        this.setPreferredSize(new Dimension(400,80));
        this.setBackground(new Color( 255,143,123));
        TitleText.setPreferredSize(new Dimension(200,80));
        TitleText.setFont(new Font("Sans-serif",Font.BOLD,20));
        TitleText.setHorizontalAlignment(JLabel.CENTER);
        this.add(this.TitleText);

    } 
}


