
package OOP2;

import java.util.Date;

public abstract class Smartphone implements IProduct {

    private String id;
    private double basicPrice;
    private Date importDate;
    private boolean isAvailable;
    private int quantity;

    private int storageGB;
    private double taxPercent;

    // Constructor
    public Smartphone(String id, double basicPrice, Date importDate,
                      boolean isAvailable, int quantity,
                      int storageGB, double taxPercent) {

        this.id = id;
        this.basicPrice = basicPrice;
        this.importDate = importDate;
        this.isAvailable = isAvailable;
        this.quantity = quantity;
        this.storageGB = storageGB;
        this.taxPercent = taxPercent;
    }

    // Getter - Setter ID
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    // Getter - Setter Basic Price
    public double getBasicPrice() {
        return basicPrice;
    }

    public void setBasicPrice(double basicPrice) {
        this.basicPrice = basicPrice;
    }

    // Getter - Setter Import Date
    public Date getImportDate() {
        return importDate;
    }

    public void setImportDate(Date importDate) {
        this.importDate = importDate;
    }

    // Getter - Setter Available
    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    // Getter - Setter Quantity
    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    // Getter - Setter Storage
    public int getStorageGB() {
        return storageGB;
    }

    public void setStorageGB(int storageGB) {
        this.storageGB = storageGB;
    }

    // Getter - Setter Tax
    public double getTaxPercent() {
        return taxPercent;
    }

    public void setTaxPercent(double taxPercent) {
        this.taxPercent = taxPercent;
    }

    // Add product
    @Override
    public void addProduct() {
        System.out.println("Smartphone added successfully!");
    }

    // Update product
    @Override
    public void updateProduct() {
        System.out.println("Smartphone updated successfully!");
    }

    // Display details
    public void displayDetails() {
        System.out.println("===== SMARTPHONE =====");
        System.out.println("ID: " + id);
        System.out.println("Basic Price: " + basicPrice);
        System.out.println("Import Date: " + importDate);
        System.out.println("Available: " + isAvailable);
        System.out.println("Quantity: " + quantity);
        System.out.println("Storage: " + storageGB + " GB");
        System.out.println("Tax: " + taxPercent + "%");
        System.out.println("Final Price: " + calculatePrice());
    }

    // Calculate price
    @Override
    public double calculatePrice() {
        return basicPrice
                + (basicPrice * taxPercent / 100);
    }
}