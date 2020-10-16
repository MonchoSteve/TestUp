package com.devsteve.test.Negociador;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.devsteve.test.ActitudNegociadora.ActitudNegociadora5Activity;
import com.devsteve.test.ActitudNegociadora.ActitudNegociadoraActivity;
import com.devsteve.test.R;

public class Negociador4Activity extends AppCompatActivity {

    private RadioGroup rbgN1, rbgN2, rbgN3;
    private RadioButton rdN1_1, rdN1_2, rdN1_3, rdN2_1, rdN2_2, rdN2_3, rdN3_1, rdN3_2, rdN3_3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_negociador4);

        //Pregunta 1
        rbgN1 = findViewById(R.id.rbg_N10);
        rdN1_1 = findViewById(R.id.rd_N10_1);
        rdN1_2 = findViewById(R.id.rd_N10_2);
        rdN1_3 = findViewById(R.id.rd_N10_3);
        rbgN1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (i){
                    case R.id.rd_N10_1:
                        break;

                    case R.id.rd_N10_2:
                        break;

                    case R.id.rd_N10_3:
                        break;
                }
            }
        });

        //Pregunta 2
        rbgN2 = findViewById(R.id.rbg_N11);
        rdN2_1 = findViewById(R.id.rd_N11_1);
        rdN2_2 = findViewById(R.id.rd_N11_2);
        rdN2_3 = findViewById(R.id.rd_N11_3);
        rbgN2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int ik) {
                switch (ik){
                    case R.id.rd_N11_1:
                        break;

                    case R.id.rd_N11_2:
                        break;

                    case R.id.rd_N11_3:
                        break;
                }
            }
        });

        //Pregunta 3
        rbgN3 = findViewById(R.id.rbg_N12);
        rdN3_1 = findViewById(R.id.rd_N12_1);
        rdN3_2 = findViewById(R.id.rd_N12_2);
        rdN3_3 = findViewById(R.id.rd_N12_3);
        rbgN3.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int ia) {
                switch (ia){
                    case R.id.rd_N12_1:
                        break;

                    case R.id.rd_N12_2:
                        break;

                    case R.id.rd_N12_3:
                        Intent intent = new Intent(Negociador4Activity.this, ActitudNegociadoraActivity.class);
                        startActivity(intent);
                        break;
                }
            }
        });
    }
}