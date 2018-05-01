package Fruits;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Fruit {
    String name;
    String color;

    public Fruit() {
    }

    public Fruit(String name, String color) {
        this.name = name;
        this.color = color;
    }

    void input(){
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){
            this.name=reader.readLine();
            this.color=reader.readLine();
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
    void print(){
        System.out.println(this.name);
        System.out.println(this.color);
    }
}
