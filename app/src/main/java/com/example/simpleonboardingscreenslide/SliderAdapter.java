package com.example.simpleonboardingscreenslide;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

public class SliderAdapter extends PagerAdapter {
    //TODO 2.1: Create the following
    Context context;
    LayoutInflater layoutInflater;

    //TODO 2.2: Initialize the Context
    public SliderAdapter(Context context) {
        this.context = context;
    }

    //Array Example To Display
    public String[] slideImages={"PAGE1","PAGE2","PAGE3"};
    //

    @Override
    public int getCount() {
        //Return array length
        return slideImages.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        //compare to our object
        return view==(RelativeLayout) object;
    }


    //TODO
    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        //TODO: initialize inflater + create View for the slide_layout
        layoutInflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.slide_layout, container, false);
        //Initialize slide_layout elements
        TextView text = (TextView) view.findViewById(R.id.someText);
        //set their content according to the position in array
        text.setText(slideImages[position]);
        //TODO: don't forget this
        container.addView(view);
        return view;
    }
    //Recommended: Destroy item when you are done with it: save resources
    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((RelativeLayout)object);
    }
}
