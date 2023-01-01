

import java.util.ArrayList;

//訂單資料儲存區



public class OrderList  {
    private static ArrayList<String[][]> orderlist = new ArrayList<>();
    private static ArrayList<Integer> tableNumberlist = new ArrayList<>();
    private static ArrayList<Long> startTime = new ArrayList<>();
    private static ArrayList<Long> dineTime = new ArrayList<>();
    private static int tableState[] = new int[12] ;
 
    public static void addOrder(String[][] order,int tableNumber,long start) {
        orderlist.add(order); 
        tableNumberlist.add(tableNumber);
        startTime.add(start);
    } 
    public static void removeOrder(int orderNumber) {
        String[][] order = orderlist.get(orderNumber);
        
    	orderlist.remove(order); 
        tableNumberlist.remove(tableNumberlist.get(orderNumber));
        long start = startTime.remove(0);
        dineTime.add(System.currentTimeMillis()-start);
    }
    
    public static void updateTableStatus(int tableNumber ,int status) {
    	tableState[tableNumber] = status;

    	
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
    
    //使用方法: 
    //int 狀態 = OrderList.getTableStatus()[你要的桌號]



    
}




