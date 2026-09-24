
package QuanLiThuVienSach;

import java.util.Scanner;

public class EBook extends Book {
    private double fileSizeMB;
    private String downloadLink;
    private String fileFormat;

    public EBook() {
        super();
    }

    public EBook(String bookId, String title, String author, double basePrice, double fileSizeMB, String downloadLink, String fileFormat) {
        super(bookId, title, author, basePrice);
        this.fileSizeMB = fileSizeMB;
        this.downloadLink = downloadLink;
        this.fileFormat = fileFormat;
    }

    @Override
    public double calculateRentalFee() {
        // Phí mượn = (Giá gốc * Số ngày mượn) giảm 20% do không chi phí lưu kho sách giấy
        return (getBasePrice() * getBorrowedDays()) * 0.8;
    }

    @Override
    public void addBook() {
        super.addBook();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập dung lượng file (MB): ");
        this.fileSizeMB = Double.parseDouble(scanner.nextLine());
        System.out.print("Nhập đường dẫn download: ");
        this.downloadLink = scanner.nextLine();
        System.out.print("Nhập định dạng file (PDF/EPUB/MOBI): ");
        this.fileFormat = scanner.nextLine();
    }

    @Override
    public void displayBook() {
        super.displayBook();
        System.out.printf(" | Dung lượng: %.1fMB | Định dạng: %-4s | Link: %s\n",
                fileSizeMB, fileFormat, downloadLink);
    }
}