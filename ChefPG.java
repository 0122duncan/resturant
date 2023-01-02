package interfaces;

import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;



import javax.swing.JTable;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Window.Type;


public class ChefPG extends JFrame {


	private JPanel contentPane;
	private JTable orderDisplay;
	private JTable orderDisplay_1;
	private JTable orderDisplay_2;
	private JTable orderDisplay_3;
	private JTable orderDisplay_4;
	private JTable orderDisplay_5;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JButton btnNewButton_3;
	private JButton btnNewButton_4;
	private JButton btnNewButton_5;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;



	String[] header = {"food","amount"};
	ArrayList<String[][]> orderlist;
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OrderList orderlist= null; 
					ChefPG frame = new ChefPG(orderlist);
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
	public ChefPG(OrderList newOrderlist) {
		setTitle("Kitchen \r\n");
		
	    this.orderlist = OrderList.getOrder();

	    
	    
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 1280, 800);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		
		//OrderList.getOrder() & table number arraylist 
		OrderList.addOrder(new String[][] {{"",""}},0,System.currentTimeMillis());
		OrderList.addOrder(new String[][] {{"",""}},0,System.currentTimeMillis());
		OrderList.addOrder(new String[][] {{"",""}},0,System.currentTimeMillis());
		OrderList.addOrder(new String[][] {{"",""}},0,System.currentTimeMillis());
		OrderList.addOrder(new String[][] {{"",""}},0,System.currentTimeMillis());
		OrderList.addOrder(new String[][] {{"",""}},0,System.currentTimeMillis());
		
		
		

		
		try {	
			/*
			 * table and default orders
			 **/
			DefaultTableModel model = new DefaultTableModel(); 
			
			
			//Append columns
			model.addColumn("food"); 
			model.addColumn("amount"); 
			
			// Append rows
			
			for(int i=0;i<OrderList.getOrder().get(0).length;i++) {
				model.addRow(new Object[]{OrderList.getOrder().get(0)[i][0],OrderList.getOrder().get(0)[i][1]});			
			}
			
			
			orderDisplay = new JTable(model);
			orderDisplay.setBounds(21, 43, 300, 270);
			panel.add(orderDisplay);

			
			//set model
			model = new DefaultTableModel();
			model.addColumn("food"); 
			model.addColumn("amount"); 
			
			//rows
			for(int i=0;i<OrderList.getOrder().get(1).length;i++) {
				model.addRow(new Object[]{OrderList.getOrder().get(1)[i][0],OrderList.getOrder().get(1)[i][1]});			
			}
			
			//display model
			orderDisplay_1 = new JTable(model);
			orderDisplay_1.setBounds(443, 43, 300, 270);
			panel.add(orderDisplay_1);
			
			//set model
			model = new DefaultTableModel();
			model.addColumn("food"); 
			model.addColumn("amount"); 
			
			//rows
			for(int i=0;i<OrderList.getOrder().get(2).length;i++) {
				model.addRow(new Object[]{OrderList.getOrder().get(2)[i][0],OrderList.getOrder().get(2)[i][1]});			
			} 
			orderDisplay_2 = new JTable(model);
			orderDisplay_2.setBounds(863, 43, 300, 270);
			panel.add(orderDisplay_2);
			
			//set model
			model = new DefaultTableModel();
			model.addColumn("food"); 
			model.addColumn("amount"); 
				
			//rows
			for(int i=0;i<OrderList.getOrder().get(3).length;i++) {
				model.addRow(new Object[]{OrderList.getOrder().get(3)[i][0],OrderList.getOrder().get(3)[i][1]});			
			} 
	
			orderDisplay_3 = new JTable(model);
			orderDisplay_3.setBounds(21, 380, 300, 270);
			panel.add(orderDisplay_3);
			
			//set model
			model = new DefaultTableModel();
			model.addColumn("food"); 
			model.addColumn("amount"); 
				
			//rows
			for(int i=0;i<OrderList.getOrder().get(4).length;i++) {
				model.addRow(new Object[]{OrderList.getOrder().get(4)[i][0],OrderList.getOrder().get(4)[i][1]});			
			}
			
			orderDisplay_4 = new JTable(model);
			orderDisplay_4.setBounds(443, 380, 300, 270);
			panel.add(orderDisplay_4);
			//set model
			model = new DefaultTableModel();
			model.addColumn("food"); 
			model.addColumn("amount"); 
				
			//rows
			for(int i=0;i<OrderList.getOrder().get(5).length;i++) {
				model.addRow(new Object[]{OrderList.getOrder().get(5)[i][0],OrderList.getOrder().get(5)[i][1]});			
			}		
			
			orderDisplay_5 = new JTable(model);
			orderDisplay_5.setBounds(863, 380, 300, 270);
			panel.add(orderDisplay_5);
			
			/*
			 * table number display
			 */
			lblNewLabel = new JLabel(String.valueOf(OrderList.getTableNumber().get(0)));
			lblNewLabel.setBounds(71, 14, 46, 15);
			panel.add(lblNewLabel);
			
			lblNewLabel_1 = new JLabel(String.valueOf(OrderList.getTableNumber().get(1)));
			lblNewLabel_1.setBounds(484, 14, 46, 15);
			panel.add(lblNewLabel_1);
			
			lblNewLabel_2 = new JLabel(String.valueOf(OrderList.getTableNumber().get(2)));
			lblNewLabel_2.setBounds(914, 14, 46, 15);
			panel.add(lblNewLabel_2);
			
			lblNewLabel_3 = new JLabel(String.valueOf(OrderList.getTableNumber().get(3)));
			lblNewLabel_3.setBounds(71, 351, 46, 15);
			panel.add(lblNewLabel_3);
			
			lblNewLabel_4 = new JLabel(String.valueOf(OrderList.getTableNumber().get(4)));
			lblNewLabel_4.setBounds(493, 351, 46, 15);
			panel.add(lblNewLabel_4);
			
			lblNewLabel_5 = new JLabel(String.valueOf(OrderList.getTableNumber().get(5)));
			lblNewLabel_5.setBounds(914, 351, 46, 15);
			panel.add(lblNewLabel_5);

		}
		catch(IndexOutOfBoundsException e) {
		}
		

