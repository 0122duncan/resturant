package firstWindowBulider;

import java.awt.Container;
import java.awt.EventQueue;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.AbstractButton;
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

public class tableHappening_manager extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel bady;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					tableHappening_manager frame = new tableHappening_manager();
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
	public tableHappening_manager(){
		setTitle("餐桌數量設置");
//		setIconImage(Toolkit.getDefaultToolkit()
//				.getImage(tableHappening_manager.class.getResource("/restaurant/images/table.png")));
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 710, 496);
		bady = new JPanel();
		bady.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(bady);
		bady.setLayout(null);

		// 座位

		JButton table1 = new JButton("01");
		table1.setBounds(40, 50, 85, 23);
		bady.add(table1);

		JButton table2 = new JButton("02");
		table2.setBounds(160, 50, 85, 23);
		bady.add(table2);
		table2.setVisible(false);

		JButton table3 = new JButton("03");
		table3.setBounds(280, 50, 85, 23);
		bady.add(table3);
		table3.setVisible(false);

		JButton table4 = new JButton("04");
		table4.setBounds(400, 50, 85, 23);
		bady.add(table4);
		table4.setVisible(false);

		JButton table5 = new JButton("05");
		table5.setBounds(40, 200, 85, 23);
		bady.add(table5);
		table5.setVisible(false);

		JButton table6 = new JButton("06");
		table6.setBounds(160, 200, 85, 23);
		bady.add(table6);
		table6.setVisible(false);

		JButton table7 = new JButton("07");
		table7.setBounds(280, 200, 85, 23);
		bady.add(table7);
		table7.setVisible(false);

		JButton table8 = new JButton("08");
		table8.setBounds(400, 200, 85, 23);
		bady.add(table8);
		table8.setVisible(false);

		JButton table9 = new JButton("09");
		table9.setBounds(40, 350, 85, 23);
		bady.add(table9);
		table9.setVisible(false);

		JButton table10 = new JButton("10");
		table10.setBounds(160, 350, 85, 23);
		bady.add(table10);
		table10.setVisible(false);

		JButton table11 = new JButton("11");
		table11.setBounds(280, 350, 85, 23);
		bady.add(table11);
		table11.setVisible(false);

		JButton table12 = new JButton("12");
		table12.setBounds(400, 350, 85, 23);
		bady.add(table12);
		table12.setVisible(false);

		// 桌椅數量
		JButton tablesNumber = new JButton("餐桌數量");
		tablesNumber.setBounds(562, 152, 85, 23);
		bady.add(tablesNumber);

		JComboBox<String> quantity = new JComboBox<String>();
		quantity.setBounds(562, 185, 85, 23);
		bady.add(quantity);
		quantity.addItem("01");
		quantity.addItem("02");
		quantity.addItem("03");
		quantity.addItem("04");
		quantity.addItem("05");
		quantity.addItem("06");
		quantity.addItem("07");
		quantity.addItem("08");
		quantity.addItem("09");
		quantity.addItem("10");
		quantity.addItem("11");
		quantity.addItem("12");

		quantity.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String nowQuantity = (String) quantity.getSelectedItem();
				if ("01".equals(nowQuantity)) {
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
				
				if ("02".equals(nowQuantity)) {
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
				
				if ("03".equals(nowQuantity)) {
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
				
				if ("04".equals(nowQuantity)) {
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
				
				if ("05".equals(nowQuantity)) {
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
				
				if ("06".equals(nowQuantity)) {
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
				
				if ("07".equals(nowQuantity)) {
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
				
				if ("08".equals(nowQuantity)) {
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
				
				if ("09".equals(nowQuantity)) {
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
				
				if ("10".equals(nowQuantity)) {
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
				
				if ("11".equals(nowQuantity)) {
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
				
				if ("12".equals(nowQuantity)) {
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
			}

		});
		
		// 提交
				JButton Confirm = new JButton("提交");
				Confirm.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
					}
				});
				Confirm.setBounds(562, 350, 85, 23);
				bady.add(Confirm);
	}
}