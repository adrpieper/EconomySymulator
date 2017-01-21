package com.sda.pieper.economysymulator;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component
public interface EconomyComponent {
     State state();
     Population population();
}
