/*1. Develop abstract class Bird with attributes feathers and layEggs and an abstarct
        method fly().  Develop classes FlyingBird and NonFlyingBird. Create class Eagle,
        Swallow, Penguin and Chicken.
        Create array Bird and add different birds to it.
        Call fly() method for all of it.
        Output the information about
        each type of
        created bird

        / * 1. Розробити абстрактний клас Bird з атрибутами пір'я і layEggs і абстрактний
        метод літати (). Розробити класи FlyingBird і NonFlyingBird. Створіть клас Eagle
        Ластівка, пінгвін і курка.
        Створіть масив птиці та додайте до неї різних птахів.
        Виклик метод fly () для всіх
        з цього. Виведіть
        інформація про
        кожен тип
        створений птах. * /
        .*/


import java.sql.SQLOutput;

public interface Main {
    public static void main(String[] args) {

        Bird[] birds = new Bird[4];

        birds[0] = new Eagle("fly", "sdf");
        birds[1] = new Chicken("asdf", "asdf");
        birds[2] = new Penguin("asdf", "asdf");
        birds[3] = new Swallow("qwer", "asdf");
        for (int i = 0; i < birds.length; i++) {


            System.out.println(birds[i].toString());




        }


    }}

