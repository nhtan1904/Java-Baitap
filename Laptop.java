
package OOP2;

import java.util.Date;

public abstract class Laptop extends Product {

    private int warrantyYears;
    private double discountPercent;

    
    public Laptop(String id, double basicPrice, Date importDate,
                  boolean isAvailable, int quantity,
                  int warrantyYears, double discountPercent) {

        super(id, basicPrice, importDate, isAvailable, quantity);

        this.warrantyYears = warrantyYears;
        this.discountPercent = discountPercent;
    }


    public int getWarrantyYears() {
        return warrantyYears;
    }

   
    public void setWarrantyYears(int warrantyYears) {
        this.warrantyYears = warrantyYears;
    }

    
    public double getDiscountPercent() {
        return discountPercent;
    }

   
    public void setDiscountPercent(double discountPercent) {
        this.discountPercent = discountPercent;
    }

    
    @Override
    public void addProduct() {
        System.out.println("Laptop added successfully!");
    }

    
    @Override
    public void updateProduct() {
        System.out.println("Laptop updated successfully!");
    }

   
    @Override
    public void displayDetails() {
        System.out.println("===== LAPTOP =====");
        System.out.println("ID: " + getId());
        System.out.println("Basic Price: " + getBasicPrice());
        System.out.println("Import Date: " + getImportDate());
        System.out.println("Available: " + isAvailable());
        System.out.println("Quantity: " + getQuantity());
        System.out.println("Warranty Years: " + warrantyYears);
        System.out.println("Discount Percent: " + discountPercent + "%");
        System.out.println("Final Price: " + calculatePrice());
    }

   
    @Override
    public double calculatePrice() {
        return getBasicPrice()
                - (getBasicPrice() * discountPercent / 100);
    }
}