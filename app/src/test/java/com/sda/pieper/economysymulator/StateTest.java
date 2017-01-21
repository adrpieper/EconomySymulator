package com.sda.pieper.economysymulator;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class StateTest {

    /*
    Wstrzykujemy zamokowane objekty do klasy state, by móc z nich korzystać
     */
    @InjectMocks
    private State state;

    /*
    Mokujemy objekt Economy, ponieważ state jest od niego zależny (korzystasta z jego metod)
     */
    @Mock
    private Economy economy;

    @Test
    public void countBalanceTest() {
        Mockito.when(economy.countCost()).thenReturn(100);
        Mockito.when(economy.countGain()).thenReturn(10000);
        int gold = state.getGold();
        state.countBalance();
        assert state.getGold() == 10000-100+gold;
    }
}
