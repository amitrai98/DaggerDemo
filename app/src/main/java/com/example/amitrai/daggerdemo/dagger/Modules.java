package com.example.amitrai.daggerdemo.dagger;

import android.content.Context;

import com.example.amitrai.daggerdemo.utility.AppConstants;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by amitrai on 28/7/17.
 */

@Module
public class Modules {

    private String mBaseUrl;
    private Context context;

    // Constructor needs one parameter to instantiate.
    public Modules(String baseUrl, Context context) {
        this.mBaseUrl = baseUrl;
        this.context = context;
    }


    @Provides
    @Singleton
    AppConstants provideLoginRequest(){
        return new AppConstants();
    }

}
