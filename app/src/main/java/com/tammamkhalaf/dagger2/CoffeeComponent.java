package com.tammamkhalaf.dagger2;

import dagger.Component;

@Component
public interface CoffeeComponent {
    Coffee getCoffee();

    void inject(MainActivity mainActivity);
}
