package com.example.silas.parenteye.model;

import com.example.silas.parenteye.R;

import java.util.ArrayList;

/**
 * Created by silas on 6/8/17.
 */

public class Landscape {
    private int imageID;
    private String title;
    private String description;

    public int getImageID() {
        return imageID;
    }

    public void setImageID(int imageID) {
        this.imageID = imageID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public static ArrayList<Landscape> getData() {

        ArrayList<Landscape> dataList = new ArrayList<>();

        int[] images = getImages();
        String[] quiztitle = gettitles();
        String[] quizdescription = gettitledescription();
        for (int i = 0; i < images.length && i < quiztitle.length && i < quizdescription.length;i++) {
            Landscape landscape = new Landscape();
            landscape.setImageID(images[i]);
            landscape.setTitle(quiztitle[i]);
            landscape.setDescription(quizdescription[i]);
            dataList.add(landscape);
        }

        return dataList;
    }

    public static String[] gettitles(){
       String[] titles = {"Quiz", "Quiz 2", "Quiz 3","Integrated Science","Cadet","Sporting","Integrated Science",
               "Integrated Science","Integrated Science","Integrated Science","Integrated Science","Integrated Science","Integrated Science","Integrated Science","Integrated Science"};
       return titles;
    }
    public static String[] gettitledescription(){
        String[] titlesdescription = {"English Language", "Pure Mathematics", "Training On Main School Field","Inteschool Football Match","Integrated Science","Integrated Science","Integrated Science",
                "Integrated Science","Integrated Science","Integrated Science","Integrated Science","Integrated Science","Integrated Science","Integrated Science","Integrated Science"};
        return titlesdescription;
    }
    public static  int[] getImages(){
        int[] images = {
                R.drawable.thumb_1_0, R.drawable.thumb_1_1, R.drawable.thumb_1_2, R.drawable.thumb_1_3,
                R.drawable.thumb_1_4, R.drawable.thumb_1_5, R.drawable.thumb_1_6, R.drawable.thumb_1_7,
                R.drawable.thumb_1_8, R.drawable.thumb_1_9,

                R.drawable.thumb_2_0, R.drawable.thumb_2_1, R.drawable.thumb_2_2, R.drawable.thumb_2_3,
                R.drawable.thumb_2_4
        };
        return images;
    }
}
