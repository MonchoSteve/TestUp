package com.devsteve.test.Cerebro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.RadioGroup;

import com.devsteve.test.R;

public class Cerebro9Activity extends AppCompatActivity {

    private RadioGroup rbgcere17,rbgcere18;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cerebro9);


        rbgcere17 = findViewById(R.id.rbg_Cerebro17);
        rbgcere18 = findViewById(R.id.rbg_Cerebro18);

        rbgcere17.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int is) {
                switch (is){
                    case R.id.rdcerebro17_1:
                        break;
                    case R.id.rdcerebro17_2:
                        break;
                    case R.id.rdcerebro17_3:
                        break;

                    case R.id.rdcerebro17_4:
                        break;
                    case R.id.rdcerebro17_5:
                        break;
                }
            }
        });

        rbgcere18.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (i){
                    case R.id.rdcerebro18_1:
                        Intent intent = new Intent(Cerebro9Activity.this, Cerebro10Activity.class);
                        startActivity(intent);
                        break;
                    case R.id.rdcerebro18_2:
                        Intent intent1 = new Intent(Cerebro9Activity.this, Cerebro10Activity.class);
                        startActivity(intent1);
                        break;

                    case R.id.rdcerebro18_3:
                        Intent intent2 = new Intent(Cerebro9Activity.this, Cerebro10Activity.class);
                        startActivity(intent2);
                        break;

                    case R.id.rdcerebro18_4:
                        Intent intent3 = new Intent(Cerebro9Activity.this, Cerebro10Activity.class);
                        startActivity(intent3);
                        break;
                    case R.id.rdcerebro18_5:
                        Intent inten = new Intent(Cerebro9Activity.this, Cerebro10Activity.class);
                        startActivity(inten);
                        break;
                }
            }
        });


    }
}