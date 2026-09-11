
package VoLamNhatTan_7374.Lec11_Encapsulation.Exercise1;

import java.util.*;

class BankAccount {
    private String accountNumber;
    private String owner;
    private int balance;

    public void addInfo(String accountNumber, String owner, int initialBalance) {
        this.accountNumber = accountNumber;
        this.owner = owner;
        this.balance = initialBalance;
    }

    public void deposit(int amount) {
        if (amount <= 0) {
            System.out.println("Số tiền gửi không hợp lệ!");
            return;
        }
        this.balance += amount;
        System.out.printf("Đã gửi %d VNĐ vào tài khoản. Số dư mới: %d VNĐ%n", amount, this.balance);
    }
    
    public boolean withdraw(int amount) {
        if (amount <= 0) {
            System.out.println("Số tiền rút không hợp lệ!");
            return false;
        }
        
        if (amount > this.balance) {
            System.out.printf("Không đủ số dư! Cần rút %d VNĐ, hiện có %d VNĐ%n", amount, this.balance);
            return false;
        }
        this.balance -= amount;
        System.out.printf("Đã rút %d VNĐ khỏi tài khoản. Số dư mới: %d VNĐ%n", amount, this.balance);
        return true;
    }

    // Phương thức hiển thị thông tin tài khoản
    public void display() {
        System.out.println("\n=== Thông tin tài khoản ngân hàng ===");
        System.out.println("Số tài khoản: " + this.accountNumber);
        System.out.println("Chủ tài khoản: " + this.owner);
        System.out.printf("Số dư hiện tại: %,d VNĐ%n", this.balance);
    }

    
    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount();
        myAccount.addInfo("987654321", "Nguyễn Văn A", 5000000);
        myAccount.display();
        myAccount.deposit(2000000);
        myAccount.withdraw(1500000);
        myAccount.withdraw(10000000);
        myAccount.display();
    }
}

