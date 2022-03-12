/*Write a program to find the entered character is vowel or consonant using KeyListener*/
package firstList;

import java.awt.GridLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

@SuppressWarnings("serial")

public class Q5 extends JFrame implements KeyListener {

	JLabel rlbl, oplbl; // Component references
	JTextField rtxt;

	public Q5() {
			setTitle("Action event deligation frame");
			setSize(400, 400);
			setLayout(new GridLayout(5, 2));

			rlbl = new JLabel("Result");
			oplbl = new JLabel("Output: ");
			rtxt = new JTextField(20);



			add(rlbl);
			add(rtxt);
			add(oplbl);

			rtxt.addKeyListener(this);

			setVisible(true);
			setDefaultCloseOperation(EXIT_ON_CLOSE);
		}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(KeyEvent e) {
		String result = "", finalOp = "";

		switch (e.getKeyChar()) {
		case 'a':
		case 'A':
			result = "vowel";
			break;
		case 'e':
		case 'E':
			result = "vowel";
			break;
		case 'i':
		case 'I':
			result = "vowel";
			break;
		case 'O':
		case 'o':
			result = "vowel";
			break;
		case 'U':
		case 'u':
			result = "vowel";
			break;
		default:
			finalOp = "consonant";
		}
		finalOp = (finalOp == "") ? result : finalOp;
		oplbl.setText(finalOp);

	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	public static void main(String[] args) {
		new Q5();
	}
}
