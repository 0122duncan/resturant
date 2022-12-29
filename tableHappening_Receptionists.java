package restaurant;

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

public class tableHappening_Receptionists extends tableHappening_busboy {

	private JPanel bady;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					tableHappening_Receptionists frame = new tableHappening_Receptionists();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**言
	 * Create the frame.
	 * @throws MalformedURLException 
	 */
	public tableHappening_Receptionists() throws MalformedURLException {
		setTitle("領檯人員");
		setIconImage(Toolkit.getDefaultToolkit().getImage(tableHappening_Receptionists.class.getResource("/restaurant/images/table.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 710, 496);
		bady = new JPanel();
		bady.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(bady);
		bady.setLayout(null);
		
		//狀態選項
		
		JComboBox<String> state1 = new JComboBox<String>();
		state1.setBounds(40, 83, 85, 23);
		bady.add(state1);
		state1.addItem("默認");
		state1.addItem("使用中");
		
		JComboBox<String> state2 = new JComboBox<String>();
		state2.setBounds(160, 83, 85, 23);
		bady.add(state2);
		state2.addItem("默認");
		state2.addItem("使用中");
		
		JComboBox<String> state3 = new JComboBox<String>();
		state3.setBounds(280, 83, 85, 23);
		bady.add(state3);
		state3.addItem("默認");
		state3.addItem("使用中");

		
		JComboBox<String> state4 = new JComboBox<String>();
		state4.setBounds(400, 83, 85, 23);
		bady.add(state4);
		state4.addItem("默認");
		state4.addItem("使用中");

		
		JComboBox<String> state5 = new JComboBox<String>();
		state5.setBounds(40, 233, 85, 23);
		bady.add(state5);
		state5.addItem("默認");
		state5.addItem("使用中");
		
		JComboBox<String> state6 = new JComboBox<String>();
		state6.setBounds(160, 233, 85, 23);
		bady.add(state6);
		state6.addItem("默認");
		state6.addItem("使用中");
		
		JComboBox<String> state7 = new JComboBox<String>();
		state7.setBounds(280, 233, 85, 23);
		bady.add(state7);
		state7.addItem("默認");
		state7.addItem("使用中");
		
		JComboBox<String> state8 = new JComboBox<String>();
		state8.setBounds(400, 233, 85, 23);
		bady.add(state8);
		state8.addItem("默認");
		state8.addItem("使用中");
		
		JComboBox<String> state9 = new JComboBox<String>();
		state9.setBounds(40, 383, 85, 23);
		bady.add(state9);
		state9.addItem("默認");
		state9.addItem("使用中");

		
		JComboBox<String> state10 = new JComboBox<String>();
		state10.setBounds(160, 383, 85, 23);
		bady.add(state10);
		state10.addItem("默認");
		state10.addItem("使用中");

		
		
		JComboBox<String> state11 = new JComboBox<String>();
		state11.setBounds(280, 383, 85, 23);
		bady.add(state11);
		state11.addItem("默認");
		state11.addItem("使用中");

		
		JComboBox<String> state12 = new JComboBox<String>();
		state12.setBounds(400, 383, 85, 23);
		bady.add(state12);
		state12.addItem("默認");
		state12.addItem("使用中");
		
		//座位
		
		JButton table1 = new JButton("空閒中");
		table1.setBounds(40, 50, 85, 23);
		bady.add(table1);
		
		JButton table2 = new JButton("空閒中");
		table2.setBounds(160, 50, 85, 23);
		bady.add(table2);
		
		JButton table3 = new JButton("空閒中");
		table3.setBounds(280, 50, 85, 23);
		bady.add(table3);
		
		JButton table4 = new JButton("空閒中");
		table4.setBounds(400, 50, 85, 23);
		bady.add(table4);
		
		JButton table5 = new JButton("空閒中");
		table5.setBounds(40, 200, 85, 23);
		bady.add(table5);
		
		JButton table6 = new JButton("空閒中");
		table6.setBounds(160, 200, 85, 23);
		bady.add(table6);
		
		JButton table7 = new JButton("空閒中");
		table7.setBounds(280, 200, 85, 23);
		bady.add(table7);
		
		JButton table8 = new JButton("空閒中");
		table8.setBounds(400, 200, 85, 23);
		bady.add(table8);
		
		JButton table9 = new JButton("空閒中");
		table9.setBounds(40, 350, 85, 23);
		bady.add(table9);
		
		JButton table10 = new JButton("空閒中");
		table10.setBounds(160, 350, 85, 23);
		bady.add(table10);
		
		JButton table11 = new JButton("空閒中");
		table11.setBounds(280, 350, 85, 23);
		bady.add(table11);
		
		JButton table12 = new JButton("空閒中");
		table12.setBounds(400, 350, 85, 23);
		bady.add(table12);
		
		//更改狀態
		state1.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				String nowState = (String) state1.getSelectedItem();
				if("默認".equals(nowState)) {
	
				}
				if("使用中".equals(nowState)){
					table1.setText(nowState);
					table1.setBackground(Color.RED);
					table1.setForeground(Color.WHITE);
				}
			}
			
		});
		
		state2.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				String nowState = (String) state2.getSelectedItem();
				if("默認".equals(nowState)) {
	
				}
				if("使用中".equals(nowState)){
					table2.setText(nowState);
					table2.setBackground(Color.RED);
					table2.setForeground(Color.WHITE);
				}
			}
			
		});
		
		state3.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				String nowState = (String) state3.getSelectedItem();
				if("默認".equals(nowState)) {
	
				}
				if("使用中".equals(nowState)){
					table3.setText(nowState);
					table3.setBackground(Color.RED);
					table3.setForeground(Color.WHITE);
				}
			}
			
		});
		
		state4.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				String nowState = (String) state4.getSelectedItem();
				if("默認".equals(nowState)) {
	
				}
				if("使用中".equals(nowState)){
					table4.setText(nowState);
					table4.setBackground(Color.RED);
					table4.setForeground(Color.WHITE);
				}
			}
			
		});
		
		state5.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				String nowState = (String) state5.getSelectedItem();
				if("默認".equals(nowState)) {
	
				}
				if("使用中".equals(nowState)){
					table5.setText(nowState);
					table5.setBackground(Color.RED);
					table5.setForeground(Color.WHITE);
				}
			}
			
		});
		
		state6.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				String nowState = (String) state6.getSelectedItem();
				if("默認".equals(nowState)) {
	
				}
				if("使用中".equals(nowState)){
					table6.setText(nowState);
					table6.setBackground(Color.RED);
					table6.setForeground(Color.WHITE);
				}
			}
			
		});
		
		state7.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				String nowState = (String) state7.getSelectedItem();
				if("默認".equals(nowState)) {
	
				}
				if("使用中".equals(nowState)){
					table7.setText(nowState);
					table7.setBackground(Color.RED);
					table7.setForeground(Color.WHITE);
				}
			}
			
		});
		
		state8.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				String nowState = (String) state8.getSelectedItem();
				if("默認".equals(nowState)) {
	
				}
				if("使用中".equals(nowState)){
					table8.setText(nowState);
					table8.setBackground(Color.RED);
					table8.setForeground(Color.WHITE);
				}
			}
			
		});
		
		state9.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				String nowState = (String) state9.getSelectedItem();
				if("默認".equals(nowState)) {
	
				}
				if("使用中".equals(nowState)){
					table9.setText(nowState);
					table9.setBackground(Color.RED);
					table9.setForeground(Color.WHITE);
				}
			}
			
		});
		
		state10.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				String nowState = (String) state10.getSelectedItem();
				if("默認".equals(nowState)) {
	
				}
				if("使用中".equals(nowState)){
					table10.setText(nowState);
					table10.setBackground(Color.RED);
					table10.setForeground(Color.WHITE);
				}
			}
			
		});
		
		state11.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				String nowState = (String) state11.getSelectedItem();
				if("默認".equals(nowState)) {
	
				}
				if("使用中".equals(nowState)){
					table11.setText(nowState);
					table11.setBackground(Color.RED);
					table11.setForeground(Color.WHITE);
				}
			}
			
		});
		
		state12.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				String nowState = (String) state12.getSelectedItem();
				if("默認".equals(nowState)) {
	
				}
				if("使用中".equals(nowState)){
					table12.setText(nowState);
					table12.setBackground(Color.RED);
					table12.setForeground(Color.WHITE);
				}
			}
			
		});
		

		//提交
		
				JButton Confirm = new JButton("提交");
				Confirm.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
					
					}
				});
				Confirm.setBounds(562, 350, 85, 23);
				bady.add(Confirm);
		
    }
}
