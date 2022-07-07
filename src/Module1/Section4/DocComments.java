package Module1.Section4;

public class DocComments {
    public static void main(String[] args) {

    }
    /*
    * Function name: greet
    *
    * Insider the function:
    *   1.Prints: 'Hi'*/
    private static void greet(){
        System.out.println("Hi");
    }
    /**
     * Function name: printText
     * @param age (String)
     * @param name (String)
     *
     *Inside the function:
     *  1.Prints the name and age as part of a text
     * */
    private static void printText(String name, String age){
        System.out.println("Hi, I'm " + name + ", and I'm " + age + " years old. ");
    }
    /**
     * Function name: calculateArea
     *
     * @param length (double)
     * @param width  (double)
     * @return       (double)
     *
     * Inside the function:
     *  1.calculates the area and returns it.
     */
    private  static double calculateArea(double length, double width){
        return length * width;
    }
}
