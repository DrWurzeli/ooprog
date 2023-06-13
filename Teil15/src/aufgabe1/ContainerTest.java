package aufgabe1;

import java.awt.*;
import javax.swing.*;

public class ContainerTest {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Hauptfenster");
		JLabel label1 = new JLabel("Name: ");
		JTextField txt1 = new JTextField();
		JButton btn1 = new JButton ("Übernehmen");
		
		frame.setLayout(new FlowLayout());
		frame.setSize(400, 100);
		
		frame.add(label1);
		frame.add(txt1);
		txt1.setColumns(20);
		frame.add(btn1);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
		frame.setVisible(true);

	}

}
