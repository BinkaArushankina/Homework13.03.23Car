package Homework;

public class Track extends Car{

    int loadCapacity;

    Track(String model, String colour, int productionDate, int loadCapacity){
        super(model, colour, productionDate);
        this.loadCapacity=loadCapacity;
    }
}
