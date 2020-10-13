package com.devsteve.test.Cerebro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.RadioGroup;

import com.devsteve.test.R;

public class Cerebro4Activity extends AppCompatActivity {

    private RadioGroup rbgcere7, rbgcere8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cerebro4);

        rbgcere7 = findViewById(R.id.rbg_cerebro7);
        rbgcere8 = findViewById(R.id.rbg_Cerebro8);

        rbgcere7.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int is) {
                switch (is){
                    case R.id.rdcerebro7_1:
                        break;
                    case R.id.rdcerebro7_2:
                        break;
                    case R.id.rdcerebro7_3:
                        break;

                    case R.id.rdcerebro7_4:
                        break;
                    case R.id.rdcerebro7_5:
                        break;
                }
            }
        });

        rbgcere8.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (i){
                    case R.id.rdcerebro8_1:
                        Intent intent = new Intent(Cerebro4Activity.this, Cerebro5Activity.class);
                        startActivity(intent);
                        break;
                    case R.id.rdcerebro8_2:
                        Intent intent1 = new Intent(Cerebro4Activity.this, Cerebro5Activity.class);
                        startActivity(intent1);
                        break;

                    case R.id.rdcerebro8_3:
                        Intent intent2 = new Intent(Cerebro4Activity.this, Cerebro5Activity.class);
                        startActivity(intent2);
                        break;

                    case R.id.rdcerebro8_4:
                        Intent intent3 = new Intent(Cerebro4Activity.this, Cerebro5Activity.class);
                        startActivity(intent3);
                        break;
                    case R.id.rdcerebro8_5:
                        Intent inten = new Intent(Cerebro4Activity.this, Cerebro5Activity.class);
                        startActivity(inten);
                        break;
                }
            }
        });

    }
}