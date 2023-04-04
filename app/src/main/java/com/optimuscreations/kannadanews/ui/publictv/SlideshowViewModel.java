package com.optimuscreations.kannadanews.ui.publictv;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class SlideshowViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public SlideshowViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is publivtv fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}