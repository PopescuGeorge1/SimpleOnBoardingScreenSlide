package com.example.simpleonboardingscreenslide;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
/*
TODO: create a ScreenSlider (no imports or dependencies)
*/
public class MainActivity extends AppCompatActivity {
    //TODO 0: activity_main -> ViewPager
    //        slider_layout -> How the slider window looks
    //TODO 1: create and initialize the following:
    private ViewPager mViewPager;
    private LinearLayout mLinearLayout;
    //TODO 2: create and initialize the adapter (more on SliderAdapter)
    private SliderAdapter sliderAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //TODO: initialize viewPager
        mViewPager = (ViewPager) findViewById(R.id.viewpager);
        //
        sliderAdapter = new SliderAdapter(this);
        //TODO: set the adapter
        mViewPager.setAdapter(sliderAdapter);
    }
}