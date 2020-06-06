package com.wordpress.smartedudotin.www.viewmodellivedatalearn.ViewModel;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ScoreViewModel extends ViewModel {

    private MutableLiveData<Integer> score;

    public MutableLiveData<Integer> getScore(){
       if (score ==null){
           score = new MutableLiveData<>();
           score.setValue (0);
       }
       return score;
    }
//    private Integer score;
//    public Integer getScore(){
//        if (score==null){
//            score =0;
//        }
//        return score;
//    }
//
    public void addScore(){
        if (score.getValue ()==null){

            score.setValue (0);
        }
        score.setValue (score.getValue ()+1);

    }
    public void resetScore(){
     score.setValue (0);
    }

}
