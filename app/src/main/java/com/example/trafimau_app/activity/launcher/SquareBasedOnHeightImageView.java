package com.example.trafimau_app.activity.launcher;

import android.content.Context;
import android.util.AttributeSet;

public class SquareBasedOnHeightImageView extends android.support.v7.widget.AppCompatImageView {

    public SquareBasedOnHeightImageView(Context context) {
        super(context);
    }

    public SquareBasedOnHeightImageView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public SquareBasedOnHeightImageView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int min = Math.min(widthMeasureSpec, heightMeasureSpec);
        super.onMeasure(min, min);
    }
}