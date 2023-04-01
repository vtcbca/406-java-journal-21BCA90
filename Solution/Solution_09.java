/*Create package stores. Under it create a class called stock with member variable (item_no, 
item_name, stock_availible, and cost). Under the default package create a class called sales 
with field name (qty_sold) and it is the child class of stores class. Write a program to print the 
current stock of each item and perform addition.*/

import stores.stock;
import java.util.ArrayList;
import java.util.Scanner;

public class Solution_09 {
    public static void main(String[] args) {
        ArrayList<stock> items = new ArrayList<stock>();
        items.add(new stock(1, "Apple", 10, 20.0));
        items.add(new stock(2, "Banana", 20, 30.0));
        items.add(new stock(3, "Ball", 30, 40.0));

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nCurrent Stock:");
            for (stock item : items) {
                System.out.println(item);
            }

            System.out.print("\nEnter the item no. to add stock, or 0 to exit:");
            int item_no = scanner.nextInt();
            if (item_no == 0) {
                break;
            }

            stock item = items.stream().filter(i -> i.getItem_no() == item_no).findFirst().orElse(null);
            if (item == null) {
                System.out.println("Invalid item no.");
            } else {
                System.out.print("\nEnter the quantity to add:");
                int qty = scanner.nextInt();
                item.setStock_available(item.getStock_available() + qty);
                System.out.println("Stock added successfully.");
            }
        }
    }
}
