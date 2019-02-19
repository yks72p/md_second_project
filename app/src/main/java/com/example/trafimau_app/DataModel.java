package com.example.trafimau_app;

import android.graphics.Color;

import java.util.ArrayList;
import java.util.Random;

class DataModel {

    // TODO: change item count to 1_000
    private final int itemCount = 200;
    private final ArrayList<Integer> colors = new ArrayList<>();

    public DataModel(){
        for(int i = 0; i < itemCount; ++i){
            int color = generateColor();
            colors.add(color);
        }
    }

    private int generateColor(){
        Random random = new Random();
        return Color.rgb(
                random.nextInt(256),
                random.nextInt(256),
                random.nextInt(256)
        );
    }

    public int getItemCount(){
        return itemCount;
    }

    public Integer getColor(int position){
        if(position >= 0 && position < itemCount){
            return colors.get(position);
        }
        return null;
    }

}