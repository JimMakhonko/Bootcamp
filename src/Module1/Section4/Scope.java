package Module1.Section4;

public class Scope {
    static int dog = 5;
    public static void main(String[] args) {
    someFunc();
        System.out.println(dog);
    }
    public static void someFunc(){
        int apples = 5;
        System.out.println(apples);
    }
}
