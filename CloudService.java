
package OOP3;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public abstract class CloudService implements ICloudService {
    private String id;
    private double baseMonthlyFee;
    private Date startDate;
    private boolean isActive;
    private int monthsUsed;

    public CloudService() {
    }

    public CloudService(String id, double baseMonthlyFee, Date startDate, boolean isActive, int monthsUsed) {
        this.id = id;
        this.baseMonthlyFee = baseMonthlyFee;
        this.startDate = startDate;
        this.isActive = isActive;
        this.monthsUsed = monthsUsed;
    }

    // Getters and Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getBaseMonthlyFee() {
        return baseMonthlyFee;
    }

    public void setBaseMonthlyFee(double baseMonthlyFee) {
        this.baseMonthlyFee = baseMonthlyFee;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public int getMonthsUsed() {
        return monthsUsed;
    }

    public void setMonthsUsed(int monthsUsed) {
        this.monthsUsed = monthsUsed;
    }

    @Override
    public void addService() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ID: ");
        this.id = sc.nextLine();

        System.out.print("Nhap Phi co ban hang thang (Base Monthly Fee): ");
        this.baseMonthlyFee = sc.nextDouble();
        sc.nextLine(); // doc bo dong trong

        System.out.print("Nhap Ngay bat dau (dd/MM/yyyy): ");
        String dateStr = sc.nextLine();
        try {
            this.startDate = new SimpleDateFormat("dd/MM/yyyy").parse(dateStr);
        } catch (ParseException e) {
            this.startDate = new Date(); // Mac dinh la ngay hien tai neu loi
        }

        System.out.print("Trang thai hoat dong (true/false): ");
        this.isActive = sc.nextBoolean();

        System.out.print("Nhap so thang da su dụng: ");
        this.monthsUsed = sc.nextInt();
    }

    @Override
    public void updateService() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Cap nhat Phi co ban hang thang: ");
        this.baseMonthlyFee = sc.nextDouble();
        sc.nextLine();

        System.out.print("Cap nhat Ngay bat dau (dd/MM/yyyy): ");
        String dateStr = sc.nextLine();
        try {
            this.startDate = new SimpleDateFormat("dd/MM/yyyy").parse(dateStr);
        } catch (ParseException e) {
            System.out.println("Dinh dang ngay khong hop le, giu nguyen ngay cu.");
        }

        System.out.print("Cap nhat Trang thai hoat dong (true/false): ");
        this.isActive = sc.nextBoolean();

        System.out.print("Cap nhat So thang su dung: ");
        this.monthsUsed = sc.nextInt();
    }

    @Override
    public void displayDetails() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String dateFormatted = (startDate != null) ? sdf.format(startDate) : "N/A";
        System.out.println("ID: " + id);
        System.out.println("Base Monthly Fee: $" + baseMonthlyFee);
        System.out.println("Start Date: " + dateFormatted);
        System.out.println("Is Active: " + isActive);
        System.out.println("Months Used: " + monthsUsed);
    }
}
