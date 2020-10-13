package com.devsteve.test.Cerebro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.RadioGroup;

import com.devsteve.test.R;

public class Cerebro1Activity extends AppCompatActivity {

    private RadioGroup rbgcere1, rbgcere2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cerebro1);

        rbgcere1 = findViewById(R.id.rbg_Cerebro);
        rbgcere2 = findViewById(R.id.rbg_Cerebro2);

        rbgcere1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int is) {
                switch(is){
                    case R.id.rdcerebro_1:
                        break;
                    case R.id.rdcerebro_2:
                        break;
                    case R.id.rdcerebro_3:
                        break;
                    case R.id.rdcerebro_4:
                        break;
                    case R.id.rdcerebro_5:
                        break;
                }
            }
        });

        rbgcere2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (i){
                    case R.id.rdcerebro2_1:
                        Intent intent = new Intent(Cerebro1Activity.this, Cerebro2Activity.class);
                        startActivity(intent);
                        break;
                    case R.id.rdcerebro2_2:
                        Intent intent1 = new Intent(Cerebro1Activity.this, Cerebro2Activity.class);
                        startActivity(intent1);
                        break;

                    case R.id.rdcerebro2_3:
                        Intent intent2 = new Intent(Cerebro1Activity.this, Cerebro2Activity.class);
                        startActivity(intent2);
                        break;

                    case R.id.rdcerebro2_4:
                        Intent intent3 = new Intent(Cerebro1Activity.this, Cerebro2Activity.class);
                        startActivity(intent3);
                        break;
                    case R.id.rdcerebro2_5:
                        Intent inten = new Intent(Cerebro1Activity.this, Cerebro2Activity.class);
                        startActivity(inten);
                        break;
                }
            }
        });
    }
}