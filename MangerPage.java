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

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MangerPage frame = new MangerPage();
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
	public MangerPage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 490, 351);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 486, 314);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton employeeButton = new JButton("員工資料管理");
		employeeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SoftwaveTeamWork buttonFrame = new SoftwaveTeamWork();
				buttonFrame.setVisible(true);
				
			}
		});
		employeeButton.setBounds(153, 35, 170, 36);
		employeeButton.setBackground(new Color(255, 255, 255));
		employeeButton.setFont(new Font("新細明體", Font.PLAIN, 15));
		panel.add(employeeButton);
		
		JButton checkButton = new JButton("庫存查詢");
		checkButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Sellcheck buttonframe = new Sellcheck();
				buttonframe.setVisible(true);
			}
		});
		checkButton.setBounds(153, 90, 170, 36);
		checkButton.setBackground(new Color(255, 255, 255));
		checkButton.setFont(new Font("新細明體", Font.PLAIN, 15));
		panel.add(checkButton);
		
		JButton sellButton = new JButton("銷售統計");
		sellButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Selling buttonframe = new Selling();
				buttonframe.setVisible(true);
			}
		});
		sellButton.setBounds(153, 145, 170, 36);
		sellButton.setBackground(new Color(255, 255, 255));
		sellButton.setFont(new Font("新細明體", Font.PLAIN, 15));
		panel.add(sellButton);
		
		JButton tableButton = new JButton("桌椅配置");
		tableButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		tableButton.setFont(new Font("新細明體", Font.PLAIN, 15));
		tableButton.setBackground(Color.WHITE);
		tableButton.setBounds(153, 200, 170, 36);
		panel.add(tableButton);
	}
}
