package com.theironyard;


public class Main {

    public static void main(String[] args) {
        System.out.println("This is the main method");

        try {
            boolean oddForMe = isOddUnder50(45);
            System.out.println(oddForMe);

        } catch (BadInputException ex) {
            ex.printStackTrace();
        }

        System.out.println(sum3Numbers(3,3,3));
    }

    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    public static boolean isOdd(int num) {
        return num % 2 != 0;
    }

    public static boolean isOddUnder50(int num) throws BadInputException {
        if(num >= 50) {
            throw new BadInputException();
        }

        return num % 2 != 0;
    }

    public static int sum3Numbers (int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }

    public static boolean isMultipleOf3 (int num) {
        return num % 3 == 0;
    }

}
