/*
Create method div(), which calculates the dividing of two double
        numbers. In main method input 2 double numbers and call this
        method. Catch all exceptions.*/


import java.util.InputMismatchException;

public class Div {
    public static double div(double a, double b) {
        return a / b;
    }

    public static void main(String[] args) throws Exception {
        try {
            double a = 1;
            double b = 0;
            if(b==0){
                System.out.println ("Catch the Error"+ div (a,b));
            }

        } catch (InputMismatchException e) {
            System.out.println ("Error" );
        }

    }


}
