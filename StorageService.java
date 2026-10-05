
package OOP3;

import java.util.*;
import java.util.Scanner;

public class StorageService extends CloudService {
    private int storageGB;
    private boolean encryptionEnabled;

    public StorageService() {
        super();
    }

    public StorageService(String id, double baseMonthlyFee, java.util.Date startDate, boolean isActive, int monthsUsed, int storageGB, boolean encryptionEnabled) {
        super(id, baseMonthlyFee, startDate, isActive, monthsUsed);
        this.storageGB = storageGB;
        this.encryptionEnabled = encryptionEnabled;
    }

    public int getStorageGB() {
        return storageGB;
    }

    public void setStorageGB(int storageGB) {
        this.storageGB = storageGB;
    }

    public boolean isEncryptionEnabled() {
        return encryptionEnabled;
    }

    public void setEncryptionEnabled(boolean encryptionEnabled) {
        this.encryptionEnabled = encryptionEnabled;
    }

    @Override
    public void addService() {
        super.addService();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap Dung luong Storage (GB): ");
        this.storageGB = sc.nextInt();
        System.out.print("Co bat Ma hoa hay khong (true/false): ");
        this.encryptionEnabled = sc.nextBoolean();
    }

    @Override
    public void updateService() {
        super.updateService();
        Scanner sc = new Scanner(System.in);
        System.out.print("Cap nhat Storage (GB): ");
        this.storageGB = sc.nextInt();
        System.out.print("Cap nhat Ma hoa (true/false): ");
        this.encryptionEnabled = sc.nextBoolean();
    }

    @Override
    public void displayDetails() {
        System.out.println("--- Storage Service ---");
        super.displayDetails();
        System.out.println("Storage (GB): " + storageGB);
        System.out.println("Encryption Enabled: " + encryptionEnabled);
        System.out.println("Monthly Cost: $" + calculateMonthlyCost());
    }

    @Override
    public double calculateMonthlyCost() {
        double extraFee = encryptionEnabled ? 10.0 : 0.0;
        return getBaseMonthlyFee() + (storageGB * 0.05) + extraFee;
    }
}
