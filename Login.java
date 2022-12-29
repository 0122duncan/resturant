package firstWindowBulider;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
public class Login extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField accountText;
	private JPasswordField passwordField;
	private OrderList orderlist;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 436, 263);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel login_page = new JLabel("餐廳帳號登入系統");
		login_page.setFont(new Font("新細明體", Font.PLAIN, 20));
		login_page.setBounds(133, 45, 182, 35);
		panel.add(login_page);
		
		JLabel passwoedLabel = new JLabel("密碼:");
		passwoedLabel.setFont(new Font("新細明體", Font.PLAIN, 15));
		passwoedLabel.setBounds(78, 170, 59, 27);
		panel.add(passwoedLabel);
		
		JLabel accountLabel = new JLabel("帳號:");
		accountLabel.setFont(new Font("新細明體", Font.PLAIN, 15));
		accountLabel.setBounds(78, 112, 59, 27);
		panel.add(accountLabel);
		
		accountText = new JTextField();
		accountText.setBounds(130, 112, 206, 27);
		panel.add(accountText);
		accountText.setColumns(10);
		
		JButton loginSure = new JButton("確定");
		loginSure.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String account = accountText.getText();
				char prefix = account.charAt(0);
				if(prefix == 109 || prefix == 77) {
					MangerPage frame = new MangerPage();
					frame.setVisible(true);
				}
				else if(prefix == 87 || prefix == 119) {}
				else if(prefix == 76 || prefix == 108) {}
				else if(prefix == 90 || prefix == 122) {}
				else if(prefix == 75 || prefix == 107) {
					ChefPG chefPG = new ChefPG(orderlist);
					chefPG.setVisible(true);
				}
				else {
					JOptionPane.showMessageDialog(null, "帳號或密碼錯誤");
				}
			}
		});
		loginSure.setBackground(new Color(255, 255, 255));
		loginSure.setFont(new Font("新細明體", Font.PLAIN, 15));
		loginSure.setBounds(341, 230, 85, 23);
		panel.add(loginSure);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(130, 170, 206, 27);
		panel.add(passwordField);
	}
}
