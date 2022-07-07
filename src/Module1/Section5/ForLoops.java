package Module1.Section5;

import java.util.Scanner;

public class ForLoops {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
        System.out.print("Hi Timmy! Choose a number to count to: ");
        int number = scan.nextInt();
        print(number);
    }
private static void print(int number){
    System.out.println("Great! Here's how it's done");
for(int i =0; i <= number; i++){
    System.out.print(i + " ");
}
}
}
