package com.tammamkhalaf.dagger2;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = RiverModule.class)
public interface AppComponent {
    CoffeeComponent.Builder getCoffeeComponentBuilder();
}
