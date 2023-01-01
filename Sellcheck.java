package firstWindowBulider;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.*;
import java.util.HashMap;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;


public class Sellcheck extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table;
	DefaultTableModel dishCheck;

	/**
	 * Launch the application.
	 */
	HashMap<String, Integer> map = new HashMap<>();
	private JTextField dishText;
	private JTextField dishNumberText;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Sellcheck frame = new Sellcheck();
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
	public Sellcheck() {
		//預先輸入餐點好讓一開始就會顯示出來("key",value)
		map.put("餐點1",10);
		map.put("餐點2",10);
		map.put("餐點3",10);
		map.put("餐點4",10);
		
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 506, 351);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 492, 314);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(27, 21, 303, 221);
		panel.add(scrollPane);
		
		table = new JTable();
		table.addMouseListener(new MouseAdapter() {
			@Override
			//mouseClicked為滑鼠點擊後會觸發
			public void mouseClicked(MouseEvent e) {
				int i = table.getSelectedRow();
				//點選該格可以取得該格的資料並顯示在輸入格中，接著若選取刪除就可以直接將那格刪掉
				//若用修改則直接將輸入格上頭的資料輸入那一格
				dishText.setText(dishCheck.getValueAt(i,0).toString());
				dishNumberText.setText(dishCheck.getValueAt(i,1).toString());
			}
		});
		dishCheck = new DefaultTableModel();
		Object[] column = {"餐點","剩餘數量"};
		Object[] leftover = new Object[2];
		System.out.println(map);
		dishCheck.setColumnIdentifiers(column);//設置列表上方的東西
		table.setModel(dishCheck);//將列表放入table中
		//用變數i去尋訪每一個在map中的key
		for(String i : map.keySet() ) {
			leftover[0] = i;
			leftover[1] = map.get(i);//取得對應的值
			dishCheck.addRow(leftover);//添加進table中
		}
		scrollPane.setViewportView(table);
		
		JLabel dishLabel = new JLabel("餐點:");
		dishLabel.setFont(new Font("新細明體", Font.PLAIN, 15));
		dishLabel.setBounds(340, 22, 45, 32);
		panel.add(dishLabel);
		
		JLabel dishNumberLabel = new JLabel("數量:");
		dishNumberLabel.setFont(new Font("新細明體", Font.PLAIN, 15));
		dishNumberLabel.setBounds(340, 88, 45, 32);
		panel.add(dishNumberLabel);
		
		dishText = new JTextField();
		dishText.setFont(new Font("新細明體", Font.PLAIN, 15));
		dishText.setBounds(340, 57, 142, 21);
		panel.add(dishText);
		dishText.setColumns(10);
		
		dishNumberText = new JTextField();
		dishNumberText.setFont(new Font("新細明體", Font.PLAIN, 15));
		dishNumberText.setColumns(10);
		dishNumberText.setBounds(340, 125, 142, 21);
		panel.add(dishNumberText);
		
		JButton addDishButton = new JButton("新增");
		addDishButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(dishText.getText().equals("")||dishNumberText.getText().equals("")) {
					//JOptionPane就是設置彈跳視窗
					JOptionPane.showMessageDialog(null, "請輸入完整的資訊");
				}
				else {
					//取得輸入的值
					leftover[0] = dishText.getText();
					leftover[1] = dishNumberText.getText();
					dishCheck.addRow(leftover);
					//清空輸入格
					dishText.setText("");
					dishNumberText.setText("");
				}
			}
		});
		addDishButton.setBackground(new Color(255, 255, 255));
		addDishButton.setBounds(368, 192, 85, 25);
		panel.add(addDishButton);
		
		JButton deleteDishButton = new JButton("刪除");
		deleteDishButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int i = table.getSelectedRow();//取得被點選的那一列
				if(i>=0)
					dishCheck.removeRow(i);//將該列移去
				else
					JOptionPane.showMessageDialog(null, "請選取欄位");
			}
		});
		deleteDishButton.setBackground(Color.WHITE);
		deleteDishButton.setBounds(368, 232, 85, 25);
		panel.add(deleteDishButton);
		
		JButton repairDishButton = new JButton("修改");
		repairDishButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int i = table.getSelectedRow();//取得被點選的那一列
				//setValueAt(新值,第幾列,第幾行)
				dishCheck.setValueAt(dishText.getText(), i, 0);
				dishCheck.setValueAt(dishNumberText.getText(), i, 1);
			}
		});
		repairDishButton.setBackground(Color.WHITE);
		repairDishButton.setBounds(368, 268, 85, 25);
		panel.add(repairDishButton);
	}
}
