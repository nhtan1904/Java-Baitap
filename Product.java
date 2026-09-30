
 
package OOP2;


import java.util.*;
import java.util.Date;

public abstract class Product implements IProduct {

    private String id;
    private double basicPrice;
    private Date importDate;
    private boolean isAvailable;
    private int quantity;

    
    public Product(String id, double basicPrice, Date importDate,
                   boolean isAvailable, int quantity) {

        this.id = id;
        this.basicPrice = basicPrice;
        this.importDate = importDate;
        this.isAvailable = isAvailable;
        this.quantity = quantity;
    }

    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    // Getter - Setter basicPrice
    public double getBasicPrice() {
        return basicPrice;
    }

    public void setBasicPrice(double basicPrice) {
        this.basicPrice = basicPrice;
    }

   
    public Date getImportDate() {
        return importDate;
    }

    public void setImportDate(Date importDate) {
        this.importDate = importDate;
    }

    
    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    
    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    
    @Override
    public abstract void addProduct();

    @Override
    public abstract void updateProduct();

    public abstract void displayDetails();

    @Override
    public abstract double calculatePrice();
}

        
    
    
    

