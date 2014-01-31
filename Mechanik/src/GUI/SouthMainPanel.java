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
import javax.swing.ImageIcon;
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
				case repair: {
					if(Reka.getCzesci()[Reka.getReka().getX()][Reka.getReka().getY()]!=null){
						Reka.getReka().napraw();
					} else {
						MainDialog.getKonsola().append("Mechanik: Nie ma czego naprawiac!" + newline);
					}
					
					break;
				}
				
				case pick : {
					
					if (Reka.getCzesci()[Reka.getReka().getX()][Reka.getReka().getY()].getDraw()) {
						Reka.getCzesci()[Reka.getReka().getX()][Reka.getReka().getY()].changeIfDraw();
	        			Reka.getReka().setImg(new ImageIcon(new Resize().resize(Reka.getCzesci()[Reka.getReka().getX()][Reka.getReka().getY()].getImage(), GamePanel.getW()/GamePanel.getA(),GamePanel.getH()/GamePanel.getA(),true)).getImage());
	        			Reka.getReka().setID(Reka.getCzesci()[Reka.getReka().getX()][Reka.getReka().getY()].getID());
	        			MainDialog.getKonsola().append("Mechanik: Juz podnoszê!" + newline);				
					} else {
						MainDialog.getKonsola().append("Mechanik: Ale tu przecie¿ nic nie ma." + newline);
					}
					
					if(Reka.getReka().getX()==2)
						Reka.getCzesci()[Reka.getReka().getX()][Reka.getReka().getY()].changeIfDraw();
					break;
				}
				
				case drop :{
					
					if(Reka.getReka().getImg()!=null)	{
					if (Reka.getReka().getX()==3 && Reka.getReka().getY()==9) {
						Reka.getReka().setImg(null);
						MainDialog.getKonsola().append("Mechanik: Wyrzuci³em" + newline);
					} else {
						
						MainDialog.getKonsola().append("Mechanik: Nie rób z warsztatu œmietnika! i wyrzuc to do smieci" + newline);
					}
					}	else 
							MainDialog.getKonsola().append("Mechanik: Nie mam czego wyrzucic" + newline);
					
					break;
					
				}
				
				case swap: {
					
					if(Reka.getReka().getImg()==null)
						MainDialog.getKonsola().append("Mechanik: Nie ma czego wstawiæ!" + newline);
					else {
						if (Reka.getCzesci()[Reka.getReka().getX()][Reka.getReka().getY()].getID()==Reka.getReka().getID()) { 
							if(!Reka.getCzesci()[Reka.getReka().getX()][Reka.getReka().getY()].getDraw()) {
							Reka.getReka().napraw();
							MainDialog.getKonsola().append("Mechanik: Juz zamieniam!" + newline);
							} else {
								MainDialog.getKonsola().append("Mechanik: usun najpierw star¹ czêœæ!!" + newline);
							}
						} else {
						MainDialog.getKonsola().append("Mechanik: To chyba nie ta czêœæ!" + newline);
					}
					}
					break;
					
				}
				
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
			
			Reka.repaint();
			Reka.validate();
			Reka.sprawdzWszystko();
		}

	}
	
	public enum KomendySwitch {
		repair,
		investigate,
		up,
		down,
		left,
		right,
		pick,
		drop,
		swap
	}
	
}
