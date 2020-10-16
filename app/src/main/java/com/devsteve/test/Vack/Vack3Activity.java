package com.devsteve.test.Vack;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.devsteve.test.R;

public class Vack3Activity extends AppCompatActivity {

    private RadioGroup rbgVack1, rbgVack2, rbgVack3;
    private RadioButton rdVack1_1,rdVack1_2, rdVack1_3, rdVack2_1, rdVack2_2, rdVack2_3, rdVack3_1, rdVack3_2, rdVack3_3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vack3);

        //Pregunta 1
        rbgVack1 = findViewById(R.id.rbg_Vack7);
        rdVack1_1 = findViewById(R.id.rd_Vack7_1);
        rdVack1_2 = findViewById(R.id.rd_Vack7_2);
        rdVack1_3 = findViewById(R.id.rd_Vack7_3);
        rbgVack1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (i){
                    case R.id.rd_Vack7_1:
                        break;
                    case R.id.rd_Vack7_2:
                        break;
                    case R.id.rd_Vack7_3:
                        break;
                }
            }
        });
        //
        rbgVack2 = findViewById(R.id.rbg_Vack8);
        rdVack2_1 = findViewById(R.id.rd_Vack8_1);
        rdVack2_2 = findViewById(R.id.rd_Vack8_2);
        rdVack2_3 = findViewById(R.id.rd_Vack8_3);
        rbgVack2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (i){
                    case R.id.rd_Vack8_1:
                        break;
                    case R.id.rd_Vack8_2:
                        break;
                    case R.id.rd_Vack8_3:
                        break;
                }
            }
        });
        //
        rbgVack3 = findViewById(R.id.rbg_Vack9);
        rdVack3_1 = findViewById(R.id.rd_Vack9_1);
        rdVack3_2 = findViewById(R.id.rd_Vack9_2);
        rdVack3_3 = findViewById(R.id.rd_Vack9_3);
        rbgVack3.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (i){
                    case R.id.rd_Vack9_1:
                        break;
                    case R.id.rd_Vack9_2:
                        break;
                    case R.id.rd_Vack9_3:
                        Intent intent = new Intent(Vack3Activity.this, Vack4Activity.class);
                        startActivity(intent);
                        break;
                }
            }
        });
    }
}