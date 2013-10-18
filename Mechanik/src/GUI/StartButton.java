package GUI;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

@SuppressWarnings("serial")
public class StartButton extends JButton implements ActionListener {
	
	public StartButton() {
		super();
		addActionListener(this);
		
		setText("Start Game");
		setPreferredSize(new Dimension(400, 140));
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		new MainDialog();
		
	}

}
