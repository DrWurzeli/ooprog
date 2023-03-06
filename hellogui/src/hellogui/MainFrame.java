package hellogui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MainFrame {

	private JFrame frame;
	private JTextField textField1;
	private JTextField textField2;
	private JTextField textFieldResult;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame window = new MainFrame();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainFrame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 300, 220);
		frame.setTitle("Taschenrechner");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		textField1 = new JTextField();
		textField1.setColumns(10);
		
		JLabel lblZahl1 = new JLabel("Zahl 1:");
		
		textField2 = new JTextField();
		textField2.setColumns(10);
		
		JLabel lblZahl2 = new JLabel("Zahl 2:");
		
		JButton btnAdd = new JButton("Addiere die Zahlen!");
		
		textFieldResult = new JTextField();
		textFieldResult.setColumns(10);
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(lblZahl1, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblZahl2, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE))
							.addGap(18)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
								.addComponent(textField2)
								.addComponent(textField1)
								.addComponent(btnAdd, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(63)
							.addComponent(textFieldResult)))
					.addContainerGap(267, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblZahl1)
						.addComponent(textField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(textField2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblZahl2))
					.addGap(18)
					.addComponent(btnAdd)
					.addGap(18)
					.addComponent(textFieldResult, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(127, Short.MAX_VALUE))
		);
		frame.getContentPane().setLayout(groupLayout);
	
	
		btnAdd.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					int x = Integer.parseInt(textField1.getText());
					int y = Integer.parseInt(textField2.getText());
					int r = x + y;
					textFieldResult.setText(Integer.toString(r));
					}
					catch (NumberFormatException x) {
					System.out.println("Error : "+ x.getMessage());
					textFieldResult.setText("");
					}
					finally {
						System.out.println("Click Event verarbeitet.");
					}
			}
		});
	}
}
