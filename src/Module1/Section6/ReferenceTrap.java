package Module1.Section6;

import java.util.Arrays;

public class ReferenceTrap {
    public static void main(String[] args) {
/*        int[] numbers = {1,2,3};
        int[] numbers2 = Arrays.copyOf(numbers,numbers.length);
        numbers2[1] = 5;
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(numbers2));*/
        String[] items = {"clock", "table", "ladder", "chair", "oven", "phone"};
        function(items);
        System.out.println(items[0]);
    }
    public static void function(String[] items) {
        String[] moreItems = Arrays.copyOf(items, items.length);
        moreItems[0] = "bed";
    }
}
