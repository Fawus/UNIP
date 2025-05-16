package com.pedrorigobello.ddmnp1;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private TextView textResultado;
    private EditText epeso;
    private EditText ealtura;
    private spinner spinnerExample;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        // Inicialização dos elementos de interface
        textResultado = findViewById(R.id.textResultado);
        epeso = findViewById(R.id.epeso);
        ealtura = findViewById(R.id.ealtura);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void calcularImc(View view) {

        double peso = Double.parseDouble(epeso.getText().toString());
        double altura = Double.parseDouble(ealtura.getText().toString());
        double resultado =  peso / (altura * altura);

        if (resultado <19){
            textResultado.setText("Abaixo do peso!");


        }else if (resultado <= 19 || resultado < 25){

            textResultado.setText("Peso normal!");



        }else if (resultado <= 25 || resultado < 30){

            textResultado.setText("Acima do peso!");

        }else if (resultado <= 30 || resultado < 40){

        textResultado.setText("Obesidade tipo 1!");

    }else if (resultado >= 40 ){

            textResultado.setText("Obesidade tipo 2!");}
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);  // Verifique se esse é o layout correto

            Spinner spinnerExample = findViewById(R.id.spinnerExample);

            // Cria o adapter com o array definido no strings.xml
            ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(
                    this,
                    R.array.dropdown_options,
                    android.R.layout.simple_spinner_item
            );
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            spinnerExample.setAdapter(adapter);
        }
    }


