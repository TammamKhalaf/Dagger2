package com.tammamkhalaf.dagger2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    private AppComponent appComponent;

    @Inject
    Coffee coffee,coffee2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AppComponent component = ((MainApplication) getApplication()).getAppComponent();

        CoffeeComponent coffeeComponent = component.getCoffeeComponentBuilder().milk(5).sugar(4).build();
        coffeeComponent.inject(this);

        Log.d(TAG, "--> Coffee : "
                +"\ncoffee 1: "+coffee+
                 "\ncoffee 2: "+coffee2
                +"\nriver for coffee 1 "+coffee.river+
                 "\nriver for coffee 2 "+coffee2.river
        );

    }
}