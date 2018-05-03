package project_fruits;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.LinkedList;
import java.util.List;

public class OrestMain {

	public static void main(String[] args) {

		List<Fruit> listOfFruits = new LinkedList<Fruit>();
		listOfFruits.add(new Fruit());
		listOfFruits.add(new Citrus());
		listOfFruits.add(new Citrus());
		listOfFruits.add(new Fruit());
		listOfFruits.add(new Fruit());
		for (Fruit fruit : listOfFruits) {
			try {
				fruit.input();
			} catch (NumberFormatException e) {
				System.out.println("Wrong format of entered numbers");
			
			} catch (IOException e) {
				System.out.println("Try later");
			}

		}
		try {
			System.out.println("List of your fruits");
			for (Fruit fruit : listOfFruits) {
				fruit.output();
			}
			ObjectOutputStream serNonSortList = new ObjectOutputStream(new FileOutputStream("listOfFruits.txt"));
			serNonSortList.writeObject(listOfFruits);
			serNonSortList.close();
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
		} catch (IOException e) {
			System.out.println("Try later");
		}

		System.out.println();

		try {
			listOfFruits.sort(new CompareFruitName());
			System.out.println("Sorted by name");
			for (Fruit fruit : listOfFruits) {
				System.out.println(fruit);
			}
			ObjectOutputStream serNonSortList = new ObjectOutputStream(new FileOutputStream("sortedListOfFruits.txt"));
			serNonSortList.writeObject(listOfFruits);
			serNonSortList.close();
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
		} catch (IOException e) {
			System.out.println("Try later");
		}

		System.out.println();

		try {
			for (Fruit yellowfruit : listOfFruits) {
				if (yellowfruit.getFruitColor().equalsIgnoreCase("yellow")) {
					System.out.println("Fruit: " + yellowfruit.getFruitName() + " is yellow.");
				}
			}
			ObjectOutputStream serNonSortList = new ObjectOutputStream(new FileOutputStream("yellowFruits.txt"));
			serNonSortList.writeObject(listOfFruits);
			serNonSortList.close();
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
		} catch (IOException e) {
			System.out.println("Try later");
		}
	}
}
