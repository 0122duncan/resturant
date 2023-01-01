package restaurant;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


public class tableHappening_waiter extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					tableHappening_waiter frame = new tableHappening_waiter();
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
	public tableHappening_waiter() {
		setTitle("服務生");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 710, 496);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);


		// 座位

		JButton table1 = new JButton("使用中");
		table1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				waiterOfOrder waiterOfOrderFrame = new waiterOfOrder();
				waiterOfOrderFrame.setVisible(true);
			}
		});
		
		table1.setBounds(40, 50, 85, 23);
		contentPane.add(table1);

		JButton table2 = new JButton("空閒中");
		table2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				waiterOfOrder waiterOfOrderFrame = new waiterOfOrder();
				waiterOfOrderFrame.setVisible(true);
			}
		});
		table2.setBounds(160, 50, 85, 23);
		contentPane.add(table2);
		

		JButton table3 = new JButton("空閒中");
		table3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				waiterOfOrder waiterOfOrderFrame = new waiterOfOrder();
				waiterOfOrderFrame.setVisible(true);
			}
		});
		table3.setBounds(280, 50, 85, 23);
		contentPane.add(table3);

		JButton table4 = new JButton("空閒中");
		table4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				waiterOfOrder waiterOfOrderFrame = new waiterOfOrder();
				waiterOfOrderFrame.setVisible(true);
			}
		});
		table4.setBounds(400, 50, 85, 23);
		contentPane.add(table4);

		JButton table5 = new JButton("空閒中");
		table5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				waiterOfOrder waiterOfOrderFrame = new waiterOfOrder();
				waiterOfOrderFrame.setVisible(true);
			}
		});
		table5.setBounds(40, 200, 85, 23);
		contentPane.add(table5);

		JButton table6 = new JButton("空閒中");
		table6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				waiterOfOrder waiterOfOrderFrame = new waiterOfOrder();
				waiterOfOrderFrame.setVisible(true);
			}
		});
		table6.setBounds(160, 200, 85, 23);
		contentPane.add(table6);

		JButton table7 = new JButton("空閒中");
		table7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				waiterOfOrder waiterOfOrderFrame = new waiterOfOrder();
				waiterOfOrderFrame.setVisible(true);
			}
		});
		table7.setBounds(280, 200, 85, 23);
		contentPane.add(table7);

		JButton table8 = new JButton("空閒中");
		table8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				waiterOfOrder waiterOfOrderFrame = new waiterOfOrder();
				waiterOfOrderFrame.setVisible(true);
			}
		});
		table8.setBounds(400, 200, 85, 23);
		contentPane.add(table8);

		JButton table9 = new JButton("空閒中");
		table9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				waiterOfOrder waiterOfOrderFrame = new waiterOfOrder();
				waiterOfOrderFrame.setVisible(true);
			}
		});
		table9.setBounds(40, 350, 85, 23);
		contentPane.add(table9);

		JButton table10 = new JButton("空閒中");
		table10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				waiterOfOrder waiterOfOrderFrame = new waiterOfOrder();
				waiterOfOrderFrame.setVisible(true);
			}
		});
		table10.setBounds(160, 350, 85, 23);
		contentPane.add(table10);

		JButton table11 = new JButton("空閒中");
		table11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				waiterOfOrder waiterOfOrderFrame = new waiterOfOrder();
				waiterOfOrderFrame.setVisible(true);
			}
		});
		table11.setBounds(280, 350, 85, 23);
		contentPane.add(table11);

		JButton table12 = new JButton("空閒中");
		table12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				waiterOfOrder waiterOfOrderFrame = new waiterOfOrder();
				waiterOfOrderFrame.setVisible(true);
			}
		});
		table12.setBounds(400, 350, 85, 23);
		contentPane.add(table12);

		 

		// 提交

		JButton Confirm = new JButton("提交");
		Confirm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});
		Confirm.setBounds(562, 350, 85, 23);
		contentPane.add(Confirm);

	}
}
