package HW4.task1;

//Oleksandr Bezborodov
public class CreateAndCheck {

    //Checking is that float are belong to the range (min\max)
    public static void floatBetweenRange(int value, float min, float max) {
        if (value >= min && value <= max) {
            System.out.println("This value is between " + min + " / " + max);
        } else {
            System.out.println("Value : " + value + ". This value is NOT between " + min + " / " + max);
        }
    }

    //Checking is that Mass of floats are belong to the range each  ||| (min\max)
    public static void floatBetweenRange(float mass[], float min, float max) {
        for (int i = 0; i < mass.length; i++) {
            if (mass[i] >= min && mass[i] <= max) {
                System.out.println("Value : " + mass[i] + ". This value is between " + min + " / " + max);
            } else {
                System.out.println("Value : " + mass[i] + ". This value is NOT between " + min + " / " + max);
            }
        }

    }

    // In this method we create all integers how much we need.
    public static int[] createMassIntegers(int howMuchIntegers) {
        int mass[] = new int[howMuchIntegers];

        for (int i = 0; i < mass.length; i++) {
            mass[i] = GetValues.getInteger();
        }
        return mass;
    }

    // In this method we create all floats how much we need.
    public static float[] createMassFloats(int howMuchFloats) {
        float mass[] = new float[howMuchFloats];

        for (int i = 0; i < mass.length; i++) {
            mass[i] = GetValues.getFloat();
        }
        return mass;
    }

    //__Searching min and max values in array
    public static void findMinMax(int[] array) {
        int maxValue = array[0];
        int minValue = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > maxValue) {
                maxValue = array[i];
            } else if (array[i] < minValue) {
                minValue = array[i];
            }
        }
        System.out.println("Max value is : " + maxValue + " Min value is : " + minValue);
    }

    //In this method we should find an HTTP Error
    public static void getHttpError(int errorNumber) {

        switch (errorNumber) {
            case 400:
                System.out.println(HTTPError.BadRequest);
            break;
            case 401:
                System.out.println(HTTPError.Unauthorized);
            break;
            case 402:
                System.out.println(HTTPError.PaymentRequired);
            break;
            case 403:
                System.out.println(HTTPError.Forbidden);
            break;
            case 404:
                System.out.println(HTTPError.NotFound);
            break;
            default:
                System.out.println("We don't know that type of errors :( ");

        }

    }


}
