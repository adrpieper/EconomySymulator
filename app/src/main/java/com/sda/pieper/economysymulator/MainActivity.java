package com.sda.pieper.economysymulator;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView goldTextView = (TextView) findViewById(R.id.gold_text_view);
        Button button = (Button) findViewById(R.id.count_button);
        /*
        Ten kod tworzy nam potrzebne drzewo klas
         */

        EconomyComponent economyComponent = DaggerEconomyComponent.create();
        final State state = economyComponent.state();
        Population population = economyComponent.population();
        population.setCount(1000);

        goldTextView.setText(Integer.toString(state.getGold()));

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                state.countBalance();
                goldTextView.setText(Integer.toString(state.getGold()));
            }
        });
    }
}
