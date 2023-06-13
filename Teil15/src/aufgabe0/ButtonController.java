package aufgabe0;

import java.awt.event.*;
import javax.swing.JButton;

public class ButtonController implements ActionListener {

	private int counter = 0;
	
	@Override
	public void actionPerformed(ActionEvent e) {
		counter++;
		
		JButton refSource=(JButton)e.getSource();
		
		refSource.setText("Gedrückt:" + counter);
		
	}
	
}
