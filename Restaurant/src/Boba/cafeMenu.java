package Boba;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class cafeMenu {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					cafeMenu window = new cafeMenu();
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
	public cafeMenu() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(300, 300, 450, 350);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblTeaaCafe = new JLabel("Tea'a Cafe");
		lblTeaaCafe.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblTeaaCafe.setBounds(131, 0, 134, 34);
		frame.getContentPane().add(lblTeaaCafe);
		
		JLabel lblIcedTea = new JLabel("Green or Black Iced Tea");
		lblIcedTea.setFont(new Font("Century", Font.BOLD, 11));
		lblIcedTea.setBounds(10, 65, 134, 21);
		frame.getContentPane().add(lblIcedTea);
		
		JLabel lblAllTeaIs = new JLabel("All drinks are one size and tea can be served hot or cold");
		lblAllTeaIs.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 8));
		lblAllTeaIs.setBounds(10, 236, 238, 14);
		frame.getContentPane().add(lblAllTeaIs);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(258, 55, 147, 207);
		frame.getContentPane().add(textArea);
		
		JButton btnIcedTea = new JButton("Add $4");
		btnIcedTea.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int IcedTeaP = 4;
			//	String addIceT = ""
				//textArea.append(str);
				
				
				
			}
		});
		btnIcedTea.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnIcedTea.setBounds(33, 85, 61, 14);
		frame.getContentPane().add(btnIcedTea);
		
		JButton chaiButton = new JButton("Add $4");
		chaiButton.setFont(new Font("Tahoma", Font.PLAIN, 8));
		chaiButton.setBounds(33, 134, 57, 14);
		frame.getContentPane().add(chaiButton);
		
		JLabel lblChaiTea = new JLabel("Chai tea");
		lblChaiTea.setFont(new Font("Century", Font.BOLD, 11));
		lblChaiTea.setBounds(33, 119, 67, 14);
		frame.getContentPane().add(lblChaiTea);
		
		JButton btnAdd = new JButton("Add $5");
		btnAdd.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnAdd.setBounds(33, 176, 61, 14);
		frame.getContentPane().add(btnAdd);
		
		JButton button_2 = new JButton("Add $4");
		button_2.setFont(new Font("Tahoma", Font.PLAIN, 9));
		button_2.setBounds(168, 85, 61, 14);
		frame.getContentPane().add(button_2);
		
		JButton button_3 = new JButton("Add $4");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_3.setFont(new Font("Tahoma", Font.PLAIN, 9));
		button_3.setBounds(168, 133, 61, 14);
		frame.getContentPane().add(button_3);
		
		JButton button_4 = new JButton("Add $4");
		button_4.setFont(new Font("Tahoma", Font.PLAIN, 9));
		button_4.setBounds(168, 176, 61, 14);
		frame.getContentPane().add(button_4);
		
		JLabel lblCooler = new JLabel("Cooler");
		lblCooler.setFont(new Font("Century", Font.BOLD, 11));
		lblCooler.setBounds(33, 159, 67, 14);
		frame.getContentPane().add(lblCooler);
		
		JLabel lblTealatte = new JLabel("Tea Latte");
		lblTealatte.setFont(new Font("Century", Font.BOLD, 11));
		lblTealatte.setBounds(168, 68, 67, 14);
		frame.getContentPane().add(lblTealatte);
		
		JLabel lblMilkTea = new JLabel("Milk Tea");
		lblMilkTea.setFont(new Font("Century", Font.BOLD, 11));
		lblMilkTea.setBounds(168, 119, 67, 14);
		frame.getContentPane().add(lblMilkTea);
		
		JLabel lblVanillaShake = new JLabel("Vanilla Shake");
		lblVanillaShake.setFont(new Font("Century", Font.BOLD, 11));
		lblVanillaShake.setBounds(168, 159, 82, 14);
		frame.getContentPane().add(lblVanillaShake);
		
		
		JButton btnCash = new JButton("Cash");
		btnCash.setBounds(258, 262, 57, 27);
		frame.getContentPane().add(btnCash);
		
		JButton btnCredit = new JButton("Credit");
		btnCredit.setBounds(338, 262, 67, 27);
		frame.getContentPane().add(btnCredit);
		
		JButton button = new JButton("$10");
		button.setFont(new Font("Tahoma", Font.PLAIN, 8));
		button.setBounds(10, 264, 45, 21);
		frame.getContentPane().add(button);
		
		JButton cancelButton = new JButton("Cancel");
		cancelButton.setFont(new Font("Tahoma", Font.PLAIN, 9));
		cancelButton.setBounds(297, 31, 61, 23);
		frame.getContentPane().add(cancelButton);
		
		JButton button20 = new JButton("$20");
		button20.setFont(new Font("Tahoma", Font.PLAIN, 8));
		button20.setBounds(71, 264, 45, 21);
		frame.getContentPane().add(button20);
		
		JButton button_5 = new JButton("$50");
		button_5.setFont(new Font("Tahoma", Font.PLAIN, 8));
		button_5.setBounds(131, 265, 51, 21);
		frame.getContentPane().add(button_5);
		
		JButton button_6 = new JButton("$100");
		button_6.setFont(new Font("Tahoma", Font.PLAIN, 8));
		button_6.setBounds(192, 266, 51, 21);
		frame.getContentPane().add(button_6);
	}
}
