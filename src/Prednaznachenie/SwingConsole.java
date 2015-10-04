package Prednaznachenie;
import java.awt.Image;
import java.awt.Toolkit;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;


public class SwingConsole {
	public static void run (final JFrame f, final int width, final int height){
		SwingUtilities.invokeLater(new Runnable() {
//			
			public void run(){
//				Image im = Toolkit.getDefaultToolkit().getImage("star.png");
				Image im = null;
				try{
					im = ImageIO.read(this.getClass().getClassLoader().getResourceAsStream("star.png"));
				}catch(Exception e){}
				
				//Image im = 
				f.setTitle("Расчет звезды предназначения и таблицы пифагора");
				f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				f.setIconImage(im);
				f.setSize(width, height);
				f.setVisible(true);
				f.setLocation(50, 50);
			}
		}
		);
	}
}
