package aufgabe0;

import java.awt.*;
import javax.swing.*;

public class View {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame("Testfenster");
		JButton btn1 = new JButton ("Testbutton");
		
		btn1.addActionListener(new ButtonController());
		
		frame.setLayout(new FlowLayout());
		
		frame.add(btn1);
		frame.setSize(400, 100);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}