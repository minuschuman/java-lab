/*Design a User interface using different classes required to display an image and write an event handling procedure to change the displayed image when a button is clicked.*/
package firstList;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Q3 {
	File file;
	BufferedImage bufferedImage;
	ImageIcon imageIcon;

	public Q3() throws IOException {
		// TODO Auto-generated constructor stub
		file = new File("C:\\Users\\Atomix\\Pictures\\UseCase.png");

		bufferedImage = ImageIO.read(file);
		imageIcon = new ImageIcon(bufferedImage);

		JFrame frame = new JFrame();
		frame.setLayout(new FlowLayout());
		JLabel lable = new JLabel();
		lable.setIcon(imageIcon);
		frame.add(lable);
		JButton changeBtn = new JButton("Change");

		frame.add(changeBtn);
		frame.setSize(1280, 960);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		changeBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent event) {
				file = new File("D:\\Book\\6th\\Advanced-Java-Programming\\Project\\Practical\\src\\firstList\\apple-touch-icon.png");
				try {
					bufferedImage = ImageIO.read(file);
					imageIcon = new ImageIcon(bufferedImage);
					lable.setIcon(imageIcon);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
	}

	public static void main(String[] args) throws IOException {
		new Q3();
	}

}
