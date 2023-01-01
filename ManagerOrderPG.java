package interfaces;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import net.miginfocom.swing.MigLayout;

public class ManagerOrderPG extends JFrame {

	private JPanel contentPane;
	
	/*tst area*/

	StringBuffer red    = new StringBuffer("紅龜粿 : ");
	StringBuffer orange = new StringBuffer("橘龜粿 : ");
	StringBuffer yellow = new StringBuffer("黃龜粿 : ");
	StringBuffer green  = new StringBuffer("綠龜粿 : ");
	StringBuffer blue   = new StringBuffer("藍龜粿 : ");
	StringBuffer indigo = new StringBuffer("靛龜粿 : ");
	StringBuffer purple = new StringBuffer("紫龜粿 : ");
	

	
	/*end of tst*/
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ManagerOrderPG frame = new ManagerOrderPG();
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
	public ManagerOrderPG() {
		
		int items[] = new int[7];
		
		OrderList.addOrder(new String[][] {{"紅龜粿","55"}},0);
		
		JTable[] orderDisplay = new JTable[OrderList.getOrder().size()];
		
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 659, 537);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		//count each item amount
		
		for(int i=0;i<OrderList.getOrder().size();i++) {
			
			//i = how many orders in OrderList
		
			for (int j=0;j<OrderList.getOrder().get(i).length;j++) {
			
				//j = how many items in order
				
				String item = OrderList.getOrder().get(i)[j][0];
				String n = OrderList.getOrder().get(i)[j][1];
				
				switch (item) {
				
				case "紅龜粿":
					items[0]+=Integer.valueOf(n);
					break;
				case "橘龜粿":
					items[1]+=Integer.valueOf(n);
					break;
				case "黃龜粿":
					items[2]+=Integer.valueOf(n);
					break;
				case "綠龜粿":
					items[3]+=Integer.valueOf(n);
					break;
				case "藍龜粿":	
					items[4]+=Integer.valueOf(n);
					break;
				case "靛龜粿":
					items[5]+=Integer.valueOf(n);
					break;
				case "紫龜粿":
					items[6]+=Integer.valueOf(n);
					break;
				}
			
			}
		}
		
		//string builder append each amount
		red.append(String.valueOf(items[0]));
		orange.append(String.valueOf(items[1]));
		yellow.append(String.valueOf(items[2]));
		green.append(String.valueOf(items[3]));
		blue.append(String.valueOf(items[4]));
		indigo.append(String.valueOf(items[5]));
		purple.append(String.valueOf(items[6]));
			
			
		JLabel lblNewLabel = new JLabel(red.toString());
		lblNewLabel.setFont(new Font("新細明體", Font.PLAIN, 15));
		lblNewLabel.setBounds(73, 52, 100, 30);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel(orange.toString());
		lblNewLabel_1.setFont(new Font("新細明體", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(73, 102, 100, 30);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel(yellow.toString());
		lblNewLabel_2.setFont(new Font("新細明體", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(73, 143, 100, 30);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel(green.toString());
		lblNewLabel_3.setFont(new Font("新細明體", Font.PLAIN, 15));
		lblNewLabel_3.setBounds(73, 190, 100, 30);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel(blue.toString());
		lblNewLabel_4.setFont(new Font("新細明體", Font.PLAIN, 15));
		lblNewLabel_4.setBounds(257, 60, 100, 30);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel(indigo.toString());
		lblNewLabel_5.setFont(new Font("新細明體", Font.PLAIN, 15));
		lblNewLabel_5.setBounds(257, 102, 100, 30);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel(purple.toString());
		lblNewLabel_6.setFont(new Font("新細明體", Font.PLAIN, 15));
		lblNewLabel_6.setBounds(257, 143, 100, 30);
		contentPane.add(lblNewLabel_6);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 250, 623, 240);
		contentPane.add(scrollPane);
		
		JPanel panel = new JPanel();
		scrollPane.setViewportView(panel);
		panel.setLayout(new MigLayout("", "[]", "[]"));


		for(int orderIndex=0;orderIndex<OrderList.getOrder().size();orderIndex++) {
			DefaultTableModel model = new DefaultTableModel();
			model.addColumn("food"); 
			model.addColumn("amount"); 
			
			for(int i=0;i<OrderList.getOrder().get(orderIndex).length;i++) {
				model.addRow(new Object[]{OrderList.getOrder().get(orderIndex)[i][0],OrderList.getOrder().get(orderIndex)[i][1]});			

			}
				

			orderDisplay[orderIndex] = new JTable(model);

			panel.add(orderDisplay[orderIndex]);
			
		}
		
		
		
		
	}
}
