
package OOP3;


import java.util.Scanner;

public class ComputeService extends CloudService {
    private int cpuCores;
    private double runtimeHours;

    public ComputeService() {
        super();
    }

    public ComputeService(String id, double baseMonthlyFee, java.util.Date startDate, boolean isActive, int monthsUsed, int cpuCores, double runtimeHours) {
        super(id, baseMonthlyFee, startDate, isActive, monthsUsed);
        this.cpuCores = cpuCores;
        this.runtimeHours = runtimeHours;
    }

    public int getCpuCores() {
        return cpuCores;
    }

    public void setCpuCores(int cpuCores) {
        this.cpuCores = cpuCores;
    }

    public double getRuntimeHours() {
        return runtimeHours;
    }

    public void setRuntimeHours(double runtimeHours) {
        this.runtimeHours = runtimeHours;
    }

    @Override
    public void addService() {
        super.addService();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap So loi CPU (CPU Cores): ");
        this.cpuCores = sc.nextInt();
        System.out.print("Nhap So gio chay (Runtime Hours): ");
        this.runtimeHours = sc.nextDouble();
    }

    @Override
    public void updateService() {
        super.updateService();
        Scanner sc = new Scanner(System.in);
        System.out.print("Cap nhat So loi CPU: ");
        this.cpuCores = sc.nextInt();
        System.out.print("Cap nhat So gio chay: ");
        this.runtimeHours = sc.nextDouble();
    }

    @Override
    public void displayDetails() {
        System.out.println("--- Compute Service ---");
        super.displayDetails();
        System.out.println("CPU Cores: " + cpuCores);
        System.out.println("Runtime Hours: " + runtimeHours);
        System.out.println("Monthly Cost: $" + calculateMonthlyCost());
    }

    @Override
    public double calculateMonthlyCost() {
        // Cong thuc tinh chi phi hang thang: Phi co ban + (So loi CPU * So gio chay * 0.1)
        return getBaseMonthlyFee() + (cpuCores * runtimeHours * 0.1);
    }
}
