package com.tammamkhalaf.dagger2;

import android.util.Log;

import javax.inject.Inject;

public class River {
    private static final String TAG = "River";

    public River() {
        Log.d(TAG, "--> River: ");
    }

    public String getWater(){
        return "water";
    }
}
