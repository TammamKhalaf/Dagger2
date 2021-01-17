package com.tammamkhalaf.dagger2;

import android.app.Application;

public class MainApplication extends Application {

    private CoffeeComponent coffeeComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        CoffeeComponent component = DaggerCoffeeComponent.builder().sugar(3).milk(5).build();
    }

    public CoffeeComponent getCoffeeComponent() {
        return coffeeComponent;
    }
}
