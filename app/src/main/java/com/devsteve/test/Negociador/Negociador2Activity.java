package com.devsteve.test.Negociador;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.devsteve.test.R;

public class Negociador2Activity extends AppCompatActivity {

    private RadioGroup rbgN1, rbgN2, rbgN3;
    private RadioButton rdN1_1, rdN1_2, rdN1_3, rdN2_1, rdN2_2, rdN2_3, rdN3_1, rdN3_2, rdN3_3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_negociador2);

        //Pregunta 1
        rbgN1 = findViewById(R.id.rbg_N4);
        rdN1_1 = findViewById(R.id.rd_N4_1);
        rdN1_2 = findViewById(R.id.rd_N4_2);
        rdN1_3 = findViewById(R.id.rd_N4_3);
        rbgN1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (i){
                    case R.id.rd_N4_1:
                        break;

                    case R.id.rd_N4_2:
                        break;

                    case R.id.rd_N4_3:
                        break;
                }
            }
        });

        //Pregunta 2
        rbgN2 = findViewById(R.id.rbg_N5);
        rdN2_1 = findViewById(R.id.rd_N5_1);
        rdN2_2 = findViewById(R.id.rd_N5_2);
        rdN2_3 = findViewById(R.id.rd_N5_3);
        rbgN2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int ik) {
                switch (ik){
                    case R.id.rd_N5_1:
                        break;

                    case R.id.rd_N5_2:
                        break;

                    case R.id.rd_N5_3:
                        break;
                }
            }
        });

        //Pregunta 3
        rbgN3 = findViewById(R.id.rbg_N6);
        rdN3_1 = findViewById(R.id.rd_N6_1);
        rdN3_2 = findViewById(R.id.rd_N6_2);
        rdN3_3 = findViewById(R.id.rd_N6_3);
        rbgN3.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int ia) {
                switch (ia){
                    case R.id.rd_N6_1:
                        break;

                    case R.id.rd_N6_2:
                        break;

                    case R.id.rd_N6_3:
                        Intent intent = new Intent(Negociador2Activity.this, Negociador3Activity.class);
                        startActivity(intent);
                        break;
                }
            }
        });

    }
}