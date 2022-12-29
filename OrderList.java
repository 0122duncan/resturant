package interfaces;

import java.util.ArrayList;


public class OrderList  {
    private static ArrayList<String[][]> orderlist = new ArrayList<>();
    private static ArrayList<Integer> tableNumberlist = new ArrayList<>();

    


    public static void addOrder(String[][] order,int tableNumber) {
        orderlist.add(order); 
        tableNumberlist.add(tableNumber);
        
    } 
    public static void removeOrder(String[][] order,int tableNumber) {
        orderlist.remove(order); 
        tableNumberlist.remove(tableNumber);
    }
    


    public static ArrayList<String[][]> getOrder() {
        return orderlist;
    }
    public static ArrayList<Integer> getTableNumber() {
        return tableNumberlist;
    }




    
}




