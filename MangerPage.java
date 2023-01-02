package firstWindowBulider;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MangerPage extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MangerPage window = new MangerPage();
					window.frame.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MangerPage() {
		
		frame = new JFrame();
		frame.setTitle("經理頁面");
		frame.setBounds(100, 100, 520, 382);
		frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		frame.setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 500, 345);
		contentPane.add(panel);
		
		JButton employeeButton = new JButton("員工資料管理");
		employeeButton.setBounds(173, 35, 170, 36);
		employeeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SoftwaveTeamWork buttonFrame = new SoftwaveTeamWork();
				buttonFrame.setVisible(true);
				
			}
		});
		panel.setLayout(null);
		employeeButton.setBackground(new Color(255, 255, 255));
		employeeButton.setFont(new Font("新細明體", Font.PLAIN, 15));
		panel.add(employeeButton);
		
		JButton checkButton = new JButton("庫存查詢");
		checkButton.setBounds(173, 90, 170, 36);
		checkButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Sellcheck buttonframe = new Sellcheck();
				buttonframe.setVisible(true);
			}
		});
		checkButton.setBackground(new Color(255, 255, 255));
		checkButton.setFont(new Font("新細明體", Font.PLAIN, 15));
		panel.add(checkButton);
		
		JButton sellButton = new JButton("銷售統計");
		sellButton.setBounds(173, 145, 170, 36);
		sellButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Selling buttonframe = new Selling();
				buttonframe.setVisible(true);
			}
		});
		sellButton.setBackground(new Color(255, 255, 255));
		sellButton.setFont(new Font("新細明體", Font.PLAIN, 15));
		panel.add(sellButton);
		
		JButton tableButton = new JButton("桌椅配置");
		tableButton.setBounds(173, 255, 170, 36);
		tableButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tableHappening_manager frame = new tableHappening_manager();
				frame.setVisible(true);
			}
		});
		tableButton.setFont(new Font("新細明體", Font.PLAIN, 15));
		tableButton.setBackground(Color.WHITE);
		panel.add(tableButton);
		
		JButton orderButton = new JButton("銷售分析");
		orderButton.setBounds(173, 200, 170, 36);
		orderButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ManagerOrderPG manggerOrderPG = new ManagerOrderPG();
				manggerOrderPG.setVisible(true);
			}
		});
		orderButton.setFont(new Font("新細明體", Font.PLAIN, 15));
		orderButton.setBackground(Color.WHITE);
		panel.add(orderButton);
		
		JButton leaveButton = new JButton("離開");
		leaveButton.setBackground(new Color(255, 255, 255));
		leaveButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login login = new Login();
				login.setVisible(true);
				
			    frame.dispose();
				
				
			}
		});
		leaveButton.setFont(new Font("新細明體", Font.PLAIN, 15));
		leaveButton.setBounds(389, 294, 85, 27);
		panel.add(leaveButton);
	}
}
