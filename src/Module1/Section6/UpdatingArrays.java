package Module1.Section6;

import java.util.Arrays;

public class UpdatingArrays {
    public static void main(String[] args) {
        String[] menu = {"Espresso", "Iced coffee", "Macchiato"};
        menu[2] = "Latte";
        System.out.println(Arrays.toString(menu));

        String[] newMenu = new String[5];
        for (int i = 0; i < menu.length; i++) {
            newMenu[i] = menu[i];
            System.out.println(i + ". " + menu[i]);
        }
        newMenu[3] = "House Blend";
        newMenu[4] = "Cold Brew";
        System.out.println("The new arr");
        System.out.println(Arrays.toString(newMenu));
    }

}
