package aufgabe0;

import java.awt.*;
import javax.swing.*;

public class SwingTest {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame("Testfenser");
		JButton btn1 = new JButton ("Testbutton");
		
		frame.setLayout(new FlowLayout());
		
		frame.add(btn1);
		frame.setSize(400, 100);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}
