package src;

import java.awt.*;

import javax.swing.*;

public class ElectricFan extends JPanel{
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		g.setColor(Color.GRAY);
		g.fillOval(295, 95, 210, 210);
		g.setColor(Color.WHITE);
		g.fillOval(300, 100, 200, 200);
		
		g.setColor(Color.ORANGE);
		for(int i = 0; i<5; i++) {
			g.fillArc(310, 110, 180, 180, i*72, 36);
		}
		
		g.setColor(Color.GRAY);
		g.fillRect(380, 300, 45, 150);
		
		g.setColor(Color.BLUE);
		int[] x = {350,450,500,300};
		int[] y = {450,450,550,550};
		g.fillPolygon(x, y, 4);
		
		g.setColor(Color.RED);
		for(int i = 0; i<4 ; i++) {
			g.fillRoundRect(360+i*20, 500, 17, 20, 20, 20);
		}
		g.setColor(Color.WHITE);
		for(int i = 0 ; i<4 ; i++) {
			g.drawString(i+"", 366+i*20, 514);
		}
	}
	

}
