
package OOP2;

import java.util.Date;
import java.util.Scanner;

public class Processor {

    private ProductArrayList productList;

    
    public Processor() {
        productList = new ProductArrayList();
    }

    
    public void addLaptop() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap ID: ");
        String id = sc.nextLine();

        System.out.print("Nhap basic price: ");
        double basicPrice = sc.nextDouble();

        System.out.print("Nhap quantity: ");
        int quantity = sc.nextInt();

        System.out.print("Nhap warranty years: ");
        int warrantyYears = sc.nextInt();

        System.out.print("Nhap discount percent: ");
        double discountPercent = sc.nextDouble();

        Laptop laptop = new Laptop(
                id,
                basicPrice,
                new Date(),
                true,
                quantity,
                warrantyYears,
                discountPercent
        ) {
            @Override
            public void displaydetails() {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
        };

        productList.addProduct(laptop);

        System.out.println("Them Laptop thanh cong!");
    }

   
    public void addSmartphone() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap ID: ");
        String id = sc.nextLine();

        System.out.print("Nhap basic price: ");
        double basicPrice = sc.nextDouble();

        System.out.print("Nhap quantity: ");
        int quantity = sc.nextInt();

        System.out.print("Nhap storage GB: ");
        int storageGB = sc.nextInt();

        System.out.print("Nhap tax percent: ");
        double taxPercent = sc.nextDouble();

        Smartphone smartphone = new Smartphone(
                id,
                basicPrice,
                new Date(),
                true,
                quantity,
                storageGB,
                taxPercent
        ) {
            @Override
            public void displaydetails() {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
        };

        smartphone.addProduct();

        System.out.println("Them Smartphone thanh cong!");
    }

    
    public void updateProduct() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap ID can cap nhat: ");
        String id = sc.nextLine();

        productList.updateProductById(id);
    }

    
    public void deleteProduct() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap ID can xoa: ");
        String id = sc.nextLine();

        productList.deleteProductById(id);
    }

    
    public void displayAllProducts() {
        productList.displayAllProducts();
    }

    
    public void displayAvailableProducts() {
        productList.findAvailableProducts();
    }

    
    public void findHighestPrice() {
        productList.findHighestPrice();
    }
}