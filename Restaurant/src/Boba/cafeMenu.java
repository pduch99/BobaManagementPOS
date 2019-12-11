package Boba;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class cafeMenu {
	double price;
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
	 * @return 
	 */
		
	private void initialize() {
		Drinks d = new Drinks("Green/Black Tea",4.00);
		Drinks d2 = new Drinks("Chai Tea",4.00);
		Drinks d3 = new Drinks("MilK Tea",4.00);
		Drinks d4 = new Drinks("Cooler",5.00);
		Drinks d5 = new Drinks("Vanilla Shake",4.00);
		Drinks d6 = new Drinks("Tea Latte",4.00);
		frame = new JFrame();
		frame.setBounds(500, 400, 550, 450);
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
		textArea.setBounds(258, 55, 247, 207);
		frame.getContentPane().add(textArea);
		
		JButton btnIcedTea = new JButton("Add $4");
		btnIcedTea.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.append(d.toString());
				price = price+4;
				
				
			}
		});
		btnIcedTea.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnIcedTea.setBounds(33, 85, 61, 14);
		frame.getContentPane().add(btnIcedTea);
		
		JButton chaiButton = new JButton("Add $4");
		chaiButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.append(d2.toString());
				price = price+4;
				
				
			}
		});
		chaiButton.setFont(new Font("Tahoma", Font.PLAIN, 8));
		chaiButton.setBounds(33, 134, 57, 14);
		frame.getContentPane().add(chaiButton);
		
		JLabel lblChaiTea = new JLabel("Chai tea");
		lblChaiTea.setFont(new Font("Century", Font.BOLD, 11));
		lblChaiTea.setBounds(33, 119, 67, 14);
		frame.getContentPane().add(lblChaiTea);
		
		JButton btnAdd = new JButton("Add $5");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.append(d4.toString());
				price = price+5;
				
			}
		});
		btnAdd.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnAdd.setBounds(33, 176, 61, 14);
		frame.getContentPane().add(btnAdd);
		
		JButton button_2 = new JButton("Add $4");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.append(d6.toString());
				price = price+4;
			}
		});
		button_2.setFont(new Font("Tahoma", Font.PLAIN, 9));
		button_2.setBounds(168, 85, 61, 14);
		frame.getContentPane().add(button_2);
		
		JButton button_3 = new JButton("Add $4");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.append(d3.toString());
				price = price+4;
				
				
			}
		});
		button_3.setFont(new Font("Tahoma", Font.PLAIN, 9));
		button_3.setBounds(168, 133, 61, 14);
		frame.getContentPane().add(button_3);
		
		JButton button_4 = new JButton("Add $4");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.append(d5.toString());
				price = price+4;
				
				
			}
		});
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
		btnCredit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				showCreditFrame();
				textArea.setText(null);
				
				
			}

			private void showCreditFrame() {
				CreditCardScreen c1 = new CreditCardScreen();
				CreditCardScreen.main(null);
				
			}
				
			}
		);
		btnCredit.setBounds(338, 262, 67, 27);
		frame.getContentPane().add(btnCredit);
		
		JButton button = new JButton("$10");
		button.setFont(new Font("Tahoma", Font.PLAIN, 8));
		button.setBounds(10, 264, 45, 21);
		frame.getContentPane().add(button);
		
		JButton totalButton = new JButton("Total");
		totalButton.addActionListener(new ActionListener() {
			private DecimalFormat df2 = new DecimalFormat("#.##");
			public void actionPerformed(ActionEvent e) {
				Double tax = .1725 * price;
				df2.format(tax);
				df2.format(price);
				textArea.append("Subtotal: " + Double.toString(price)+"\n");
				textArea.append("Tax: " + Double.toString(tax)+"\n");
				Double total = price + tax;
				df2.format(total);
				textArea.append("Total: " + Double.toString(total)+"\n");
					
			}
		});
		totalButton.setFont(new Font("Tahoma", Font.PLAIN, 9));
		totalButton.setBounds(297, 31, 61, 23);
		frame.getContentPane().add(totalButton);
		
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
