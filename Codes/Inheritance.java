class Vehicle {
    int speed;
    int fuelCapacity;

    Vehicle(int speed, int fuelCapacity) {
        this.speed = speed;
        this.fuelCapacity = fuelCapacity;
    }
}

class Car extends Vehicle {
    int numberOfDoors;

    Car(int speed, int fuelCapacity, int numberOfDoors) {
        super(speed, fuelCapacity);
        this.numberOfDoors = numberOfDoors;
    }

    void showCarDetails() {
        System.out.println("Speed: " + speed + " km/h");
        System.out.println("Fuel Capacity: " + fuelCapacity + " liters");
        System.out.println("Number of Doors: " + numberOfDoors);
    }
}

class Bike extends Vehicle {
    boolean hasCarrier;

    Bike(int speed, int fuelCapacity, boolean hasCarrier) {
        super(speed, fuelCapacity);
        this.hasCarrier = hasCarrier;
    }

    void showBikeDetails() {
        System.out.println("Speed: " + speed + " km/h");
        System.out.println("Fuel Capacity: " + fuelCapacity + " liters");
        System.out.println("Has Carrier: " + hasCarrier);
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Car car = new Car(200, 50, 4);
        Bike bike = new Bike(150, 15, true);

        System.out.println("Car Details:");
        car.showCarDetails();

        System.out.println("\nBike Details:");
        bike.showBikeDetails();
    }
}
