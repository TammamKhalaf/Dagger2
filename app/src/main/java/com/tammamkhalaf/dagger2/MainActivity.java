package com.tammamkhalaf.dagger2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    @Inject
    Coffee coffee;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CoffeeComponent component = ((MainApplication) getApplication()).getCoffeeComponent();
        component.inject(this);

        Log.d(TAG, "--> Coffee : "+coffee.getCoffeeCup()+" coffee no"+coffee);

    }
}