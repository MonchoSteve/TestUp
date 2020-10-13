package com.devsteve.test.Cerebro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.RadioGroup;

import com.devsteve.test.R;

public class Cerebro5Activity extends AppCompatActivity {

    private RadioGroup rbgcere9, rbgcere10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cerebro5);

        rbgcere9 = findViewById(R.id.rbg_Cerebro9);
        rbgcere10 = findViewById(R.id.rbg_Cerebro10);

        rbgcere9.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int is) {
                switch (is){
                    case R.id.rdcerebro9_1:
                        break;
                    case R.id.rdcerebro9_2:
                        break;
                    case R.id.rdcerebro9_3:
                        break;

                    case R.id.rdcerebro9_4:
                        break;
                    case R.id.rdcerebro9_5:
                        break;
                }
            }
        });

        rbgcere10.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (i){
                    case R.id.rdcerebro10_1:
                        Intent intent = new Intent(Cerebro5Activity.this, Cerebro6Activity.class);
                        startActivity(intent);
                        break;
                    case R.id.rdcerebro10_2:
                        Intent intent1 = new Intent(Cerebro5Activity.this, Cerebro6Activity.class);
                        startActivity(intent1);
                        break;

                    case R.id.rdcerebro10_3:
                        Intent intent2 = new Intent(Cerebro5Activity.this, Cerebro6Activity.class);
                        startActivity(intent2);
                        break;

                    case R.id.rdcerebro10_4:
                        Intent intent3 = new Intent(Cerebro5Activity.this, Cerebro6Activity.class);
                        startActivity(intent3);
                        break;
                    case R.id.rdcerebro10_5:
                        Intent inten = new Intent(Cerebro5Activity.this, Cerebro6Activity.class);
                        startActivity(inten);
                        break;
                }
            }
        });
    }
}