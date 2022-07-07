package Module2.Section7;


import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Car[] cars = new Car[]{
                new Car("Nissan", 8500, 1999, "red", new String[]{"tires", "keys"}),
                new Car("Toyota", 5000, 2009, "black", new String[]{"tires", "keys"}),
                new Car("Nissan", 3000, 2012, "yellow", new String[]{"tires", "filter"}),
                new Car("Nissan", 7500, 1992, "black", new String[]{"tires", "filter"}),
                new Car("Honda", 7000, 2019, "orange", new String[]{"tires", "filter"}),
                new Car("Mercedes", 12000, 2015, "jet black", new String[]{"tires", "filter", "transmission"})
        };
        System.out.println("\n ****** JAVA DEALERSHIP! ****** \n");
        System.out.print("Welcome! Enter the type of car you're looking for: ");
        String userChoice = scanner.nextLine();
        System.out.println("Enter your budget: ");
        int usersBudget = scanner.nextInt();


        Dealership dealership = new Dealership(cars);
dealership.getCar(dealership.search(userChoice,usersBudget));

    }
}
