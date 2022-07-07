package Module2.Section7;

import java.util.Arrays;
import java.util.Scanner;

public class Dealership {
    Scanner scanner = new Scanner(System.in);
    private final Car[] cars;

    public Dealership(Car[] cars) {
        this.cars = new Car[cars.length];
        for (int i = 0; i < cars.length; i++) {
            this.cars[i] = new Car(cars[i]);
        }
    }

    public void setCar(Car car, int index) {
        this.cars[index] = new Car(car);
    }

    public void getCar(int index) {
        new Car(this.cars[index]);
    }

    public void sell(int index) {
        this.cars[index].drive();
        this.cars[index] = null;
    }

    public int search(String make, int budget) {
        for (int i = 0; i < cars.length; i++) {

            if (this.cars[i].getMake().equals(make) && this.cars[i].getPrice() <= budget) {
                System.out.println("\nWe found a car in spot " + i + "\n\n" + this.cars[i].toString());
                System.out.println("if you're interested type 'yes'");

                String answer = scanner.nextLine();
                if (answer.equals("yes"))
                    sell(i);
            } else {
                System.out.println("\nYour search didn't match any results.\n");
                System.out.println("Feel free to browse through our collection of cars.\\n");
                return i;
            }
        }
        return 0;
    }

/*
    public String search(String make, int budget) {
        for (int i = 0; i < this.cars.length; i++) {
            if (this.cars[i] == null) {
                continue;
            } else if (this.cars[i].getMake().equals(make) && this.cars[i].getPrice() <= budget) {
                return "\nWe found one in spot " + i + "\n" + this.cars[i].toString() + "\nAre you interested?";
            }
        }
        return "Sorry, we couldn't find any cars according to your requirements.";
    }
*/

    public String toString() {
        String temp = "";
        for (int i = 0; i < this.cars.length; i++) {
            temp += "Parking Spot: " + i + "\n";
            if (this.cars[i] == null) {
                temp += "Empty\n";
            } else {
                temp += this.cars[i].toString() + "\n";
            }
        }
        return temp;
    }
}
