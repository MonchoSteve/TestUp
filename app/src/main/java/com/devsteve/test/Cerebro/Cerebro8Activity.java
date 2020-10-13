package com.devsteve.test.Cerebro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.RadioGroup;

import com.devsteve.test.R;

public class Cerebro8Activity extends AppCompatActivity {

    private RadioGroup rbgcere15, rbgcere16;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cerebro8);

        rbgcere15 = findViewById(R.id.rbg_Cerebro15);
        rbgcere16 = findViewById(R.id.rbg_Cerebro16);

        rbgcere15.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int is) {
                switch (is){
                    case R.id.rdcerebro15_1:
                        break;
                    case R.id.rdcerebro15_2:
                        break;
                    case R.id.rdcerebro15_3:
                        break;

                    case R.id.rdcerebro15_4:
                        break;
                    case R.id.rdcerebro15_5:
                        break;
                }
            }
        });

        rbgcere16.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (i){
                    case R.id.rdcerebro16_1:
                        Intent intent = new Intent(Cerebro8Activity.this, Cerebro9Activity.class);
                        startActivity(intent);
                        break;
                    case R.id.rdcerebro16_2:
                        Intent intent1 = new Intent(Cerebro8Activity.this, Cerebro9Activity.class);
                        startActivity(intent1);
                        break;

                    case R.id.rdcerebro16_3:
                        Intent intent2 = new Intent(Cerebro8Activity.this, Cerebro9Activity.class);
                        startActivity(intent2);
                        break;

                    case R.id.rdcerebro16_4:
                        Intent intent3 = new Intent(Cerebro8Activity.this, Cerebro9Activity.class);
                        startActivity(intent3);
                        break;
                    case R.id.rdcerebro16_5:
                        Intent inten = new Intent(Cerebro8Activity.this, Cerebro9Activity.class);
                        startActivity(inten);
                        break;
                }
            }
        });

    }
}