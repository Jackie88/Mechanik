package GUI;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.net.URL;
import javax.swing.ImageIcon;

public class Resize {

	public Image resize (String src, int width, int height) {
	
	ClassLoader cldr = this.getClass().getClassLoader();
	URL imageURL = cldr.getResource("img/" + src);
	Image scaledImage = new ImageIcon(src).getImage();
	
    
	BufferedImage imageBuff = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
    Graphics g = imageBuff.createGraphics();
    g.drawImage(scaledImage, 0, 0, width, height, null);
    g.dispose();
	
    scaledImage = new ImageIcon(imageBuff).getImage();
    
    return scaledImage;
	}
	
	public Image resize(String src, int width, int height, boolean b) {
		
		ClassLoader cldr = this.getClass().getClassLoader();
		URL imageURL = cldr.getResource("img/" + src);
		Image scaledImage = new ImageIcon(src).getImage();
		
	    return scaledImage.getScaledInstance(width, height, Image.SCALE_SMOOTH);
		
	}
	
}