package Grafa;

import java.awt.*;
 
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextField;
 
public class Panel extends JPanel {
	JTextField pole_tekstowe = new JTextField(30);
	JButton przycisk = new JButton("OK");
    public Panel() {
        setPreferredSize(new Dimension(400, 100));
        setName("Panel Komunikacyjny");
        setLayout(new FlowLayout());
        //pole_tekstowe.setLayout(new )
        add(pole_tekstowe);
        add(przycisk);
    }
 
}