/*
. Enter in the console sentence of five words.
        • display the longest word in the sentence
        • determine the number of its letters
        • bring the second word in reverse order



        3. Implement a pattern for US currency: the first symbol "$",
        then any number of digits, dot and two digits after the dot.
        Enter the text from the console that contains several
        occurrences of US currency. Display all occurrences on the
        screen.
*/


import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter five words: ");
        String input = sc.nextLine();



    String [] word = input.split(" ");
    String temp = " ";
        for (int i = 0; i < word.length; i++) {
            if (word[i].length() >= temp.length()) {
                temp = word[i];
            }
        }


        System.out.println("Longest word is :");
        System.out.println(temp);
/*
                    2. Enter a sentence that contains the words between more
                    than one space. Convert all spaces, consecutive, one. For
                    example, if we introduce the sentence "I am learning
                    Java Core», we have to get the "I'm learning Java Core»*/

        String space = "    Hello     World  it     I   am";
        space = space.replaceAll("\\s+"," ");
        System.out.println(space);

               /* 3. Implement a pattern for US currency: the first symbol "$",
                    then any number of digits, dot and two digits after the dot.
                    Enter the text from the console that contains several
                    occurrences of US currency. Display all occurrences on the
                    screen.
                    3. Внесіть схему для валюти США: перший символ "$",
                    тоді будь-яка кількість цифр, крапка та дві цифри після крапки.
                    Введіть текст з консолі, що містить кілька
                    входження валюти США. Показати всі події на
                    екран. * /*/
 

    }

}
