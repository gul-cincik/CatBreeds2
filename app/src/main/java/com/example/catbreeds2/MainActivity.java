package com.example.catbreeds2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity implements FirstFragment.FirstFragmentInterface{

    private Fragment firstFragment = new FirstFragment();
    private  Fragment featuresFragment = new FeaturesFragment();
    private Fragment resultFragment = new ResultFragment();



    public static int eyesId;
    public static int earsId;
    public static int faceId;
    public static int legsId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        switchFragment(firstFragment);
    }

    protected void switchFragment(Fragment fragment) {

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.frame_layout, fragment);
        fragmentTransaction.commit();
    }


    @Override
    public void switchToFeaturesFragment() {
        switchFragment(featuresFragment);
    }




    public void switchToEyes() {
        featuresFragment = new FeaturesFragment();
        ((FeaturesFragment)featuresFragment).layoutId = R.layout.eyes;
        switchFragment(featuresFragment);
    }


    public void switchToEars(int id) {
        eyesId = id;
        featuresFragment = new FeaturesFragment();
        ((FeaturesFragment)featuresFragment).layoutId = R.layout.ears;
        switchFragment(featuresFragment);
    }

    public void switchToFace(int id) {
        earsId = id;
        featuresFragment = new FeaturesFragment();
        ((FeaturesFragment)featuresFragment).layoutId = R.layout.face;
        switchFragment(featuresFragment);
    }

    public void switchToLegs(int id){
        faceId = id;
        featuresFragment = new FeaturesFragment();
        ((FeaturesFragment)featuresFragment).layoutId = R.layout.legs;
        switchFragment(featuresFragment);
    }
    public void switchToResult(int id){
        legsId = id;
        featuresFragment = new FeaturesFragment();
        ((FeaturesFragment)featuresFragment).layoutId = R.layout.result;
        switchFragment(resultFragment);
    }





}
