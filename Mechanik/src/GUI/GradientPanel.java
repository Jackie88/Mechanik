package GUI;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public class GradientPanel extends JPanel {

	public GradientPanel(){
		super();
		setOpaque(false);
		
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D) g;
		
		g2d.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
		GradientPaint grad = new GradientPaint(0,0, Color.white, 0,getHeight(), Color.lightGray);
		g2d.setPaint(grad);
		g2d.fillRect(0, 0, getWidth(), getHeight());
	}
	
}
