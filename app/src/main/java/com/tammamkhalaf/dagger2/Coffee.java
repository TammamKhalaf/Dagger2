package com.tammamkhalaf.dagger2;

import android.util.Log;

import javax.inject.Inject;

public class Coffee {
    private static final String TAG = "Coffee";
    
    @Inject
    Farm farm;

    River river;

    @Inject
    public Coffee(River river) {
        this.river = river;
    }

    public String getCoffeeCup(){
        return farm.getBeans()+"+"+river.getWater();
    }

    @Inject
    public void connectElectricity(){
        Log.d(TAG, "--> connectElectricity: Connecting.... ");
    }
    
}
