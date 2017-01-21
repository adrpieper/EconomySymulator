package com.sda.pieper.economysymulator;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class ArmyTest {

    @InjectMocks
    private Army army;

    @Mock
    private Population population;

    @Test
    public void countCost() {
        Mockito.when(population.getCount()).thenReturn(1000);
        assert army.countCost() == 10000;
    }

}
