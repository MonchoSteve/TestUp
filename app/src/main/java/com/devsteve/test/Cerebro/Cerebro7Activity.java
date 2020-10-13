package com.devsteve.test.Cerebro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.RadioGroup;

import com.devsteve.test.R;

public class Cerebro7Activity extends AppCompatActivity {

    private RadioGroup rbgcere13, rbgcere14;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cerebro7);

        rbgcere13 = findViewById(R.id.rbg_Cerebro13);
        rbgcere14 = findViewById(R.id.rbg_Cerebro14);

        rbgcere13.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int is) {
                switch (is){
                    case R.id.rdcerebro13_1:
                        break;
                    case R.id.rdcerebro13_2:
                        break;
                    case R.id.rdcerebro13_3:
                        break;

                    case R.id.rdcerebro13_4:
                        break;
                    case R.id.rdcerebro13_5:
                        break;
                }
            }
        });

        rbgcere14.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (i){
                    case R.id.rdcerebro14_1:
                        Intent intent = new Intent(Cerebro7Activity.this, Cerebro8Activity.class);
                        startActivity(intent);
                        break;
                    case R.id.rdcerebro14_2:
                        Intent intent1 = new Intent(Cerebro7Activity.this, Cerebro8Activity.class);
                        startActivity(intent1);
                        break;

                    case R.id.rdcerebro14_3:
                        Intent intent2 = new Intent(Cerebro7Activity.this, Cerebro8Activity.class);
                        startActivity(intent2);
                        break;

                    case R.id.rdcerebro14_4:
                        Intent intent3 = new Intent(Cerebro7Activity.this, Cerebro8Activity.class);
                        startActivity(intent3);
                        break;
                    case R.id.rdcerebro14_5:
                        Intent inten = new Intent(Cerebro7Activity.this, Cerebro8Activity.class);
                        startActivity(inten);
                        break;
                }
            }
        });

    }
}