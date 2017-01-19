package com.sda.pieper.economysymulator;

import org.junit.Test;

/**
 * Created by RENT on 2017-01-19.
 */

public class IntegrationTest {


    @Test
    public void test() {

        Population population = new Population();
        Army army = new Army(population);
        Buildings buildings = new Buildings();
        Economy economy = new Economy(army, population, buildings);
        State state = new State(economy);
        population.setCount(1000);
        System.out.println(state.getGold());
        state.countBalance();
        System.out.println(state.getGold());
    }
}
