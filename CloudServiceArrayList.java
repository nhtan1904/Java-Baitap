
package OOP3;

import java.util.ArrayList;

public class CloudServiceArrayList {
    private ArrayList<CloudService> services;

    public CloudServiceArrayList() {
        services = new ArrayList<>();
    }

    public void addServiceToArrayList(CloudService service) {
        services.add(service);
        System.out.println("Da thêm dich vu thanh cong!");
    }

    public void updateServiceById(String id) {
        boolean found = false;
        for (CloudService service : services) {
            if (service.getId().equalsIgnoreCase(id)) {
                System.out.println("Tien hanh cap nhat cho dich vu ID: " + id);
                service.updateService();
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Khong tim thay dich vu voi ID: " + id);
        }
    }

    public void deleteServiceById(String id) {
        boolean removed = services.removeIf(service -> service.getId().equalsIgnoreCase(id));
        if (removed) {
            System.out.println("Da xoa dich vu voi ID: " + id);
        } else {
            System.out.println("Khong tim thay dich vu voi ID: " + id);
        }
    }

    public void displayAllServices() {
        if (services.isEmpty()) {
            System.out.println("Danh sach dich vu trong.");
            return;
        }
        for (CloudService service : services) {
            service.displayDetails();
            System.out.println("-------------------------");
        }
    }

    public void displayActiveServices() {
        boolean found = false;
        for (CloudService service : services) {
            if (service.isActive()) {
                service.displayDetails();
                System.out.println("-------------------------");
                found = true;
            }
        }
        if (!found) {
            System.out.println("Khong co dich vu nao dang hoat dong (Active).");
        }
    }

    public double findHighestMonthlyCost() {
        if (services.isEmpty()) {
            return 0.0;
        }
        double maxCost = services.get(0).calculateMonthlyCost();
        for (CloudService service : services) {
            double cost = service.calculateMonthlyCost();
            if (cost > maxCost) {
                maxCost = cost;
            }
        }
        return maxCost;
    }
}
