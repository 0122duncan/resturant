package firstWindowBulider;

import java.awt.Color;
import java.awt.Container;
import java.awt.EventQueue;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import java.awt.Toolkit;

public class tableHappening_busboy extends tableHappening_manager {

	private static int tableState1;
	private static int tableState2;
	private static int tableState3;
	private static int tableState4;
	private static int tableState5;
	private static int tableState6;
	private static int tableState7;
	private static int tableState8;
	private static int tableState9;
	private static int tableState10;
	private static int tableState11;
	private static int tableState12;

	private JPanel bady;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					tableHappening_busboy frame = new tableHappening_busboy();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * 言 Create the frame.
	 * 
	 * @throws MalformedURLException
	 */
	public tableHappening_busboy() throws MalformedURLException {
		setTitle("雜工");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 710, 496);
		bady = new JPanel();
		bady.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(bady);
		bady.setLayout(null);

		// 狀態選項

		JComboBox<String> state1 = new JComboBox<String>();
		state1.setBounds(40, 83, 85, 23);
		bady.add(state1);
		state1.addItem("默認");
		state1.addItem("空閒中");

		JComboBox<String> state2 = new JComboBox<String>();
		state2.setBounds(160, 83, 85, 23);
		bady.add(state2);
		state2.addItem("默認");
		state2.addItem("空閒中");

		JComboBox<String> state3 = new JComboBox<String>();
		state3.setBounds(280, 83, 85, 23);
		bady.add(state3);
		state3.addItem("默認");
		state3.addItem("空閒中");

		JComboBox<String> state4 = new JComboBox<String>();
		state4.setBounds(400, 83, 85, 23);
		bady.add(state4);
		state4.addItem("默認");
		state4.addItem("空閒中");

		JComboBox<String> state5 = new JComboBox<String>();
		state5.setBounds(40, 233, 85, 23);
		bady.add(state5);
		state5.addItem("默認");
		state5.addItem("空閒中");

		JComboBox<String> state6 = new JComboBox<String>();
		state6.setBounds(160, 233, 85, 23);
		bady.add(state6);
		state6.addItem("默認");
		state6.addItem("空閒中");

		JComboBox<String> state7 = new JComboBox<String>();
		state7.setBounds(280, 233, 85, 23);
		bady.add(state7);
		state7.addItem("默認");
		state7.addItem("空閒中");

		JComboBox<String> state8 = new JComboBox<String>();
		state8.setBounds(400, 233, 85, 23);
		bady.add(state8);
		state8.addItem("默認");
		state8.addItem("空閒中");

		JComboBox<String> state9 = new JComboBox<String>();
		state9.setBounds(40, 383, 85, 23);
		bady.add(state9);
		state9.addItem("默認");
		state9.addItem("空閒中");

		JComboBox<String> state10 = new JComboBox<String>();
		state10.setBounds(160, 383, 85, 23);
		bady.add(state10);
		state10.addItem("默認");
		state10.addItem("空閒中");

		JComboBox<String> state11 = new JComboBox<String>();
		state11.setBounds(280, 383, 85, 23);
		bady.add(state11);
		state11.addItem("默認");
		state11.addItem("空閒中");

		JComboBox<String> state12 = new JComboBox<String>();
		state12.setBounds(400, 383, 85, 23);
		bady.add(state12);
		state12.addItem("默認");
		state12.addItem("空閒中");

		// 座位
		/*
		 * 
		 */
		// 1空閒中、2使用中，3未清理

		JButton table1 = new JButton("未清理");
		table1.setBounds(40, 50, 85, 23);
		bady.add(table1);
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

		JButton table2 = new JButton("未清理");
		table2.setBounds(160, 50, 85, 23);
		bady.add(table2);
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

		JButton table3 = new JButton("未清理");
		table3.setBounds(280, 50, 85, 23);
		bady.add(table3);
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

		JButton table4 = new JButton("未清理");
		table4.setBounds(400, 50, 85, 23);
		bady.add(table4);
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

