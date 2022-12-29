package firstWindowBulider;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JLabel;
import java.awt.Font;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Selling extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table;
	DefaultTableModel sellCheck;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Selling frame = new Selling();
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
	public Selling() {
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 590, 411);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 576, 374);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 10, 351, 354);
		panel.add(scrollPane);
		
		table = new JTable();
		sellCheck = new DefaultTableModel();
		Object[] column = {"時間","獲利","成本","淨獲利"};
		Object[] row = new Object[4];
		sellCheck.setColumnIdentifiers(column);
		table.setModel(sellCheck);
		scrollPane.setViewportView(table);
		
		
		JLabel dateLabel_1 = new JLabel("");
		dateLabel_1.setBounds(371, 102, 55, 27);
		dateLabel_1.setFont(new Font("新細明體", Font.PLAIN, 15));
		panel.add(dateLabel_1);
		
		JButton upDateButton = new JButton("更新");
		upDateButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//獲取時間
				DateTimeFormatter data = DateTimeFormatter.ofPattern("yyyy/MM/dd");
				row[0] = data.format(LocalDateTime.now());
				//這邊需要去做連結訂單
				row[1] = 2000;
				row[2] = 1000;
				row[3] = 2000 - 1000;
				sellCheck.addRow(row);
			}
		});
		upDateButton.setBackground(new Color(255, 255, 255));
		upDateButton.setBounds(457, 297, 85, 23);
		panel.add(upDateButton);
	}
}
