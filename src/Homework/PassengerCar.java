package Homework;

public class PassengerCar extends Car{

     int numberOfSeats;

    PassengerCar(String model, String colour, int productionDate, int numberOfSeats) {
        super(model, colour, productionDate);
        this.numberOfSeats=numberOfSeats;
    }
}
