package GUI;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

@SuppressWarnings("serial")
public class MainFrame extends JFrame implements WindowListener{

	public MainFrame(){
		super();
		
		add(new MainPanel());
		add(new StartButton(),BorderLayout.SOUTH);
		
		addWindowListener(this);
		setTitle("Mechanik - START");
		setSize(new Dimension(900, 700));
		setLocationRelativeTo(null);
		setVisible(true);
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setResizable(false);
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		int close = JOptionPane.showConfirmDialog(null, "Czy napewno chcesz wyjsc??", "Wyjscie", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
		if(close==JOptionPane.YES_OPTION)	System.exit(0);
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	
	
}
