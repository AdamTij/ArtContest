/* Name: Adamou Tidjani
 * Project name: ArtContest
 * Class: CSCI 142
 * Instructor: Syeda Nizami
 * Date: 06/05/2022
 */

import java.awt.*;
public class ArtContest {

	public static void main(String[] args) {
		
		// The following code creates a graphics object g and set panel size
		DrawingPanel panel = new DrawingPanel(840, 580);
		Graphics g = panel.getGraphics();
		
		// This sets the background color
		panel.setBackground(new Color(137, 207, 240));
				
		// The following code draws 3 clouds using the cloud method 
		cloud(g,10,60,75,Color.white); 
		cloud(g,300,60,75,Color.white);
		cloud(g,580,60,75,Color.white);
		
		// sun 
		g.setColor(Color.yellow);
		sun(g);
		
		// 6 birds in black
		g.setColor(Color.BLACK);
		bird(240,150,g);
		bird(510,150,g);
		bird(45,150,g);
		bird(700,150,g);
		bird(135,165,g);
		bird(630,165,g);
		
		// grass in green within the panel 
		g.setColor(new Color(30, 205, 0));
		for(int x=0; x<840; x=x+10) { 
			g.drawLine(x+12, 520,x-20,680); 
		 }
		
		/* The following draws a house
		 * First the roof is drawn using its method
		 * Then the base in black
		 * A window in white 
		 * And the door in different shapes  
		 */
		g.setColor(new Color(4, 118, 208));
		roof(g);
			
		g.setColor(Color.black);
		g.fillRect(215, 450, 325, 130);
		
		g.setColor(Color.white);
		g.fillRect(350, 330, 60, 60);
		
		door(g);
		 
	}
	
	/* The rest is all the methods used in the main method */
	
	public static void door(Graphics g) {
		g.setColor(Color.white);
		g.fillRect(290, 410, 180, 160);
		g.setColor(Color.black);
		g.fillPolygon(leftPoly(296, 425));
		g.fillPolygon(upperPoly(298,416));
		g.fillPolygon(rightPoly(465,420));
		g.fillPolygon(bottomPoly(307,566));
	}
	public static void roof(Graphics g) {
		g.fillRect(260, 350,240, 100);
		g.fillPolygon(topPoly(260, 350));
		g.fillPolygon(topLeftPoly(260, 350));
		g.fillPolygon(topRightPoly(500, 350));
	}
	public static void sun(Graphics g) {
		g.fillOval(720, 20, 80, 85);
		g.drawLine(697, 27, 718, 42);
		g.drawLine(728, 26, 711, 12);
		g.drawLine(744, 19, 734, 5);
		g.drawLine(763, 16, 761, 5);
		g.drawLine(776, 20, 787, 8);
		g.drawLine(787, 28, 805, 17);
		g.drawLine(797, 41, 814, 31);
		g.drawLine(802, 55, 819, 48);
		g.drawLine(803, 67, 819, 65);
		g.drawLine(801, 81, 818, 82);
		g.drawLine(794, 91, 806, 100);
		g.drawLine(785, 100, 792, 110);
		g.drawLine(774, 107, 777, 117);
	}
	
	public static void bird(int x, int y, Graphics g) {
		g.drawLine(x, y, x+11, y+20);
		g.drawLine(x+11, y+20, x+17, y);
	}
	
	public static Polygon topRightPoly(int x, int y) {
		Polygon p = new Polygon();
		p.addPoint(x,y);
		p.addPoint(x, y+100);
		p.addPoint(x+45, y+100);
		return p;
		
	}
	
	public static Polygon topLeftPoly(int x, int y) {
		Polygon p = new Polygon();
		p.addPoint(x,y);
		p.addPoint(x, y+100);
		p.addPoint(x-50, y+100);
		return p;
		
	}
	
	public static Polygon topPoly(int x, int y) {
		Polygon p = new Polygon();
		p.addPoint(x,y);
		p.addPoint(x+240, y);
		p.addPoint(x+130, y-110);
		return p;
		
	}
	
	public static Polygon leftPoly(int x, int y) {
		Polygon p = new Polygon();
		p.addPoint(x,y);
		p.addPoint(x, y+140);
		p.addPoint(x+79, y+75);
		return p;
		
	}
	
	public static Polygon upperPoly(int x, int y) {
		Polygon p = new Polygon();
		p.addPoint(x,y);
		p.addPoint(x+162, y);
		p.addPoint(x+85, y+76);
		return p;
		
	}
	
	public static Polygon rightPoly(int x, int y) {
		Polygon p = new Polygon();
		p.addPoint(x,y);
		p.addPoint(x, y+145);
		p.addPoint(x-75, y+78);
		return p;
	}
	
	public static Polygon bottomPoly(int x, int y) {
		Polygon p = new Polygon();
		p.addPoint(x,y);
		p.addPoint(x+149, y);
		p.addPoint(x+76, y-61);
		return p;
	}
	
	public static void cloud (Graphics g,int x, int y, int size, Color color) {
		
		g.setColor(color);
		g.fillOval(x, y, size, size);
		g.fillOval((int)(x+size*.35), (int)(y-size*.2), (int)(size*1.75), (int)(size*1.4));
		g.fillOval((int)(x+size*1.5), (int)(y+size*.15),(int)(size*.9), (int)(size*.9));
		g.fillOval((int)(x+size*1.8), (int)(y+size*.05), (int)(size*.3), (int)(size*.3));
	}

}
