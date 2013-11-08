package Grafa;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
 
public class Okno extends JFrame implements KeyListener {
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
        //panel.setFocusable(isCursorSet());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    @Override
	public void keyPressed(KeyEvent e) {
		validate();
		repaint();
	}

	@Override
	public void keyReleased(KeyEvent e) {
		validate();
		repaint();
	}

	@Override
	public void keyTyped(KeyEvent evt) {

	}
}