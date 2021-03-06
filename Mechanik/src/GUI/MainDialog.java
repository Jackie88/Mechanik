package GUI;

import java.awt.BorderLayout;
//import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
//import java.awt.GridBagConstraints;
//import java.awt.GridBagLayout;

//import javax.swing.BorderFactory;
//import javax.swing.ImageIcon;
//import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

@SuppressWarnings("serial")
public class MainDialog extends JDialog {
	
	private static GamePanel panel;
	private static Konsola txtArea;
	
	public MainDialog(){
		
		super();
		panel =new GamePanel();
		txtArea = new Konsola();
		JScrollPane scr = new JScrollPane(txtArea,
                JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		
		setLayout(new BorderLayout(20, 20));
		setTitle("Napraw swoje auto !");
		setVisible(true);
		setSize(new Dimension(803, 714));
		setLocationRelativeTo(null);
		
		getContentPane().setBackground(Color.white);
		
		add(panel);
		add(scr,BorderLayout.EAST);
		add(new JLabel(""),BorderLayout.WEST);
		add(new SouthMainPanel(panel), BorderLayout.SOUTH);
		add(new TopMainPanel(),BorderLayout.PAGE_START);
	
	
	}
	
	public static JPanel getPanel() {
		return panel;
	}
	
	public static Konsola getKonsola() {
		return txtArea;
	}
}
