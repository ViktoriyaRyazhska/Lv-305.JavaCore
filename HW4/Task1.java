package HW4.task1;


//Oleksandr Bezborodov
//Solve the next tasks:
//1*read 3 float numbers and check: are they all belong to the range [-5,5];
//2*read 3 integer numbers and write max and min of them;
//3*read number of HTTP Error (400, 401,402, ...) and write the name of this error (Declare enum HTTPError);
public class Task1 {

    public static void main(String[] args) {
        //1st part
        float myArray[] = CreateAndCheck.createMassFloats(3);
        CreateAndCheck.floatBetweenRange(myArray,-5,5);
        //2nd part
        int myArray2[] = CreateAndCheck.createMassIntegers(3);
        CreateAndCheck.findMinMax(myArray2);
        //3rd part
        System.out.println("Enter error number!");
        CreateAndCheck.getHttpError(GetValues.getInteger());

    }


/////////////////////////////////////////////////////////////////////////////////////////////////////////////



}