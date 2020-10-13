package com.devsteve.test.Cerebro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.RadioGroup;

import com.devsteve.test.R;

public class Cerebro6Activity extends AppCompatActivity {

    private RadioGroup rbgcere11, rbgcere12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cerebro6);

        rbgcere11 = findViewById(R.id.rbg_Cerebro11);
        rbgcere12 = findViewById(R.id.rbg_Cerebro12);

        rbgcere11.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int is) {
                switch (is){
                    case R.id.rdcerebro11_1:
                        break;
                    case R.id.rdcerebro11_2:
                        break;
                    case R.id.rdcerebro11_3:
                        break;

                    case R.id.rdcerebro11_4:
                        break;
                    case R.id.rdcerebro11_5:
                        break;
                }
            }
        });

        rbgcere12.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (i){
                    case R.id.rdcerebro12_1:
                        Intent intent = new Intent(Cerebro6Activity.this, Cerebro7Activity.class);
                        startActivity(intent);
                        break;
                    case R.id.rdcerebro12_2:
                        Intent intent1 = new Intent(Cerebro6Activity.this, Cerebro7Activity.class);
                        startActivity(intent1);
                        break;

                    case R.id.rdcerebro12_3:
                        Intent intent2 = new Intent(Cerebro6Activity.this, Cerebro7Activity.class);
                        startActivity(intent2);
                        break;

                    case R.id.rdcerebro12_4:
                        Intent intent3 = new Intent(Cerebro6Activity.this, Cerebro7Activity.class);
                        startActivity(intent3);
                        break;
                    case R.id.rdcerebro12_5:
                        Intent inten = new Intent(Cerebro6Activity.this, Cerebro7Activity.class);
                        startActivity(inten);
                        break;
                }
            }
        });
    }
}