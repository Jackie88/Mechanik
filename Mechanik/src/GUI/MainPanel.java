package GUI;

import java.awt.Font;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

@SuppressWarnings("serial")
public class MainPanel extends GradientPanel {

	String myFont;
	
	public MainPanel() {
		super();
		
		setLayout(new GridBagLayout());
		
		JLabel title = new JLabel("Witamy w Mechaniku !!!");
		myFont = title.getFont().getName();
	
		title.setFont(new Font(myFont, Font.PLAIN, 80));
		title.setAlignmentX(SwingConstants.CENTER);
		title.setAlignmentY(SwingConstants.CENTER);
		
		add(title);
	}
	
}
