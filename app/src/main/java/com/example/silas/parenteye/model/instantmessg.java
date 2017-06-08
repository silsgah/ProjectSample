package com.example.silas.parenteye.model;

import com.example.silas.parenteye.R;

import java.util.ArrayList;

/**
 * Created by silas on 6/8/17.
 */

public class instantmessg {
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

    public static ArrayList<instantmessg> getData() {

        ArrayList<instantmessg> dataList = new ArrayList<>();

        int[] images = getImages();
        String[] quiztitle = gettitles();
        String[] quizdescription = gettitledescription();
        for (int i = 0; i < images.length && i < quiztitle.length && i < quizdescription.length;i++) {
            instantmessg instantmgg = new instantmessg();
            instantmgg.setImageID(images[i]);
            instantmgg.setTitle(quiztitle[i]);
            instantmgg.setDescription(quizdescription[i]);
            dataList.add(instantmgg);
        }
        return dataList;
    }

    public static String[] gettitles(){
        String[] titles = {"School Fees", "End of Term", "Quiz 3"};
        return titles;
    }
    public static String[] gettitledescription(){
        String[] titlesdescription = {"Payment must be made before end of July, 2017", "The School will be going on vacation by 20 August, 2017"};
        return titlesdescription;
    }
    public static  int[] getImages(){
        int[] images = { R.drawable.thumb_2_3,
                R.drawable.thumb_2_4
        };
        return images;
    }
}
