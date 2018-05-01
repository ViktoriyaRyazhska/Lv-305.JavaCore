package Fruits;

import java.io.*;

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
        try{
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("name");
            this.name=reader.readLine();
            System.out.println("color");
            this.color=reader.readLine();
            System.out.println("vitamin");
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
    void input(ObjectOutputStream objectOutputStream){
        try {
            objectOutputStream.writeObject(this);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    void print(ObjectInputStream objectInputStream){
        try {
            Citrus citrus = (Citrus) objectInputStream.readObject();
            citrus.print();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
