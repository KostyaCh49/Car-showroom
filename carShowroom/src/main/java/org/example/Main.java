package org.example;

class Main {
    public static void main(String[] args) {
        SportCar sportCar = new SportCar("Chevrolet", "Corvette", 124000);
        HyperCar hyperCar = new HyperCar("McLaren", "Senna", 837000);
        ElectrictCar electrictCar = new ElectrictCar("BMW", "i4", 69200);
        SecondHandCar secondHandCar = new SecondHandCar("Audi", "a4", 28600);

        Information information = new Information();
        information.getInformation(sportCar);
        information.getInformation(hyperCar);
        information.getInformation(electrictCar);
        information.getInformation(secondHandCar);

        BuyCar buyCar = new BuyCar();
        buyCar.buy(sportCar);
        buyCar.buy(hyperCar);
        buyCar.buy(electrictCar);
        buyCar.buy(secondHandCar);
    }
}

//Single Responsibility Principle
class Car {
    private String brand;
    private String model;
    private int price;

    public Car(String brand, String model, int price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getPrice() {
        return price;
    }
}

//Liskov Substitution Principle
class SportCar extends Car {
    public SportCar(String brand, String model, int price) {
        super(brand, model, price);
    }
}

class HyperCar extends Car {
    public HyperCar(String brand, String model, int price) {
        super(brand, model, price);
    }
}

class ElectrictCar extends Car {
    public ElectrictCar(String brand, String model, int price) {
        super(brand, model, price);
    }
}

class SecondHandCar extends Car {
    public SecondHandCar(String brand, String model, int price) {
        super(brand, model, price);
    }
}

class Information {
    public void getInformation(Car car) {
        System.out.println("Car brand: " + car.getBrand());
        System.out.println("Car model: " + car.getModel());
        System.out.println("Car price: " + car.getPrice() + "\n");
    }
}

//Interface Segregation Principle; Dependency Inversion Principle
interface Buy {
    void buy(Car car);
}

class BuyCar implements Buy {
    @Override
    public void buy(Car car) {
        System.out.println("You bought a car: " + car.getBrand() + " " + car.getModel() + " for " + car.getPrice());
    }
}