package lesson03.practical;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class Product implements Comparable<Product>{
    private String name;
    private double price;
    final private int quantity;

    private Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public static void main(String[] args) {
    	
        List<Product> list = new ArrayList<>();
        list.add(new Product("Apple",12.0,30));
        list.add( new Product("Pear",22.3,50));
        list.add(new Product("Lemon", 20.5, 18));
        list.add(new Product("Peach",35.8,24));
        
        Product mostExp = list.stream().max(Product::compareTo).get();
        System.out.printf("The most expensive item is : %s. Quantity : %d\n",mostExp.getName(),mostExp.getQuantity());
        
        Product bQ = list.stream().max(Comparator.comparingInt(Product::getQuantity)).get();
        System.out.println("The biggest quantity item is : "+bQ.getName());

//        Supplier<Stream<Product>> ss = () -> Stream.of(products);
//        Product mostExp = ss.get().max(Product::compareTo).get(); //Optional<Product> ???
//        System.out.printf("The most expensive item is : %s. Quantity : %d\n",mostExp.getName(),mostExp.getQuantity());
//
//        Supplier<Stream<Product>> ss2 = () -> Stream.of(products);
//        Product bQ = ss2.get().max(Comparator.comparingInt(Product::getQuantity)).get();
//        System.out.println("The biggest quantity item is : "+bQ.getName());
//        
    }

    @Override
    public int compareTo(Product o) {
        return Double.compare(price,o.price);
    }
}
