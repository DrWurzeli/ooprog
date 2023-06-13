package aufgabe4;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;

public class ErrorGUI extends JDialog{

	private static final long serialVersionUID = 1L;

	public ErrorGUI(Exception e) {
		
		GridLayout errorGrid = new GridLayout(2,1);
		JDialog errorDialog = new JDialog(this, "ERROR-GUI", true);
		
		JLabel errorMessage = new JLabel("" + e.getClass());
		errorMessage.setForeground(Color.RED);
		
		JButton okButton = new JButton("Schließen");
	    okButton.addActionListener(x -> dispose());	
		
	    errorDialog.setLayout(errorGrid);
	    errorDialog.add(errorMessage);
	    errorDialog.add(okButton);	
	    errorDialog.pack();
	    errorDialog.setAlwaysOnTop(true);
	    errorDialog.setVisible(true);
	}
}
