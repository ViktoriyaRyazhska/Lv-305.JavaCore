package HW5.task5;

import HW5.GetValues;

public class Car {
    private String type = "";
    private int year = 0;
    private double engineCapacity = 0;


    public int getYear() {
        return year;
    }

    public Car() {
        System.out.println("Lets initialize new car :");
        setType();
        setYear();
        setEngineCapacity();
    }

    public void setType() {
        System.out.println(" Enter type! ");
        this.type = GetValues.getString();
    }

    public void setYear() {
        System.out.println(" Enter Year! ");
        this.year = GetValues.getInteger();
    }

    public void setEngineCapacity() {
        System.out.println(" Enter Capacity! ");
        this.engineCapacity = GetValues.getDouble();
    }

    @Override
    public String toString() {
        return "Car{" +
                "type='" + type + '\'' +
                ", year=" + year +
                ", engineCapacity=" + engineCapacity +
                '}';
    }
}
