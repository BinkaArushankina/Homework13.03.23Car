package Homework;

public class Car {
     String model;
     String colour;
     int productionDate;


    Car(String model, String colour, int productionDate){
        this.model=model;
        this.colour=colour;
        this.productionDate=productionDate;
    }
    public void drive(){
        System.out.println("I'm driving");
    }
    public void stop(){
        System.out.println("stop");
    }
}