		/*
		 * buttons & functions
		 * 
		 *
		 */

		for (int i = 0;i<6;i++) {
			OrderList.removeOrder(0);
			
		}


		updateTable(OrderList.getOrder());

		btnNewButton = new JButton("done");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnfunction(0);
			}
		});
		btnNewButton.setBounds(127, 10, 87, 23);
		panel.add(btnNewButton);
		
		btnNewButton_1 = new JButton("done");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnfunction(1);
				
			}
		});
		btnNewButton_1.setBounds(549, 10, 87, 23);
		panel.add(btnNewButton_1);
		
		
		btnNewButton_2 = new JButton("done");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnfunction(2);
				
			}
		});
		btnNewButton_2.setBounds(970, 10, 87, 23);
		panel.add(btnNewButton_2);
		
		btnNewButton_3 = new JButton("done");
		btnNewButton_3.setBounds(127, 347, 87, 23);
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnfunction(3);
			}
		});
		panel.add(btnNewButton_3);
		
		btnNewButton_4 = new JButton("done");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnfunction(4);
			}
		});
		btnNewButton_4.setBounds(549, 347, 87, 23);
		panel.add(btnNewButton_4);
		
		btnNewButton_5 = new JButton("done");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnfunction(5);
			}
		});
		btnNewButton_5.setBounds(970, 347, 87, 23);
		panel.add(btnNewButton_5);
		

		
	}

	void btnfunction (int start) {
		if(OrderList.getOrder().size()>=start+1) {	
			OrderList.getOrder().remove(start);
			OrderList.getTableNumber().remove(start);
			
			updateTable(OrderList.getOrder());
				
		}
	}
	
	public void updateTable(ArrayList<String[][]> newOrderlist) {
		orderlist = newOrderlist;
		for(int j=0;j<6;j++) {
			DefaultTableModel model = new DefaultTableModel();
			model.addColumn("food"); 
			model.addColumn("amount"); 
			try {
				for(int i=0;i<OrderList.getOrder().get(j).length;i++) {
					model.addRow(new Object[]{OrderList.getOrder().get(j)[i][0],OrderList.getOrder().get(j)[i][1]});

				}

				switch (j) {
					case 0:
						orderDisplay.setModel(model);
						lblNewLabel.setText(String.valueOf(OrderList.getTableNumber().get(j)));
						break;
					case 1:
						orderDisplay_1.setModel(model);
						lblNewLabel_1.setText(String.valueOf(OrderList.getTableNumber().get(j)));
						break;

					case 2:
						orderDisplay_2.setModel(model);
						lblNewLabel_2.setText(String.valueOf(OrderList.getTableNumber().get(j)));
						break;

					case 3:
						orderDisplay_3.setModel(model);
						lblNewLabel_3.setText(String.valueOf(OrderList.getTableNumber().get(j)));
						break;

					case 4:
						orderDisplay_4.setModel(model);
						lblNewLabel_4.setText(String.valueOf(OrderList.getTableNumber().get(j)));
						break;

					case 5:
						orderDisplay_5.setModel(model);
						lblNewLabel_5.setText(String.valueOf(OrderList.getTableNumber().get(j)));
						break;

				}
			}
			catch(IndexOutOfBoundsException e) {
				switch (j) {
					case 0:
						model.setRowCount(0);
						orderDisplay.setModel(model);
						lblNewLabel.setText("");
					case 1:
						model.setRowCount(0);
						orderDisplay_1.setModel(model);
						lblNewLabel_1.setText("");
					case 2:
						model.setRowCount(0);
						orderDisplay_2.setModel(model);
						lblNewLabel_2.setText("");
					case 3:
						model.setRowCount(0);
						orderDisplay_3.setModel(model);
						lblNewLabel_3.setText("");
					case 4:
						model.setRowCount(0);
						orderDisplay_4.setModel(model);
						lblNewLabel_4.setText("");
					case 5:
						model.setRowCount(0);
						orderDisplay_5.setModel(model);
						lblNewLabel_5.setText("");
				}
			}	
		}
	}
	

}
