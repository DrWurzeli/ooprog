package aufgabe3;

//Datei: PanelTest.java
import javax.swing.*;
import java.awt.*;
public class PanelTest{
	public static void main (String[] args) {
		JFrame frame = new JFrame ("Hauptfenster");
		//1. leichtgewichtigen GUI-Container erzeugen und befüllen.
		JPanel pane1 = new JPanel();
		pane1.add(new JLabel("Senden an: "));
		pane1.add(new TextField(20));
		
		//2. leichtgewichtigen GUI-Container erzeugen und befüllen.
		JPanel pane2 = new JPanel();
		pane2.add(new JTextArea(20, 30));
		
		//3. leichtgewichtigen GUI-Container erzeugen und befüllen.
		JPanel pane3 = new JPanel();
		pane3.add(new JButton("Verwerfen"));
		pane3.add(new JButton("Senden"));
		
		//GUI-Container und –Komponenten in Hauptfenster legen.
		frame.add (pane1, BorderLayout.NORTH);
		frame.add (pane2, BorderLayout.CENTER);
		frame.add (pane3, BorderLayout.SOUTH);
		frame.pack();
		frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
		frame.setVisible (true);
	}
}
