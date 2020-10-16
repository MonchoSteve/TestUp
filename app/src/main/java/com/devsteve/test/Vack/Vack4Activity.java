package com.devsteve.test.Vack;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.devsteve.test.BienvenidoActivity;
import com.devsteve.test.R;

public class Vack4Activity extends AppCompatActivity {

    private RadioGroup rbgVack1, rbgVack2, rbgVack3;
    private RadioButton rdVack1_1,rdVack1_2, rdVack1_3, rdVack2_1, rdVack2_2, rdVack2_3, rdVack3_1, rdVack3_2, rdVack3_3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vack4);

        //Pregunta 1
        rbgVack1 = findViewById(R.id.rbg_Vack10);
        rdVack1_1 = findViewById(R.id.rd_Vack10_1);
        rdVack1_2 = findViewById(R.id.rd_Vack10_2);
        rdVack1_3 = findViewById(R.id.rd_Vack10_3);
        rbgVack1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (i){
                    case R.id.rd_Vack10_1:
                        break;
                    case R.id.rd_Vack10_2:
                        break;
                    case R.id.rd_Vack10_3:
                        break;
                }
            }
        });
        //
        rbgVack2 = findViewById(R.id.rbg_Vack11);
        rdVack2_1 = findViewById(R.id.rd_Vack11_1);
        rdVack2_2 = findViewById(R.id.rd_Vack11_2);
        rdVack2_3 = findViewById(R.id.rd_Vack11_3);
        rbgVack2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (i){
                    case R.id.rd_Vack11_1:
                        break;
                    case R.id.rd_Vack11_2:
                        break;
                    case R.id.rd_Vack11_3:
                        break;
                }
            }
        });
        //
        rbgVack3 = findViewById(R.id.rbg_Vack12);
        rdVack3_1 = findViewById(R.id.rd_Vack12_1);
        rdVack3_2 = findViewById(R.id.rd_Vack12_2);
        rdVack3_3 = findViewById(R.id.rd_Vack12_3);
        rbgVack3.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (i){
                    case R.id.rd_Vack12_1:
                        break;
                    case R.id.rd_Vack12_2:
                        break;
                    case R.id.rd_Vack12_3:
                        Intent intent = new Intent(Vack4Activity.this, BienvenidoActivity.class);
                        startActivity(intent);
                        break;
                }
            }
        });
    }
}