package Grafa;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.*;
 
public class Okno extends JFrame {
    public Okno() {
        super("Mechanik");
        setPreferredSize(new Dimension(450, 500));
        JPanel mapa = new Mapa();
        JPanel panel = new Panel();
        setLayout(new FlowLayout());
        add(mapa);
        add(panel);
        pack();
        mapa.setFocusable(isCursorSet());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}