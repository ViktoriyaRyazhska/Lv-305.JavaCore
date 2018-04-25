import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Runner {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        Maze myMap = new Maze();

        introGrating();


        introWhereMove();

        String choice = userChoice(bufferedReader);

        myMap.printMap();


        game(bufferedReader, myMap);


    }

    public static void introGrating() {
        System.out.println("Welcome to Maze Runner!.\nHere is your current position");
    }

    public static void introWhereMove() {
        System.out.println("Where you would like to move. (R, L, U, D)");
    }

    public static String readInput(BufferedReader bufferedReader) throws IOException {
        String s = bufferedReader.readLine();
        return s;
    }

    public static String userChoice(BufferedReader bufferedReader) throws IOException {
        List<String> validInputList = Arrays.asList("r", "l", "d", "u");

        String s = readInput(bufferedReader);

        while (!validInputList.contains(s)) {
            introWhereMove();
            s = readInput(bufferedReader);
        }
        return s;
    }

    public static void sorryWall() {
        System.out.println("Sorry wall");
    }

    public static void winning() {
        System.out.println("you win");
    }

    public static void thereIsPit(){
        System.out.println("Watch out! There's a pit ahead, jump it? (y) for jump");
    }

    public static void game(BufferedReader bufferedReader, Maze myMap) throws IOException {

        while (!myMap.didIWin()) {
            introWhereMove();
            switch (userChoice(bufferedReader)) {
                case "r":
                    if (myMap.canIMoveRight()) {
                        myMap.moveRight();
                    } else if (myMap.isThereAPit("R")) {
                        thereIsPit();
                        if (bufferedReader.readLine().equals("y")) {
                            myMap.jumpOverPit("R");
                        }
                    } else {
                        sorryWall();
                    }
                    break;
                case "l":
                    if (myMap.canIMoveLeft()) {
                        myMap.moveLeft();
                    } else if (myMap.isThereAPit("L")) {
                        thereIsPit();
                        if (bufferedReader.readLine().equals("y")) {
                            myMap.jumpOverPit("L");
                        }
                    } else {
                        sorryWall();
                    }
                    break;
                case "u":
                    if (myMap.canIMoveUp()) {
                        myMap.moveUp();
                    } else if (myMap.isThereAPit("U")) {
                        thereIsPit();
                        if (bufferedReader.readLine().equals("y")) {
                            myMap.jumpOverPit("U");
                        }
                    } else {
                        sorryWall();
                    }
                    break;
                case "d":
                    if (myMap.canIMoveDown()) {
                        myMap.moveDown();
                    } else if (myMap.isThereAPit("D")) {
                        thereIsPit();
                        if (bufferedReader.readLine().equals("y")) {
                            myMap.jumpOverPit("D");
                        } else {
                            sorryWall();
                        }
                        break;
                    }
            }
            myMap.printMap();
            myMap.didIWin();
        }
            winning();
    }
}





