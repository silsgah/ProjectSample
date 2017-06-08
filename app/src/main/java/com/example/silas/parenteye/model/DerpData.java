package com.example.silas.parenteye.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by silas on 6/7/17.
 */

public class DerpData {
    private static final String[] titles = {"English Language", "Mathematics", "Integrated Science",
            "Social Studies","Religious and Moral Edu.","ICT", "French"};
    private static final String[] titlescore = {"70", "80", "90", "65", "50", "89", "79"};
    private static final String[] titlescoregrade = {"B", "B+", "A", "C", "C", "A", "B"};
    private static final String[] icons = {"1", "2", "3", "4", "5", "6", "7"};

    public static List<DerpList> getListData() {
        List<DerpList> data = new ArrayList<>();
        for (int x = 0; x < 1; x++) {
            for (int i = 0; i < titles.length && i < icons.length; i++) {
                DerpList item = new DerpList();
                item.setImageResId(icons[i]);
                item.setTitle(titles[i]);
                item.setTitlescore(titlescore[i]);
                item.setTitlescoregrade(titlescoregrade[i]);
                data.add(item);
            }

        }
        return data;
    }
}
