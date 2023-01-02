import java.util.ArrayList;

//訂單資料儲存區

public class OrderList {
	private static ArrayList<String[][]> orderlist = new ArrayList<>();
	private static ArrayList<Integer> tableNumberlist = new ArrayList<>();
	private static ArrayList<Long> startTime = new ArrayList<>();
	private static ArrayList<Long> dineTime = new ArrayList<>();
	private static int tableState[] = new int[13];
	private static int tableQuantit =12 ;
	private static int tableNumber ;

	public static void addOrder(String[][] order, int tableNumber) {
		orderlist.add(order);
		tableNumberlist.add(tableNumber);
	}

	public static void removeOrder(int orderNumber) {
		String[][] order = orderlist.get(orderNumber);

		orderlist.remove(order);
		tableNumberlist.remove(tableNumberlist.get(orderNumber));
		long start = startTime.remove(0);
		dineTime.add(System.currentTimeMillis() - start);
	}

	public static void updateTableStatus(int tableNumber, int status) {
		tableState[tableNumber] = status;
		
	}
	public static void updateTableQuantity(int nowQuantity) {
		tableQuantit = nowQuantity;
	}
	
	public static ArrayList<String[][]> getOrder() {
		return orderlist;
	}

	public static ArrayList<Integer> getTableNumber() {
		return tableNumberlist;
	}

	public static ArrayList<Long> getDiningTime() {
		return dineTime;
	}

	public static int[] getTableStatus() {
		return tableState;
	}
	
	public static int getTableQuantit() {
		return tableQuantit;
	}
	
	//桌號傳入
	public static void tableNumber(int Number) {
		tableNumber = Number;
	}
	
	//桌號傳出
	public static int getNumber() {
		return tableNumber;
	}
	

	// 使用方法:
	// int 狀態 = OrderList.getTableStatus()[你要的桌號]

}
