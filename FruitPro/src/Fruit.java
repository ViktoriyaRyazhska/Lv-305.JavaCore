import sun.applet.Main;

import javax.swing.*;
import java.util.List;

public class Fruit extends Main {
    public String name;
    public String color;


    public void input() {

    }

    public void print() {

    }


    public Fruit() {
    }

    public Fruit(String name , String color) {
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "\n" +
                "" + name + " " +
                "has color   " + color +
                "";
    }


}




