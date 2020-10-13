package com.devsteve.test.Animodo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.RadioGroup;

import com.devsteve.test.R;

public class Animodo5Activity extends AppCompatActivity {

    private RadioGroup rbganim9, rbganim10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animodo5);

        rbganim9 = findViewById(R.id.rbg_Animodo9);
        rbganim10 = findViewById(R.id.rbg_Animodo10);

        rbganim9.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int in) {
                switch(in){
                    case R.id.rd9_1:
                        break;
                    case R.id.rd9_2:
                        break;
                    case R.id.rd9_3:
                        break;
                    case R.id.rd9_4:
                        break;
                    case R.id.rd9_5:
                        break;
                    case R.id.rd9_6:
                        break;
                }

            }
        });

        rbganim10.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch(i){
                    case R.id.rd10_1:
                        Intent intent = new Intent(Animodo5Activity.this, Animodo6Activity.class);
                        startActivity(intent);
                        break;
                    case R.id.rd10_2:
                        Intent inte = new Intent(Animodo5Activity.this, Animodo6Activity.class);
                        startActivity(inte);
                        break;
                    case R.id.rd10_3:
                        Intent intet = new Intent(Animodo5Activity.this, Animodo6Activity.class);
                        startActivity(intet);
                        break;
                    case R.id.rd10_4:
                        Intent in = new Intent(Animodo5Activity.this, Animodo6Activity.class);
                        startActivity(in);
                        break;
                    case R.id.rd10_5:
                        Intent intentm = new Intent(Animodo5Activity.this, Animodo6Activity.class);
                        startActivity(intentm);
                        break;
                    case R.id.rd10_6:
                        Intent intem = new Intent(Animodo5Activity.this, Animodo6Activity.class);
                        startActivity(intem);
                        break;
                }
            }
        });

    }
}