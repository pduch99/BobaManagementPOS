package Boba;

import java.awt.EventQueue;

import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JSeparator;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class login_S {

	private JFrame frame;
	private JTextField txtUsername;
	private JPasswordField txtPassword;
	private static Employee[] workers = new Employee[10];
	private static ArrayList<Integer> positions = new ArrayList<Integer>(10); //keeps track of the open indexes in workers
	public static boolean loggedOn = false; //Tracks if a user is logged on, 
	private static String loggedUser;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login_S window = new login_S();
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
	public login_S() {
		for(int i = 0; i < 10; i++)
		{
			positions.add(i, i);
			System.out.println(i);
		}
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(200, 200, 500, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Manager Login System");
		lblNewLabel.setBounds(204, 25, 143, 26);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblusername = new JLabel("Username");
		lblusername.setBounds(90, 78, 80, 14);
		frame.getContentPane().add(lblusername);
		
		JLabel lblpassword = new JLabel("Password");
		lblpassword.setBounds(90, 148, 80, 14);
		frame.getContentPane().add(lblpassword);
		
		txtUsername = new JTextField();
		txtUsername.setBounds(196, 75, 123, 20);
		frame.getContentPane().add(txtUsername);
		txtUsername.setColumns(10);
		
		txtPassword = new JPasswordField();
		txtPassword.setBounds(196, 145, 123, 20);
		frame.getContentPane().add(txtPassword);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String password = new String(txtPassword.getPassword());
				String username = txtUsername.getText();
				boolean succ = false;
				
				for(int i = 0; i < workers.length; i++) {
					if(workers[i] != null) {
						if(workers[i].isName(username) && workers[i].isPassword(password)) {
							JOptionPane.showMessageDialog(frame, "Login sucsessful", "Management Login Systems", JOptionPane.INFORMATION_MESSAGE);
							loggedOn = true;
							succ = true;
							loggedUser = username;
							mainScreen.employLbl.setText("Welcome " + username);
							break;
						}
					}
				}
				if(succ == false) {
					JOptionPane.showMessageDialog(frame, "Invalid Login Details", "Management Login Systems", JOptionPane.ERROR_MESSAGE);
				}
				txtUsername.setText(null);
				txtPassword.setText(null);
			}
		});
		btnLogin.setBounds(31, 210, 80, 23);
		frame.getContentPane().add(btnLogin);
		
		JButton addBtn = new JButton("Add"); 
		addBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addEmp(txtUsername.getText(), new String(txtPassword.getPassword()));
			}
		});
		addBtn.setBounds(116, 210, 80, 23);
		frame.getContentPane().add(addBtn);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtUsername.setText(null);
				txtPassword.setText(null);
			}
		});
		btnReset.setBounds(204, 210, 80, 23);
		frame.getContentPane().add(btnReset);
		
		JButton removeBtn = new JButton("Remove"); 
		removeBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				removeEmp(txtUsername.getText(), new String(txtPassword.getPassword()));
			}
		});
		removeBtn.setBounds(292, 210, 80, 23);
		frame.getContentPane().add(removeBtn);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame frmLoginSystems = new JFrame("Exit");
				if(JOptionPane.showConfirmDialog(frmLoginSystems, "Confirm if you want to exit", "Login Systems", JOptionPane.YES_NO_OPTION)== 
						JOptionPane.YES_NO_OPTION) {
					frame.dispose();
				}
				
			}
		});
		btnExit.setBounds(380, 210, 80, 23);
		frame.getContentPane().add(btnExit);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(71, 189, 366, 10);
		frame.getContentPane().add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(71, 53, 366, 10);
		frame.getContentPane().add(separator_1);
	}
	
	public void addEmp(String name, String passwd)
	{
		boolean potato = positions.isEmpty();
		int ind = 0;
		if(potato == false) {
			workers[positions.remove(ind)] = new Employee(name, passwd);
			txtUsername.setText(null);
			txtPassword.setText(null);
		}
		else {
			txtUsername.setText(null);
			txtPassword.setText(null);
		}
	}
	
	public void removeEmp(String name, String password)
	{
		for(int i = 0; i < workers.length; i++)
		{
			if(!positions.contains(i))
			{
				if(workers[i].isName(name) && workers[i].isPassword(password))
				{
					positions.add(i);
					workers[i] = null;
					txtUsername.setText(null);
					txtPassword.setText(null);
					break;
				}
			}
		}
	}
	
	public String getLoggedUser()
	{ return loggedUser; }
}
