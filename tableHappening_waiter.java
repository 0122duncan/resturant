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
		if (OrderList.getTableStatus()[1] == 1) {
			table1.setText("空閒中");
			table1.setBackground(Color.GREEN);
			table1.setForeground(Color.BLACK);
		}
		if (OrderList.getTableStatus()[1] == 2) {
			table1.setText("使用中");
			table1.setBackground(Color.RED);
			table1.setForeground(Color.WHITE);
		}
		if (OrderList.getTableStatus()[1] == 3) {
			table1.setText("未清理");
			table1.setBackground(Color.ORANGE);
			table1.setForeground(Color.BLACK);
		}
		
		JButton table2 = new JButton("使用中");
		table2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				waiterOfOrder waiterOfOrderFrame = new waiterOfOrder();
				waiterOfOrderFrame.setVisible(true);
			}
		});
		table2.setBounds(160, 50, 85, 23);
		contentPane.add(table2);
		if (OrderList.getTableStatus()[2] == 1) {
			table2.setText("空閒中");
			table2.setBackground(Color.GREEN);
			table2.setForeground(Color.BLACK);
		}
		if (OrderList.getTableStatus()[2] == 2) {
			table2.setText("使用中");
			table2.setBackground(Color.RED);
			table2.setForeground(Color.WHITE);
		}
		if (OrderList.getTableStatus()[2] == 3) {
			table2.setText("未清理");
			table2.setBackground(Color.ORANGE);
			table2.setForeground(Color.BLACK);
		}
		

		JButton table3 = new JButton("使用中");
		table3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				waiterOfOrder waiterOfOrderFrame = new waiterOfOrder();
				waiterOfOrderFrame.setVisible(true);
			}
		});
		table3.setBounds(280, 50, 85, 23);
		contentPane.add(table3);
		if (OrderList.getTableStatus()[3] == 1) {
			table3.setText("空閒中");
			table3.setBackground(Color.GREEN);
			table3.setForeground(Color.BLACK);
		}
		if (OrderList.getTableStatus()[3] == 2) {
			table3.setText("使用中");
			table3.setBackground(Color.RED);
			table3.setForeground(Color.WHITE);
		}
		if (OrderList.getTableStatus()[3] == 3) {
			table3.setText("未清理");
			table3.setBackground(Color.ORANGE);
			table3.setForeground(Color.BLACK);
		}

		JButton table4 = new JButton("使用中");
		table4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				waiterOfOrder waiterOfOrderFrame = new waiterOfOrder();
				waiterOfOrderFrame.setVisible(true);
			}
		});
		table4.setBounds(400, 50, 85, 23);
		contentPane.add(table4);
		if (OrderList.getTableStatus()[4] == 1) {
			table4.setText("空閒中");
			table4.setBackground(Color.GREEN);
			table4.setForeground(Color.BLACK);
		}
		if (OrderList.getTableStatus()[4] == 2) {
			table4.setText("使用中");
			table4.setBackground(Color.RED);
			table4.setForeground(Color.WHITE);
		}
		if (OrderList.getTableStatus()[4] == 3) {
			table4.setText("未清理");
			table4.setBackground(Color.ORANGE);
			table4.setForeground(Color.BLACK);
		}

		JButton table5 = new JButton("使用中");
		table5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				waiterOfOrder waiterOfOrderFrame = new waiterOfOrder();
				waiterOfOrderFrame.setVisible(true);
			}
		});
		table5.setBounds(40, 200, 85, 23);
		contentPane.add(table5);
		if (OrderList.getTableStatus()[5] == 1) {
			table5.setText("空閒中");
			table5.setBackground(Color.GREEN);
			table5.setForeground(Color.BLACK);
		}
		if (OrderList.getTableStatus()[5] == 2) {
			table5.setText("使用中");
			table5.setBackground(Color.RED);
			table5.setForeground(Color.WHITE);
		}
		if (OrderList.getTableStatus()[5] == 3) {
			table5.setText("未清理");
			table5.setBackground(Color.ORANGE);
			table5.setForeground(Color.BLACK);
		}

		JButton table6 = new JButton("使用中");
		table6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				waiterOfOrder waiterOfOrderFrame = new waiterOfOrder();
				waiterOfOrderFrame.setVisible(true);
			}
		});
		table6.setBounds(160, 200, 85, 23);
		contentPane.add(table6);
		if (OrderList.getTableStatus()[6] == 1) {
			table6.setText("空閒中");
			table6.setBackground(Color.GREEN);
			table6.setForeground(Color.BLACK);
		}
		if (OrderList.getTableStatus()[6] == 2) {
			table6.setText("使用中");
			table6.setBackground(Color.RED);
			table6.setForeground(Color.WHITE);
		}
		if (OrderList.getTableStatus()[6] == 3) {
			table6.setText("未清理");
			table6.setBackground(Color.ORANGE);
			table6.setForeground(Color.BLACK);
		}

		JButton table7 = new JButton("使用中");
		table7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				waiterOfOrder waiterOfOrderFrame = new waiterOfOrder();
				waiterOfOrderFrame.setVisible(true);
			}
		});
		table7.setBounds(280, 200, 85, 23);
		contentPane.add(table7);
		if (OrderList.getTableStatus()[7] == 1) {
			table7.setText("空閒中");
			table7.setBackground(Color.GREEN);
			table7.setForeground(Color.BLACK);
		}
		if (OrderList.getTableStatus()[7] == 2) {
			table7.setText("使用中");
			table7.setBackground(Color.RED);
			table7.setForeground(Color.WHITE);
		}
		if (OrderList.getTableStatus()[7] == 3) {
			table7.setText("未清理");
			table7.setBackground(Color.ORANGE);
			table7.setForeground(Color.BLACK);
		}

		JButton table8 = new JButton("使用中");
		table8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				waiterOfOrder waiterOfOrderFrame = new waiterOfOrder();
				waiterOfOrderFrame.setVisible(true);
			}
		});
		table8.setBounds(400, 200, 85, 23);
		contentPane.add(table8);
		if (OrderList.getTableStatus()[8] == 1) {
			table8.setText("空閒中");
			table8.setBackground(Color.GREEN);
			table8.setForeground(Color.BLACK);
		}
		if (OrderList.getTableStatus()[8] == 2) {
			table8.setText("使用中");
			table8.setBackground(Color.RED);
			table8.setForeground(Color.WHITE);
		}
		if (OrderList.getTableStatus()[8] == 3) {
			table8.setText("未清理");
			table8.setBackground(Color.ORANGE);
			table8.setForeground(Color.BLACK);
		}

		JButton table9 = new JButton("使用中");
		table9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				waiterOfOrder waiterOfOrderFrame = new waiterOfOrder();
				waiterOfOrderFrame.setVisible(true);
			}
		});
		table9.setBounds(40, 350, 85, 23);
		contentPane.add(table9);
		if (OrderList.getTableStatus()[9] == 1) {
			table9.setText("空閒中");
			table9.setBackground(Color.GREEN);
			table9.setForeground(Color.BLACK);
		}
		if (OrderList.getTableStatus()[9] == 2) {
			table9.setText("使用中");
			table9.setBackground(Color.RED);
			table9.setForeground(Color.WHITE);
		}
		if (OrderList.getTableStatus()[9] == 3) {
			table9.setText("未清理");
			table9.setBackground(Color.ORANGE);
			table9.setForeground(Color.BLACK);
		}

		JButton table10 = new JButton("使用中");
		table10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				waiterOfOrder waiterOfOrderFrame = new waiterOfOrder();
				waiterOfOrderFrame.setVisible(true);
			}
		});
		table10.setBounds(160, 350, 85, 23);
		contentPane.add(table10);
		if (OrderList.getTableStatus()[10] == 1) {
			table10.setText("空閒中");
			table10.setBackground(Color.GREEN);
			table10.setForeground(Color.BLACK);
		}
		if (OrderList.getTableStatus()[10] == 2) {
			table10.setText("使用中");
			table10.setBackground(Color.RED);
			table10.setForeground(Color.WHITE);
		}
		if (OrderList.getTableStatus()[10] == 3) {
			table10.setText("未清理");
			table10.setBackground(Color.ORANGE);
			table10.setForeground(Color.BLACK);
		}

		JButton table11 = new JButton("使用中");
		table11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				waiterOfOrder waiterOfOrderFrame = new waiterOfOrder();
				waiterOfOrderFrame.setVisible(true);
			}
		});
		table11.setBounds(280, 350, 85, 23);
		contentPane.add(table11);
		if (OrderList.getTableStatus()[11] == 1) {
			table11.setText("空閒中");
			table11.setBackground(Color.GREEN);
			table11.setForeground(Color.BLACK);
		}
		if (OrderList.getTableStatus()[11] == 2) {
			table11.setText("使用中");
			table11.setBackground(Color.RED);
			table11.setForeground(Color.WHITE);
		}
		if (OrderList.getTableStatus()[11] == 3) {
			table11.setText("未清理");
			table11.setBackground(Color.ORANGE);
			table11.setForeground(Color.BLACK);
		}


		JButton table12 = new JButton("使用中");
		table12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				waiterOfOrder waiterOfOrderFrame = new waiterOfOrder();
				waiterOfOrderFrame.setVisible(true);
			}
		});
		table12.setBounds(400, 350, 85, 23);
		contentPane.add(table12);
		if (OrderList.getTableStatus()[12] == 1) {
			table12.setText("空閒中");
			table12.setBackground(Color.GREEN);
			table12.setForeground(Color.BLACK);
		}
		if (OrderList.getTableStatus()[12] == 2) {
			table12.setText("使用中");
			table12.setBackground(Color.RED);
			table12.setForeground(Color.WHITE);
		}
		if (OrderList.getTableStatus()[12] == 3) {
			table12.setText("未清理");
			table12.setBackground(Color.ORANGE);
			table12.setForeground(Color.BLACK);
		}

		 
		//餐桌數量隱藏
				if (OrderList.getTableQuantit()==1) {
					table1.setVisible(true);
					table2.setVisible(false);
					table3.setVisible(false);
					table4.setVisible(false);
					table5.setVisible(false);
					table6.setVisible(false);
					table7.setVisible(false);
					table8.setVisible(false);
					table9.setVisible(false);
					table10.setVisible(false);
					table11.setVisible(false);
					table12.setVisible(false);
		
					
				}
				
				if (OrderList.getTableQuantit()==2) {
					table1.setVisible(true);
					table2.setVisible(true);
					table3.setVisible(false);
					table4.setVisible(false);
					table5.setVisible(false);
					table6.setVisible(false);
					table7.setVisible(false);
					table8.setVisible(false);
					table9.setVisible(false);
					table10.setVisible(false);
					table11.setVisible(false);
					table12.setVisible(false);
			
					
				}
				
				if (OrderList.getTableQuantit()==3) {
					table1.setVisible(true);
					table2.setVisible(true);
					table3.setVisible(true);
					table4.setVisible(false);
					table5.setVisible(false);
					table6.setVisible(false);
					table7.setVisible(false);
					table8.setVisible(false);
					table9.setVisible(false);
					table10.setVisible(false);
					table11.setVisible(false);
					table12.setVisible(false);
				
					
				}
				
				if (OrderList.getTableQuantit()==4) {
					table1.setVisible(true);
					table2.setVisible(true);
					table3.setVisible(true);
					table4.setVisible(true);
					table5.setVisible(false);
					table6.setVisible(false);
					table7.setVisible(false);
					table8.setVisible(false);
					table9.setVisible(false);
					table10.setVisible(false);
					table11.setVisible(false);
					table12.setVisible(false);
			
					
				}
				
				if (OrderList.getTableQuantit()==5) {
					table1.setVisible(true);
					table2.setVisible(true);
					table3.setVisible(true);
					table4.setVisible(true);
					table5.setVisible(true);
					table6.setVisible(false);
					table7.setVisible(false);
					table8.setVisible(false);
					table9.setVisible(false);
					table10.setVisible(false);
					table11.setVisible(false);
					table12.setVisible(false);
			
				}
				
				if (OrderList.getTableQuantit()==6) {
					table1.setVisible(true);
					table2.setVisible(true);
					table3.setVisible(true);
					table4.setVisible(true);
					table5.setVisible(true);
					table6.setVisible(true);
					table7.setVisible(false);
					table8.setVisible(false);
					table9.setVisible(false);
					table10.setVisible(false);
					table11.setVisible(false);
					table12.setVisible(false);
		
				}
				
				if (OrderList.getTableQuantit()==7) {
					table1.setVisible(true);
					table2.setVisible(true);
					table3.setVisible(true);
					table4.setVisible(true);
					table5.setVisible(true);
					table6.setVisible(true);
					table7.setVisible(true);
					table8.setVisible(false);
					table9.setVisible(false);
					table10.setVisible(false);
					table11.setVisible(false);
					table12.setVisible(false);
		
					
					
				}
				
				if (OrderList.getTableQuantit()==8) {
					table1.setVisible(true);
					table2.setVisible(true);
					table3.setVisible(true);
					table4.setVisible(true);
					table5.setVisible(true);
					table6.setVisible(true);
					table7.setVisible(true);
					table8.setVisible(true);
					table9.setVisible(false);
					table10.setVisible(false);
					table11.setVisible(false);
					table12.setVisible(false);
			
				}
				
				if (OrderList.getTableQuantit()==9) {
					table1.setVisible(true);
					table2.setVisible(true);
					table3.setVisible(true);
					table4.setVisible(true);
					table5.setVisible(true);
					table6.setVisible(true);
					table7.setVisible(true);
					table8.setVisible(true);
					table9.setVisible(true);
					table10.setVisible(false);
					table11.setVisible(false);
					table12.setVisible(false);
		
				}
				
				if (OrderList.getTableQuantit()==10) {
					table1.setVisible(true);
					table2.setVisible(true);
					table3.setVisible(true);
					table4.setVisible(true);
					table5.setVisible(true);
					table6.setVisible(true);
					table7.setVisible(true);
					table8.setVisible(true);
					table9.setVisible(true);
					table10.setVisible(true);
					table11.setVisible(false);
					table12.setVisible(false);
				
					
				}
				
				if (OrderList.getTableQuantit()==11) {
					table1.setVisible(true);
					table2.setVisible(true);
					table3.setVisible(true);
					table4.setVisible(true);
					table5.setVisible(true);
					table6.setVisible(true);
					table7.setVisible(true);
					table8.setVisible(true);
					table9.setVisible(true);
					table10.setVisible(true);
					table11.setVisible(true);
					table12.setVisible(false);

					
				}
				
				if (OrderList.getTableQuantit()==12) {
					table1.setVisible(true);
					table2.setVisible(true);
					table3.setVisible(true);
					table4.setVisible(true);
					table5.setVisible(true);
					table6.setVisible(true);
					table7.setVisible(true);
					table8.setVisible(true);
					table9.setVisible(true);
					table10.setVisible(true);
					table11.setVisible(true);
					table12.setVisible(true);
		
				}
			

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
