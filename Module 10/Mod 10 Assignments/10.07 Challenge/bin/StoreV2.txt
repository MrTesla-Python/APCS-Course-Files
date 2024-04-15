/**
 * This class defines a Store object
 * its item, products, price, quantity
 *
 * @author Tristan Darnell
 * @version 03/04/24
 */

import java.util.Arrays;

class StoreV2 {
    private String itemName;
    private int productNumber;
    private double price;
    private int quantity;

    public StoreV2(String itemName, int productNumber, double price, int quantity) {
        this.itemName = itemName;
        this.productNumber = productNumber;
        this.price = price;
        this.quantity = quantity;
    }

    public String getItemName() {
        return itemName;
    }

    public int getProductNumber() {
        return productNumber;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getTotalCost() {
        return price * quantity;
    }
    public String toString() {
        return String.format("%-21s | Product Number: %d | Price: $%.2f | Quantity: %d | Total Cost: $%.2f",
                itemName, productNumber, price, quantity, getTotalCost());
    }
}
