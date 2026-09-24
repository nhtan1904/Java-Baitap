
package QuanLiThuVienSach;

import java.util.Scanner;

public abstract class Book implements IBook {
    private String bookId;
    private String title;
    private String author;
    private double basePrice;
    private int borrowedDays;
    private String status; // "AVAILABLE" hoặc "BORROWED"
    private String borrowerName;

    public Book() {
        this.status = "AVAILABLE";
        this.borrowedDays = 0;
        this.borrowerName = "";
    }

    public Book(String bookId, String title, String author, double basePrice) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.basePrice = basePrice;
        this.borrowedDays = 0;
        this.status = "AVAILABLE";
        this.borrowerName = "";
    }

    // Getters và Setters
    public String getBookId() { return bookId; }
    public void setBookId(String bookId) { this.bookId = bookId; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getAuthor() { return author; }
    public void setAuthor(String author) { this.author = author; }

    public double getBasePrice() { return basePrice; }
    public void setBasePrice(double basePrice) { this.basePrice = basePrice; }

    public int getBorrowedDays() { return borrowedDays; }
    public void setBorrowedDays(int borrowedDays) { this.borrowedDays = borrowedDays; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public String getBorrowerName() { return borrowerName; }
    public void setBorrowerName(String borrowerName) { this.borrowerName = borrowerName; }

    // Phương thức trừu tượng tính phí mượn sách
    public abstract double calculateRentalFee();

    @Override
    public void addBook() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập mã sách: ");
        this.bookId = scanner.nextLine();
        System.out.print("Nhập tên sách: ");
        this.title = scanner.nextLine();
        System.out.print("Nhập tên tác giả: ");
        this.author = scanner.nextLine();
        System.out.print("Nhập giá thuê cơ bản/ngày: ");
        this.basePrice = Double.parseDouble(scanner.nextLine());
    }

    @Override
    public void updateBook() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Cập nhật tên sách (" + title + "): ");
        String newTitle = scanner.nextLine();
        if (!newTitle.trim().isEmpty()) this.title = newTitle;

        System.out.print("Cập nhật tác giả (" + author + "): ");
        String newAuthor = scanner.nextLine();
        if (!newAuthor.trim().isEmpty()) this.author = newAuthor;

        System.out.print("Cập nhật giá thuê cơ bản (" + basePrice + "): ");
        String newPriceStr = scanner.nextLine();
        if (!newPriceStr.trim().isEmpty()) this.basePrice = Double.parseDouble(newPriceStr);
    }

    @Override
    public void displayBook() {
        System.out.printf("Mã: %-6s | Tên: %-25s | Tác giả: %-15s | Giá cơ bản: %,10.0f VNĐ | Trạng thái: %-10s",
                bookId, title, author, basePrice, status);
        if (status.equalsIgnoreCase("BORROWED")) {
            System.out.printf(" | Người mượn: %-15s | Số ngày: %d", borrowerName, borrowedDays);
        }
    }
}
