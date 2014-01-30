package GUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.util.concurrent.TimeUnit;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.Timer;

@SuppressWarnings("serial")
public class SouthMainPanel extends JPanel implements FocusListener, ActionListener {

	private JButton but;
	private JTextField txt;
	private static String cmd;
	private String newline = String.format("%n");
	private GamePanel Reka;
	
	public SouthMainPanel(GamePanel panel) {
		
		super();
		Reka=panel;
		setOpaque(false);
		setLayout(new BorderLayout(20,20));
		setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
		
		but = new JButton("Siema");
		but.setPreferredSize(new Dimension(100, 30));
		but.addActionListener(this);
		
		txt = new JTextField("Wpisz komende");
		txt.setForeground(Color.lightGray);
		txt.addFocusListener(this);
		txt.addActionListener(this);
		
		add(but, BorderLayout.EAST);
		add(txt);
		
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
		Timer czas = new Timer(2000, new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e) {
				Reka.getReka().decrementY();
				Reka.repaint();
				Reka.validate();								
			}
		});
		cmd=txt.getText();
		//txt.setForeground(Color.lightGray);
		txt.setText("");
		String[] komendy = new String[20];
		komendy = CommandFinder.LangInterpreter.Interpret(cmd);
		//int controlInt=0;
		for(int i=0;i<=19;i=i+2){
			KomendySwitch komendySw = KomendySwitch.valueOf(komendy[i].toLowerCase());
			switch(komendySw){
				case repair: Reka.getReka().napraw();break;
				case investigate: Reka.getReka().sprawdz();break;
				case up:{
					for(int krok=1; krok<=(Integer.parseInt(komendy[i+1]));krok++){
						Reka.getReka().decrementY();
						Reka.repaint();
						Reka.validate();	
					}
					MainDialog.getKonsola().append("Mechanik: Poruszy³em o " + komendy[i+1] + " w górê." + newline);
					break;
				}
				case down:{
					for(int krok=1; krok<=(Integer.parseInt(komendy[i+1]));krok++)
					Reka.getReka().incrementY();
					MainDialog.getKonsola().append("Mechanik: Poruszy³em o " + komendy[i+1] + " w dó³." + newline);
					break;
				}
				case left:{
					for(int krok=1; krok<=(Integer.parseInt(komendy[i+1]));krok++)
					Reka.getReka().decrementX();
					MainDialog.getKonsola().append("Mechanik: Poruszy³em o " + komendy[i+1] + " w lewo." + newline);
					break;
				}
				case right:{
					for(int krok=1; krok<=(Integer.parseInt(komendy[i+1]));krok++)
					Reka.getReka().incrementX();
					MainDialog.getKonsola().append("Mechanik: Poruszy³em o " + komendy[i+1] + " w prawo." + newline);
					break;
				}
			}
			/*if(str != null) MainDialog.getKonsola().append( str + newline);
			if(str.matches("repair")) Reka.getReka().napraw();
			else if(str.matches("investigate")) Reka.getReka().sprawdz();
			else if(str.matches("up")) Reka.getReka().incrementX();*/
			Reka.repaint();
			Reka.validate();	
		}

	}
	
	public enum KomendySwitch {
		repair,
		investigate,
		up,
		down,
		left,
		right
	}
}
