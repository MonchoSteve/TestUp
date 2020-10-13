package com.devsteve.test.Animodo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.RadioGroup;

import com.devsteve.test.R;

public class Animodo4Activity extends AppCompatActivity {

    private RadioGroup rbgAnim7,rbganim8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animodo4);

        rbgAnim7 = findViewById(R.id.rbg_Animodo7);
        rbganim8 = findViewById(R.id.rbg_Animodo8);
        rbgAnim7.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int in) {
                switch(in){
                    case R.id.rd7_1:
                        break;
                    case R.id.rd7_2:
                        break;
                    case R.id.rd7_3:
                        break;
                    case R.id.rd7_4:
                        break;
                    case R.id.rd7_5:
                        break;
                    case R.id.rd7_6:
                        break;
                }

            }
        });

        rbganim8.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch(i){
                    case R.id.rd8_1:
                        Intent intent = new Intent(Animodo4Activity.this, Animodo5Activity.class);
                        startActivity(intent);
                        break;
                    case R.id.rd8_2:
                        Intent inte = new Intent(Animodo4Activity.this, Animodo5Activity.class);
                        startActivity(inte);
                        break;
                    case R.id.rd8_3:
                        Intent intet = new Intent(Animodo4Activity.this, Animodo5Activity.class);
                        startActivity(intet);
                        break;
                    case R.id.rd8_4:
                        Intent in = new Intent(Animodo4Activity.this, Animodo5Activity.class);
                        startActivity(in);
                        break;
                    case R.id.rd8_5:
                        Intent intentm = new Intent(Animodo4Activity.this, Animodo5Activity.class);
                        startActivity(intentm);
                        break;
                    case R.id.rd8_6:
                        Intent intem = new Intent(Animodo4Activity.this, Animodo5Activity.class);
                        startActivity(intem);
                        break;
                }
            }
        });

    }
}