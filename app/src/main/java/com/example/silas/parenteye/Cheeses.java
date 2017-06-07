package com.example.silas.parenteye;

import java.util.Random;

/**
 * Created by silas on 5/26/17.
 */

public class Cheeses {
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
            "Parent Association Meeting", "Academic Trip To Akosombo 23/05/2017",
            "Terminal Report On Your Ward", "Parent Contribution towards...", "Minute of PTA on 3/02/2017"
    };

}
