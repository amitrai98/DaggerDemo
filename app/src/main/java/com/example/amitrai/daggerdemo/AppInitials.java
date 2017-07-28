package com.example.amitrai.daggerdemo;

import android.app.Application;

import com.example.amitrai.daggerdemo.dagger.DaggerInjector;
import com.example.amitrai.daggerdemo.dagger.Injector;
import com.example.amitrai.daggerdemo.dagger.Modules;
import com.example.amitrai.daggerdemo.utility.AppConstants;

/**
 * Created by amitrai on 28/7/17.
 */

public class AppInitials extends Application {

    /**
     * The Injector.
     */
    Injector injector;

    private static AppInitials context;

    private String Base_url = " test url";

    @Override
    public void onCreate() {
        super.onCreate();

        context = this;

        injector = DaggerInjector.builder()
                .modules(new Modules(AppConstants.CUSTOM_VALUE, this))
                .build();

    }

    /**
     * Gets injector.
     *
     * @return the injector
     */
    public Injector getInjector() {
        return injector;
    }


    /**
     * Get context app initials.
     *
     * @return the app initials
     */
    public static AppInitials getContext(){
        return  context;
    }
}
