package com.example.catbreeds2;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class FirstFragment extends Fragment {

    public interface FirstFragmentInterface{
        void switchToFeaturesFragment();
        void switchToEyes();
        void switchToEars(int id);
        void switchToFace(int id);
        void switchToLegs(int id);
        void switchToResult(int id);
    }

    private FirstFragmentInterface firstFragmentInterface;

    @Override
    public  void onAttach(@NonNull Context context){
        super.onAttach(context);
        firstFragmentInterface = (FirstFragmentInterface) context;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.first_fragment, container, false);

        Button eyes_button = view.findViewById(R.id.start_button);
        eyes_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                firstFragmentInterface.switchToEyes();
            }});



        return view;


    }
}
