
package OOP3;

import java.util.Scanner;

public class Processor {
    public static void main(String[] args) {
        CloudServiceArrayList list = new CloudServiceArrayList();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n========== CLOUD SERVICE MANAGEMENT ==========");
            System.out.println("1. Them Storage Service");
            System.out.println("2. Them Compute Service");
            System.out.println("3. Hien thi tat ca dich vu");
            System.out.println("4. Hien thi cac dich vu dang hoat dong (Active)");
            System.out.println("5. Cap nhat dich vu theo ID");
            System.out.println("6. Xoa dich vu theo ID");
            System.out.println("7. Tim chi phi hang thang cao nhat (Highest Monthly Cost)");
            System.out.println("0. Thoat");
            System.out.print("Chon chuc nang (0-7): ");
            
            choice = sc.nextInt();
            sc.nextLine(); // Doc bo dong trong

            switch (choice) {
                case 1:
                    System.out.println("\n--- THEM STORAGE SERVICE ---");
                    StorageService ss = new StorageService();
                    ss.addService();
                    list.addServiceToArrayList(ss);
                    break;

                case 2:
                    System.out.println("\n--- THEM COMPUTE SERVICE ---");
                    ComputeService cs = new ComputeService();
                    cs.addService();
                    list.addServiceToArrayList(cs);
                    break;

                case 3:
                    System.out.println("\n--- DANH SACH TAT CA DICH VU ---");
                    list.displayAllServices();
                    break;

                case 4:
                    System.out.println("\n--- DANH SACH DICH VU DANG HOAT DONG ---");
                    list.displayActiveServices();
                    break;

                case 5:
                    System.out.print("Nhap ID dich vu can cap nhat: ");
                    String updateId = sc.nextLine();
                    list.updateServiceById(updateId);
                    break;

                case 6:
                    System.out.print("Nhap ID dich vu can xoa: ");
                    String deleteId = sc.nextLine();
                    list.deleteServiceById(deleteId);
                    break;

                case 7:
                    double maxCost = list.findHighestMonthlyCost();
                    System.out.printf("Chi phi hang thang cao nhat la: $%.2f\n", maxCost);
                    break;

                case 0:
                    System.out.println("Da thoát chuong trinh!");
                    break;

                default:
                    System.out.println("Lua chon khong hop le. Vui long chon lai!");
            }
        } while (choice != 0);

        sc.close();
    }
}
