package GUI;

import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class TopMainPanel extends JPanel {

	private JLabel label;
	private String time;
	
	public TopMainPanel() {
		
		super();
		time = "Powodzenia !!!";
		
		label = new JLabel(time);
		label.setAlignmentX(CENTER_ALIGNMENT);
		label.setAlignmentY(CENTER_ALIGNMENT);
		label.setFont(new Font(Font.SERIF, Font.PLAIN, 25));
		
		setBorder(BorderFactory.createEmptyBorder(20, 0, 0, 0));
		setOpaque(false);
		
		add(label);
	}
	
}
