package com.devsteve.test.Cerebro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.RadioGroup;

import com.devsteve.test.R;

public class Cerebro11Activity extends AppCompatActivity {

    private RadioGroup rbgcere21, rbgcere22;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cerebro11);

        rbgcere21 = findViewById(R.id.rbg_Cerebro21);
        rbgcere22 = findViewById(R.id.rbg_Cerebro22);

        rbgcere21.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int is) {
                switch (is){
                    case R.id.rdcerebro20_1:
                        break;
                    case R.id.rdcerebro20_2:
                        break;
                    case R.id.rdcerebro20_3:
                        break;

                    case R.id.rdcerebro20_4:
                        break;
                    case R.id.rdcerebro20_5:
                        break;
                }
            }
        });

        rbgcere22.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (i){
                    case R.id.rdcerebro22_1:
                        Intent intent = new Intent(Cerebro11Activity.this, Cerebro12Activity.class);
                        startActivity(intent);
                        break;
                    case R.id.rdcerebro22_2:
                        Intent intent1 = new Intent(Cerebro11Activity.this, Cerebro12Activity.class);
                        startActivity(intent1);
                        break;

                    case R.id.rdcerebro22_3:
                        Intent intent2 = new Intent(Cerebro11Activity.this, Cerebro12Activity.class);
                        startActivity(intent2);
                        break;

                    case R.id.rdcerebro22_4:
                        Intent intent3 = new Intent(Cerebro11Activity.this, Cerebro12Activity.class);
                        startActivity(intent3);
                        break;
                    case R.id.rdcerebro22_5:
                        Intent inten = new Intent(Cerebro11Activity.this, Cerebro12Activity.class);
                        startActivity(inten);
                        break;
                }
            }
        });
    }
}