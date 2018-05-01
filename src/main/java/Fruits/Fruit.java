package Fruits;

import java.io.*;

public class Fruit {
    String name;
    String color;

    public Fruit() {
    }

    public Fruit(String name, String color) {
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

    void input(){
        try{
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("name");
            this.name=reader.readLine();
            System.out.println("color");
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
    void input(ObjectOutputStream objectOutputStream){
        try {
            objectOutputStream.writeObject(this);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    void print(ObjectInputStream objectInputStream){
        try {
            Fruit fruit = (Fruit) objectInputStream.readObject();
            fruit.print();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
