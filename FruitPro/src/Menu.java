import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.util.*;
import java.util.List;
import java.util.stream.Collectors;

public class Menu extends Fruit {
    public Menu() {
        super ( );
    }

    public static void main(String[] args) {


        Scanner in = new Scanner ( System.in );
        System.out.println ( (char) 27 + "[01;32m        Menu | " +
                "" +
                "                  \n 1.     All Fruit  " +
                "                \n 2.     Choose Fruit " +
                "                \n 3.     Sorted Fruit  " +

                "                 \n 4.     Print from fire to console " +

                "                \n 5.     Print from console to file " +
                "               \n _____________________________________ )" + (char) 27 + "[00;00m" );
        System.out.println ( );
        System.out.println ( "|  0.     Exit" );
        int menuItem = 0;
        List<Citrus> fruits = new ArrayList<> ( );
        fruits.add ( new Citrus ( "Banana" , "Yellow" , 10 ) );
        fruits.add ( new Citrus ( "Orange" , "Orange" , 60 ) );
        fruits.add ( new Citrus ( "Lemon" , "Lemon" , 40 ) );
        fruits.add ( new Citrus ( "Apple" , "Red" , 13 ) );
        fruits.add ( new Citrus ( "Pineapple" , "Yellow" , 20 ) );


        do try {
            System.out.print ( "Choose item: ");
            menuItem = in.nextInt ( );

            switch (menuItem) {

                case 1: // work photo fruit

                    System.out.println ( fruits );
                    JFrame frame1 = new JFrame ( );
                    ImageIcon icon1 = new ImageIcon ( "Fruit.jpg" );
                    JLabel label12 = new JLabel ( icon1 );
                    frame1.add ( label12 );
                    frame1.setDefaultCloseOperation
                            ( JFrame.EXIT_ON_CLOSE );
                    frame1.pack ( );
                    frame1.setVisible ( true );
                    break;

                case 2://work photo many fruit

                    JFrame.setDefaultLookAndFeelDecorated ( true );
                    JFrame frame = new JFrame ( );
                    frame.setTitle ( "JLabel Test" );
                    frame.setLayout ( new FlowLayout ( ) );
                    frame.setDefaultCloseOperation ( JFrame.EXIT_ON_CLOSE );
                    ImageIcon imageIcon = new ImageIcon ( "banana.jpg" );
                    ImageIcon imageIcon1 = new ImageIcon ( "apple.jpg" );
                    ImageIcon imageIcon2 = new ImageIcon ( "orange.jpg" );
                    ImageIcon imageIcon3 = new ImageIcon ( "lemon.jpg" );
                    ImageIcon imageIcon4 = new ImageIcon ( "pineapple.jpg" );

                    JLabel label = new JLabel ( imageIcon , SwingConstants.LEFT );
                    JLabel label1 = new JLabel ( imageIcon1 , SwingConstants.CENTER );
                    JLabel label2 = new JLabel ( imageIcon2 , SwingConstants.CENTER );
                    JLabel label3 = new JLabel ( imageIcon3 , SwingConstants.CENTER );
                    JLabel label4 = new JLabel ( imageIcon4 , SwingConstants.CENTER );

                    frame.add ( label );
                    frame.add ( label1 );
                    frame.add ( label2 );
                    frame.add ( label3 );
                    frame.add ( label4 );
                    frame.pack ( );
                    frame.setVisible ( true );

                    Scanner sc = new Scanner ( System.in );
                    System.out.println ( "Choose fruit: \n 1.Banana \n 2.Orange \n 3.Lemon \n 5.Apple \n 6.Pineapple " );
                    fruits.stream ( ).forEach ( fruit -> System.out.println ( fruits.get ( sc.nextInt ( ) - 1 ) ) );

                case 3: ///work sorted
                    JFrame frame2 = new JFrame ( );
                    ImageIcon icon2 = new ImageIcon ( "sort.jpg" );
                    JLabel label6 = new JLabel ( icon2 );
                    frame2.add ( label6 );
                    frame2.setDefaultCloseOperation
                            ( JFrame.EXIT_ON_CLOSE );
                    frame2.pack ( );
                    frame2.setVisible ( true );

                    Scanner sc1 = new Scanner ( System.in );
                    System.out.println ( "Sort Fruit \n " +
                            "1.Sort by name " +
                            " \n 2.Sort by Vitamin C " +
                            " \n 3.Sort by Color\n " +
                            "5.Sort by Yellow color" +
                            " \n 6.Pineapple " );

                    switch (sc1.nextInt ( )) {
                        case 1:
                            fruits.sort ( Comparator.comparing ( Fruit::getName ) );
                            System.out.println ( "Sorted by name" + fruits );
                            sc1.nextInt ( );

                        case 2:
                            fruits.sort ( Comparator.comparingInt ( Citrus::getVitaminC ) );
                            System.out.println ( "Sorted by VitaminC" + fruits );
                            sc1.nextInt ( );

                        case 3:
                            fruits.sort ( (Comparator.comparing ( Fruit::getColor )) );
                            System.out.println ( "Sorted by Color" + fruits );
                            sc1.nextInt ( );
                        case 4:
                            List sortYellow = fruits.stream ( ).filter ( line1 -> "Yellow".equals ( line1.getColor ( ) ) ).collect ( Collectors.toList ( ) );
                            System.out.println ( "Sorted by Yellow color" + sortYellow );
                            System.out.println ( menuItem );
                        case 0:
                            break;
                    }


                case 4: ///work


                    BufferedReader br = new BufferedReader ( new FileReader ( "fruit.txt" ) );
                    String line = null;
                    while ((line = br.readLine ( )) != null) {
                        System.out.println ( line );
                    }


                    break;
                case 5:


                    PrintStream console = System.out;
                    File file = new File ( "1.txt" );
                    FileOutputStream fos = new FileOutputStream ( file );
                    PrintStream ps = new PrintStream ( fos );
                    Scanner sc2 = new Scanner ( System.in );

                        System.out.println ( "Choose fruit: \n 1.Banana \n 2.Orange \n 3.Lemon \n 5.Apple \n 6.Pineapple " );
                        System.setOut ( ps );

                        fruits.stream ( ).forEach ( fruit -> System.out.println ( fruits.get ( sc2.nextInt ( ) - 1 ) ) );
                        System.setOut ( console );
break;

case 0:
    System.out.println ("By" );
break;




            }
        } catch (FileNotFoundException e) {
            System.out.println ( );
        } catch (IndexOutOfBoundsException e) {
            System.out.println ( "Choose number " );
        } catch (InputMismatchException e) {
            System.out.println ( "Bad choices" );

        } catch (IOException e) {
            e.printStackTrace ( );
        } while (menuItem != 0);
        System.out.println ( "By" );

    }

}
