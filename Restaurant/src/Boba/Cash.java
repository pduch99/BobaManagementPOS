package Boba;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Cash {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cash window = new Cash();
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
	public Cash() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JTextArea txtrCashAmmount = new JTextArea();
		txtrCashAmmount.setEditable(false);
		txtrCashAmmount.setText("Cash Ammount:");
		txtrCashAmmount.setBounds(53, 65, 111, 16);
		frame.getContentPane().add(txtrCashAmmount);
		
		textField = new JTextField();
		textField.setBounds(176, 60, 130, 26);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnEnter = new JButton("Enter");
		btnEnter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			JOptionPane.showMessageDialog(frame, "Thank You, Your Change is $1.50", "Cash System", JOptionPane.INFORMATION_MESSAGE);
			frame.dispose();
			}
		});
		btnEnter.setBounds(186, 85, 117, 29);
		frame.getContentPane().add(btnEnter);
	}
}
