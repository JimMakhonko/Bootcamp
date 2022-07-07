package Module1.Section5;

import java.util.Scanner;

public class WhileLoops {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
    String password = " ";
    while(!password.equals("Java")){
        password = scan.nextLine();
    }
        System.out.println("Correct");
    }

}
