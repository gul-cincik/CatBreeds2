package com.example.catbreeds2;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import java.util.ArrayList;
import java.util.List;

public class ResultFragment extends Fragment {
    public  int layoutId;
    public String foundBreed = "No Result";

    private FirstFragment.FirstFragmentInterface resultFragmentInterface;

    @Override
    public void onAttach(@NonNull Context context){
        super.onAttach(context);
        resultFragmentInterface = (FirstFragment.FirstFragmentInterface) context;
    }

    public ResultFragment(){

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.result, container, false);
        TextView breed = view.findViewById(R.id.foundBreed);
        String breedString = Breed();
        breed.setText(breedString);
        return view;

    }

    public String Breed(){
        List<Integer[]> breeds = new ArrayList<>();
        List<String> breedNames = new ArrayList<>();
        List<Integer> breedScores = new ArrayList<>();

        Integer[] oriental = new Integer[]{R.id.yellow_eyes, R.id.oriental_ears, R.id.peterbald_face, R.id.long_legs};
        breeds.add(oriental);
        breedNames.add("Oriental");
        breedScores.add(0);

        Integer[] scottish = new Integer[]{R.id.orange_eyes, R.id.scottish_ears, R.id.scottşsh_face, R.id.short_legs};
        breeds.add(scottish);
        breedNames.add("Scottish");
        breedScores.add(0);

        Integer[] siamese = new Integer[]{R.id.blue_eyes, R.id.siyam_ears, R.id.siyam_face, R.id.long_legs};
        breeds.add(siamese);
        breedNames.add("Siamese");
        breedScores.add(0);

        Integer[] abyssinian = new Integer[]{R.id.orange_eyes, R.id.habes_ears, R.id.siyam_face, R.id.long_legs};
        breeds.add(abyssinian);
        breedNames.add("Abyssinian");
        breedScores.add(0);

        Integer[] peterbald = new Integer[]{R.id.green_eyes, R.id.peterbald_ears, R.id.peterbald_face, R.id.long_legs};
        breeds.add(peterbald);
        breedNames.add("Peterbald");
        breedScores.add(0);

        Integer[] sphynx = new Integer[]{R.id.blue_eyes, R.id.sphynx_ears, R.id.sphynx_face, R.id.long_legs};
        breeds.add(sphynx);
        breedNames.add("Sphynx");
        breedScores.add(0);

        Integer[] american = new Integer[]{R.id.yellow_eyes, R.id.american_ears, R.id.tekir_face, R.id.long_legs};
        breeds.add(american);
        breedNames.add("American");
        breedScores.add(0);

        Integer[] bombay = new Integer[]{R.id.orange_eyes, R.id.bombay_ears, R.id.bombay_face, R.id.normal_legs};
        breeds.add(bombay);
        breedNames.add("Bombay");
        breedScores.add(0);

        Integer[] ankara = new Integer[]{R.id.van_eyes, R.id.ankara_ears, R.id.ankara_face, R.id.normal_legs};
        breeds.add(ankara);
        breedNames.add("Ankara");
        breedScores.add(0);

        Integer[] british = new Integer[]{R.id.orange_eyes, R.id.british_ears, R.id.british_face, R.id.short_legs};
        breeds.add(british);
        breedNames.add("British");
        breedScores.add(0);

        Integer[] ragdoll = new Integer[]{R.id.blue_eyes, R.id.siyam_ears, R.id.ragdoll_face, R.id.normal_legs};
        breeds.add(ragdoll);
        breedNames.add("Ragdoll");
        breedScores.add(0);

        Integer[] persian = new Integer[]{R.id.yellow_eyes, R.id.iran_ears, R.id.fars_face, R.id.short_legs};
        breeds.add(persian);
        breedNames.add("Persian");
        breedScores.add(0);

        for(int i = 0; i < breeds.size(); i++){
            if(MainActivity.eyesId == R.id.yellow_eyes && MainActivity.earsId == R.id.iran_ears && MainActivity.faceId == R.id.fars_face && MainActivity.legsId == R.id.short_legs){
                foundBreed = "Persian";
            }
            if(MainActivity.eyesId == R.id.blue_eyes && MainActivity.earsId == R.id.siyam_ears && MainActivity.faceId == R.id.ragdoll_face && MainActivity.legsId == R.id.normal_legs ){
                foundBreed = "Ragdoll";
            }
            if(MainActivity.eyesId == R.id.orange_eyes && MainActivity.earsId == R.id.british_ears && MainActivity.faceId == R.id.british_face && MainActivity.legsId == R.id.short_legs){
                foundBreed = "British";
            }
            if(MainActivity.eyesId == R.id.yellow_eyes && MainActivity.earsId == R.id.oriental_ears && MainActivity.faceId == R.id.peterbald_face && MainActivity.legsId == R.id.long_legs){
                foundBreed = "Oriental";
            }

            if(MainActivity.eyesId == R.id.orange_eyes && MainActivity.earsId == R.id.bombay_ears && MainActivity.faceId == R.id.bombay_face && MainActivity.legsId == R.id.normal_legs){
                foundBreed = "Bombay";
            }
            if(MainActivity.eyesId == R.id.van_eyes && MainActivity.earsId == R.id.ankara_ears && MainActivity.faceId == R.id.ankara_face && MainActivity.legsId == R.id.normal_legs){
                foundBreed = "Ankara";
            }
            if(MainActivity.eyesId == R.id.orange_eyes && MainActivity.earsId == R.id.scottish_ears && MainActivity.faceId == R.id.scottşsh_face && MainActivity.legsId == R.id.short_legs){
                foundBreed = "Scottish";
            }
            if(MainActivity.eyesId == R.id.yellow_eyes && MainActivity.earsId == R.id.american_ears && MainActivity.faceId == R.id.tekir_face && MainActivity.legsId == R.id.long_legs){
                foundBreed = "American";
            }
            if(MainActivity.eyesId == R.id.blue_eyes && MainActivity.earsId == R.id.sphynx_ears && MainActivity.faceId == R.id.sphynx_face && MainActivity.legsId == R.id.long_legs){
                foundBreed = "Sphynx";
            }
            if(MainActivity.eyesId == R.id.green_eyes && MainActivity.earsId == R.id.peterbald_ears && MainActivity.faceId == R.id.peterbald_face && MainActivity.legsId == R.id.long_legs){
                foundBreed = "Peterbald";
            }
            if(MainActivity.eyesId == R.id.orange_eyes && MainActivity.earsId == R.id.habes_ears && MainActivity.faceId == R.id.siyam_face && MainActivity.legsId == R.id.long_legs){
                foundBreed = "Abyssinian";
            }
            if(MainActivity.eyesId == R.id.blue_eyes && MainActivity.earsId == R.id.siyam_ears && MainActivity.faceId == R.id.siyam_face && MainActivity.legsId == R.id.long_legs){
                foundBreed = "Siamese";
            }
        }

        for(int i = 0; i < breeds.size(); i++){
            int currentScore = breedScores.get(i);
            if(breeds.get(i)[0] == MainActivity.eyesId){
                breedScores.set(i, currentScore + i);
            }
            if(breeds.get(i)[1] == MainActivity.earsId){
                breedScores.set(i, currentScore + i);
            }
            if(breeds.get(i)[2] == MainActivity.faceId){
                breedScores.set(i, currentScore + i);
            }
            if (breeds.get(i)[3] == MainActivity.legsId){
                breedScores.set(i, currentScore + i);
            }
        }


        int maxIndex = 0;
        int maxValue = -1;
        for (int i = 0; i < breedScores.size(); i++){
            int currentScore = breedScores.get(i);
            if (currentScore > maxValue) {
                maxValue = currentScore;
                maxIndex = i;
            }
        }

        String foundBreed = breedNames.get(maxIndex);
        return foundBreed;
    }




}
