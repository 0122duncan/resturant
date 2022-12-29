package firstWindowBulider;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.table.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class SoftwaveTeamWork extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField nameText;
	private JTextField ageText;
	private JTextField postText;
	private JTextField worktimeText;
	private JTable table;
	DefaultTableModel model;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SoftwaveTeamWork frame = new SoftwaveTeamWork();
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
	public SoftwaveTeamWork() {
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 608, 430);
		
		contentPane = new JPanel();
		contentPane.setBackground(new Color(192, 192, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel nameLabel = new JLabel("姓名:");
		nameLabel.setFont(new Font("新細明體", Font.PLAIN, 15));
		nameLabel.setBounds(28, 50, 65, 28);
		contentPane.add(nameLabel);
		
		JLabel ageLabel = new JLabel("年齡:");
		ageLabel.setFont(new Font("新細明體", Font.PLAIN, 15));
		ageLabel.setBounds(28, 80, 65, 28);
		contentPane.add(ageLabel);
		
		JLabel postLabel = new JLabel("職位:");
		postLabel.setFont(new Font("新細明體", Font.PLAIN, 15));
		postLabel.setBounds(28, 110, 65, 28);
		contentPane.add(postLabel);
		
		JLabel worktimeLabel = new JLabel("工作時間:");
		worktimeLabel.setFont(new Font("新細明體", Font.PLAIN, 15));
		worktimeLabel.setBounds(28, 140, 65, 28);
		contentPane.add(worktimeLabel);
		
		nameText = new JTextField();
		nameText.setBounds(100, 50, 120, 21);
		contentPane.add(nameText);
		nameText.setColumns(10);
		
		ageText = new JTextField();
		ageText.setColumns(10);
		ageText.setBounds(100, 80, 120, 21);
		contentPane.add(ageText);
		
		postText = new JTextField();
		postText.setColumns(10);
		postText.setBounds(100, 110, 120, 21);
		contentPane.add(postText);
		
		worktimeText = new JTextField();
		worktimeText.setColumns(10);
		worktimeText.setBounds(100, 140, 120, 21);
		contentPane.add(worktimeText);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(261, 28, 307, 344);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.addMouseListener(new MouseAdapter() {
			@Override
			//設定滑鼠點擊資訊
			public void mouseClicked(MouseEvent e) {
				int i = table.getSelectedRow();
				//點選該格可以取得該格的資料並顯示在輸入格中，接著若選取刪除就可以直接將那格刪掉
				//若用修改則直接將輸入格上頭的資料輸入那一格
				nameText.setText(model.getValueAt(i,0).toString());
				ageText.setText(model.getValueAt(i,1).toString());
				postText.setText(model.getValueAt(i,2).toString());
				worktimeText.setText(model.getValueAt(i,3).toString());
			}
		});
		model = new DefaultTableModel();//創建一個空的列表
		Object[] column = {"姓名","年齡","職位","工作時間"}; 
		Object[] row = new Object[4];//最後需要輸入四格故大小設為四
		model.setColumnIdentifiers(column);//設置列表上方的東西
		table.setModel(model);//將列表放入table中
		scrollPane.setViewportView(table);
		
		JButton newData = new JButton("新增");
		newData.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(nameText.getText().equals("")||ageText.getText().equals("")||postText.getText().equals("")||worktimeText.getText().equals("")) {
					//JOptionPane就是設置彈跳視窗
					JOptionPane.showMessageDialog(null, "請輸入完整的資訊");
				}
				else {
					//取得輸入的值
					row[0] = nameText.getText();
					row[1] = ageText.getText();
					row[2] = postText.getText();
					row[3] = worktimeText.getText();
					//導入model中，model會將結果放進table裡
					model.addRow(row);
					//清空輸入格
					nameText.setText("");
					ageText.setText("");
					postText.setText("");
					worktimeText.setText("");
				}
				
			}
		});
		newData.setBackground(new Color(255, 255, 255));
		newData.setFont(new Font("新細明體", Font.PLAIN, 15));
		newData.setBounds(28, 274, 95, 25);
		contentPane.add(newData);
		
		JButton repair = new JButton("修改");
		repair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int i = table.getSelectedRow();//取得被點選的那一列
				//setValueAt(新值,第幾列,第幾行)
				model.setValueAt(nameText.getText(), i, 0);
				model.setValueAt(ageText.getText(), i, 1);
				model.setValueAt(postText.getText(), i, 2);
				model.setValueAt(worktimeText.getText(), i, 3);
			}
		});
		repair.setFont(new Font("新細明體", Font.PLAIN, 15));
		repair.setBackground(new Color(255, 255, 255));
		repair.setBounds(145, 275, 95, 25);
		contentPane.add(repair);
		
		JButton deleteData = new JButton("刪除");
		deleteData.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int i = table.getSelectedRow();//取得被點選的那一列
				if(i>=0)
					model.removeRow(i);//將該列移去
				else
					JOptionPane.showMessageDialog(null, "請選取欄位");
			}
		});
		deleteData.setFont(new Font("新細明體", Font.PLAIN, 15));
		deleteData.setBackground(new Color(255, 255, 255));
		deleteData.setBounds(28, 324, 95, 25);
		contentPane.add(deleteData);
		
		JButton deleteAll = new JButton("清空");
		deleteAll.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				nameText.setText("");
				ageText.setText("");
				postText.setText("");
				worktimeText.setText("");
			}
		});
		deleteAll.setFont(new Font("新細明體", Font.PLAIN, 15));
		deleteAll.setBackground(new Color(255, 255, 255));
		deleteAll.setBounds(145, 325, 95, 25);
		contentPane.add(deleteAll);
	}
}
