package stores;

public class stock {
    private int item_no;
    private String item_name;
    private int stock_available;
    private double cost;

    public stock(int item_no, String item_name, int stock_available, double cost) {
        this.item_no = item_no;
        this.item_name = item_name;
        this.stock_available = stock_available;
        this.cost = cost;
    }

    public int getItem_no() {
        return item_no;
    }

    public String getItem_name() {
        return item_name;
    }

    public int getStock_available() {
        return stock_available;
    }

    public double getCost() {
        return cost;
    }

    public void setStock_available(int stock_available) {
        this.stock_available = stock_available;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }
	
    public String toString() {
        return "Item No.: " + item_no + ", Item Name: " + item_name + ", Stock Available: " + stock_available + ", Cost: " + cost;
    }
}