package com.devsteve.test.Animodo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.RadioGroup;

import com.devsteve.test.R;

public class Animodo6Activity extends AppCompatActivity {

    private RadioGroup rbganim11, rbganim12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animodo6);

        rbganim11 = findViewById(R.id.rbg_Animodo11);
        rbganim12 = findViewById(R.id.rbg_Animodo12);

        rbganim11.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int in) {
                switch(in){
                    case R.id.rd11_1:
                        break;
                    case R.id.rd11_2:
                        break;
                    case R.id.rd11_3:
                        break;
                    case R.id.rd11_4:
                        break;
                    case R.id.rd11_5:
                        break;
                    case R.id.rd11_6:
                        break;
                }
            }
        });

        rbganim12.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch(i){
                    case R.id.rd12_1:
                        Intent intent = new Intent(Animodo6Activity.this, Animodo7Activity.class);
                        startActivity(intent);
                        break;
                    case R.id.rd12_2:
                        Intent inte = new Intent(Animodo6Activity.this, Animodo7Activity.class);
                        startActivity(inte);
                        break;
                    case R.id.rd12_3:
                        Intent intet = new Intent(Animodo6Activity.this, Animodo7Activity.class);
                        startActivity(intet);
                        break;
                    case R.id.rd12_4:
                        Intent in = new Intent(Animodo6Activity.this, Animodo7Activity.class);
                        startActivity(in);
                        break;
                    case R.id.rd12_5:
                        Intent intentm = new Intent(Animodo6Activity.this, Animodo7Activity.class);
                        startActivity(intentm);
                        break;
                    case R.id.rd12_6:
                        Intent intem = new Intent(Animodo6Activity.this, Animodo7Activity.class);
                        startActivity(intem);
                        break;
                }
            }
        });

    }
}