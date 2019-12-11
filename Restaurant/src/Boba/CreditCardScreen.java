package Boba;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CreditCardScreen {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField txtCreditCard;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CreditCardScreen window = new CreditCardScreen();
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
	public CreditCardScreen() {
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
		
		textField = new JTextField();
		textField.setBounds(93, 60, 264, 26);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(93, 98, 264, 26);
		frame.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(93, 132, 264, 26);
		frame.getContentPane().add(textField_2);
		
		JTextArea txtrName = new JTextArea();
		txtrName.setEditable(false);
		txtrName.setText("Name");
		txtrName.setBounds(16, 65, 72, 16);
		frame.getContentPane().add(txtrName);
		
		txtCreditCard = new JTextField();
		txtCreditCard.setEditable(false);
		txtCreditCard.setText("Credit Card");
		txtCreditCard.setBounds(6, 98, 85, 26);
		frame.getContentPane().add(txtCreditCard);
		txtCreditCard.setColumns(10);
		
		JTextArea txtrCcv = new JTextArea();
		txtrCcv.setEditable(false);
		txtrCcv.setText("CCV");
		txtrCcv.setBounds(16, 137, 65, 16);
		frame.getContentPane().add(txtrCcv);
		
		JButton btnNewButton = new JButton("Enter");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			String creditname = textField.getText();
			String creditnumber = textField_1.getText();
			String creditCCV = textField_2.getText();
			JOptionPane.showMessageDialog(frame, "Card Accepted", "Credit System", JOptionPane.INFORMATION_MESSAGE);
			
			frame.dispose();
			}
		});
		btnNewButton.setBounds(264, 170, 117, 29);
		frame.getContentPane().add(btnNewButton);
	}
}
