package com.sda.pieper.economysymulator;


import javax.inject.Inject;

public class Economy {
    private final Army army;
    private final Population population;
    private final Buildings buildings;

    @Inject
    public Economy(Army army, Population population, Buildings buildings) {
        this.army = army;
        this.population = population;
        this.buildings = buildings;
    }

    public int countCost() {
        return army.countCost() + buildings.countCost();
    }

    public int countGain() {
        return population.countTaxes() + buildings.countProduction();
    }
}
