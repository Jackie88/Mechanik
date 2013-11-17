package GUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class MainDialog extends JDialog {
	
	private static JPanel panel;
	private static Konsola txtArea;
	
	public MainDialog(){
		super();
		panel =new GamePanel();
		setLayout(new BorderLayout(20, 20));
		add(panel );
		add(new SouthMainPanel(), BorderLayout.SOUTH);
		txtArea = new Konsola();
		add(txtArea, BorderLayout.EAST);
		add(new JLabel(""), BorderLayout.WEST);
		add(new TopMainPanel(),BorderLayout.PAGE_START);
		System.out.println(getLayout());
		
		setTitle("Napraw swoje auto !");
		setVisible(true);
		setSize(new Dimension(800, 650));
		setLocationRelativeTo(null);
		getContentPane().setBackground(Color.white);
	
	}
	
	public static JPanel getPanel() {
		return panel;
	}
	
	public static Konsola getKonsola() {
		return txtArea;
	}
}
