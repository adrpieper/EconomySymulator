package com.sda.pieper.economysymulator;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class EconomyTest {

    @InjectMocks
    Economy economy;

    @Mock
    Army army;

    @Mock
    Buildings buildings;

    @Mock
    Population population;

    @Test
    public void testCount(){
        when(army.countCost()).thenReturn(2);
        when(buildings.countCost()).thenReturn(10);
        assert economy.countCost() == 12;

    }



}
