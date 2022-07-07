package Module1.Section4;

public class ReturnValues {
    public static void main(String[] args) {
        double measure1 = measureRectangle(4.3, 2.2, "area");
        double measure2 = measureRectangle(3.2, 4.1, "perimeter");

        stringPrinter(4.3, 2.2, measure1,"area");
        stringPrinter(3.2, 4.1, measure2,"perimeter");
    }

    private static double measureRectangle(double length, double width, String option) {
        if(length <0 || width <0){
            System.out.println("length can't be negative");
            System.exit(0);
        }
        return switch (option) {
            case "area" -> length * width;
            case "perimeter" -> 2 * (length + width);
            default -> 404;
        };
    }

    private static void stringPrinter(double length, double width, double measure, String option) {
        System.out.println("The " + option + " of a rectangle with length " + length +
                " and width " + width + " is equal to " + measure + "\n");
    }
}
