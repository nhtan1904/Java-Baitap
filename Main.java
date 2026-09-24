
package QuanLiThuVienSach;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BookArrayList manager = new BookArrayList();
        Scanner scanner = new Scanner(System.in);

        // Khởi tạo một số dữ liệu mẫu ban đầu
        manager.addBook(new PaperBook("BK01", "Lap Trinh Java", "Nguyen Van A", 15000, "Ke A1", 450, true));
        manager.addBook(new EBook("BK02", "Cau Truc Du Lieu", "Tran Van B", 10000, 12.5, "https://dtu.edu.vn/bk02", "PDF"));

        int choice = -1;
        do {
            System.out.println("\n=================================================");
            System.out.println("   HỆ THỐNG QUẢN LÝ THƯ VIỆN SÁCH (DTU - CMU)");
            System.out.println("=================================================");
            System.out.println("1. Thêm sách in (PaperBook)");
            System.out.println("2. Thêm sách điện tử (EBook)");
            System.out.println("3. Cập nhật thông tin sách");
            System.out.println("4. Xóa sách theo mã");
            System.out.println("5. Hiển thị tất cả sách");
            System.out.println("6. Tìm sách trống (AVAILABLE)");
            System.out.println("7. Tìm sách đã mượn (BORROWED)");
            System.out.println("8. Mượn sách");
            System.out.println("9. Trả sách");
            System.out.println("10. Tính tiền phí mượn sách");
            System.out.println("0. Thoát chương trình");
            System.out.print("Mời bạn chọn chức năng (0-10): ");

            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (Exception e) {
                choice = -1;
            }

            switch (choice) {
                case 1:
                    System.out.println("\n--- THÊM SÁCH IN NEW ---");
                    PaperBook pb = new PaperBook();
                    pb.addBook();
                    manager.addBook(pb);
                    break;
                case 2:
                    System.out.println("\n--- THÊM SÁCH ĐIỆN TỬ NEW ---");
                    EBook eb = new EBook();
                    eb.addBook();
                    manager.addBook(eb);
                    break;
                case 3:
                    System.out.print("Nhập mã sách cần cập nhật: ");
                    String idUpdate = scanner.nextLine();
                    manager.updateBook(idUpdate);
                    break;
                case 4:
                    System.out.print("Nhập mã sách cần xóa: ");
                    String idDelete = scanner.nextLine();
                    manager.deleteBookById(idDelete);
                    break;
                case 5:
                    manager.displayAllBooks();
                    break;
                case 6:
                    manager.findAvailableBooks();
                    break;
                case 7:
                    manager.findBorrowedBooks();
                    break;
                case 8:
                    System.out.print("Nhập mã sách muốn mượn: ");
                    String idBorrow = scanner.nextLine();
                    System.out.print("Nhập tên người mượn: ");
                    String name = scanner.nextLine();
                    System.out.print("Nhập số ngày mượn: ");
                    int days = Integer.parseInt(scanner.nextLine());
                    manager.borrowBook(idBorrow, name, days);
                    break;
                case 9:
                    System.out.print("Nhập mã sách muốn trả: ");
                    String idReturn = scanner.nextLine();
                    manager.returnBook(idReturn);
                    break;
                case 10:
                    System.out.print("Nhập mã sách cần tính tiền phí: ");
                    String idCalc = scanner.nextLine();
                    manager.calculateBookPrice(idCalc);
                    break;
                case 0:
                    System.out.println("Cảm ơn bạn đã sử dụng chương trình!");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ, vui lòng thử lại!");
            }
        } while (choice != 0);
    }
}
