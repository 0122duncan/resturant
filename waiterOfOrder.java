package restaurant;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JList;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.AbstractListModel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JScrollPane;

public class waiterOfOrder extends JFrame {

	protected static Object java;
	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					waiterOfOrder frame = new waiterOfOrder();
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
	public waiterOfOrder() {
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 512, 520);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		// 菜品選擇
		JComboBox<String> chooseDishes = new JComboBox<String>();
		chooseDishes.setModel(new DefaultComboBoxModel(new String[] { "紅龜粿","橙龜粿","黃龜粿","綠龜粿", "藍龜粿", "靛龜粿", "紫龜粿" }));
		chooseDishes.setBounds(29, 393, 115, 25);
		contentPane.add(chooseDishes);

		// 表格本體
		String[] head = { "菜品", "數量" };
		DefaultTableModel DTM = new DefaultTableModel();
		// 表格列表標題
		for (int i = 0; i < head.length; i++) {
			DTM.addColumn(head[i]);
		}
		table = new JTable(DTM);
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(29, 28, 277, 343);
		getContentPane().add(scrollPane);
		// contentPane.add(table);

		
		// 數量選擇
		JComboBox dishesQuantity = new JComboBox();
		dishesQuantity.setFont(new Font("標楷體", Font.BOLD, 13));
		dishesQuantity.setModel(new DefaultComboBoxModel(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10" }));
		dishesQuantity.setBounds(29, 428, 115, 25);
		contentPane.add(dishesQuantity);
		

		// 確認菜品和數量
		JButton OKbutton = new JButton("確定");
		OKbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DTM.addRow(new Object[] { chooseDishes.getSelectedItem(), dishesQuantity.getSelectedItem()});
			}
		});
		OKbutton.setBounds(214, 393, 85, 25);
		contentPane.add(OKbutton);

		JButton submit = new JButton("提交菜單");
		submit.setFont(new Font("新細明體", Font.BOLD, 17));
		submit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}

		});
		submit.setBounds(334, 119, 127, 42);
		contentPane.add(submit);
		
		JButton btnNewButton = new JButton("刪除所選品項");
		
		btnNewButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
			        // check for selected row first
			        if (table.getSelectedRow() != -1) {
			            // remove selected row from the model
			        	DTM.removeRow(table.getSelectedRow());
			        }
			}
		});
		btnNewButton.setBounds(192, 428, 127, 25);
		contentPane.add(btnNewButton);
		
		
	}
}
