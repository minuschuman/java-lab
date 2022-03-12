package firstList;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class Q6 extends JFrame {
	JPanel panel1, panel2, panel3;
	JLabel namelbl, emaillbl, contactlbl;
	JTextField nametxt, emailtxt, contacttxt;
	JButton savebtn;
	JButton b1, b2, b3, b4, b5;
	GridBagConstraints gbc = new GridBagConstraints();

	public Q6() {
		setLayout(new BorderLayout(10, 10));

		panel1 = panelOneAdder();
		panel1.setPreferredSize(new Dimension(320, 300));
		add(panel1, BorderLayout.WEST);

		panel2 = panelTwoAdder();
		panel2.setPreferredSize(new Dimension(320, 300));
		add(panel2, BorderLayout.EAST);

		panel3 = panelThreeAdder();
		panel3.setPreferredSize(new Dimension(1000, 1000));
//		add(panel3, BorderLayout.SOUTH);
//		add(panel3);

		setSize(700, 700);
		setVisible(true);

	}

	private JPanel panelOneAdder() {
		panel1 = new JPanel();
		panel1.setBackground(Color.green);
		panel1.setLayout(new FlowLayout());

		namelbl = new JLabel("Name");
		emaillbl = new JLabel("Email");
		contactlbl = new JLabel("Contact");

		nametxt = new JTextField(20);
		emailtxt = new JTextField(20);
		contacttxt = new JTextField(20);

		savebtn = new JButton("save");

		panel1.add(namelbl);
		panel1.add(nametxt);

		panel1.add(emaillbl);
		panel1.add(emailtxt);

		panel1.add(contactlbl);
		panel1.add(contacttxt);

		panel1.add(savebtn);

		return panel1;
	}

	private JPanel panelTwoAdder() {
		panel2 = new JPanel();
		panel2.setBackground(Color.blue);
		panel2.setLayout(new GridLayout(7, 1));

		namelbl = new JLabel("Name");
		emaillbl = new JLabel("Email");
		contactlbl = new JLabel("Contact");

		nametxt = new JTextField(20);
		emailtxt = new JTextField(20);
		contacttxt = new JTextField(20);

		savebtn = new JButton("save");

		panel2.add(namelbl);
		panel2.add(nametxt);
		panel2.add(emaillbl);
		panel2.add(emailtxt);
		panel2.add(contactlbl);
		panel2.add(contacttxt);
		panel2.add(savebtn);

		return panel2;
	}

	private JPanel panelThreeAdder() {
		panel2 = new JPanel();
		panel2.setBackground(Color.blue);
		panel2.setLayout(new GridBagLayout());

		setLayout(new GridBagLayout());
		b1 = new JButton("Button1");
		gbc.gridx = 0;// column position
		gbc.gridy = 0;// row position
		gbc.gridheight = 5;
		gbc.fill = GridBagConstraints.VERTICAL;// merges rows=4
		panel2.add(b1, gbc);// b1 added to JPanel on the basis of gbc
		b2 = new JButton("Button2");
		gbc.gridx = 1;
		gbc.gridy = 1;
		gbc.gridheight = 1;
		panel2.add(b2, gbc);// b2 added to 1,1 position of gridbaglayout
		b3 = new JButton("Button3");
		gbc.gridx = 2;
		gbc.gridy = 2;
		gbc.gridheight = 1;
		panel2.add(b3, gbc);
		b4 = new JButton("Button4");
		gbc.gridx = 3;
		gbc.gridy = 3;
		gbc.gridheight = 1;
		panel2.add(b4, gbc);
		b5 = new JButton("Button5 is used to save information");
		gbc.gridx = 1;
		gbc.gridy = 4;
		gbc.gridheight = 1;
		gbc.gridwidth = 3;// no of columns merged=3
		gbc.fill = GridBagConstraints.HORIZONTAL;
		panel2.add(b5, gbc);

		return panel2;
	}

	public static void main(String[] args) {
		new Q6();
	}

}
