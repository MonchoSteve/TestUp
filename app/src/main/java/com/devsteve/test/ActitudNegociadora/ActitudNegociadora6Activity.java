package com.devsteve.test.ActitudNegociadora;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.devsteve.test.R;
import com.devsteve.test.Vack.VackActivity;

public class ActitudNegociadora6Activity extends AppCompatActivity {

    private RadioGroup rbgACN1, rbgACN2, rbgACN3;
    private RadioButton rdACN1_1, rdACN1_2, rdACN1_3, rdACN2_1, rdACN2_2, rdACN2_3, rdACN3_1, rdACN3_2, rdACN3_3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actitud_negociadora6);


        //Pregunta 1
        rbgACN1 = findViewById(R.id.rbg_ACN24);
        rdACN1_1 = findViewById(R.id.rd_ACN24_1);
        rdACN1_2 = findViewById(R.id.rd_ACN24_2);
        rdACN1_3 = findViewById(R.id.rd_ACN24_3);
        rbgACN1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (i){
                    case R.id.rd_ACN24_1:
                        break;
                    case R.id.rd_ACN24_2:
                        break;
                    case R.id.rd_ACN24_3:
                        break;
                }
            }
        });
        //Pregunta 2
        rbgACN2 = findViewById(R.id.rbg_ACN25);
        rdACN2_1 = findViewById(R.id.rd_ACN25_1);
        rdACN2_2 = findViewById(R.id.rd_ACN25_2);
        rdACN2_3 = findViewById(R.id.rd_ACN25_3);
        rbgACN2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (i){
                    case R.id.rd_ACN25_1:
                        break;
                    case R.id.rd_ACN25_2:
                        break;
                    case R.id.rd_ACN25_3:
                        Intent intent = new Intent(ActitudNegociadora6Activity.this, VackActivity.class);
                        startActivity(intent);
                        break;
                }
            }
        });
    }
}