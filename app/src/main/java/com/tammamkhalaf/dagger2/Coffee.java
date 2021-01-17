package com.tammamkhalaf.dagger2;

import android.util.Log;

import javax.inject.Inject;

public class Coffee {
    private static final String TAG = "Coffee";
    
    @Inject
    Farm farm;

    River river;

    int sugar;

    @Inject
    public Coffee(River river,int sugar) {
        this.river = river;
        this.sugar = sugar;
    }

    public String getCoffeeCup(){
        return farm.getBeans()+"+"+river.getWater()+" sugar: "+sugar;
    }

    @Inject
    public void connectElectricity(){
        Log.d(TAG, "--> connectElectricity: Connecting.... ");
    }
    
}
