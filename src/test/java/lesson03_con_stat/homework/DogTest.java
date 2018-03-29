package lesson03_con_stat.homework;

import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class DogTest {
    static List<Dog> dogs;
    static Dog testdog;

    @BeforeClass
   public static void initDogs(){
        testdog = new Dog("test1",2,Breed.FIRSTBREED);
        dogs=new ArrayList<>();
        Dog dog1 = new Dog("test1",1,Breed.FIRSTBREED);
        Dog dog2 = new Dog("test2",2,Breed.SECONDBREED);
        dogs.add(dog1);
        dogs.add(dog2);
    }
    @Test
   public void testSameName(){
        boolean actual = true;
        boolean excepted = Dog.checkSameName(dogs,testdog);
        assertEquals(actual,excepted);
    }
    public void testOldestDog(){
        //void method
    }
}