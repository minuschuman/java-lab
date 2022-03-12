/*Draw a design of car using different 2D shapes of Graphics class and label the parts of car using Font class of AWT.*/
package firstList;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class Q2 extends Canvas {
	@Override
	public void paint(Graphics g) {

//		g.fillRect(100, 70, 700, 300);

		getBody(g);
		getTyre(g, 100 + 70, 330 - 50, 20, 25, 60);
		getTyre(g, 650 + 70, 330 - 50, 20, 25, 60);
	}

	public void getBody(Graphics g) {
//		int mainBodyX=150;
		int mainBodyY = 180;
		g.setColor(Color.black);
		g.fillRoundRect(100 + 20, mainBodyY, 800 - 20, 150, 25, 25);
		int arrX[] = { 125, 230, 290, 400, 690, 850, 890 };
		int arrY[] = { mainBodyY + 1, mainBodyY - 20, mainBodyY - 25, 55, 60, 130, mainBodyY };
		g.fillPolygon(arrX, arrY, arrX.length);

		g.setColor(Color.DARK_GRAY);
		int seatX[] = { 300, 410, 520, 520};
		int seatY[] = { mainBodyY -15, 65, 68, mainBodyY-15 };
		g.fillPolygon(seatX, seatY, seatX.length);
		
		
		int backSeatX[] = { 550, 550, 680, 680 };
		int backSeatY[] = { mainBodyY -15, 68, 68, mainBodyY-15};
		g.fillPolygon(backSeatX, backSeatY, backSeatX.length);
		
		int backGlassX[] = { 700 , 700, 800, 800 };
		int backGlassY[] = { mainBodyY -15, 75, 120, mainBodyY-15};
		g.fillPolygon(backGlassX, backGlassY, backGlassX.length);
		
		g.setColor(Color.WHITE);
//		g.drawPolygon(seatX, seatY, seatX.length);
//		g.drawPolygon(backSeatX, backSeatY, backSeatX.length);
	}

	public void getTyre(Graphics g, int x, int y, int radIn, int midRad, int radOut) {
		int tyreInRad = 2 * radIn;
		int tyreMidRad = 2 * midRad;
		int tyreOutRad = 2 * radOut;
		int radDiff = (int) (tyreOutRad - tyreMidRad) / 2;
		g.setColor(Color.black);
		g.fillOval(x, y, tyreOutRad, tyreOutRad);
		g.setColor(Color.DARK_GRAY);
		g.fillOval(radDiff + x, radDiff + y, tyreMidRad, tyreMidRad);
		radDiff = radDiff + (int) (tyreMidRad - tyreInRad) / 2;
		g.setColor(Color.black);
		g.fillOval(radDiff + x, radDiff + y, tyreInRad, tyreInRad);
		g.setColor(Color.WHITE);
		g.drawOval(x, y, tyreOutRad, tyreOutRad);
	}

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		Q2 canva = new Q2();
		frame.add(canva);
		frame.setSize(1200, 700);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
}
