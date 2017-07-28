package com.example.amitrai.daggerdemo.ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.example.amitrai.daggerdemo.AppInitials;
import com.example.amitrai.daggerdemo.R;
import com.example.amitrai.daggerdemo.utility.AppConstants;

import javax.inject.Inject;

/**
 * Created by amitrai on 28/7/17.
 */

public class HomeActivity extends AppCompatActivity {

    @Inject
    AppConstants appConstants;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        AppInitials.getContext().getInjector().inject(this);

        TextView txt_value = findViewById(R.id.txt_value);

        txt_value.setText("injected value is " + appConstants.CUSTOM_VALUE);
    }
}
