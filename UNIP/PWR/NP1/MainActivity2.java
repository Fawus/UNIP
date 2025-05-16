package com.pedrorigobello.ddmnp1;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Spinner spinner;
    Button escolher;
    TextView textDistMin;
    TextView textDistMax;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        spinner = findViewById(R.id.planets_spinner);
        escolher = findViewById(R.id.escolher);
        textDistMin = findViewById(R.id.dist_min);
        textDistMax = findViewById(R.id.dist_max);

        String[] planetas = {
                "Venus",
                "Mars",
                "Mercury",
                "Sun",
                "Jupiter",
                "Saturn",
                "Uranus",
                "Pluto",
                "Neptune",
        };

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item, planetas);
        spinner.setAdapter(adapter);

        escolher.setOnClickListener(view -> {
            Double min_dist = -1.0, max_dist = -1.0;

            String escolhido = spinner.getSelectedItem().toString();

            if(escolhido.equals("Venus"))   {min_dist = 39.79;    max_dist = 259.71;}
            if(escolhido.equals("Mars"))    {min_dist = 55.65;    max_dist = 399.58;}
            if(escolhido.equals("Mercury")) {min_dist = 82.5;     max_dist = 216.3;}
            if(escolhido.equals("Sun"))     {min_dist = 147.0;    max_dist = 152.1;}
            if(escolhido.equals("Jupiter")) {min_dist = 591.97;   max_dist = 965.52;}
            if(escolhido.equals("Saturn"))  {min_dist = 1_204.28; max_dist = 1_652.48;}
            if(escolhido.equals("Uranus"))  {min_dist = 2_586.88; max_dist = 3_154.91;}
            if(escolhido.equals("Pluto"))   {min_dist = 4_293.37; max_dist = 7_523.53;}
            if(escolhido.equals("Neptune")) {min_dist = 4_311.02; max_dist = 4_685.02;}


            textDistMin.setText(min_dist.toString());
            textDistMax.setText(max_dist.toString());

        });


    }
}
