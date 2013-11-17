package GUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;

@SuppressWarnings("serial")
public class SouthMainPanel extends JPanel implements FocusListener, ActionListener {

	private JButton but;
	private JTextField txt;
	private static String cmd;
	private String newline = String.format("%n");
	
	public SouthMainPanel() {
		
		super();
		setOpaque(false);
		setLayout(new BorderLayout(20,20));
		setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
		
		but = new JButton("Siema");
		txt = new JTextField("Wpisz komende");
		txt.setForeground(Color.lightGray);
		but.setPreferredSize(new Dimension(100, 30));
		
		add(but, BorderLayout.EAST);
		add(txt);
		
		txt.addFocusListener(this);
		but.addActionListener(this);
		txt.addActionListener(this);
	
		
	}
	
	public static String getCmd () {
		return cmd;
	}

	@Override
	public void focusGained(FocusEvent e) {
		
		if(txt.getText().equals("Wpisz komende"))
			txt.setText("");
		
		txt.setForeground(Color.black);
		
	}

	@Override
	public void focusLost(FocusEvent e) {}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		cmd=txt.getText();
		txt.setForeground(Color.lightGray);
		txt.setText("Wpisz komende");
		
		MainDialog.getPanel().requestFocus();
		MainDialog.getKonsola().append("Ja : " + cmd + newline + "Komp : costam" + newline);
	
	}
}
