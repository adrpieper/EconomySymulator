package com.sda.pieper.economysymulator;

import org.junit.Test;

/**
 * Created by RENT on 2017-01-19.
 */

public class PopulationText {

    @Test
    public void test() {
        Population population = new Population();

        population.setCount(4);

        assert population.getCount() == 4;
    }
}
