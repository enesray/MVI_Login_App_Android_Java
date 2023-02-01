package com.raytech.mvi_login_app.view;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.raytech.mvi_login_app.ıntent.LoginIntent;

public class LoginViewModel extends ViewModel {
    private MutableLiveData<Boolean> mLoginResult = new MutableLiveData<>();
    public void processLoginIntent(LoginIntent loginIntent) {
        // Perform authentication here and set login result
        boolean result = false;
        if (loginIntent.username.equals("admin") && loginIntent.password.equals("admin1")) {
            result = true;
        }
        mLoginResult.setValue(result);
    }
    public LiveData<Boolean> loginResult() {
        return mLoginResult;
    }
}
