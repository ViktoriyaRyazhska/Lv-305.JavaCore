package Fruits;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Citrus extends Fruit {

    double vitamin;

    public Citrus() {
    }

    public Citrus(String name, String color, double vitamin) {
        super(name, color);
        this.vitamin=vitamin;
    }

    @Override
    void input() {
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){
            this.name=reader.readLine();
            this.color=reader.readLine();
            this.vitamin=Double.parseDouble(reader.readLine());
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }

    @Override
    void print() {
        super.print();
        System.out.println(this.vitamin);
    }
}
