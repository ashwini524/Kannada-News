package com.optimuscreations.kannadanews.ui.tv9;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class HomeViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public HomeViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is tv9 fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}