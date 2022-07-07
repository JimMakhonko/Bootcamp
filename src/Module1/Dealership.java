package Module1;

import java.util.Scanner;

public class Dealership {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the Java dealership");
        System.out.println(" - Select option 'a' to buy a car");
        System.out.println(" - Select option 'b' to sell a car");
        String option = scan.nextLine();
        switch (option) {
            case "a" -> {
                System.out.println("What's your budget?");
                int budget = scan.nextInt();
                if (budget >= 10000) {
                    System.out.println("Great, Nissan Altima is available!");
                    System.out.println("\nDou you have insurance");
                    scan.nextLine();
                    String insurance = scan.nextLine();
                    System.out.println("\nDo you have drivers licence");
                    String licence = scan.nextLine();
                    System.out.println("\nWhat's your credit score?");
                    int creditScore = scan.nextInt();
                    if (insurance.equals("yes") && licence.equals("yes") && creditScore >= 660) {
                        System.out.println("Sold! Pleasure doing business with you");
                    } else {
                        System.out.println("Sorry, You're not eligible");
                    }
                } else {
                    System.out.println("We don't sell cars under 10k, sorry");
                }
            }
            case "b" -> {
                System.out.println("\nWhat is your car valued at?");
                int value = scan.nextInt();
                System.out.println("\nWhat's your selling price?");
                int price = scan.nextInt();
                if (value > price && price <= 30000) {
                    System.out.println("\nWe'll buy your car, pleasure doing business with you!");
                } else {
                    System.out.println("Sorry, we aren't interested!");
                }
            }
            default -> System.out.println("Invalid option");
        }
        scan.close();
    }

}
