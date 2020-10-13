package com.devsteve.test.Cerebro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.RadioGroup;

import com.devsteve.test.R;

public class Cerebro3Activity extends AppCompatActivity {

    private RadioGroup rbgcere5, rbgcere6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cerebro3);

        rbgcere5 = findViewById(R.id.rbg_Cerebro5);
        rbgcere6 = findViewById(R.id.rbg_Cerebro6);

        rbgcere5.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int is) {
                switch (is){
                    case R.id.rdcerebro5_1:
                        break;
                    case R.id.rdcerebro5_2:
                        break;
                    case R.id.rdcerebro5_3:
                        break;

                    case R.id.rdcerebro5_4:
                        break;
                    case R.id.rdcerebro5_5:
                        break;
                }
            }
        });


        rbgcere6.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (i){
                    case R.id.rdcerebro6_1:
                        Intent intent = new Intent(Cerebro3Activity.this, Cerebro4Activity.class);
                        startActivity(intent);
                        break;
                    case R.id.rdcerebro6_2:
                        Intent intent1 = new Intent(Cerebro3Activity.this, Cerebro4Activity.class);
                        startActivity(intent1);
                        break;

                    case R.id.rdcerebro6_3:
                        Intent intent2 = new Intent(Cerebro3Activity.this, Cerebro4Activity.class);
                        startActivity(intent2);
                        break;

                    case R.id.rd_cerebro6_4:
                        Intent intent3 = new Intent(Cerebro3Activity.this, Cerebro4Activity.class);
                        startActivity(intent3);
                        break;
                    case R.id.rdcerebro6_5:
                        Intent inten = new Intent(Cerebro3Activity.this, Cerebro4Activity.class);
                        startActivity(inten);
                        break;
                }
            }
        });

    }
}