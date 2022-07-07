package Module1.Section3.Delimiters;

import java.util.Scanner;

public class Delimiters {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter two integers (on the same line)");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        System.out.println("Enter two very big integers (on the same line)");
        long bigNum1 = scan.nextLong();
        long bigNum2 = scan.nextLong();
        System.out.println("Enter two decimals (on the same line)");
        double double1 = scan.nextDouble();
        double double2 = scan.nextDouble();
        System.out.println("Enter two text values (on the same line)");
        String str1 = scan.nextLine();
        String str2 = scan.nextLine();

        scan.close();
        System.out.println("\tIntegers: " + num1 + " " + num2);
        System.out.println("\tBig Integers: " + bigNum1 + " " + bigNum2);
        System.out.println("\tDecimals: " + double1 + " " + double2);
        System.out.println("\tText values: " + str1 + " " + str2);
    }
}
