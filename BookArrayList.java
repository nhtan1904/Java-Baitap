
package QuanLiThuVienSach;


import java.util.ArrayList;

public class BookArrayList {
    private ArrayList<Book> bookList;

    public BookArrayList() {
        this.bookList = new ArrayList<>();
    }

    public void addBook(Book b) {
        bookList.add(b);
        System.out.println("-> Thêm sách thành công!");
    }

    public Book findBookById(String id) {
        for (Book b : bookList) {
            if (b.getBookId().equalsIgnoreCase(id)) {
                return b;
            }
        }
        return null;
    }

    public void updateBook(String id) {
        Book b = findBookById(id);
        if (b != null) {
            b.updateBook();
            System.out.println("-> Cập nhật thông tin thành công!");
        } else {
            System.out.println("-> Không tìm thấy sách có mã: " + id);
        }
    }

    public void deleteBookById(String id) {
        Book b = findBookById(id);
        if (b != null) {
            bookList.remove(b);
            System.out.println("-> Đã xóa sách thành công!");
        } else {
            System.out.println("-> Không tìm thấy sách có mã: " + id);
        }
    }

    public void displayAllBooks() {
        if (bookList.isEmpty()) {
            System.out.println("Danh sách sách đang trống!");
            return;
        }
        System.out.println("\n=== DANH SÁCH TẤT CẢ SÁCH TRONG THƯ VIỆN ===");
        for (Book b : bookList) {
            b.displayBook();
        }
    }

    public void findAvailableBooks() {
        System.out.println("\n=== DANH SÁCH SÁCH ĐANG CÓ SẴN (AVAILABLE) ===");
        boolean found = false;
        for (Book b : bookList) {
            if (b.getStatus().equalsIgnoreCase("AVAILABLE")) {
                b.displayBook();
                found = true;
            }
        }
        if (!found) System.out.println("Không có sách nào đang rảnh!");
    }

    public void findBorrowedBooks() {
        System.out.println("\n=== DANH SÁCH SÁCH ĐANG ĐƯỢC MƯỢN (BORROWED) ===");
        boolean found = false;
        for (Book b : bookList) {
            if (b.getStatus().equalsIgnoreCase("BORROWED")) {
                b.displayBook();
                found = true;
            }
        }
        if (!found) System.out.println("Chưa có sách nào được mượn!");
    }

    public void borrowBook(String id, String borrowerName, int days) {
        Book b = findBookById(id);
        if (b == null) {
            System.out.println("-> Không tìm thấy sách mã: " + id);
            return;
        }
        if (b.getStatus().equalsIgnoreCase("BORROWED")) {
            System.out.println("-> Sách này đã có người mượn!");
            return;
        }
        b.setStatus("BORROWED");
        b.setBorrowerName(borrowerName);
        b.setBorrowedDays(days);
        System.out.println("-> Mượn sách thành công cho độc giả: " + borrowerName);
    }

    public void returnBook(String id) {
        Book b = findBookById(id);
        if (b == null) {
            System.out.println("-> Không tìm thấy sách mã: " + id);
            return;
        }
        if (b.getStatus().equalsIgnoreCase("AVAILABLE")) {
            System.out.println("-> Sách này đang ở thư viện, không cần trả!");
            return;
        }
        
        double fee = b.calculateRentalFee();
        System.out.printf("-> Trả sách thành công! Tổng phí mượn phải thanh toán: %,.0f VNĐ\n", fee);
        
        // Reset trạng thái sách
        b.setStatus("AVAILABLE");
        b.setBorrowerName("");
        b.setBorrowedDays(0);
    }

    public void calculateBookPrice(String id) {
        Book b = findBookById(id);
        if (b != null) {
            if (b.getStatus().equalsIgnoreCase("AVAILABLE")) {
                System.out.println("-> Sách chưa được mượn nên chưa tính phí!");
            } else {
                System.out.printf("-> Chi phí mượn của sách [%s]: %,.0f VNĐ\n", b.getTitle(), b.calculateRentalFee());
            }
        } else {
            System.out.println("-> Không tìm thấy sách có mã: " + id);
        }
    }
}
