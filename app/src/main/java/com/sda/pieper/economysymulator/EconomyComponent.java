package com.sda.pieper.economysymulator;

import dagger.Component;

@Component
public interface EconomyComponent {
     State state();
     Population population();
}
