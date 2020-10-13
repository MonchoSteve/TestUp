package com.devsteve.test.Animodo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.RadioGroup;

import com.devsteve.test.R;

public class Animodo3Activity extends AppCompatActivity {

    private RadioGroup rbg6anim,rbg5anim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animodo3);

        rbg5anim = findViewById(R.id.rbg_Animodo5);
        rbg5anim.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int in) {
                switch(in){
                    case R.id.rd5_1:
                        break;
                    case R.id.rd5_2:
                        break;
                    case R.id.rd5_3:
                        break;
                    case R.id.rd5_4:
                        break;
                    case R.id.rd5_5:
                        break;
                    case R.id.rd5_6:
                        break;
                }

            }
        });

        rbg6anim = findViewById(R.id.rbg_Animodo6);
        rbg6anim.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch(i){
                    case R.id.rd6_1:
                        Intent intent = new Intent(Animodo3Activity.this, Animodo4Activity.class);
                        startActivity(intent);
                        break;
                    case R.id.rd6_2:
                        Intent inte = new Intent(Animodo3Activity.this, Animodo4Activity.class);
                        startActivity(inte);
                        break;
                    case R.id.rd6_3:
                        Intent intet = new Intent(Animodo3Activity.this, Animodo4Activity.class);
                        startActivity(intet);
                        break;
                    case R.id.rd6_4:
                        Intent in = new Intent(Animodo3Activity.this, Animodo4Activity.class);
                        startActivity(in);
                        break;
                    case R.id.rd6_5:
                        Intent intentm = new Intent(Animodo3Activity.this, Animodo4Activity.class);
                        startActivity(intentm);
                        break;
                    case R.id.rd6_6:
                        Intent intem = new Intent(Animodo3Activity.this, Animodo4Activity.class);
                        startActivity(intem);
                        break;
                }
            }
        });
    }
}