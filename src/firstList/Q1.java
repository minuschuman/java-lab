/*Make a user interface using AWT components and write an event handling procedure to close the Frame when close button of Frame is clicked.*/
package firstList;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Q1 extends WindowAdapter {

	public static void main(String[] args) {
		Frame f = new Frame();
		f.setSize(300, 300);
		f.addWindowListener(new Q1());
		f.setVisible(true);
	}

	@Override
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}

}
