package com.example.amitrai.daggerdemo.dagger;

import com.example.amitrai.daggerdemo.ui.HomeActivity;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by amitrai on 28/7/17.
 */

@Singleton
@Component(modules={Modules.class})
public interface Injector {
    void inject(HomeActivity activity);
}

