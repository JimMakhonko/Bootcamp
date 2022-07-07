package Module1.Section6;

import java.util.Arrays;

public class lolkek {
    public static void main(String[] args) {
        String[] items = {"clock", "table", "ladder", "chair", "oven", "phone"};
        String[] moreItems = new String[6];

        for (int i = (moreItems.length - 1); i >= 1; i--) {
            if (i % 2 != 0) {
                continue;
            }
            moreItems[i] = items[i];
        }
        System.out.println(Arrays.toString(moreItems));
    }
}
