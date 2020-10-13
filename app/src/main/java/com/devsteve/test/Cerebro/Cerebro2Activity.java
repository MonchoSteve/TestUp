package com.devsteve.test.Cerebro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.RadioGroup;

import com.devsteve.test.R;


public class Cerebro2Activity extends AppCompatActivity {

    private RadioGroup rbgcere3, rbgcere4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cerebro2);
        rbgcere3 = findViewById(R.id.rbg_Cerebro3);
        rbgcere4 = findViewById(R.id.rbg_Cerebro4);

        rbgcere3.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int is) {
                switch(is){
                    case R.id.rdcerebro3_1:
                        break;
                    case R.id.rdcerebro3_2:
                        break;
                    case R.id.rdcerebro3_3:
                        break;
                    case R.id.rdcerebro3_4:
                        break;
                    case R.id.rdcerebro3_5:
                        break;
                }
            }
        });

        rbgcere4.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (i){
                    case R.id.rdcerebro4_1:
                        Intent intent = new Intent(Cerebro2Activity.this, Cerebro3Activity.class);
                        startActivity(intent);
                        break;
                    case R.id.rdcerebro4_2:
                        Intent intent1 = new Intent(Cerebro2Activity.this, Cerebro3Activity.class);
                        startActivity(intent1);
                        break;

                    case R.id.rdcerebro4_3:
                        Intent intent2 = new Intent(Cerebro2Activity.this, Cerebro3Activity.class);
                        startActivity(intent2);
                        break;

                    case R.id.rdcerebro4_4:
                        Intent intent3 = new Intent(Cerebro2Activity.this, Cerebro3Activity.class);
                        startActivity(intent3);
                        break;
                    case R.id.rdcerebro4_5:
                        Intent inten = new Intent(Cerebro2Activity.this, Cerebro3Activity.class);
                        startActivity(inten);
                        break;
                }
            }
        });
    }
}