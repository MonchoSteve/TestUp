package com.devsteve.test.Animodo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.RadioGroup;

import com.devsteve.test.Cerebro.CerebroActivity;
import com.devsteve.test.R;

public class Animodo7Activity extends AppCompatActivity {

    private RadioGroup rbganim13,rbganim14;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animodo7);

        rbganim13 = findViewById(R.id.rbg_Animodo13);
        rbganim14 = findViewById(R.id.rbg_Animodo14);

        rbganim13.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int in) {
                switch(in){
                    case R.id.rd13_1:
                        break;
                    case R.id.rd13_2:
                        break;
                    case R.id.rd13_3:
                        break;
                    case R.id.rd13_4:
                        break;
                    case R.id.rd13_5:
                        break;
                    case R.id.rd13_6:
                        break;
                }
            }
        });

        rbganim14.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch(i){
                    case R.id.rd14_1:
                        Intent intent = new Intent(Animodo7Activity.this, CerebroActivity.class);
                        startActivity(intent);
                        break;
                    case R.id.rd14_2:
                        Intent inte = new Intent(Animodo7Activity.this, CerebroActivity.class);
                        startActivity(inte);
                        break;
                    case R.id.rd14_3:
                        Intent intet = new Intent(Animodo7Activity.this, CerebroActivity.class);
                        startActivity(intet);
                        break;
                    case R.id.rd14_4:
                        Intent in = new Intent(Animodo7Activity.this, CerebroActivity.class);
                        startActivity(in);
                        break;
                    case R.id.rd14_5:
                        Intent intentm = new Intent(Animodo7Activity.this, CerebroActivity.class);
                        startActivity(intentm);
                        break;
                    case R.id.rd14_6:
                        Intent intem = new Intent(Animodo7Activity.this, CerebroActivity.class);
                        startActivity(intem);
                        break;
                }
            }
        });

    }
}