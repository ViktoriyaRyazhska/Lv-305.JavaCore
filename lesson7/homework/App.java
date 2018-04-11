package lesson7.homework;

import java.util.*;

public class App {

    public static void main(String[] args) {
        // Write parameterized methods union(Set set1, Set set2) and intersect(Set set1, Set set2),
        // realizing the operations of union and intersection of two sets.
        // Test the operation of these techniques on two pre-filled sets.
        System.out.println("TASK 1\n");
        taskOne();

        // Create map personMap and add to it ten persons of type <String, String> (lastName, firstName).
        //  Output the entities of the map on the screen.
        //  There are at less two persons with the same firstName among these 10 people?
        //  Remove from the map person whose firstName is ”Orest” (or other). Print result.
        System.out.println("\nTASK 2\n");
        taskTwo();

        // Write class Student that provides information about the name of the student and his course.
        // Class Student should consists of properties for access to these fields constructor with parameters
        // method printStudents (List students, Integer course), which receives a list of students and the course number
        // and prints to the console the names of the students from the list, which are taught in this course (use an iterator)
        // methods to compare students by name and by course
        // In the main() method
        //  declare List students and add to the list five different students
        //  display the list of students ordered by name
        //  display the list of students ordered by course.
        System.out.println("\nTASK 3\n");
        taskThree();
    }

    private static void taskOne() {
        Set<String> set1 = new HashSet<>();
        Set<String> set2 = new HashSet<>();

        set1.add("test");
        set1.add("test1");
        set1.add("test2");
        set1.add("test3");
        set1.add("test4");

        set2.add("test3");
        set2.add("test1");
        set2.add("test2");
        set2.add("test12");
        set2.add("test17");

        System.out.println("Set 1: " + set1);
        System.out.println("Set 2: " + set2);
        System.out.println("Intersection: " + SetOperations.intersect(set1, set2));
        System.out.println("Union: " + SetOperations.union(set1, set2));
    }

    private static void taskTwo() {
        // Create map personMap and add to it ten persons of type <String, String> (lastName, firstName).
        Map<String, String> personMap = new HashMap<>();
        personMap.put("Test", "Orest");
        personMap.put("Test1", "Bogdan");
        personMap.put("Test2", "Maria");
        personMap.put("Test3", "Petro");
        personMap.put("Test4", "Orest");
        personMap.put("Test5", "Ivan");
        personMap.put("Test6", "Oleg");
        personMap.put("Test7", "Oleg");
        personMap.put("Test8", "Orest");
        personMap.put("Test9", "Orest");

        //  Output the entities of the map on the screen.
        System.out.println("PersonMap: " + personMap);

        //  There are at less two persons with the same firstName among these 10 people?
        Collection<String> valueCollection = personMap.values();
        Set<String> valueSet = new HashSet<>(valueCollection);
        if (valueCollection.size() > valueSet.size()) {
            System.out.println("There are at less two persons with the same firstName");
        } else {
            System.out.println("There are no people with the same firstName");
        }

        //  Remove from the map person whose firstName is ”Orest” (or other). Print result.
        Iterator<Map.Entry<String, String>> iterator = personMap.entrySet().iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getValue().equals("Orest")) {
                iterator.remove();
            }
         }
        System.out.println(personMap);
    }

    private static void taskThree() {
        List<Student> students = new LinkedList<>();
        students.add(new Student("Bogdan", 5));
        students.add(new Student("Petro", 4));
        students.add(new Student("Yaroslav", 5));
        students.add(new Student("Borys", 4));
        students.add(new Student("Ivan", 3));
        System.out.println("Not sorted:" + students);
        students.sort(Student.getNameComparator());
        System.out.println("Sorted by name:\n" + students);
        students.sort(Student.getCourseComparator());
        System.out.println("Sorted by course:\n" + students);



    }
}
