package Source;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.*;

public class mainScreen extends JFrame implements ActionListener {

	private static String header = "WELCOME TO Restaurant";
	private String logIn = "Employee Log In";
	private String menu = "Menu";

	private JButton loginBtn = new JButton("Employee Log In");
	private JButton restaurantBtn = new JButton("Cafe Menu");
	private JButton managementBtn = new JButton("Manager Hub");
	private JLabel loginLbl = new JLabel("Please Log In here");
	private JLabel restaurantLbl = new JLabel("Access the menu here");
	private JLabel managementLbl = new JLabel("Managers Access Records here");

	private JPanel topPanel = new JPanel(new GridLayout(3, 2));
	//login_S fr = new login_S();

	public mainScreen(String title) {

		super(title);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400, 400);
		setLayout(new BorderLayout());
		createTopPanel();
		addPanelsToFrame();
		setActionListener();
		setVisible(true);

	}

	private void addPanelsToFrame() {
		add(topPanel, BorderLayout.CENTER);

//		add(middlePanel);
//		add(bottomPanel);
	}

	private void createTopPanel() {
		topPanel.add(loginBtn);
		topPanel.add(restaurantBtn);
		topPanel.add(managementBtn);

	}

	private void setActionListener() {
		loginBtn.addActionListener(this);
		restaurantBtn.addActionListener(this);
		managementBtn.addActionListener(this);

	}

//	public static void main(String[] args) {
////		Scanner cin = new Scanner(System.in);
////		// TODO Auto-generated method stub
////		System.out.println("\t\t\t" + header + "\n\n");
////		System.out.println("Employees Please Log in before making sales" + 
////		" Press E then enter to log in");
////		String employee = cin.nextLine();
////		while (employee.isBlank() || employee != "E") {
////			System.out.println("Please Enter E to log in: ");
////			employee = cin.nextLine();
////
////		}
////		if(employee.equalsIgnoreCase("E")) {
//		new mainScreen().setVisible(true);
////			
//		}

	@Override
	public void actionPerformed(ActionEvent e) {
		String callingBtn = e.getActionCommand();
		
		if (callingBtn.equals("Cafe Menu")) {
			if (e.getSource() == restaurantBtn) {
				System.out.println("Ok");
				showmenuFrame();

			} 
		}

		if (callingBtn.equalsIgnoreCase("Employee Log In")) {
			//System.out.println("You can now log in");
			if (e.getSource() == loginBtn) {
				showlogFrame();
				// OPEN THE SEARCH WINDOW

			}
			
		} else if (callingBtn.equals("Manager Hub")) {
			// System.out.println("You can now log in");
			if (e.getSource() == managementBtn) {
				login_S fr = new login_S();
				login_S.main(null);
				
			}
			
		}

	}
	// public void actionPerformed(ActionEvent evt){

	// }

	private void showlogFrame() {
		JFrame logFrame = new JFrame("Log In");
		logFrame.setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		logFrame.setLocationRelativeTo(null);
		logFrame.setVisible(true);

	}

	private void showmenuFrame() {
//		JFrame menuFrame = new JFrame("Menu Items");
//		menuFrame.setSize(500, 500);
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		menuFrame.setLocationRelativeTo(null);
//		menuFrame.setVisible(true);
		


	}

	private void showmanageFrame() {
		JFrame manageFrame = new JFrame("Manage");
		manageFrame.setSize(500, 120);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		manageFrame.setLocationRelativeTo(null);
		manageFrame.setVisible(true);

	}

}
