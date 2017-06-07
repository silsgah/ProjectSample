package com.example.silas.parenteye;

import java.util.Random;

/**
 * Created by silas on 5/26/17.
 */

public class Academic {
    private static final Random RANDOM = new Random();

    public static int getRandomCheeseDrawable() {
        switch (RANDOM.nextInt(5)) {
            default:
            case 0:
                return R.drawable.parents;
            case 1:
                return R.drawable.parents;
            case 2:
                return R.drawable.parents;
            case 3:
                return R.drawable.parents;
            case 4:
                return R.drawable.parents;
        }
    }

    public static final String[] sCheeseStrings = {
            "Extra Classes On Mathematics", "Special French lessons for Students",
            "General Meeting for all Parents", "Four Weeks Intensive Arabic Course", "Dummy Sample For Showcase"
    };

}
