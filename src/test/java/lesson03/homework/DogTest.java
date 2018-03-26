package lesson03.homework;

import org.junit.Test;

import static org.junit.Assert.*;

public class DogTest {

    @Test
    public void name() {
        Dog dog = new Dog("b",2,Breed.FIRST);
        String actuacl = dog.s(2);
        String exepted = "22";
        assertEquals(exepted,actuacl);
    }
}