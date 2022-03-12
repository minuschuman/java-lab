/*Write a program to find the factorial of a number provided via JTextField and when JButton(“Factorial”) is clicked using ActionListener.*/
package firstList;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class Q4 extends JFrame {
	public Q4() {
		setLayout(new FlowLayout());
		JTextField txtInput = new JTextField(20);
		JButton btnFact = new JButton("Factorial");
		JLabel lblDisp = new JLabel();

		add(txtInput);
		add(btnFact);
		add(lblDisp);

		btnFact.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int num = Integer.valueOf(txtInput.getText());
				int fact = 1;
				String opt = "";
				do {
					fact = fact * num;
					opt = opt + " " + num;
					if (num > 1) {
						opt = opt + " X";
					}
					num--;
				} while (num >= 1);
				lblDisp.setText(opt + " = " + fact);
			}
		});

		setSize(700, 300);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Q4();
	}

}
