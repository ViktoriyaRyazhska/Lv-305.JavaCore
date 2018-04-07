package lesson05_collections.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class MyCollection {

    private List<Integer> list;
    MyCollection(){
        Random random = new Random();
        list=new ArrayList<>();
        for(int i = 0 ; i<10; i++){
            list.add(random.nextInt(33));
        }
    }
    List<Integer> MoreThanFive(List<Integer> list){
        return list.stream().filter(x->x>5).collect(Collectors.toList());
    }
    List<Integer> removeGreaterThanTwenty(List<Integer> list){
        return list.stream().filter(x->x<20).collect(Collectors.toList());
    }

    public List<Integer> getList() {
        return list;
    }

    public void setList(List<Integer> list) {
        this.list = list;
    }

    public static void main(String[] args) {
        MyCollection myCollection = new MyCollection();
        System.out.println(myCollection.getList());
        List<Integer> newCollection = myCollection.MoreThanFive(myCollection.getList());
        System.out.println(newCollection);
        myCollection.setList(myCollection.removeGreaterThanTwenty(myCollection.getList()));
        System.out.println(myCollection.getList());

        try {
            myCollection.getList().add(2, 1);
            myCollection.getList().add(8, -3);
            myCollection.getList().add(5, -4);
        }
        catch (RuntimeException e){
            System.out.println("index out of bounds");
        }

        Collections.sort(myCollection.getList());

        System.out.println(myCollection.getList());
    }

}


