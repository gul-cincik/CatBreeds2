package com.example.catbreeds2;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RadioGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

public class FeaturesFragment extends Fragment {

    public int layoutId;
    public int eye_selection;




    private FirstFragment.FirstFragmentInterface featuresFragmentInterface;

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        featuresFragmentInterface = (FirstFragment.FirstFragmentInterface) context;
    }


    public FeaturesFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
        View view = inflater.inflate(layoutId, container, false);


        Button ears_button = view.findViewById(R.id.ears_button);
        if(ears_button != null){
            final RadioGroup radioGroup = view.findViewById(R.id.eyes_selection);
             ears_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                eye_selection = radioGroup.getCheckedRadioButtonId();
                featuresFragmentInterface.switchToEars(eye_selection);
            }});}

        Button face_button = view.findViewById(R.id.face_button);
        if(face_button != null){
            final RadioGroup radioGroup = view.findViewById(R.id.ears_selection);
            face_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int ears_selection;
                ears_selection = radioGroup.getCheckedRadioButtonId();
                featuresFragmentInterface.switchToFace(ears_selection);
            }});}

        Button legs_button = view.findViewById(R.id.legs_button);
        if(legs_button != null){
            final RadioGroup radioGroup = view.findViewById(R.id.face_selection);
            legs_button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    int face_selection;
                    face_selection = radioGroup.getCheckedRadioButtonId();
                    featuresFragmentInterface.switchToLegs(face_selection);
                }});}

        Button result_button = view.findViewById(R.id.result_button);
        if(result_button != null) {
            final RadioGroup radioGroup = view.findViewById(R.id.legs_selection);
            result_button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    int legs_selection;
                    legs_selection = radioGroup.getCheckedRadioButtonId();
                    featuresFragmentInterface.switchToResult(legs_selection);
                }});
        }

        return  view;
        }






}
