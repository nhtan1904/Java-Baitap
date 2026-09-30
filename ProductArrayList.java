
package OOP2;

import java.util.ArrayList;

public class ProductArrayList {

    private ArrayList<Product> products;

    // Constructor
    public ProductArrayList() {
        products = new ArrayList<>();
    }

    // Add Product
    public void addProduct(Product product) {
        products.add(product);
        System.out.println("Product added successfully!");
    }

    // Update Product By ID
    public void updateProductById(String id) {

        for (Product product : products) {

            if (product.getId().equals(id)) {
                product.updateProduct();
                return;
            }
        }

        System.out.println("Product with ID " + id + " not found!");
    }

    // Delete Product By ID
    public void deleteProductById(String id) {

        for (Product product : products) {

            if (product.getId().equals(id)) {
                products.remove(product);
                System.out.println("Product deleted successfully!");
                return;
            }
        }

        System.out.println("Product with ID " + id + " not found!");
    }

    // Display all products
    public void displayAllProducts() {

        if (products.isEmpty()) {
            System.out.println("Product list is empty!");
            return;
        }

        for (Product product : products) {
            product.displayDetails();
            System.out.println("----------------------------");
        }
    }

    // Find available products
    public void findAvailableProducts() {

        for (Product product : products) {

            if (product.isAvailable()) {
                product.displayDetails();
                System.out.println("----------------------------");
            }
        }
    }

    // Find highest price
    public void findHighestPrice() {

        if (products.isEmpty()) {
            System.out.println("Product list is empty!");
            return;
        }

        Product highest = products.get(0);

        for (Product product : products) {

            if (product.calculatePrice() > highest.calculatePrice()) {
                highest = product;
            }
        }

        System.out.println("===== PRODUCT WITH HIGHEST PRICE =====");
        highest.displayDetails();
    }
}