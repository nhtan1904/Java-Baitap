
package QuanLiThuVienSach;


import java.util.Scanner;

public class PaperBook extends Book {
    private String shelfLocation;
    private double weight;
    private boolean isHardcover;

    public PaperBook() {
        super();
    }

    public PaperBook(String bookId, String title, String author, double basePrice, String shelfLocation, double weight, boolean isHardcover) {
        super(bookId, title, author, basePrice);
        this.shelfLocation = shelfLocation;
        this.weight = weight;
        this.isHardcover = isHardcover;
    }

    @Override
    public double calculateRentalFee() {
        // Phí mượn = (Giá gốc * Số ngày mượn) + Phụ phí bìa cứng (10,000 VNĐ)
        double total = getBasePrice() * getBorrowedDays();
        if (isHardcover) {
            total += 10000;
        }
        return total;
    }

    @Override
    public void addBook() {
        super.addBook();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vị trí kệ sách (VD: Kệ A1): ");
        this.shelfLocation = scanner.nextLine();
        System.out.print("Nhập trọng lượng (gram): ");
        this.weight = Double.parseDouble(scanner.nextLine());
        System.out.print("Có phải sách bìa cứng không? (true/false): ");
        this.isHardcover = Boolean.parseBoolean(scanner.nextLine());
    }

    @Override
    public void displayBook() {
        super.displayBook();
        System.out.printf(" | Kệ: %-6s | Nặng: %.0fg | Bìa cứng: %s\n",
                shelfLocation, weight, (isHardcover ? "Có" : "Không"));
    }
}
