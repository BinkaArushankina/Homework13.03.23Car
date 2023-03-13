package Homework;

public class Main {

    //Задача
    //Создать класс Car, содержащий поля   model, colour, productionDate
    //а также конструктор и методы drive и stop.
    //Создать дочерние классы PassengerCar и Track. Класс PassengerCar должен также содержать
    //поле numberOfSeats(количество мест) а Класс Track поле loadCapacity (грузоподьемность).
    //В методе main класса Main создать несколько обьектов этих классов и
    //вывести в консоль их характеристики и результат работы методов

    public static void main(String[] args) {
        Car mercedes = new Car("Mercedes","white",2022);
        System.out.println("model: "+mercedes.model+"; colour: "+mercedes.colour+"; production Date: "+mercedes.productionDate);
        mercedes.drive();
        mercedes.stop();

        PassengerCar bmw = new PassengerCar("BMW","black",2020,5);
        System.out.println("model: "+bmw.model+"; colour: "+bmw.colour+"; production Date: "+bmw.productionDate+"; number of seats: "+bmw.numberOfSeats);
        bmw.stop();
        bmw.drive();

        Track audi = new Track("Audi","silver",2021,1600);
        System.out.println("model: "+audi.model+"; colour: "+audi.colour+"; production Date: "+audi.productionDate+"; load capacity: "+audi.loadCapacity);
        audi.drive();
        audi.stop();

    }
}