		JButton table5 = new JButton("未清理");
		table5.setBounds(40, 200, 85, 23);
		bady.add(table5);
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

		JButton table6 = new JButton("未清理");
		table6.setBounds(160, 200, 85, 23);
		bady.add(table6);
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

		JButton table7 = new JButton("未清理");
		table7.setBounds(280, 200, 85, 23);
		bady.add(table7);
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

		JButton table8 = new JButton("未清理");
		table8.setBounds(400, 200, 85, 23);
		bady.add(table8);
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

		JButton table9 = new JButton("未清理");
		table9.setBounds(40, 350, 85, 23);
		bady.add(table9);
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

		JButton table10 = new JButton("未清理");
		table10.setBounds(160, 350, 85, 23);
		bady.add(table10);
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

		JButton table11 = new JButton("未清理");
		table11.setBounds(280, 350, 85, 23);
		bady.add(table11);
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

		JButton table12 = new JButton("未清理");
		table12.setBounds(400, 350, 85, 23);
		bady.add(table12);
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
		// 更改狀態
		state1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String nowState = (String) state1.getSelectedItem();
				if ("默認".equals(nowState)) {
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
				}
				if ("空閒中".equals(nowState)) {
					table1.setText(nowState);
					table1.setBackground(Color.GREEN);
					table1.setForeground(Color.BLACK);
					tableState1 = 1;
				}
			}

		});

		state2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String nowState = (String) state2.getSelectedItem();
				if ("默認".equals(nowState)) {
					if( OrderList.getTableStatus()[2]==1) {
						table2.setText("空閒中");
						table2.setBackground(Color.GREEN);
						table2.setForeground(Color.BLACK);
					}
					if( OrderList.getTableStatus()[2]==2) {
						table2.setText("使用中");
						table2.setBackground(Color.RED);
						table2.setForeground(Color.WHITE);
					}
					if( OrderList.getTableStatus()[2]==3) {
						table2.setText("未清理");
						table2.setBackground(Color.ORANGE);
						table2.setForeground(Color.BLACK);
					}
				}
				if ("空閒中".equals(nowState)) {
					table2.setText(nowState);
					table2.setBackground(Color.GREEN);
					table2.setForeground(Color.BLACK);
					tableState2 = 1;
				}
			}

		});

		state3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String nowState = (String) state3.getSelectedItem();
				if ("默認".equals(nowState)) {
					if( OrderList.getTableStatus()[3]==1) {
						table3.setText("空閒中");
						table3.setBackground(Color.GREEN);
						table3.setForeground(Color.BLACK);
					}
					if( OrderList.getTableStatus()[3]==2) {
						table3.setText("使用中");
						table3.setBackground(Color.RED);
						table3.setForeground(Color.WHITE);
					}
					if( OrderList.getTableStatus()[3]==3) {
						table3.setText("未清理");
						table3.setBackground(Color.ORANGE);
						table3.setForeground(Color.BLACK);
					}
				}
				if ("空閒中".equals(nowState)) {
					table3.setText(nowState);
					table3.setBackground(Color.GREEN);
					table3.setForeground(Color.BLACK);
					tableState3 = 1;
				}
			}

		});

		state4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String nowState = (String) state4.getSelectedItem();
				if ("默認".equals(nowState)) {
					if( OrderList.getTableStatus()[4]==1) {
						table4.setText("空閒中");
						table4.setBackground(Color.GREEN);
						table4.setForeground(Color.BLACK);
					}
					if( OrderList.getTableStatus()[4]==2) {
						table4.setText("使用中");
						table4.setBackground(Color.RED);
						table4.setForeground(Color.WHITE);
					}
					if( OrderList.getTableStatus()[4]==3) {
						table4.setText("未清理");
						table4.setBackground(Color.ORANGE);
						table4.setForeground(Color.BLACK);
					}
				}
				if ("空閒中".equals(nowState)) {
					table4.setText(nowState);
					table4.setBackground(Color.GREEN);
					table4.setForeground(Color.BLACK);
					tableState4 = 1;
				}
			}

		});

		state5.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String nowState = (String) state5.getSelectedItem();
				if ("默認".equals(nowState)) {
					if( OrderList.getTableStatus()[5]==1) {
						table5.setText("空閒中");
						table5.setBackground(Color.GREEN);
						table5.setForeground(Color.BLACK);
					}
					if( OrderList.getTableStatus()[5]==2) {
						table5.setText("使用中");
						table5.setBackground(Color.RED);
						table5.setForeground(Color.WHITE);
					}
					if( OrderList.getTableStatus()[5]==3) {
						table5.setText("未清理");
						table5.setBackground(Color.ORANGE);
						table5.setForeground(Color.BLACK);
					}
				}
				if ("空閒中".equals(nowState)) {
					table5.setText(nowState);
					table5.setBackground(Color.GREEN);
					table5.setForeground(Color.BLACK);
					tableState5 = 1;
				}
			}

		});

		state6.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String nowState = (String) state6.getSelectedItem();
				if ("默認".equals(nowState)) {
					if( OrderList.getTableStatus()[6]==1) {
						table6.setText("空閒中");
						table6.setBackground(Color.GREEN);
						table6.setForeground(Color.BLACK);
					}
					if( OrderList.getTableStatus()[6]==2) {
						table6.setText("使用中");
						table6.setBackground(Color.RED);
						table6.setForeground(Color.WHITE);
					}
					if( OrderList.getTableStatus()[6]==3) {
						table6.setText("未清理");
						table6.setBackground(Color.ORANGE);
						table6.setForeground(Color.BLACK);
					}	
				}
				if ("空閒中".equals(nowState)) {
					table6.setText(nowState);
					table6.setBackground(Color.GREEN);
					table6.setForeground(Color.BLACK);
					tableState6 = 1;
				}
			}

		});

		state7.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String nowState = (String) state7.getSelectedItem();
				if ("默認".equals(nowState)) {
					if( OrderList.getTableStatus()[7]==1) {
						table7.setText("空閒中");
						table7.setBackground(Color.GREEN);
						table7.setForeground(Color.BLACK);
					}
					if( OrderList.getTableStatus()[7]==2) {
						table7.setText("使用中");
						table7.setBackground(Color.RED);
						table7.setForeground(Color.WHITE);
					}
					if( OrderList.getTableStatus()[7]==3) {
						table7.setText("未清理");
						table7.setBackground(Color.ORANGE);
						table7.setForeground(Color.BLACK);
					}
				}
				if ("空閒中".equals(nowState)) {
					table7.setText(nowState);
					table7.setBackground(Color.GREEN);
					table7.setForeground(Color.BLACK);
					tableState7 = 1;
				}
			}

		});

		state8.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String nowState = (String) state8.getSelectedItem();
				if ("默認".equals(nowState)) {
					if( OrderList.getTableStatus()[8]==1) {
						table8.setText("空閒中");
						table8.setBackground(Color.GREEN);
						table8.setForeground(Color.BLACK);
					}
					if( OrderList.getTableStatus()[8]==2) {
						table8.setText("使用中");
						table8.setBackground(Color.RED);
						table8.setForeground(Color.WHITE);
					}
					if( OrderList.getTableStatus()[8]==3) {
						table8.setText("未清理");
						table8.setBackground(Color.ORANGE);
						table8.setForeground(Color.BLACK);
					}
				}
				if ("空閒中".equals(nowState)) {
					table8.setText(nowState);
					table8.setBackground(Color.GREEN);
					table8.setForeground(Color.BLACK);
					tableState8 = 1;
				}
			}

		});

		state9.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String nowState = (String) state9.getSelectedItem();
				if ("默認".equals(nowState)) {
					if( OrderList.getTableStatus()[9]==1) {
						table9.setText("空閒中");
						table9.setBackground(Color.GREEN);
						table9.setForeground(Color.BLACK);
					}
					if( OrderList.getTableStatus()[9]==2) {
						table9.setText("使用中");
						table9.setBackground(Color.RED);
						table9.setForeground(Color.WHITE);
					}
					if( OrderList.getTableStatus()[9]==3) {
						table9.setText("未清理");
						table9.setBackground(Color.ORANGE);
						table9.setForeground(Color.BLACK);
					}	
				}
				if ("空閒中".equals(nowState)) {
					table9.setText(nowState);
					table9.setBackground(Color.GREEN);
					table9.setForeground(Color.BLACK);
					tableState9 = 1;
				}
			}

		});

		state10.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String nowState = (String) state10.getSelectedItem();
				if ("默認".equals(nowState)) {
					if( OrderList.getTableStatus()[10]==1) {
						table10.setText("空閒中");
						table10.setBackground(Color.GREEN);
						table10.setForeground(Color.BLACK);
					}
					if( OrderList.getTableStatus()[10]==2) {
						table10.setText("使用中");
						table10.setBackground(Color.RED);
						table10.setForeground(Color.WHITE);
					}
					if( OrderList.getTableStatus()[10]==3) {
						table10.setText("未清理");
						table10.setBackground(Color.ORANGE);
						table10.setForeground(Color.BLACK);
					}	
				}
				if ("空閒中".equals(nowState)) {
					table10.setText(nowState);
					table10.setBackground(Color.GREEN);
					table10.setForeground(Color.BLACK);
					tableState10 = 1;
				}
			}

		});

		state11.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String nowState = (String) state11.getSelectedItem();
				if ("默認".equals(nowState)) {
					if( OrderList.getTableStatus()[11]==1) {
						table11.setText("空閒中");
						table11.setBackground(Color.GREEN);
						table11.setForeground(Color.BLACK);
					}
					if( OrderList.getTableStatus()[11]==2) {
						table11.setText("使用中");
						table11.setBackground(Color.RED);
						table11.setForeground(Color.WHITE);
					}
					if( OrderList.getTableStatus()[11]==3) {
						table11.setText("未清理");
						table11.setBackground(Color.ORANGE);
						table11.setForeground(Color.BLACK);
					}	
				}
				if ("空閒中".equals(nowState)) {
					table11.setText(nowState);
					table11.setBackground(Color.GREEN);
					table11.setForeground(Color.BLACK);
					tableState11 = 1;
				}
			}

		});

		state12.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String nowState = (String) state12.getSelectedItem();
				if ("默認".equals(nowState)) {
					if( OrderList.getTableStatus()[12]==1) {
						table12.setText("空閒中");
						table12.setBackground(Color.GREEN);
						table12.setForeground(Color.BLACK);
					}
					if( OrderList.getTableStatus()[12]==2) {
						table12.setText("使用中");
						table12.setBackground(Color.RED);
						table12.setForeground(Color.WHITE);
					}
					if( OrderList.getTableStatus()[12]==3) {
						table12.setText("未清理");
						table12.setBackground(Color.ORANGE);
						table12.setForeground(Color.BLACK);
					}	
				}
				if ("空閒中".equals(nowState)) {
					table12.setText(nowState);
					table12.setBackground(Color.GREEN);
					table12.setForeground(Color.BLACK);
					tableState12 = 1;
				}
			}

		});

		// 提交
		JButton Confirm = new JButton("提交");
		Confirm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				OrderList.updateTableStatus(1, tableState1);
				OrderList.updateTableStatus(2, tableState2);
				OrderList.updateTableStatus(3, tableState3);
				OrderList.updateTableStatus(4, tableState4);
				OrderList.updateTableStatus(5, tableState5);
				OrderList.updateTableStatus(6, tableState6);
				OrderList.updateTableStatus(7, tableState7);
				OrderList.updateTableStatus(8, tableState8);
				OrderList.updateTableStatus(9, tableState9);
				OrderList.updateTableStatus(10, tableState10);
				OrderList.updateTableStatus(11, tableState11);
				OrderList.updateTableStatus(12, tableState12);
			}
		});
		Confirm.setBounds(562, 350, 85, 23);
		bady.add(Confirm);

	}

}
