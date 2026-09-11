
package VoLamNhatTan_7374.Lec11_Encapsulation.Exercise1;

class CarProfile {
    private String make;
    private String model;
    private int year;

    public void addProfile(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public void displayProfile() {
        System.out.printf("Car Profile: %d %s %s%n", year, make, model);
    }

    public static void main(String[] args) {
        CarProfile myCar = new CarProfile();
        myCar.addProfile("Toyota", "Camry", 2023);
        myCar.displayProfile();
    }
}

